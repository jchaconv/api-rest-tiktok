CREATE DATABASE DB_TIK_TOK;

CREATE TABLE `db_tik_tok`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `hasphoto` TINYINT NULL,
  `name` VARCHAR(45) NULL,
  `lastname` VARCHAR(45) NULL,
  `nickname` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  `numberoffollowers` INT NULL,
  `numberofviewers` INT NULL,
  `numberoflikes` INT NULL,
  `ismoderator` TINYINT NULL,
  `comment` VARCHAR(45) NULL,
  `creationdate` DATETIME NULL,
  `updatedon` DATETIME NULL,
  `status` TINYINT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);



  INSERT INTO `db_tik_tok`.`users`(`hasphoto`,`name`,`lastname`,`nickname`,`description`,`numberoffollowers`,`numberofviewers`,`numberoflikes`,`ismoderator`,`comment`,`creationdate`,`updatedon`,`status`)
  VALUES(1,'Elena','Markez','elenakatherinemar','No hay descripción corta',18,243,0,0,'espero que no se enoje',now(),now(),1),
  (1,'David','','godoygt18','No hay descripción corta',54,454,0,0,'me parece un morrito tranqui',now(),now(),1),
  (1,'Gaby','Eche','gabyevelyn11','No hay descripción corta',9,57,69,0,'es mi amiga, me cae bien y yo no a ella',now(),now(),1),
  (1,'Samyr','','samyr1726','No hay descripción corta',46,1400,10,0,'es un morrito',now(),now(),1),
  (1,'Flor','','flornoemy24','sígueme y te sigo',635,894,402,0,'la descripción jaja',now(),now(),1),
  (1,'Bruno','Jaramillo','brunojaramilloe','No hay descripción corta',65,143,211,0,'será ese el color de su cabello?',now(),now(),1);


create user 'myuserone'@localhost
identified by 'myuseronepass';

GRANT ALL PRIVILEGES ON *.* TO 'myuserone'@localhost;




