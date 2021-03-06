CREATE DATABASE  IF NOT EXISTS library;
USE library;

CREATE TABLE AUTHOR (
  ID bigint(20) NOT NULL AUTO_INCREMENT,
  NAME varchar(255) DEFAULT NULL,
  PRIMARY KEY (ID)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


CREATE TABLE BOOK (
  ID bigint(20) NOT NULL AUTO_INCREMENT,
  AVAILABLE bit(1) NOT NULL,
  RELEASE_DATE datetime DEFAULT NULL,
  TITLE varchar(255) DEFAULT NULL,
  AUTHOR_ID bigint(20) DEFAULT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY (AUTHOR_ID) REFERENCES AUTHOR (ID)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

CREATE TABLE USERS (
  ID bigint(20) NOT NULL AUTO_INCREMENT,
  EMAIL varchar(255) DEFAULT NULL,
  FIRST_NAME varchar(255) DEFAULT NULL,
  LAST_NAME varchar(255) DEFAULT NULL,
  PASSWORD varchar(255) DEFAULT NULL,
  USERNAME varchar(255) DEFAULT NULL,
  PRIMARY KEY (ID)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


CREATE TABLE LEND_BOOK_REQUESTS (
  ID bigint(20) NOT NULL AUTO_INCREMENT,
  BOOK_ID bigint(20) DEFAULT NULL,
  USER_ID bigint(20) DEFAULT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY (BOOK_ID) REFERENCES BOOK (ID),
  FOREIGN KEY (USER_ID) REFERENCES USERS (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

