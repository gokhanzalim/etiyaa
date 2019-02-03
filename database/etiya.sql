-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 03 Şub 2019, 20:51:39
-- Sunucu sürümü: 10.1.37-MariaDB
-- PHP Sürümü: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `etiya`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `authorities`
--

CREATE TABLE `authorities` (
  `username` varchar(128) NOT NULL,
  `authority` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `authorities`
--

INSERT INTO `authorities` (`username`, `authority`) VALUES
('etiya', 'ROLE_ADMIN'),
('gokhan', 'ROLE_ADMIN');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `name` varchar(225) NOT NULL,
  `surname` varchar(225) NOT NULL,
  `address` text NOT NULL,
  `phone` text NOT NULL,
  `email` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `customer`
--

INSERT INTO `customer` (`id`, `name`, `surname`, `address`, `phone`, `email`) VALUES
(1, 'Etiya', 'etiya', 'Yıldız Teknik Üniv. Teknokent', '121231356', 'test@gmail.com'),
(2, 'Duru', 'Çetin', 'İstanbul', '3224668', 'test@gmail.com'),
(3, 'Mehmet', 'Doğan', 'Ankara', '2122252356', 'test@gmail.com'),
(4, 'Murat', 'Soydan', 'Adana', '32225646', 'test@gmail.com'),
(5, 'Yelda', 'Kekliktepe', 'İstanbul', '1212120', 'test@gmail.com'),
(6, 'Gökhan', 'Zalim', 'Eyüp', '2121212121', 'test@gmail.com'),
(7, 'Faruk', 'Çan', 'Göktürk Merkez Mah.', '1234565', 'test@gmail.com'),
(8, 'Yılmaz', 'Durak', 'Eyüp/İstanbul', '1223321', 'test@gmail.com'),
(9, 'Ekip', 'Fatih', 'Zonguldak', '53456546', 'test@gmail.com'),
(10, 'Duygu', 'Mert', 'İstanbul', '2122252364', 'test@gmail.com'),
(11, 'Cenk', 'Türkmen', 'Işıklar Mahallesi Girne Cad. No:25', '22221532', 'test@gmail.com');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `issues`
--

CREATE TABLE `issues` (
  `id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `type` int(11) NOT NULL,
  `process_details` text NOT NULL,
  `changes` text NOT NULL,
  `process_date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `issues`
--

INSERT INTO `issues` (`id`, `customer_id`, `product_id`, `user_id`, `type`, `process_details`, `changes`, `process_date`) VALUES
(1, 5, 8, 1, 3, 'Ariza tespit edildi', 'Lastik', '2019-02-02 00:56:27'),
(2, 5, 8, 2, 3, 'Test Edildi', 'Somun', '2019-02-02 00:56:27'),
(3, 9, 12, 1, 3, 'Genel Bakım', 'Klips', '2019-02-02 00:56:27'),
(4, 7, 5, 2, 1, 'Genel Bakım', 'Su,tesisat,kondansatör', '2019-02-02 00:56:27'),
(5, 4, 9, 1, 3, 'Temizlik Yapıldı', 'Havalandırma Filtreleri', '2019-02-07 00:00:00'),
(6, 4, 9, 2, 2, 'Bozulan parçalar onarıldı', 'elektrik tesisatı', '2019-02-07 00:59:00'),
(7, 4, 9, 1, 3, 'Arıza giderildi', 'ekran', '2019-02-08 04:59:00'),
(9, 8, 11, 1, 3, '6 Aylık Bakım Yapıldı', 'Yag,Lastik ve Raflar', '2019-02-12 14:44:00'),
(12, 10, 14, 2, 2, 'Mekanik parçalar onarıldı', 'Mikroişlemci', '2019-02-02 14:44:00'),
(22, 6, 7, 2, 1, 'Genel Bakım', 'Yag,Lastik ve Raflar', '2019-02-06 23:24:00');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `products`
--

CREATE TABLE `products` (
  `id` int(11) NOT NULL,
  `product_name` text NOT NULL,
  `serial_number` varchar(225) NOT NULL,
  `buy_date` datetime NOT NULL,
  `period` int(11) NOT NULL DEFAULT '0',
  `customer_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `products`
--

INSERT INTO `products` (`id`, `product_name`, `serial_number`, `buy_date`, `period`, `customer_id`) VALUES
(7, 'Televizyon', '1334144600156', '2019-02-02 00:57:23', 2, 6),
(6, 'Çamaşır Makinası', '4444545', '2019-02-02 00:57:23', 3, 6),
(5, 'Televizyon', '11224555', '2019-02-02 00:57:23', 6, 7),
(8, 'Araba', '1334012532', '2019-02-02 00:57:23', 12, 5),
(9, 'Buzdolabı', '854675156', '2019-02-02 00:57:23', 6, 4),
(10, 'Televizyon', '11224555', '2019-02-02 00:57:23', 3, 8),
(11, 'Lorem Ipsum', '11224555', '2019-02-02 00:57:23', 6, 8),
(12, 'Televizyon', '2324242', '2019-02-02 00:57:23', 6, 9),
(13, 'Televizyon', '4444545', '2019-01-01 00:06:00', 12, 6),
(14, 'Kombi', '2212353566', '2019-02-24 13:24:00', 12, 10);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(128) NOT NULL,
  `password` varchar(512) NOT NULL,
  `enabled` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `enabled`) VALUES
(1, 'etiya', '{noop}etiya', 1),
(2, 'gokhan', '{noop}gokhan', 1);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `issues`
--
ALTER TABLE `issues`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKcigc16s3flsg53i2sy0m37e` (`user_id`);

--
-- Tablo için indeksler `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKsu77w85kis17ny28x5pli9mvn` (`customer_id`);

--
-- Tablo için indeksler `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- Tablo için AUTO_INCREMENT değeri `issues`
--
ALTER TABLE `issues`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- Tablo için AUTO_INCREMENT değeri `products`
--
ALTER TABLE `products`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Tablo için AUTO_INCREMENT değeri `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Dökümü yapılmış tablolar için kısıtlamalar
--

--
-- Tablo kısıtlamaları `issues`
--
ALTER TABLE `issues`
  ADD CONSTRAINT `FKcigc16s3flsg53i2sy0m37e` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
