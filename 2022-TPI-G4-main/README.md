# 2022-TPI-G4
TPI Grupo 4

Actualmente, el avance del trabajo se encuentra disponible en la rama v2.0.

-PRIMER PASO-
La api utiliza una base de datos SQL Server. Para ejecutarla debe descargar la base dae datos "dacs" y crear un usuario ejecutando lo siguiente:
USE [master]
GO

CREATE LOGIN [dacs] WITH PASSWORD=N'1234', DEFAULT_DATABASE=[master], DEFAULT_LANGUAGE=[Espa�ol], CHECK_EXPIRATION=OFF, CHECK_POLICY=OFF
GO

use dacs
if not exists(select * from sys.database_principals where name = 'dacs')
CREATE USER dacs for LOGIN dacs

USE [dacs]
GO
ALTER ROLE [db_owner] ADD MEMBER [dacs]
GO

-SEGUNDO PASO-
Se requiere tener instalado:
- java 8.0
- maven 
- postman 
 
Una vez configurado el acceso a la base de datos, se debe ir a la ruta donde se encuentra la aplicacion y ejecutar el siguiente comando: 
mvn spring-boot:run 



