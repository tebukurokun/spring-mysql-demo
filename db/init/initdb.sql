create SCHEMA IF NOT EXISTS demo_db;

USE demo_db;

SET
  AUTOCOMMIT = 0;

create TABLE person (
  id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  age INTEGER NOT NULL,
  PRIMARY KEY (id)
);

insert into
  person (name, age)
values
  ('taro', 11),
  ('jiro', 10) gt