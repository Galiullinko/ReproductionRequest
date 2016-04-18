CREATE TABLE documents (
  id SERIAL PRIMARY KEY,
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
  participantId INT,

  FOREIGN KEY (participantId) REFERENCES participants(id)
);

CREATE TABLE users (
  id SERIAL PRIMARY KEY,
  name VARCHAR (100),
  patronymic VARCHAR(100),
  email VARCHAR (100),
  phoneNumber VARCHAR(100),
  seriesOfThePassport INT,
  numberOfThePassport INT
);

CREATE TABLE participants (
  id SERIAL PRIMARY KEY,
  documentId INT,
  userId INT,
  isIE BIT,
  nameOfEntity VARCHAR (100),
  idOfTaxpayer INT,
  location VARCHAR (100),
  mainStateRegistrationNumber VARCHAR(100),
  nameOfIE VARCHAR(100),
  surnameOfIE VARCHAR(100),
  patronymicOfIE VARCHAR(100),

  FOREIGN KEY (documentId) REFERENCES documents(id),
  FOREIGN KEY (userId) REFERENCES users(id)
);