DROP TABLE IF EXISTS usuario;

CREATE TABLE usuario (
  login VARCHAR(20) PRIMARY KEY NOT NULL,
  password VARCHAR(30) NOT NULL,
  nombre VARCHAR(50) NOT NULL,
  cliente FLOAT NOT NULL,
  email VARCHAR(50),
  fechaAlta DATE NOT NULL DEFAULT SYSDATE,
  fechaBaja DATE,
  status CHAR(1) NOT NULL DEFAULT 'A',
  intentos FLOAT NOT NULL DEFAULT 0,
  fechaRevocado DATE,
  fechaVigencia DATE,
  noAcceso INTEGER,
  apellidoPaterno VARCHAR(50),
  apellidoMaterno VARCHAR(50),
  area NUMBER(4),
  fechaModificacion DATE NOT NULL DEFAULT SYSDATE
);