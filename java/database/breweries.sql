DROP TABLE IF EXISTS brewery;

CREATE TABLE brewery (
    brewery_id serial,
    brewery_name varchar (50) NOT NULL, 
    website varchar(32) NOT NULL,
    phone varchar(16) NOT NULL,
    history varchar(250) NOT NULL, 
    image varchar(200) NOT NULL, 
    address varchar(200) NOT NULL, 
    days_and_hours_of_operation varchar(200) NOT NULL, 
    CONSTRAINT PK_brewery_id PRIMARY KEY(brewery_id),
    CONSTRAINT UQ_website UNIQUE(website)
);