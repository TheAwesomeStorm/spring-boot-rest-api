create table physicians(
    id bigint not null auto_increment,
    name varchar(100) not null,
    email varchar(100) not null unique,
    code varchar(6) not null unique,
    specialty varchar(100) not null,
    street varchar(100) not null,
    district varchar(100) not null,
    zip_code varchar(9) not null,
    adjunct varchar(100),
    house_number varchar(20),
    state char(2) not null,
    city varchar(100) not null,
    primary key(id)
);