-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 28, 2017 at 03:55 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `com.unicredit.rest`
--

-- --------------------------------------------------------

--
-- Table structure for table `Events`
--

CREATE TABLE `Events` (
  `id` int(11) NOT NULL,
  `name` text NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Events`
--

INSERT INTO `Events` (`id`, `name`, `date`) VALUES
(1, 'Event1', '2017-05-28'),
(2, 'Event1', '2017-05-28'),
(3, 'Event3', '2017-05-29'),
(4, 'Event3', '2017-05-29'),
(6, 'Event 4', '2017-10-29'),
(7, 'Event ', '2017-05-31'),
(8, 'Event ', '2017-05-31'),
(9, 'Event', '2017-10-19'),
(10, 'Event', '2017-10-19'),
(11, 'Event', '2017-10-19'),
(12, 'Event', '2017-10-19'),
(13, 'Event', '2017-10-19'),
(14, 'Event', '2017-10-19'),
(15, 'Event', '2017-10-19'),
(16, 'Event', '2017-10-19'),
(17, 'Event', '2017-10-19'),
(18, 'Event', '2017-10-19');

-- --------------------------------------------------------

--
-- Table structure for table `Tickets`
--

CREATE TABLE `Tickets` (
  `id` int(11) NOT NULL,
  `owner` varchar(10) NOT NULL,
  `event` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Tickets`
--

INSERT INTO `Tickets` (`id`, `owner`, `event`) VALUES
(2, 'Radu', 1),
(3, 'Mihai', 2),
(4, 'Gica', 2),
(5, 'Mihai', 2),
(6, 'Gica', 2),
(7, 'Dacu', 1),
(8, 'Nae', 1),
(9, 'Catalin', 1),
(10, 'David', 4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Events`
--
ALTER TABLE `Events`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Tickets`
--
ALTER TABLE `Tickets`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Events`
--
ALTER TABLE `Events`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT for table `Tickets`
--
ALTER TABLE `Tickets`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
