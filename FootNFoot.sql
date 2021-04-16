-- phpMyAdmin SQL Dump
-- version 4.9.5deb2
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le : ven. 16 avr. 2021 à 00:30
-- Version du serveur :  8.0.23-0ubuntu0.20.04.1
-- Version de PHP : 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `FootNFoot`
--

-- --------------------------------------------------------

--
-- Structure de la table `Leagues`
--

CREATE TABLE `Leagues` (
  `ID` int NOT NULL,
  `league_name` varchar(255) NOT NULL,
  `league_code` varchar(255) NOT NULL,
  `league_country` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Leagues`
--

INSERT INTO `Leagues` (`ID`, `league_name`, `league_code`, `league_country`) VALUES
(1, 'Ligue 1 Uber eats', 'FRL1', 'France '),
(2, 'Premier League ', 'PL', 'England '),
(3, 'Bundesliga', 'BDL', 'Germany '),
(4, 'Liga BBVA', 'ESL', 'Spain'),
(5, 'Serie A', 'ITS', 'Italy');

-- --------------------------------------------------------

--
-- Structure de la table `Players`
--

CREATE TABLE `Players` (
  `ID` int NOT NULL,
  `LastName` varchar(255) NOT NULL,
  `FirstName` varchar(255) DEFAULT NULL,
  `post` varchar(50) DEFAULT NULL,
  `Age` int DEFAULT NULL,
  `player_league` int DEFAULT NULL,
  `player_team` int DEFAULT NULL,
  `Score` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Players`
--

INSERT INTO `Players` (`ID`, `LastName`, `FirstName`, `post`, `Age`, `player_league`, `player_team`, `Score`) VALUES
(1, 'Ronaldo', 'Cristiano', 'Buteur', 36, 5, 63, '25'),
(2, 'Messi', 'Lionel', 'Buteur', 33, 4, 43, '23'),
(3, 'Lewandowski', 'Roberto', 'Buteur', 32, 3, 81, '35'),
(4, 'Mbappe', 'Kylian', 'Buteur', 22, 1, 2, '21'),
(5, 'Kane', 'Harry', 'Buteur', 27, 2, 27, '19'),
(6, 'Oblak', 'Jan', 'Gardien', 28, 4, 41, '20'),
(7, 'Ederson', 'Santana', 'Gardien', 27, 2, 21, '23'),
(8, 'Szczęsny', 'Wojciech', 'Gardien', 30, 5, 63, '27'),
(9, 'Maignan', 'Mike ', 'Gardien', 25, 1, 1, '19'),
(10, 'Gulácsi', 'Péter', 'Gardien', 30, 3, 82, '23'),
(11, 'Bamba', 'Jonathan', 'Passeur', 25, 1, 1, '9'),
(12, 'Kane', 'Harry', 'Passeur', 27, 2, 27, '13'),
(13, 'Lukaku', 'Romelu', 'Passeur', 27, 5, 61, '9'),
(14, 'Aspas', 'Iago', 'Passeur', 33, 4, 50, '10'),
(15, 'Müller', 'Thomas', 'Passeur', 31, 3, 81, '15');

-- --------------------------------------------------------

--
-- Structure de la table `Teams`
--

CREATE TABLE `Teams` (
  `ID` int NOT NULL,
  `team_name` varchar(255) NOT NULL,
  `classment` int DEFAULT NULL,
  `pts` int DEFAULT NULL,
  `bp` int DEFAULT NULL,
  `bc` int DEFAULT NULL,
  `league` int DEFAULT NULL,
  `last_result` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Teams`
--

INSERT INTO `Teams` (`ID`, `team_name`, `classment`, `pts`, `bp`, `bc`, `league`, `last_result`) VALUES
(1, 'Lille', 1, 69, 53, 19, 1, 'v'),
(2, 'Paris', 2, 66, 71, 23, 1, 'v'),
(3, 'Monaco', 3, 65, 67, 38, 1, 'd'),
(4, 'Lyon', 4, 64, 63, 31, 1, 'v'),
(5, 'Lens', 5, 52, 51, 44, 1, 'v'),
(6, 'Marseille', 6, 49, 43, 39, 1, 'v'),
(7, 'Rennes', 7, 48, 40, 35, 1, 'd'),
(8, 'Montpellier', 8, 46, 52, 53, 1, 'n'),
(9, 'Nice', 9, 43, 41, 42, 1, 'v'),
(10, 'Metz', 10, 42, 36, 38, 1, 'd'),
(11, 'Angers', 11, 41, 34, 47, 1, 'v'),
(12, 'Reims', 12, 40, 38, 38, 1, 'v'),
(13, 'Saint-Etienne', 13, 39, 36, 47, 1, 'd'),
(14, 'Strasbourg', 14, 36, 41, 50, 1, 'v'),
(15, 'Bordeaux ', 15, 36, 35, 45, 1, 'd'),
(16, 'Brest ', 16, 36, 44, 55, 1, 'v'),
(17, 'Lorient', 17, 32, 38, 58, 1, 'n'),
(18, 'Nîmes', 18, 30, 31, 59, 1, 'd'),
(19, 'Nantes', 19, 28, 32, 49, 1, 'd'),
(20, 'Dijon', 20, 15, 20, 56, 1, 'd'),
(21, 'Manchester City', 1, 74, 67, 23, 2, 'd'),
(22, 'Manchester United', 2, 63, 61, 34, 2, 'n'),
(23, 'Leicester', 3, 56, 55, 37, 2, 'n'),
(24, 'West Ham', 4, 55, 51, 39, 2, 'v'),
(25, 'Chelsea', 5, 54, 50, 31, 2, 'v'),
(26, 'Liverpool', 6, 52, 53, 37, 2, 'd'),
(27, 'Tottenham', 7, 49, 52, 35, 2, 'd'),
(28, 'Everton', 8, 48, 41, 38, 2, 'v'),
(29, 'Arsenal', 9, 45, 43, 35, 2, 'n'),
(30, 'Leeds United', 10, 45, 49, 49, 2, 'd'),
(31, 'Aston Villa', 11, 44, 43, 33, 2, 'n'),
(32, 'Wolves', 12, 38, 31, 41, 2, 'd'),
(33, 'Crystal Palace ', 13, 38, 33, 52, 2, 'n'),
(34, 'Southampton', 14, 36, 39, 56, 2, 'v'),
(35, 'Brighton', 15, 33, 33, 38, 2, 'd'),
(36, 'Burnley', 16, 33, 25, 42, 2, 'n'),
(37, 'Newcastle ', 17, 32, 32, 51, 2, 'n'),
(38, 'Fulham', 18, 26, 24, 42, 2, 'v'),
(39, 'West Bromwich Albion', 19, 26, 28, 59, 2, 'd'),
(40, 'Sheffield United', 20, 14, 17, 55, 2, 'v'),
(41, 'Atlético Madrid', 1, 67, 52, 20, 4, 'n'),
(42, 'Real Madrid', 2, 66, 53, 24, 4, 'v'),
(43, 'Barcelona ', 3, 65, 69, 26, 4, 'd'),
(44, 'Séville', 4, 61, 44, 24, 4, 'v'),
(45, 'Real Sociedad', 5, 47, 47, 31, 4, 'n'),
(46, 'Betis ', 6, 47, 40, 43, 4, 'n'),
(47, 'Villareal', 7, 46, 43, 33, 4, 'd'),
(48, 'Grenade', 8, 39, 36, 50, 4, 'v'),
(49, 'Levante', 9, 39, 37, 39, 4, 'v'),
(50, 'Celta Vigo', 10, 37, 41, 48, 4, 'd'),
(51, 'Athletic Bilbao', 11, 37, 39, 33, 4, 'n'),
(52, 'Cadix', 12, 35, 27, 45, 4, 'v'),
(53, 'Valence ', 13, 34, 37, 42, 4, 'n'),
(54, 'Osasuna', 14, 34, 25, 36, 4, 'v'),
(55, 'Getafe', 15, 30, 22, 34, 4, 'd'),
(56, 'Huesca', 16, 27, 31, 45, 4, 'v'),
(57, 'Valladolid', 17, 27, 27, 41, 4, 'd'),
(58, 'Elche', 18, 26, 27, 46, 4, 'd'),
(59, 'Deportivo Alaves', 19, 23, 24, 47, 4, 'n'),
(60, 'Eibar', 20, 23, 22, 36, 4, 'd'),
(61, 'Inter Milan', 1, 74, 69, 27, 5, 'v'),
(62, 'Milan AC', 2, 63, 57, 35, 5, 'v'),
(63, 'Juventus', 3, 62, 61, 27, 5, 'v'),
(64, 'Atalanta', 4, 61, 71, 38, 5, 'v'),
(65, 'Napoli', 5, 59, 65, 34, 5, 'v'),
(66, 'Lazio ', 6, 55, 46, 38, 5, 'v'),
(67, 'Roma', 7, 54, 54, 44, 5, 'v'),
(68, 'Sassuolo ', 8, 43, 49, 48, 5, 'v'),
(69, 'Hellas Verona', 9, 41, 38, 35, 5, 'd'),
(70, 'Sampdoria', 10, 36, 39, 45, 5, 'd'),
(71, 'Bologne', 11, 34, 39, 46, 5, 'd'),
(72, 'Udinese', 12, 33, 32, 40, 5, 'd'),
(73, 'Genoa', 13, 32, 32, 44, 5, 'd'),
(74, 'Spezia', 14, 32, 40, 55, 5, 'v'),
(75, 'Fiorentina', 15, 30, 38, 49, 5, 'd'),
(76, 'Bénévent', 16, 30, 30, 55, 5, 'd'),
(77, 'Torino', 17, 27, 42, 52, 5, 'v'),
(78, 'Cagliari', 18, 22, 31, 52, 5, 'd'),
(79, 'Parme', 19, 20, 29, 59, 5, 'd'),
(80, 'Crotone', 20, 15, 37, 77, 5, 'd'),
(81, 'Bayern', 1, 65, 80, 36, 3, 'n'),
(82, 'RB Leipzig', 2, 60, 52, 23, 3, 'v'),
(83, 'Wolfsbourg', 54, 49, 26, 26, 3, 'd'),
(84, 'Eintracht', 4, 53, 59, 40, 3, 'v'),
(85, 'Dortmund', 5, 46, 58, 41, 3, 'v'),
(86, 'Leverkusen', 6, 44, 44, 32, 3, 'n'),
(87, 'Union Berlin', 7, 40, 42, 34, 3, 'n'),
(88, 'Mönchengladbach', 8, 40, 48, 43, 3, 'n'),
(89, 'Stuttgart', 9, 40, 48, 43, 3, 'd'),
(90, 'Fribourg', 10, 37, 40, 42, 3, 'd'),
(91, 'Augsbourg', 11, 32, 29, 42, 3, 'd'),
(92, 'Hoffenheim', 12, 31, 41, 47, 3, 'n'),
(93, 'Werder Brem', 13, 30, 32, 43, 3, 'd'),
(94, 'Mainz 05 ', 14, 28, 30, 48, 3, 'v'),
(95, 'Herta BSC', 15, 26, 34, 48, 3, 'n'),
(96, 'Arminia Bielfeld', 16, 26, 22, 46, 3, 'v'),
(97, 'Cologne', 17, 23, 27, 50, 3, 'd'),
(98, 'Schalke 04', 18, 13, 18, 71, 3, 'v');

-- --------------------------------------------------------

--
-- Structure de la table `Users`
--

CREATE TABLE `Users` (
  `ID` int NOT NULL,
  `LastName` varchar(255) NOT NULL,
  `FirstName` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `passowrd` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `Leagues`
--
ALTER TABLE `Leagues`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `Players`
--
ALTER TABLE `Players`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `player_league` (`player_league`),
  ADD KEY `player_team` (`player_team`);

--
-- Index pour la table `Teams`
--
ALTER TABLE `Teams`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `league` (`league`);

--
-- Index pour la table `Users`
--
ALTER TABLE `Users`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `Leagues`
--
ALTER TABLE `Leagues`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `Players`
--
ALTER TABLE `Players`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT pour la table `Users`
--
ALTER TABLE `Users`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `Players`
--
ALTER TABLE `Players`
  ADD CONSTRAINT `Players_ibfk_1` FOREIGN KEY (`player_league`) REFERENCES `Leagues` (`ID`),
  ADD CONSTRAINT `Players_ibfk_2` FOREIGN KEY (`player_team`) REFERENCES `Teams` (`ID`);

--
-- Contraintes pour la table `Teams`
--
ALTER TABLE `Teams`
  ADD CONSTRAINT `Teams_ibfk_1` FOREIGN KEY (`league`) REFERENCES `Leagues` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
