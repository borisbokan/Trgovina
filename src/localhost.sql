-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jan 14, 2019 at 05:10 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `trgovina`
--
DROP DATABASE IF EXISTS `trgovina`;
CREATE DATABASE IF NOT EXISTS `trgovina` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `trgovina`;

-- --------------------------------------------------------

--
-- Table structure for table `tArtikal`
--

DROP TABLE IF EXISTS `tArtikal`;
CREATE TABLE `tArtikal` (
  `id` int(11) NOT NULL,
  `id_dobavljac` int(11) NOT NULL,
  `id_grupa` int(11) NOT NULL,
  `poreklo` varchar(35) NOT NULL,
  `serijski_broj` varchar(50) NOT NULL,
  `oblik` varchar(35) NOT NULL,
  `sirina` decimal(10,0) NOT NULL,
  `visina` decimal(10,0) NOT NULL,
  `dubina` decimal(10,0) NOT NULL,
  `obim` decimal(10,0) NOT NULL,
  `sifra_artikla` varchar(25) NOT NULL,
  `dolazna_sifra` varchar(25) NOT NULL,
  `naziv_artikla` varchar(35) NOT NULL,
  `boja` varchar(25) NOT NULL,
  `dodatni_opis` text NOT NULL,
  `materijal` varchar(50) NOT NULL,
  `jel_lomjivo` tinyint(1) NOT NULL,
  `tezina` decimal(10,0) NOT NULL,
  `cena` double NOT NULL,
  `visina_pdv` double NOT NULL,
  `cena_sa_pdv` double NOT NULL,
  `napomene` varchar(50) NOT NULL,
  `slike_artikla` text NOT NULL,
  `popust` double NOT NULL,
  `kolicina_lager` int(11) NOT NULL,
  `kolicina_pakovanja` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `tArtikal`
--

TRUNCATE TABLE `tArtikal`;
-- --------------------------------------------------------

--
-- Table structure for table `tDobavljac`
--

DROP TABLE IF EXISTS `tDobavljac`;
CREATE TABLE `tDobavljac` (
  `id` int(11) NOT NULL,
  `prezime_ime_vlasnika` varchar(35) NOT NULL,
  `grad` varchar(25) NOT NULL,
  `ulica_broj` varchar(35) NOT NULL,
  `mesto_organizacije` varchar(35) NOT NULL,
  `broj_telefona_fiksni` varchar(18) NOT NULL,
  `broj_telefona_mobilni` varchar(18) NOT NULL,
  `broj_fax` varchar(18) NOT NULL,
  `mail_adresa1` varchar(50) NOT NULL,
  `mail_adresa2` varchar(50) NOT NULL,
  `tekuci_racun_din1` varchar(50) NOT NULL,
  `tekuci_racun_din2` varchar(50) NOT NULL,
  `tekuci_racun_dev1` varchar(50) NOT NULL,
  `tekuci_racun_dev2` varchar(50) NOT NULL,
  `dodatni_opis` text NOT NULL,
  `jel_aktivan` tinyint(1) NOT NULL,
  `geo_duzina_lokacije` varchar(80) NOT NULL,
  `geo_sirina_lokacije` varchar(80) NOT NULL,
  `web_stranica` varchar(50) NOT NULL,
  `jmbg_vlasnik` varchar(18) NOT NULL,
  `datum_rodjenja` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `brojLicne_karte` varchar(25) NOT NULL,
  `mesto_izdavanja_lk` varchar(35) NOT NULL,
  `pravno_ili_fizicko` varchar(10) NOT NULL,
  `naziv_organizacije` varchar(40) NOT NULL,
  `tip_organizacije` varchar(35) NOT NULL,
  `delatnost` varchar(25) NOT NULL,
  `pib` varchar(18) NOT NULL,
  `pdv_broj` varchar(18) NOT NULL,
  `maticni_broj` varchar(18) NOT NULL,
  `datum_osnivanja` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `tDobavljac`
--

TRUNCATE TABLE `tDobavljac`;
-- --------------------------------------------------------

--
-- Table structure for table `tGrupa`
--

DROP TABLE IF EXISTS `tGrupa`;
CREATE TABLE `tGrupa` (
  `id` int(11) NOT NULL,
  `path` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `tGrupa`
--

TRUNCATE TABLE `tGrupa`;
-- --------------------------------------------------------

--
-- Table structure for table `tKalkulacije`
--

DROP TABLE IF EXISTS `tKalkulacije`;
CREATE TABLE `tKalkulacije` (
  `id` int(11) NOT NULL,
  `broj_kalkulacije` varchar(50) NOT NULL,
  `datum_kalkulacije` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `dodatni_trskovi` double DEFAULT NULL,
  `marza` double DEFAULT NULL,
  `pdv` double DEFAULT NULL,
  `rabat` double DEFAULT NULL,
  `id_artikal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `tKalkulacije`
--

TRUNCATE TABLE `tKalkulacije`;
--
-- Dumping data for table `tKalkulacije`
--

INSERT INTO `tKalkulacije` (`id`, `broj_kalkulacije`, `datum_kalkulacije`, `dodatni_trskovi`, `marza`, `pdv`, `rabat`, `id_artikal`) VALUES
(1, '12091881-8', '2016-12-23 07:12:00', 5670, NULL, 24, 0, 21),
(2, '12091881-8', '2016-12-23 07:12:00', 5670, NULL, 24, 0, 21),
(4, '12091881-8', '2016-12-23 07:12:00', 5670, 3, 24, 0, 21),
(5, '8645532-8', '2013-08-11 00:03:00', 5670, 5, 24, 0, 21),
(6, '8645532-8', '2013-08-11 00:03:00', 5670.35, 5.121, 24.15, 0, 21);

-- --------------------------------------------------------

--
-- Table structure for table `tKupac`
--

DROP TABLE IF EXISTS `tKupac`;
CREATE TABLE `tKupac` (
  `id` int(11) NOT NULL,
  `prezime_ime_vlasnika` varchar(35) DEFAULT NULL,
  `grad` varchar(35) DEFAULT NULL,
  `ulica_broj` varchar(40) DEFAULT NULL,
  `mesto_organizacije` varchar(35) DEFAULT NULL,
  `broj_telefona_fiksni` varchar(18) DEFAULT NULL,
  `broj_telefona_mobilni` varchar(18) DEFAULT NULL,
  `broj_faxa` varchar(18) DEFAULT NULL,
  `mail_adresa1` varchar(50) NOT NULL,
  `mail_adresa2` varchar(50) DEFAULT NULL,
  `tekuci_dinarski_racun1` varchar(50) NOT NULL,
  `tekuci_dinarski_racun2` varchar(50) DEFAULT NULL,
  `tekuci_devizni_racun1` varchar(50) DEFAULT NULL,
  `tekuci_devizni_racun2` varchar(50) DEFAULT NULL,
  `dodatni_opis` text,
  `jel_aktivan` tinyint(1) DEFAULT '0',
  `geo_duzina` varchar(80) DEFAULT NULL,
  `geo_sirina` varchar(80) DEFAULT NULL,
  `jmbg_vlasnik` varchar(18) DEFAULT NULL,
  `datum_rodjenja` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `broj_licne_karte` varchar(25) DEFAULT NULL,
  `mesto_izdavanja_licKarte` varchar(35) DEFAULT NULL,
  `pravno_ili_fizicko` varchar(10) NOT NULL DEFAULT 'pravno',
  `naziv_organizacije` varchar(50) DEFAULT NULL,
  `tip_organizacije` varchar(18) DEFAULT NULL,
  `delatnost` varchar(50) DEFAULT NULL,
  `pib` varchar(25) DEFAULT NULL,
  `pdv_broj` varchar(25) DEFAULT NULL,
  `maticni_broj` varchar(25) DEFAULT NULL,
  `datum_osnivanja` timestamp NULL DEFAULT '0000-00-00 00:00:00',
  `jel_filijala` tinyint(1) DEFAULT '0',
  `korisnicko_ime` varchar(35) NOT NULL,
  `token` text NOT NULL,
  `sifra_korisnika` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `tKupac`
--

TRUNCATE TABLE `tKupac`;
--
-- Dumping data for table `tKupac`
--

INSERT INTO `tKupac` (`id`, `prezime_ime_vlasnika`, `grad`, `ulica_broj`, `mesto_organizacije`, `broj_telefona_fiksni`, `broj_telefona_mobilni`, `broj_faxa`, `mail_adresa1`, `mail_adresa2`, `tekuci_dinarski_racun1`, `tekuci_dinarski_racun2`, `tekuci_devizni_racun1`, `tekuci_devizni_racun2`, `dodatni_opis`, `jel_aktivan`, `geo_duzina`, `geo_sirina`, `jmbg_vlasnik`, `datum_rodjenja`, `broj_licne_karte`, `mesto_izdavanja_licKarte`, `pravno_ili_fizicko`, `naziv_organizacije`, `tip_organizacije`, `delatnost`, `pib`, `pdv_broj`, `maticni_broj`, `datum_osnivanja`, `jel_filijala`, `korisnicko_ime`, `token`, `sifra_korisnika`) VALUES
(1, 'Markovic Predrag', 'null', 'V. Nazora 171', 'null', '021/773-992', '064938838221', 'null', 'markpe@mail.com', 'null', '187-00000072612-541', 'null', 'null', 'null', 'null', 1, '-182.022821', '-98.82862552', 'null', '0000-00-00 00:00:00', 'null', 'null', 'pravno', 'null', 'null', 'null', 'null', 'null', 'null', '2000-12-15 09:12:38', 0, '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tOtpis`
--

DROP TABLE IF EXISTS `tOtpis`;
CREATE TABLE `tOtpis` (
  `id` int(11) NOT NULL,
  `broj_otpisa` varchar(50) NOT NULL,
  `id_artikal` int(11) NOT NULL,
  `kolicina` int(11) NOT NULL,
  `vreme` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `tOtpis`
--

TRUNCATE TABLE `tOtpis`;
-- --------------------------------------------------------

--
-- Table structure for table `tPorudzbenica`
--

DROP TABLE IF EXISTS `tPorudzbenica`;
CREATE TABLE `tPorudzbenica` (
  `id` int(11) NOT NULL,
  `tip_porudzbenice` varchar(15) NOT NULL,
  `sifra_porudzbenice` varchar(50) NOT NULL,
  `id_kupac` int(11) NOT NULL,
  `id_artikal` int(11) NOT NULL,
  `kolicina` int(11) NOT NULL,
  `vreme_porucivanja` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `tPorudzbenica`
--

TRUNCATE TABLE `tPorudzbenica`;
-- --------------------------------------------------------

--
-- Table structure for table `tPrijemnica`
--

DROP TABLE IF EXISTS `tPrijemnica`;
CREATE TABLE `tPrijemnica` (
  `id` int(11) NOT NULL,
  `broj_prijemnice` varchar(50) NOT NULL,
  `id_dobavljac` int(11) NOT NULL,
  `id_artikal` int(11) NOT NULL,
  `visina_pdv` double NOT NULL,
  `visina_rabat` double NOT NULL,
  `nabavna_cena` double NOT NULL,
  `kolicina` int(11) NOT NULL,
  `datum_prijema` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `tPrijemnica`
--

TRUNCATE TABLE `tPrijemnica`;
--
-- Dumping data for table `tPrijemnica`
--

INSERT INTO `tPrijemnica` (`id`, `broj_prijemnice`, `id_dobavljac`, `id_artikal`, `visina_pdv`, `visina_rabat`, `nabavna_cena`, `kolicina`, `datum_prijema`) VALUES
(4, '1909-199287-022', 23, 124, 25, 3, 156.96, 26, '2012-03-12 09:02:36'),
(5, '1909-199287-022', 23, 125, 25, 3, 156.96, 26, '2012-03-12 09:02:36');

-- --------------------------------------------------------

--
-- Table structure for table `tProdavac`
--

DROP TABLE IF EXISTS `tProdavac`;
CREATE TABLE `tProdavac` (
  `id` int(11) NOT NULL,
  `prezime_ime_vlasnika` varchar(35) NOT NULL,
  `ulica_broj` varchar(50) DEFAULT NULL,
  `mesto_organizacije` varchar(35) DEFAULT NULL,
  `broj_telefona_fiksni` varchar(18) DEFAULT NULL,
  `broj_telefona_mobilni` varchar(18) DEFAULT NULL,
  `broj_fax` varchar(18) DEFAULT NULL,
  `mail_adresa1` varchar(50) DEFAULT NULL,
  `mail_adresa2` varchar(50) DEFAULT NULL,
  `tekuci_racun_dinarski1` varchar(35) DEFAULT NULL,
  `tekuci_racun_dinarski2` varchar(35) DEFAULT NULL,
  `tekuci_dacun_devizni1` varchar(35) DEFAULT NULL,
  `tekuci_racun_devizni2` varchar(35) DEFAULT NULL,
  `dodatni_opis` text,
  `jel_aktivan` tinyint(1) DEFAULT NULL,
  `geo_duzina` varchar(80) DEFAULT NULL,
  `geo_sirina` varchar(80) DEFAULT NULL,
  `naziv_organizacije` varchar(35) DEFAULT NULL,
  `tip_organizacije` varchar(35) DEFAULT NULL,
  `delatnost` varchar(35) DEFAULT NULL,
  `pib` varchar(25) DEFAULT NULL,
  `pdv_broj` varchar(25) DEFAULT NULL,
  `maticni_broj` varchar(20) DEFAULT NULL,
  `datum_osnivanja` timestamp NULL DEFAULT NULL,
  `jmbg_vlasnik` varchar(20) DEFAULT NULL,
  `datum_rodjenja` timestamp NULL DEFAULT NULL,
  `broj_licne_karte` varchar(25) DEFAULT NULL,
  `mesto_izdavanja_lk` varchar(35) DEFAULT NULL,
  `pravno_fizicko` varchar(10) NOT NULL DEFAULT 'pravno'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `tProdavac`
--

TRUNCATE TABLE `tProdavac`;
-- --------------------------------------------------------

--
-- Table structure for table `tRacunKupca`
--

DROP TABLE IF EXISTS `tRacunKupca`;
CREATE TABLE `tRacunKupca` (
  `id` int(11) NOT NULL,
  `id_kupac` int(11) NOT NULL,
  `uplata` double NOT NULL,
  `opis_uplate` text NOT NULL,
  `datum_uplate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `tRacunKupca`
--

TRUNCATE TABLE `tRacunKupca`;
--
-- Dumping data for table `tRacunKupca`
--

INSERT INTO `tRacunKupca` (`id`, `id_kupac`, `uplata`, `opis_uplate`, `datum_uplate`) VALUES
(3, 1, 134550.35, 'Isparvka uplate ... ', '2018-11-21 10:03:23');

-- --------------------------------------------------------

--
-- Table structure for table `tTrosakKupca`
--

DROP TABLE IF EXISTS `tTrosakKupca`;
CREATE TABLE `tTrosakKupca` (
  `id` int(11) NOT NULL,
  `id_kupac` int(11) NOT NULL,
  `potrosena_suma` double NOT NULL,
  `opis_potrosnje` text NOT NULL,
  `vreme_potrosnje` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `tTrosakKupca`
--

TRUNCATE TABLE `tTrosakKupca`;
-- --------------------------------------------------------

--
-- Table structure for table `tUlogovan`
--

DROP TABLE IF EXISTS `tUlogovan`;
CREATE TABLE `tUlogovan` (
  `id` int(11) NOT NULL,
  `id_korisnik` int(11) NOT NULL,
  `vreme_ulaska` timestamp NULL DEFAULT '0000-00-00 00:00:00',
  `vreme_izlaska` timestamp NULL DEFAULT '0000-00-00 00:00:00',
  `session_id` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `tUlogovan`
--

TRUNCATE TABLE `tUlogovan`;
--
-- Indexes for dumped tables
--

--
-- Indexes for table `tArtikal`
--
ALTER TABLE `tArtikal`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_dobavljac` (`id_dobavljac`),
  ADD KEY `id_grupa` (`id_grupa`);

--
-- Indexes for table `tDobavljac`
--
ALTER TABLE `tDobavljac`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tGrupa`
--
ALTER TABLE `tGrupa`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indexes for table `tKalkulacije`
--
ALTER TABLE `tKalkulacije`
  ADD KEY `broj_kalkulacije_index` (`id`);

--
-- Indexes for table `tKupac`
--
ALTER TABLE `tKupac`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tOtpis`
--
ALTER TABLE `tOtpis`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_artikla` (`id_artikal`);

--
-- Indexes for table `tPorudzbenica`
--
ALTER TABLE `tPorudzbenica`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_kupac` (`id_kupac`),
  ADD KEY `id_artikal` (`id_artikal`),
  ADD KEY `id_artikal_2` (`id_artikal`);

--
-- Indexes for table `tPrijemnica`
--
ALTER TABLE `tPrijemnica`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_artikal` (`id_artikal`),
  ADD KEY `id_dobavljac` (`id_dobavljac`);

--
-- Indexes for table `tProdavac`
--
ALTER TABLE `tProdavac`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tRacunKupca`
--
ALTER TABLE `tRacunKupca`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_korisnik` (`id_kupac`);

--
-- Indexes for table `tTrosakKupca`
--
ALTER TABLE `tTrosakKupca`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_korisnik` (`id_kupac`);

--
-- Indexes for table `tUlogovan`
--
ALTER TABLE `tUlogovan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_korisnik` (`id_korisnik`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tArtikal`
--
ALTER TABLE `tArtikal`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tDobavljac`
--
ALTER TABLE `tDobavljac`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tGrupa`
--
ALTER TABLE `tGrupa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tKalkulacije`
--
ALTER TABLE `tKalkulacije`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tKupac`
--
ALTER TABLE `tKupac`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tOtpis`
--
ALTER TABLE `tOtpis`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tPorudzbenica`
--
ALTER TABLE `tPorudzbenica`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tPrijemnica`
--
ALTER TABLE `tPrijemnica`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tProdavac`
--
ALTER TABLE `tProdavac`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tRacunKupca`
--
ALTER TABLE `tRacunKupca`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tTrosakKupca`
--
ALTER TABLE `tTrosakKupca`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tUlogovan`
--
ALTER TABLE `tUlogovan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tArtikal`
--
ALTER TABLE `tArtikal`
  ADD CONSTRAINT `tArtikal_ibfk_1` FOREIGN KEY (`id_dobavljac`) REFERENCES `tDobavljac` (`id`);

--
-- Constraints for table `tGrupa`
--
ALTER TABLE `tGrupa`
  ADD CONSTRAINT `tGrupa_ibfk_1` FOREIGN KEY (`id`) REFERENCES `tArtikal` (`id_grupa`);

--
-- Constraints for table `tPorudzbenica`
--
ALTER TABLE `tPorudzbenica`
  ADD CONSTRAINT `tPorudzbenica_ibfk_1` FOREIGN KEY (`id_artikal`) REFERENCES `tArtikal` (`id`),
  ADD CONSTRAINT `tPorudzbenica_ibfk_2` FOREIGN KEY (`id_kupac`) REFERENCES `tKupac` (`id`);

--
-- Constraints for table `tRacunKupca`
--
ALTER TABLE `tRacunKupca`
  ADD CONSTRAINT `tRacunKupca_ibfk_1` FOREIGN KEY (`id_kupac`) REFERENCES `tKupac` (`id`);

--
-- Constraints for table `tTrosakKupca`
--
ALTER TABLE `tTrosakKupca`
  ADD CONSTRAINT `tTrosakKupca_ibfk_1` FOREIGN KEY (`id_kupac`) REFERENCES `tKupac` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
