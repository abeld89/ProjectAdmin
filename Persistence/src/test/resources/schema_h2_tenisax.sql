--#creacion de tablas
--drop table tenisax.users;
--drop table tenisax.users_role;
--drop table tenisax.persistence_login;
--drop table tenisax.events;
--drop table tenisax.photos;
--drop table tenisax.news;
--drop table tenisax.albums;
--drop table tenisax.tags;
--drop table tenisax.photos_albums;
--drop table tenisax.photos_tags;
--drop table tenisax.news_tags;

create schema tenisax;

create table tenisax.users(
	id INTEGER NOT NULL AUTO_INCREMENT,
	username VARCHAR(50) NOT NULL,
	password VARCHAR(50) NOT NULL,
	name VARCHAR(50),
	email VARCHAR(100) NOT NULL,
	telephone VARCHAR(50),
	age INTEGER,
	entry_date TIMESTAMP NOT NULL,
	enabled BOOLEAN NOT NULL,
	user_role INTEGER NOT NULL,
	PRIMARY KEY(id),
	UNIQUE KEY username (username)
);

create table tenisax.users_role(
	id INTEGER NOT NULL AUTO_INCREMENT,
	name_role VARCHAR(50) NOT NULL,
	PRIMARY KEY(id)
);

create table tenisax.persistence_login(
	user_id INTEGER NOT NULL AUTO_INCREMENT,
	token VARCHAR(50) NOT NULL,
	last_logged TIMESTAMP NOT NULL,
	text_aux VARCHAR(50),
	PRIMARY KEY(user_id)
);

create table tenisax.events(
	id INTEGER NOT NULL AUTO_INCREMENT,
	title VARCHAR(50) NOT NULL,
	date_init TIMESTAMP NOT NULL,
	date_end TIMESTAMP,
	text_event VARCHAR(250) NOT NULL,
	user_creator INTEGER NOT NULL,
	PRIMARY KEY(id)
);

create table tenisax.photos(
	id INTEGER NOT NULL AUTO_INCREMENT,
	title VARCHAR(50) NOT NULL,
	url VARCHAR(150) NOT NULL,
	upload_date TIMESTAMP NOT NULL,
	user_uploader INTEGER NOT NULL,
	PRIMARY KEY(id)
);

create table tenisax.news(
	id INTEGER NOT NULL AUTO_INCREMENT,
	title VARCHAR(50) NOT NULL,
	text VARCHAR(150) NOT NULL,
	public_date TIMESTAMP NOT NULL,
	user_creator INTEGER NOT NULL,
	file VARCHAR(150) NOT NULL,
	PRIMARY KEY(id)
);

create table tenisax.albums(
	id INTEGER NOT NULL AUTO_INCREMENT,
	name VARCHAR(50) NOT NULL,
	icon VARCHAR(150),
	public_date TIMESTAMP NOT NULL,
	user_creator INTEGER NOT NULL,
	PRIMARY KEY(id)
);

create table tenisax.tags(
	id INTEGER NOT NULL AUTO_INCREMENT,
	name VARCHAR(50) NOT NULL,
	icon VARCHAR(150),
	PRIMARY KEY(id)
);

create table tenisax.photos_albums(
	id_photo INTEGER NOT NULL AUTO_INCREMENT,
	id_album INTEGER NOT NULL AUTO_INCREMENT,
	PRIMARY KEY(id_photo, id_album)
);

create table tenisax.photos_tags(
	id_photo INTEGER NOT NULL AUTO_INCREMENT,
	id_tag INTEGER NOT NULL AUTO_INCREMENT,
	PRIMARY KEY(id_photo, id_tag)
);

create table tenisax.news_tags(
	id_news INTEGER NOT NULL AUTO_INCREMENT,
	id_tag INTEGER NOT NULL AUTO_INCREMENT,
	PRIMARY KEY(id_news, id_tag)
);