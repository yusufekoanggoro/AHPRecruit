CREATE TABLE `codebase`.`selections` (
  `id` INT NOT NULL AUTO_INCREMENT, 
  `user_id` INT NOT NULL, 
  `score` DOUBLE(11,2) NOT NULL, 
  PRIMARY KEY (`id`),
  UNIQUE (`user_id`),
  UNIQUE (`score`)
) ENGINE = InnoDB;
