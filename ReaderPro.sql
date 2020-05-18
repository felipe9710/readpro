-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: readerpro
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `audiolibros`
--

DROP TABLE IF EXISTS `audiolibros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `audiolibros` (
  `id_audiolibro` int NOT NULL AUTO_INCREMENT,
  `titulo` varchar(50) NOT NULL,
  `fecha_creacion` datetime NOT NULL,
  `num_paginas` int NOT NULL,
  `duracion_total` int NOT NULL,
  `portada` blob NOT NULL,
  `contraportada` mediumblob NOT NULL,
  `duracion` int NOT NULL,
  `calificacion` varchar(50) NOT NULL,
  `sipnosis` varchar(50) NOT NULL,
  `numCapitulos` varchar(50) NOT NULL,
  `idioma` varchar(50) NOT NULL,
  `reproducciones` double DEFAULT NULL,
  `id_narradorAF` int NOT NULL,
  `id_editorialAF` int NOT NULL,
  `id_categoriaAF` int NOT NULL,
  PRIMARY KEY (`id_audiolibro`),
  KEY `id_narradorAF` (`id_narradorAF`),
  KEY `id_editorialAF` (`id_editorialAF`),
  KEY `id_categoriaAF` (`id_categoriaAF`),
  CONSTRAINT `audiolibros_ibfk_1` FOREIGN KEY (`id_narradorAF`) REFERENCES `narradores` (`id_narrador`),
  CONSTRAINT `audiolibros_ibfk_2` FOREIGN KEY (`id_editorialAF`) REFERENCES `editoriales` (`id_editorial`),
  CONSTRAINT `audiolibros_ibfk_3` FOREIGN KEY (`id_categoriaAF`) REFERENCES `categorias` (`id_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `audiolibros`
--

LOCK TABLES `audiolibros` WRITE;
/*!40000 ALTER TABLE `audiolibros` DISABLE KEYS */;
/*!40000 ALTER TABLE `audiolibros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `audios`
--

DROP TABLE IF EXISTS `audios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `audios` (
  `id_Audio` int NOT NULL AUTO_INCREMENT,
  `archivo_audio` longblob NOT NULL,
  `id_audiolibroF` int NOT NULL,
  PRIMARY KEY (`id_Audio`),
  KEY `id_audiolibroF` (`id_audiolibroF`),
  CONSTRAINT `audios_ibfk_1` FOREIGN KEY (`id_audiolibroF`) REFERENCES `audiolibros` (`id_audiolibro`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `audios`
--

LOCK TABLES `audios` WRITE;
/*!40000 ALTER TABLE `audios` DISABLE KEYS */;
/*!40000 ALTER TABLE `audios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `autores`
--

DROP TABLE IF EXISTS `autores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autores` (
  `id_autor` int NOT NULL AUTO_INCREMENT,
  `nombre_autor1` varchar(50) NOT NULL,
  `nombre_autor2` varchar(50) DEFAULT NULL,
  `apellido_autor1` varchar(50) NOT NULL,
  `apellido_autor2` varchar(50) DEFAULT NULL,
  `fecha_nacimiento_Autor` datetime NOT NULL,
  `id_PaisAF` int NOT NULL,
  PRIMARY KEY (`id_autor`),
  KEY `id_PaisAF` (`id_PaisAF`),
  CONSTRAINT `autores_ibfk_1` FOREIGN KEY (`id_PaisAF`) REFERENCES `paises_autores` (`id_paisA`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autores`
--

LOCK TABLES `autores` WRITE;
/*!40000 ALTER TABLE `autores` DISABLE KEYS */;
INSERT INTO `autores` VALUES (1,'sdf','dsfds','dsfdsfdsfdsfdsfdsf','dsfsdf','2020-02-02 00:00:00',1);
/*!40000 ALTER TABLE `autores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `autores_libros`
--

DROP TABLE IF EXISTS `autores_libros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autores_libros` (
  `id_AutorL` int NOT NULL AUTO_INCREMENT,
  `id_autorAF` int NOT NULL,
  `id_audiolibroAF` int NOT NULL,
  PRIMARY KEY (`id_AutorL`),
  KEY `id_autorAF` (`id_autorAF`),
  KEY `id_audiolibroAF` (`id_audiolibroAF`),
  CONSTRAINT `autores_libros_ibfk_1` FOREIGN KEY (`id_autorAF`) REFERENCES `autores` (`id_autor`),
  CONSTRAINT `autores_libros_ibfk_2` FOREIGN KEY (`id_audiolibroAF`) REFERENCES `audiolibros` (`id_audiolibro`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autores_libros`
--

LOCK TABLES `autores_libros` WRITE;
/*!40000 ALTER TABLE `autores_libros` DISABLE KEYS */;
/*!40000 ALTER TABLE `autores_libros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorias` (
  `id_categoria` int NOT NULL AUTO_INCREMENT,
  `categoria` varchar(50) NOT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'f'),(2,'g'),(3,'h'),(4,'hola'),(5,'narnia'),(6,'Wakanda2.0'),(7,'asd'),(8,'jkhkhjkjhkjhkjhkj');
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `editoriales`
--

DROP TABLE IF EXISTS `editoriales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `editoriales` (
  `id_editorial` int NOT NULL AUTO_INCREMENT,
  `nombre_editorial` varchar(50) NOT NULL,
  `telefono_E` varchar(50) NOT NULL,
  `direccion_E` varchar(50) NOT NULL,
  `correo_E` varchar(50) NOT NULL,
  `Fecha_Creacion_Editorial` datetime NOT NULL,
  PRIMARY KEY (`id_editorial`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `editoriales`
--

LOCK TABLES `editoriales` WRITE;
/*!40000 ALTER TABLE `editoriales` DISABLE KEYS */;
INSERT INTO `editoriales` VALUES (1,'asd','sad','asd','sad','2019-05-18 00:00:00'),(2,'dfdasd','987987','hhkh','jkkh','2018-05-11 00:00:00'),(3,'Editorial','320 670 8990','avenida siempre viva','correo@editorial.com','2017-05-13 00:00:00');
/*!40000 ALTER TABLE `editoriales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historial`
--

DROP TABLE IF EXISTS `historial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `historial` (
  `id_Historial` int NOT NULL AUTO_INCREMENT,
  `id_audiolibroF` int NOT NULL,
  `id_usuarioF` int NOT NULL,
  PRIMARY KEY (`id_Historial`),
  KEY `id_audiolibroF` (`id_audiolibroF`),
  KEY `id_usuarioF` (`id_usuarioF`),
  CONSTRAINT `historial_ibfk_1` FOREIGN KEY (`id_audiolibroF`) REFERENCES `audiolibros` (`id_audiolibro`),
  CONSTRAINT `historial_ibfk_2` FOREIGN KEY (`id_usuarioF`) REFERENCES `usuarios` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historial`
--

LOCK TABLES `historial` WRITE;
/*!40000 ALTER TABLE `historial` DISABLE KEYS */;
/*!40000 ALTER TABLE `historial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `narradores`
--

DROP TABLE IF EXISTS `narradores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `narradores` (
  `id_narrador` int NOT NULL AUTO_INCREMENT,
  `nombre_narrador1` varchar(50) NOT NULL,
  `nombre_narrado2` varchar(50) DEFAULT NULL,
  `apellido_narrado1` varchar(50) NOT NULL,
  `apellido_narrado2` varchar(50) DEFAULT NULL,
  `fecha_nacimiento_narrador` datetime NOT NULL,
  `id_PaisNF` int NOT NULL,
  PRIMARY KEY (`id_narrador`),
  KEY `id_PaisNF` (`id_PaisNF`),
  CONSTRAINT `narradores_ibfk_1` FOREIGN KEY (`id_PaisNF`) REFERENCES `paises_narradores` (`id_PaisN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `narradores`
--

LOCK TABLES `narradores` WRITE;
/*!40000 ALTER TABLE `narradores` DISABLE KEYS */;
/*!40000 ALTER TABLE `narradores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paises_autores`
--

DROP TABLE IF EXISTS `paises_autores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paises_autores` (
  `id_paisA` int NOT NULL AUTO_INCREMENT,
  `nombrePaisA` varchar(50) NOT NULL,
  PRIMARY KEY (`id_paisA`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paises_autores`
--

LOCK TABLES `paises_autores` WRITE;
/*!40000 ALTER TABLE `paises_autores` DISABLE KEYS */;
INSERT INTO `paises_autores` VALUES (1,'Colombia'),(2,'Brasil');
/*!40000 ALTER TABLE `paises_autores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paises_narradores`
--

DROP TABLE IF EXISTS `paises_narradores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paises_narradores` (
  `id_PaisN` int NOT NULL AUTO_INCREMENT,
  `nombrePais` varchar(50) NOT NULL,
  PRIMARY KEY (`id_PaisN`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paises_narradores`
--

LOCK TABLES `paises_narradores` WRITE;
/*!40000 ALTER TABLE `paises_narradores` DISABLE KEYS */;
INSERT INTO `paises_narradores` VALUES (1,'Wakanda'),(2,'Narnia'),(3,'hffhfg'),(4,'Wakanda'),(5,'Wakanda 4 ever');
/*!40000 ALTER TABLE `paises_narradores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paises_usuarios`
--

DROP TABLE IF EXISTS `paises_usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paises_usuarios` (
  `id_PaisU` int NOT NULL AUTO_INCREMENT,
  `nombrePaisU` varchar(50) NOT NULL,
  PRIMARY KEY (`id_PaisU`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paises_usuarios`
--

LOCK TABLES `paises_usuarios` WRITE;
/*!40000 ALTER TABLE `paises_usuarios` DISABLE KEYS */;
INSERT INTO `paises_usuarios` VALUES (1,'Wakanda'),(2,'Narnia');
/*!40000 ALTER TABLE `paises_usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `nombre1` varchar(50) NOT NULL,
  `nombre2` varchar(50) DEFAULT NULL,
  `apellido1` varchar(50) NOT NULL,
  `apellido2` varchar(50) DEFAULT NULL,
  `genero` varchar(50) NOT NULL,
  `nombre_usuario` varchar(50) NOT NULL,
  `correo_usuario` varchar(50) NOT NULL,
  `contraseña_usuario` varchar(50) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `fecha_incripcion` datetime NOT NULL,
  `id_PaisUF` int NOT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `id_PaisUF` (`id_PaisUF`),
  CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`id_PaisUF`) REFERENCES `paises_usuarios` (`id_PaisU`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Miguel','asd','asdd','asd','Masculino','Miguel','asd','Autonoma20','2009-09-09','2009-09-09 00:00:00',1);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-18 18:11:09
