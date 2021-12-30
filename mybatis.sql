
create  DATABASE mybatis_1 DEFAULT character SET UTF8;
USE mybatis_1;
CREATE TABLE user(
                     user_id INT NOT NULL PRIMARY KEY auto_increment,
                     user_name varchar (20) not null comment "用户名",
                     create_time datetime default  null  comment "创建时间"
) auto_increment=100 default charset=utf8 comment="用户表";
insert  into user(user_name,create_time)values ("张三",now()),("里斯",now());
