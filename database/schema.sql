
CREATE TABLE user_registration(
	"id" BIGINT PRIMARY KEY,
	first_name varchar(255),
	last_name varchar(255),
	address varchar(255),
	phnum Integer,
	login_name varchar(255) unique not null,
	
	created_at date,
	created_by varchar(255),
	updated_at date,
	updated_by varchar(255)
);

CREATE SEQUENCE user_registration_seq START WITH 1 INCREMENT BY 1;