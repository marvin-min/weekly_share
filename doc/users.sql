DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `age` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO users(name,age)  VALUES ("张三",28);
INSERT INTO users(name,age)  VALUES ("王三",32);
INSERT INTO users(name,age)  VALUES ("李三",29);
INSERT INTO users(name,age)  VALUES ("李四",18);
INSERT INTO users(name,age)  VALUES ("王五",60);
INSERT INTO users(name,age)  VALUES ("小明",7);