create table user_registration(
	"id" bigint primary key,
	first_name varchar(255),
	last_name varchar(255),
	address varchar(255),
	phnum integer,
	login_name varchar(255) unique not null,
	
	created_at date,
	created_by varchar(255),
	updated_at date,
	updated_by varchar(255) 
);
	
	CREATE SEQUENCE user_registration_seq START WITH 1 INCREMENT BY 1;
	

create table bank_account(
    "id" bigint primary key,
    "user_registration_id"  bigint references user_registration(id), 
    "name" varchar(255) not NULL,
    "number" Integer not null unique,
    "currency" varchar(3) not null,

	created_at date,
	created_by varchar(255),
	updated_at date,
	updated_by varchar(255) 
);


CREATE SEQUENCE bank_account_seq START WITH 1 INCREMENT BY 1;


create table account_transaction (
    "id" bigint primary key,
	"bank_account_id" bigint references bank_account(id),
	"transaction_type" varchar(15),
	"amount" Float(2),
	
	created_at date,
	created_by varchar(255),
	updated_at date,
	updated_by varchar(255) 
);

CREATE SEQUENCE account_transaction_seq START WITH 1 INCREMENT BY 1;


