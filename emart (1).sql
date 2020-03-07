-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 05, 2020 at 10:05 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `emart`
--

-- --------------------------------------------------------

--
-- Table structure for table `bill_details_table`
--

CREATE TABLE `bill_details_table` (
  `bill_details_id` int(11) NOT NULL,
  `bill_id` int(20) NOT NULL,
  `item_id` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bill_details_table`
--

INSERT INTO `bill_details_table` (`bill_details_id`, `bill_id`, `item_id`) VALUES
(701, 601, 502),
(702, 602, 501),
(703, 603, 501),
(704, 604, 501),
(705, 605, 501),
(706, 606, 502),
(707, 606, 502),
(708, 607, 501),
(709, 608, 501),
(710, 609, 501),
(711, 610, 501),
(712, 610, 501),
(713, 611, 501),
(714, 612, 501),
(715, 613, 501),
(716, 614, 501),
(717, 615, 501),
(718, 615, 502),
(719, 616, 501);

-- --------------------------------------------------------

--
-- Table structure for table `bill_table`
--

CREATE TABLE `bill_table` (
  `bill_id` int(20) NOT NULL,
  `buyer_id` int(20) NOT NULL,
  `bill_type` varchar(20) NOT NULL,
  `bill_date` date NOT NULL,
  `bill_remarks` varchar(20) NOT NULL,
  `bill_amount` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bill_table`
--

INSERT INTO `bill_table` (`bill_id`, `buyer_id`, `bill_type`, `bill_date`, `bill_remarks`, `bill_amount`) VALUES
(601, 201, 'debit', '2020-02-04', 'thank you', 100),
(602, 202, 'debit', '2020-02-05', 'visit again', 500),
(603, 202, 'debit', '2020-02-05', 'visit again', 500),
(604, 202, 'debit', '2020-02-05', 'visit again', 500),
(605, 201, 'credit', '2020-03-04', '', 1000),
(606, 201, 'credit', '2020-03-04', '', 200),
(607, 202, 'credit', '2020-03-04', '', 1000),
(608, 202, 'credit', '2020-03-04', '', 1000),
(609, 202, 'credit', '2020-03-04', '', 1000),
(610, 202, 'credit', '2020-03-04', '', 2000),
(611, 202, 'credit', '2020-03-04', '', 1000),
(612, 202, 'credit', '2020-03-04', '', 1000),
(613, 202, 'credit', '2020-03-04', '', 1000),
(614, 202, 'credit', '2020-03-04', '', 1000),
(615, 201, 'credit', '2020-03-04', '', 1100),
(616, 201, 'credit', '2020-03-04', '', 1000);

-- --------------------------------------------------------

--
-- Table structure for table `buyer_signup_table`
--

CREATE TABLE `buyer_signup_table` (
  `buyer_id` int(30) NOT NULL,
  `buyer_username` varchar(30) NOT NULL,
  `buyer_email` varchar(30) NOT NULL,
  `buyer_mobile` int(30) NOT NULL,
  `buyer_date` date NOT NULL,
  `buyer_password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `buyer_signup_table`
--

INSERT INTO `buyer_signup_table` (`buyer_id`, `buyer_username`, `buyer_email`, `buyer_mobile`, `buyer_date`, `buyer_password`) VALUES
(201, 'sravya', 'sravya@gmail.com', 987456321, '2020-02-04', '123'),
(202, 'sindhu', 'sindhu@gmail.com', 986547312, '2020-02-03', '456');

-- --------------------------------------------------------

--
-- Table structure for table `category_table`
--

CREATE TABLE `category_table` (
  `category_id` int(20) NOT NULL,
  `category_name` varchar(20) NOT NULL,
  `category_brief` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category_table`
--

INSERT INTO `category_table` (`category_id`, `category_name`, `category_brief`) VALUES
(301, 'footwear', 'for foot'),
(302, 'electronic appliance', 'tv'),
(303, 'mobiles', 'electronic devices');

-- --------------------------------------------------------

--
-- Table structure for table `item_table`
--

CREATE TABLE `item_table` (
  `item_id` int(20) NOT NULL,
  `item_name` varchar(20) NOT NULL,
  `item_image` varchar(200) NOT NULL,
  `item_price` int(20) NOT NULL,
  `item_stock` int(20) NOT NULL,
  `item_description` varchar(200) NOT NULL,
  `subcategory_id` int(20) NOT NULL,
  `item_remarks` varchar(20) NOT NULL,
  `seller_id` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `item_table`
--

INSERT INTO `item_table` (`item_id`, `item_name`, `item_image`, `item_price`, `item_stock`, `item_description`, `subcategory_id`, `item_remarks`, `seller_id`) VALUES
(501, 'sony', 'https://5.imimg.com/data5/RT/DE/RQ/SELLER-65447592/sony-bravia-led-tv-500x500.jpg', 1000, 20, '4K for everyone with best in class picture quality and Dolby + DTS HD audio for complete cinematic experience, comes with supporting applications like Netflix, Prime Video, Hotstar.', 402, 'good', 101),
(502, 'bata', 'https://assets.charmboard.com/images/w_1920,h_1080/x_383,y_397,w_971,h_549,c_crop,f_auto,q_auto,e_sharpen/h_541/im/lc/859214/bata-in-sushant-kriti-x-bata-bata-india-2018.jpg', 100, 10, 'Experience great comfort walking in this pair of Black Casual Shoes from the house of BATA Featuring a contemporary refined design with exceptional comfort', 401, 'average', 102),
(503, 'OnePlus 7', 'https://fdn.gsmarena.com/imgroot/reviews/19/oneplus-7/lifestyle/-727w2/gsmarena_006.jpg', 35000, 3, 'OnePlus 7 smartphone has a Optic AMOLED display. It measures 157.7 mm x 74.8 mm x 8.2 mm and weighs 182 grams. The screen has a resolution of 1080 x 2340 pixels and 402 ppi pixel density. ', 403, 'very good ', 102);

-- --------------------------------------------------------

--
-- Table structure for table `seller_signup_table`
--

CREATE TABLE `seller_signup_table` (
  `seller_id` int(30) NOT NULL,
  `seller_username` varchar(30) NOT NULL,
  `seller_password` varchar(30) NOT NULL,
  `seller_company` varchar(30) NOT NULL,
  `seller_brief` varchar(30) NOT NULL,
  `seller_gst` int(30) NOT NULL,
  `seller_address` varchar(30) NOT NULL,
  `seller_email` varchar(30) NOT NULL,
  `seller_contact` int(30) NOT NULL,
  `seller_website` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `seller_signup_table`
--

INSERT INTO `seller_signup_table` (`seller_id`, `seller_username`, `seller_password`, `seller_company`, `seller_brief`, `seller_gst`, `seller_address`, `seller_email`, `seller_contact`, `seller_website`) VALUES
(101, 'sindhu', '123', 'Cts', 'Very Good', 100, 'hyderabad', 'abc@gmail.com', 1232456788, 'www.abc.com'),
(102, 'prudhvi', '123', 'cts', 'Good coder', 147, 'hyderabad', 'pro@gmail.com', 125478963, 'www.prudhvi.com');

-- --------------------------------------------------------

--
-- Table structure for table `sub_category_table`
--

CREATE TABLE `sub_category_table` (
  `subcategory_id` int(20) NOT NULL,
  `subcategory_name` varchar(20) NOT NULL,
  `category_id` int(20) NOT NULL,
  `subcategory_brief` varchar(20) NOT NULL,
  `subcategory_gst` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sub_category_table`
--

INSERT INTO `sub_category_table` (`subcategory_id`, `subcategory_name`, `category_id`, `subcategory_brief`, `subcategory_gst`) VALUES
(401, 'sandals', 301, 'for foott', 125),
(402, 'tv', 302, 'watch tv', 147),
(403, 'one plus', 303, '64gb', 10);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bill_details_table`
--
ALTER TABLE `bill_details_table`
  ADD PRIMARY KEY (`bill_details_id`),
  ADD KEY `bill_id` (`bill_id`),
  ADD KEY `item_id` (`item_id`);

--
-- Indexes for table `bill_table`
--
ALTER TABLE `bill_table`
  ADD PRIMARY KEY (`bill_id`),
  ADD KEY `buyer_id` (`buyer_id`);

--
-- Indexes for table `buyer_signup_table`
--
ALTER TABLE `buyer_signup_table`
  ADD PRIMARY KEY (`buyer_id`);

--
-- Indexes for table `category_table`
--
ALTER TABLE `category_table`
  ADD PRIMARY KEY (`category_id`);

--
-- Indexes for table `item_table`
--
ALTER TABLE `item_table`
  ADD PRIMARY KEY (`item_id`),
  ADD KEY `subcategory_id` (`subcategory_id`),
  ADD KEY `seller_id` (`seller_id`);

--
-- Indexes for table `seller_signup_table`
--
ALTER TABLE `seller_signup_table`
  ADD PRIMARY KEY (`seller_id`);

--
-- Indexes for table `sub_category_table`
--
ALTER TABLE `sub_category_table`
  ADD PRIMARY KEY (`subcategory_id`),
  ADD KEY `category_id` (`category_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bill_details_table`
--
ALTER TABLE `bill_details_table`
  MODIFY `bill_details_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=720;

--
-- AUTO_INCREMENT for table `bill_table`
--
ALTER TABLE `bill_table`
  MODIFY `bill_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=617;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bill_details_table`
--
ALTER TABLE `bill_details_table`
  ADD CONSTRAINT `bill_details_table_ibfk_1` FOREIGN KEY (`bill_id`) REFERENCES `bill_table` (`bill_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `bill_details_table_ibfk_2` FOREIGN KEY (`item_id`) REFERENCES `item_table` (`item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `bill_table`
--
ALTER TABLE `bill_table`
  ADD CONSTRAINT `bill_table_ibfk_1` FOREIGN KEY (`buyer_id`) REFERENCES `buyer_signup_table` (`buyer_id`);

--
-- Constraints for table `item_table`
--
ALTER TABLE `item_table`
  ADD CONSTRAINT `item_table_ibfk_1` FOREIGN KEY (`subcategory_id`) REFERENCES `sub_category_table` (`subcategory_id`),
  ADD CONSTRAINT `item_table_ibfk_2` FOREIGN KEY (`seller_id`) REFERENCES `seller_signup_table` (`seller_id`);

--
-- Constraints for table `sub_category_table`
--
ALTER TABLE `sub_category_table`
  ADD CONSTRAINT `sub_category_table_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `category_table` (`category_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
