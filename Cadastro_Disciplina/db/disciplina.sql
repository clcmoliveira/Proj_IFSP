//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M3LPBD
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: CAMILA LEITE COURA MARIANO DE OLIVEIRA
//******************************************************

-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 12-Nov-2018 às 00:02
-- Versão do servidor: 5.7.21
-- PHP Version: 7.0.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `proj_ifsp`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `disciplina`
--

DROP TABLE IF EXISTS `disciplina`;
CREATE TABLE IF NOT EXISTS `disciplina` (
  `id_dis` int(11) NOT NULL,
  `disciplina` varchar(300) NOT NULL,
  `carga_horaria` int(11) NOT NULL,
  `curso` varchar(300) NOT NULL,
  `qt_vagas` int(11) NOT NULL,
  `periodo` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `disciplina`
--

INSERT INTO `disciplina` (`id_dis`, `disciplina`, `carga_horaria`, `curso`, `qt_vagas`, `periodo`) VALUES
(1, 'Programação em Micro Informatica', 60, 'Analise e Desenvolvimento de Sistemas', 40, 'Matutino'),
(2, 'Algoritimo', 60, 'Analise e Desenvolvimento de Sistemas', 40, 'Noturno');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
