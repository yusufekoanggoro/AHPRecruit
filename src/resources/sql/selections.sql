CREATE TABLE `codebase`.`selections` (
  `id` INT NOT NULL AUTO_INCREMENT, 
  `user_id` INT NOT NULL, 
  `score` INT NOT NULL, 
  PRIMARY KEY (`id`),
  UNIQUE (`user_id`),
  UNIQUE (`score`)
) ENGINE = InnoDB;
