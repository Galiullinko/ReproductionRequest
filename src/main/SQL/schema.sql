CREATE TABLE documents (
  id SERIAL PRIMARY KEY,
  userId INT,
  yearOfWorks INT,
  goal VARCHAR(100),
  dateOfEndOfTheWork DATE,
  stateOfCreature VARCHAR(100),
  typeOfCreature VARCHAR(100),
  numberOfCreatures INT,
  nameOfWorkLocation VARCHAR(100),
  averegePieceOfWaterResources INT,
  weightOfCreatures INT,
  sourceOfResources VARCHAR(100),
  dateOfFillingTheDocument DATE,
  nameOfEntity VARCHAR (100),
  idOfTaxpayer INT,
  location VARCHAR (100),
  mainStateRegistrationNumber VARCHAR(100),
  nameOfIE VARCHAR(100),
  surnameOfIE VARCHAR(100),
  patronymicOfIE VARCHAR(100),

  FOREIGN KEY (userId) REFERENCES users(id)
);

CREATE TABLE users (
  id SERIAL PRIMARY KEY,
  name VARCHAR (100),
  patronymic VARCHAR(100),
  seriesOfThePassport VARCHAR(100),
  numberOfThePassport VARCHAR(100),
  phoneNumber VARCHAR(100),
  email VARCHAR (100)
);


CREATE TABLE tokens (
  id SERIAL PRIMARY KEY ,
  userId int,
  token VARCHAR (100),

  FOREIGN KEY (userId) REFERENCES  users(id)
);

CREATE TABLE authpairs(
  userId int PRIMARY KEY,
  login VARCHAR (100),
  password VARCHAR (100),

  FOREIGN  KEY (userId) REFERENCES users(id)
);