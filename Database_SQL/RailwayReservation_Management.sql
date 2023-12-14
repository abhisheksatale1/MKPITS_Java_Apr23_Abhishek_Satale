create database Railway_Reservation_Management
use Railway_Reservation_Management
create table Station_Master(
				Station_id int NOT NULL AUTO_INCREMENT,
                Station_name varchar(70),
                Station_type varchar(30),
                Station_code varchar(8),
                Contact_id int, -- foreign key references Station_contact(Contact_id),
                Address_id int, -- foreign key references Station_Address(Address_id),
				Station_update timestamp,
                primary key(Station_id),
                foreign key (Contact_id)references Station_Contact(Contact_id), 
                foreign key(Address_id) references Station_Address(Address_id)
                );
insert into Station_Master 
		values(1,"Nanded","Junction","NAD",2,22343,'2022-05-08 14:30:45');
	Select * from Station_Master
drop table Station_Master
--------------------------------------------------------------------------------------------------------------------------------------
Create table Station_Contact(
				Contact_id int NOT NULL AUTO_INCREMENT,
                Mobile_no char(13),
                Phone_no char(16),
                Email_id varchar(50),
                primary key(Contact_id)
                
                );
insert into Station_Contact
			Values(2,"459309395","23456742","abhisheksatale2@gmail.com");
select * from Station_Contact
drop table Station_Contact
-------------------------------------------------------------------------------------------------------------------------------------
create table Station_address(
				Address_id int NOT NULL AUTO_INCREMENT,
                Address_info varchar(100),
                Postal_code int,
                City_id int,
                primary key(Address_id),
                foreign key(City_id) references Station_city(City_id)
                );
insert into Station_address
			values(22343,"Near Busstand",431601,1012);
drop table Station_Address
---------------------------------------------------------------------------------------------------------------------------------------
Create table Station_city(
				City_id int NOT NULL AUTO_INCREMENT,
                City_name varchar(30),
                State_id int,
                primary key(City_id),
                foreign key(State_id) references Station_state(State_id)
                );
insert into Station_city
			values(1012,"Nanded",1002);
drop table Station_city
--------------------------------------------------------------------------------------------------------------------------------------
Create table Station_state(
			State_id int NOT NULL AUTO_INCREMENT,
            State_name varchar(30),
            Country_id int,
            primary key(State_id),
            foreign key(Country_id) references Station_Country(Country_id)
            );
insert into Station_state
			values(1002,"Maharashtra",1212);
drop table Station_state
-------------------------------------------------------------------------------------------------------------------------------------
Create table Station_country(
			Country_id int NOT NULL AUTO_INCREMENT,
            Country_name varchar(25),
            primary key(Country_id)
				);
insert into Station_country
		values(1212,"India");
drop table Station_country
			
            