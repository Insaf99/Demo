
CREATE TABLE Tarjeta(
ID int identity(1,1) PRIMARY KEY,
numeroTarjeta bigint,
vencimiento date,
codSeguridad int
)


CREATE TABLE Cliente(
ID int identity(1,1) PRIMARY KEY,
nombre varchar(50),
apellido varchar(50),
nacionalidad varchar(100),
edad int,
email varchar(100),
telefono varchar(100),
TarjetaID int UNIQUE FOREIGN KEY REFERENCES Tarjeta(ID))


CREATE TABLE Hotel(
ID int identity(1,1) PRIMARY KEY,
Nombre varchar(100),
estrellas int,
habitaciones varchar(50))


CREATE TABLE Paquete(
ID int identity(1,1) PRIMARY KEY,
cantidadDePersonas int,
seguroMedico float,
trasladoLocal varchar(50),
cotizacion float,
fechaLimite date,
ClienteID int FOREIGN KEY REFERENCES Cliente(ID),
HotelID int FOREIGN KEY REFERENCES Hotel(ID))

CREATE TABLE Aereos(
ID int identity(1,1) PRIMARY KEY,
IDPaquete int FOREIGN KEY REFERENCES Paquete(ID),
asiento int,
clase varchar(40),
precio float,
fecha date)

CREATE TABLE Partido(
ID int identity(1,1) PRIMARY KEY,
equipo1 varchar(50),
equipo2 varchar(50),
fecha date)

CREATE TABLE Entrada(
IDEntrada int identity(1,1) PRIMARY KEY,
IDPartido int FOREIGN KEY REFERENCES Partido(ID),
tipo varchar(40),
fase int,
precio float)





