drop table PERSON if exists;
CREATE TABLE PERSON (
    phno  INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    location VARCHAR(128) NOT NULL,
    occupation VARCHAR(128) NOT NULL,
    PRIMARY KEY (phno)
);