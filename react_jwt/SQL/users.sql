create table user(
	 no int not null auto_increment
	,user_id varchar(100) not null
	,user_pw varchar(200) not null
	,name varchar(100) not null
	,email varchar(200) default null
	,enabled int default 1
	,primary key(no)
);

select * from user;

insert into user(user_id, user_pw, name, email)
values('user','123456','사용자','user@a.com');

insert into user(user_id, user_pw, name, email)
values('admin','123456','관리자','admin@a.com');











