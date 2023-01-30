use port;

truncate table users;
truncate table roles; 




CREATE TABLE users(
userid CHAR(20) not null,
password VARCHAR (20) not null,
PRIMARY key (userid)
);

INSERT into users values('kudou','kudou1124');
insert into users values('taison','taison2978');




CREATE TABLE roles(
userid char(20) not null,
role VARCHAR(20) not null,
PRIMARY KEY (userid)
);

INSERT INTO roles VALUES('kudou','admin');
INSERT INTO roles VALUES('taison','normal');