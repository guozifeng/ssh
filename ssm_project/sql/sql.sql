-- MySQL dump 10.13  Distrib 5.1.73, for redhat-linux-gnu (x86_64)
--
-- Host: localhost    Database: learning
-- ------------------------------------------------------
-- Server version       5.1.73

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_user` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NAME` char(30) NOT NULL,
  `USER_PASSWORD` char(10) NOT NULL,
  `USER_EMAIL` char(30) NOT NULL,
  PRIMARY KEY (`USER_ID`),
  KEY `IDX_NAME` (`USER_NAME`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user`
--

LOCK TABLES `t_user` WRITE;
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` VALUES (1,'林炳文','1234567@','ling20081005@126.com'),(2,'evan','123','fff@126.com'),(3,'kaka','cadg','fwsfg@126.com'),(4,'simle','cscs','fsaf@126.com'),(5,'arthur','csas','fsaff@126.com'),(6,'小德','yuh78','fdfas@126.com'),(7,'小小','cvff','fsaf@126.com'),(8,'林林之家','gvv','lin@126.com'),(9,'林炳文Evankaka','dfsc','ling2008@126.com'),(10,'apple','uih6','ff@qq.com'),(11,'apple','tgggg','43qt@qq.com'),(12,'apple','ggg','14e23@qq.com'),(13,'apple','gg','122@qq.com'),(14,'apple','dsv','34r@qq.com'),(15,'apple','vvfdz','456@qq.com'),(16,'apple','vz','ff@qq.com'),(17,'apple','zvz','ff@qq.com'),(18,'apple','dvs','ff@qq.com'),(19,'apple','czvcx','ff@qq.com'),(20,'apple','xvzczv','ff@qq.com'),(21,'apple','cz','ff@qq.com'),(22,'apple','cxz','ff@qq.com'),(23,'apple','czv','ff@qq.com'),(24,'apple','C','ff@qq.com'),(25,'apple','dfdsf','ff@qq.com'),(26,'apple','vvf','ff@qq.com'),(27,'apple','45','ff@qq.com'),(28,'apple','5677','ff@qq.com'),(29,'apple','8','ff@qq.com'),(30,'apple','8','ff@qq.com'),(31,'apple','0h','ff@qq.com'),(32,'apple','vf','ff@qq.com'),(33,'apple','sfd','ff@qq.com'),(34,'apple','5yh','ff@qq.com'),(35,'apple','bdf','ff@qq.com'),(36,'apple','gers','ff@qq.com'),(37,'apple','89','ff@qq.com'),(38,'apple','5t','ff@qq.com'),(39,'apple','gse','ff@qq.com'),(40,'apple','gs','ff@qq.com'),(41,'apple','bs','4454@qq.com'),(42,'apple','fs','3445@qq.com'),(43,'apple','bs','354@qq.com'),(44,'apple','fsd','567@qq.com'),(45,'apple','sd','45567@qq.com'),(46,'apple','gs','456@qq.com');
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-12  3:57:12