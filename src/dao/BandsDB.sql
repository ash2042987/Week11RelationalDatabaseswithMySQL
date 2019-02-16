USE bands;

drop table if exists genres;

drop table if exists members;

create table members(
   singer_id int not null,
   firstName varchar(10),
   lastName varchar(10),
   group_id int not null,
   primary key (singer_id)
 );

create table genres(
	genres_id int not null,
	year float,
	totalMembers int(10),
   foreign key (genres_id) references members(singer_id),
   primary key (genres_id) 
);

alter table members add foreign key (group_id) references genres(genres_id);