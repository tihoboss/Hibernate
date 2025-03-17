USE sql2;
drop table if exists PERSONS;
create table PERSONS
(
	name varchar(255) not null,
    surname varchar(255) not null,
    age int not null,
    phone_number varchar(255) not null,
    city_of_living varchar(1030) not null,
    primary key(name,surname,age)
);
delete from PERSONS;
INSERT INTO PERSONS (
	name,
	surname,
	age,
	phone_number,
	city_of_living
)
VALUES(
	'Lee',
    'Know',
    23,
    '+7(999)999-99-99',
    'Korea'
),
(
	'Roman',
    'Kie',
    45,
    '+7(988)288-33-43',
    'Moscow'
),
(
	'Dima',
    'Volgen',
    10,
    '+7(963)847-38-99',
    'Moscow'
),
(
	'Artemiy',
    'Lory',
    33,
    '+7(999)343-43-21',
    'London'
);