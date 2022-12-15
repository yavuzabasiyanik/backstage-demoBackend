CREATE TABLE User_Entity(
      id INTEGER PRIMARY KEY,
      name VARCHAR(64) NOT NULL,
      age  INTEGER NOT NULL
);

INSERT INTO User_Entity (id,name,age) VALUES
  (1, 'Yavuz', 22),
  (2, 'lolo', 10);



CREATE TABLE Card_Entity(
      id INTEGER PRIMARY KEY,
      cardholder VARCHAR(64) NOT NULL,
      score  INTEGER NOT NULL
);

INSERT INTO Card_Entity (id,cardholder,score) VALUES
  (1, 'Yavuz', 100),
  (2, 'Melissa', 100),
  (3, 'Sylas', 90),
  (4, 'Rakan', 80),
  (5, 'Xayah',70);


