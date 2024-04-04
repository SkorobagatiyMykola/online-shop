CREATE TABLE products(
    id int auto_increment primary key,
    name VARCHAR(30) NOT NULL,
    description VARCHAR(100) NOT NULL,
    price decimal(10,2) default 0.00,
    created_at timestamp default CURRENT_TIMESTAMP
);

insert into products(name, description, price) values('Coca-cola','Drinks',10.5);
insert into products(name, description, price) values('Pepsi-cola','Drinks',12.5);
insert into products(name, description, price) values('Givchik','Drinks',8.5);
insert into products(name, description, price) values('IPhone 10','Mobile',10000);
insert into products(name, description, price) values('IPhone 11','Mobile',11000);
insert into products(name, description, price) values('IPhone 12','Mobile',12000);
insert into products(name, description, price) values('IPhone 13','Mobile',13000);
insert into products(name, description, price) values('IPhone 14','Mobile',14000);