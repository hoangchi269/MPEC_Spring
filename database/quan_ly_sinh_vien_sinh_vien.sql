CREATE DATABASE  IF NOT EXISTS `quan_ly_sinh_vien` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `quan_ly_sinh_vien`;
-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: quan_ly_sinh_vien
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `sinh_vien`
--

DROP TABLE IF EXISTS `sinh_vien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sinh_vien` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten_sinh_vien` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `mssv` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `gioi_tinh` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `so_dien_thoai` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `dia_chi` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `xoa` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sinh_vien`
--

LOCK TABLES `sinh_vien` WRITE;
/*!40000 ALTER TABLE `sinh_vien` DISABLE KEYS */;
INSERT INTO `sinh_vien` VALUES (1,'Dương Hoàng Chí','20172429','nam','0963793327','Hà Nội',_binary '\0'),(2,'Phạm Tú Tài','20172798','nam','0974416500','Hưng Yên',_binary '\0');
/*!40000 ALTER TABLE `sinh_vien` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-12  0:08:12
