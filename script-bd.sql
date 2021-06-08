CREATE DATABASE DB_TIK_TOK;

CREATE TABLE `db_tik_tok`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `nickname` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  `numberoffollowers` INT NULL,
  `numberofviewers` INT NULL,
  `numberoflikes` INT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);



  INSERT INTO `db_tik_tok`.`users`(`name`,`nickname`,`description`,`numberoffollowers`,`numberofviewers`,`numberoflikes`)
  VALUES('Elena Markez','elenakatherinemar','No hay descripción corta',18,243,0),
  ('David','godoygt18','No hay descripción corta',54,454,0),
  ('Gaby Eche','gabyevelyn11','No hay descripción corta',9,57,69),
  ('Samyr','samyr1726','No hay descripción corta',46,1400,10),
  ('Flor','flornoemy24','sígueme y te sigo',635,894,402),
  ('Bruno Jaramillo','brunojaramilloe','No hay descripción corta',65,143,211);


create user 'myuserone'@localhost
identified by 'myuseronepass';

GRANT ALL PRIVILEGES ON *.* TO 'myuserone'@localhost;




