CREATE TABLE `codebase`.`candidates` (
  `id` INT NOT NULL AUTO_INCREMENT, 
  `name` VARCHAR(100) NOT NULL, 
  `gender` VARCHAR(15) NOT NULL, 
  `last_education` VARCHAR(10) NOT NULL, 
  `phone_number` VARCHAR(15) NOT NULL, 
  `address` TEXT NOT NULL, 
  `leadership_score` INT NOT NULL, 
  `knowledge_score` INT NOT NULL, 
  `technical_skill_score` INT NOT NULL, 
  `advanced_skill_score` INT NOT NULL, 
  PRIMARY KEY (`id`)
) ENGINE = InnoDB;
