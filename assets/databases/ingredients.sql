PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;
CREATE TABLE `ingredients` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` text NOT NULL,`cost_per_one` REAL NOT NULL, `metric` text,`measure_by_quantity` INTEGER NOT NULL,`category_id` INTEGER NOT NULL);
INSERT INTO "ingredients" VALUES(1,'Club Orange',0.00123,'ml',0,9);
INSERT INTO "ingredients" VALUES(2,'Coca cola',0.00158,'ml',0,9);
INSERT INTO "ingredients" VALUES(3,'Fanta Lemon',0.00171,'ml',0,9);
INSERT INTO "ingredients" VALUES(4,'Fanta Orange',0.0012,'ml',0,9);
INSERT INTO "ingredients" VALUES(5,'Fior Uisce Sparkling',0.01,'ml',0,9);
INSERT INTO "ingredients" VALUES(6,'Fior Uisce Still',6.0e-05,'ml',0,9);
INSERT INTO "ingredients" VALUES(7,'Kerry Spring Still water',0.00256,'ml',0,9);
INSERT INTO "ingredients" VALUES(8,'Lilt',0.487,'ml',0,9);
INSERT INTO "ingredients" VALUES(9,'Mi Wadi Orange',0.0083,'ml',0,9);
INSERT INTO "ingredients" VALUES(10,'Oasis Citrus',0.00189,'ml',0,9);
INSERT INTO "ingredients" VALUES(11,'Oasis Summer Fruits',0.00189,'ml',0,9);
INSERT INTO "ingredients" VALUES(12,'Pink Lemonade',0.00771,'ml',0,9);
INSERT INTO "ingredients" VALUES(13,'River Rock Forest Fruits',0.0006,'ml',0,9);
INSERT INTO "ingredients" VALUES(14,'River Rock Lemon and Lime',0.0065,'ml',0,9);
INSERT INTO "ingredients" VALUES(15,'River Rock Sparkling',0.009,'ml',0,9);
INSERT INTO "ingredients" VALUES(16,'River Rock Still',0.009,'ml',0,9);
INSERT INTO "ingredients" VALUES(17,'Sprite',0.001,'ml',0,9);
INSERT INTO "ingredients" VALUES(18,'Ardrahan',0.008,'g',0,5);
INSERT INTO "ingredients" VALUES(19,'Brie Cheese Wheel',0.0024,'g',0,5);
INSERT INTO "ingredients" VALUES(20,'Cashel Blue',0.0081,'g',0,5);
INSERT INTO "ingredients" VALUES(21,'Cheddar',0.0071,'g',0,5);
INSERT INTO "ingredients" VALUES(22,'Cottage cheese',0.0044,'g',0,5);
INSERT INTO "ingredients" VALUES(23,'Creme Fraiche',0.0034,'g',0,5);
INSERT INTO "ingredients" VALUES(24,'Durrus Large',0.0116,'g',0,5);
INSERT INTO "ingredients" VALUES(25,'Emmental Cheese',0.0169,'g',0,5);
INSERT INTO "ingredients" VALUES(26,'Feta Cheese',0.017,'g',0,5);
INSERT INTO "ingredients" VALUES(27,'Goats cheese',0.014,'g',0,5);
INSERT INTO "ingredients" VALUES(28,'Gorganzola Cheese',0.0079,'g',0,5);
INSERT INTO "ingredients" VALUES(29,'Halloumi',0.017,'g',0,5);
INSERT INTO "ingredients" VALUES(30,'Laughing Cow Cheese',0.0142,'g',0,5);
INSERT INTO "ingredients" VALUES(31,'Mascarpone Cheese',0.0061,'g',0,5);
INSERT INTO "ingredients" VALUES(32,'Milleens',0.013,'g',0,5);
INSERT INTO "ingredients" VALUES(33,'Mini Babybel',0.29,'g',1,5);
INSERT INTO "ingredients" VALUES(34,'Mozzarella',0.0074,'g',0,5);
INSERT INTO "ingredients" VALUES(35,'Parmesan granaforma grated',0.00815,'g',0,5);
INSERT INTO "ingredients" VALUES(36,'Philadelphia Full Fat',0.012,'g',0,5);
INSERT INTO "ingredients" VALUES(37,'Provolone soft',0.0099,'g',0,5);
INSERT INTO "ingredients" VALUES(38,'Ricotta',0.0058,'g',0,5);
INSERT INTO "ingredients" VALUES(39,'Butter',0.041,'g',0,3);
INSERT INTO "ingredients" VALUES(40,'Butter - mini',0.7,'g',1,3);
INSERT INTO "ingredients" VALUES(41,'Butter - unsalted',0.00639,'g',0,3);
INSERT INTO "ingredients" VALUES(42,'Cream',0.00236,'g',0,3);
INSERT INTO "ingredients" VALUES(43,'Cream - clotted',0.023,'g',0,3);
INSERT INTO "ingredients" VALUES(44,'Creme Anglaise',0.0185,'g',0,3);
INSERT INTO "ingredients" VALUES(45,'Creme brulee',0.0058,'g',0,3);
INSERT INTO "ingredients" VALUES(46,'Cr̬me Fraiche',0.00487,'g',0,3);
INSERT INTO "ingredients" VALUES(47,'Egg Yolks',0.25,'ml',1,3);
INSERT INTO "ingredients" VALUES(48,'Eggs',0.16,'ml',1,3);
INSERT INTO "ingredients" VALUES(49,'Eggs whites',0.25,'ml',1,3);
INSERT INTO "ingredients" VALUES(50,'Eggs - Duck',0.42,'ml',1,3);
INSERT INTO "ingredients" VALUES(51,'Eggs - Quail',0.33,'ml',1,3);
INSERT INTO "ingredients" VALUES(52,'Ice cream -  Glenown',0.069,'g',0,3);
INSERT INTO "ingredients" VALUES(53,'Ice cream -  Glenown bourbon vanilla',0.069,'g',0,3);
INSERT INTO "ingredients" VALUES(54,'Ice cream -  Glenown caramel',0.069,'g',0,3);
INSERT INTO "ingredients" VALUES(55,'Ice cream -  Glenown chocolate',0.069,'g',0,3);
INSERT INTO "ingredients" VALUES(56,'Ice cream -  Glenown mint chococolate',0.069,'g',0,3);
INSERT INTO "ingredients" VALUES(57,'Ice cream -  Movenpeck Panna Cotta Rasp',0.00666,'g',0,3);
INSERT INTO "ingredients" VALUES(58,'Ice cream -  Movenpeck Vanilla Dream',0.0057,'g',0,3);
INSERT INTO "ingredients" VALUES(59,'Ice cream -  Movenpeck Maple Walnut',0.00695,'g',0,3);
INSERT INTO "ingredients" VALUES(60,'Ice cream -  Movenpeck Strawberry 5ltr',0.0069,'g',0,3);
INSERT INTO "ingredients" VALUES(61,'Ice cream -  Movenpeck Swiss Chocolate',0.0063,'g',0,3);
INSERT INTO "ingredients" VALUES(62,'Icecream -  Lux soft chocolate',0.00438,'g',0,3);
INSERT INTO "ingredients" VALUES(63,'Icecream - Lux soft Strawberry',0.00438,'g',0,3);
INSERT INTO "ingredients" VALUES(64,'Icecream -  Lux soft Vanilla',0.00438,'g',0,3);
INSERT INTO "ingredients" VALUES(65,'Margarine - Stork',0.166,'g',0,3);
INSERT INTO "ingredients" VALUES(66,'Milk',0.0059,'g',0,3);
INSERT INTO "ingredients" VALUES(67,'Milk -  Coconut',0.00111,'g',0,3);
INSERT INTO "ingredients" VALUES(68,'Milk -  Condenced',0.0059,'g',0,3);
INSERT INTO "ingredients" VALUES(70,'Milk -  Light',0.0059,'g',0,3);
INSERT INTO "ingredients" VALUES(71,'Milk -  Lactose Free',0.0059,'g',0,3);
INSERT INTO "ingredients" VALUES(72,'Milk- Low Fat',0.00925,'g',0,3);
INSERT INTO "ingredients" VALUES(73,'Smoothies -  Blackberry & Blueberry',2.24,'g',1,3);
INSERT INTO "ingredients" VALUES(74,'Smoothies -  Cranberry & Raspberry',2.24,'g',1,3);
INSERT INTO "ingredients" VALUES(75,'Smoothies -  Mango & Passionfruit',2.24,'g',1,3);
INSERT INTO "ingredients" VALUES(76,'Smoothies - Strawberry',2.24,'g',1,3);
INSERT INTO "ingredients" VALUES(77,'Sorbet -  Raspberry',0.045,'g',0,3);
INSERT INTO "ingredients" VALUES(78,'Yogurt 200g',0.86,'g',1,3);
INSERT INTO "ingredients" VALUES(79,'Yogurt 500g',0.63,'g',1,3);
INSERT INTO "ingredients" VALUES(80,'Yogurt 55g',0.58,'g',1,3);
INSERT INTO "ingredients" VALUES(81,'Bacon -  Back Bacon',0.042,'g',0,8);
INSERT INTO "ingredients" VALUES(82,'Bacon -  Lardons',0.0089,'g',0,8);
INSERT INTO "ingredients" VALUES(83,'Bacon -  Loin of bacon',0.0058,'g',0,8);
INSERT INTO "ingredients" VALUES(84,'Bacon - Pizza Topping',0.019,'g',0,8);
INSERT INTO "ingredients" VALUES(85,'Bacon -  Rashers',0.0211,'g',0,8);
INSERT INTO "ingredients" VALUES(86,'Beef -  Burgers',2.51,'g',1,8);
INSERT INTO "ingredients" VALUES(87,'Beef -  Diced Beef',0.016,'g',0,8);
INSERT INTO "ingredients" VALUES(88,'Beef -  Kababs',0.99,'g',1,8);
INSERT INTO "ingredients" VALUES(89,'Beef -  Meat ball',0.7,'g',1,8);
INSERT INTO "ingredients" VALUES(90,'Beef -  Prime Sirloin Steaks',6.0,'g',1,8);
INSERT INTO "ingredients" VALUES(91,'Beef -  Rib Eye Steak',9.0,'g',1,8);
INSERT INTO "ingredients" VALUES(92,'Beef -  Roast',0.00723,'g',0,8);
INSERT INTO "ingredients" VALUES(93,'Beef -  Round Mince',0.00723,'g',0,8);
INSERT INTO "ingredients" VALUES(94,'Beef - Silverside',0.0059,'g',0,8);
INSERT INTO "ingredients" VALUES(95,'Beef -  Sliced',0.0291,'g',0,8);
INSERT INTO "ingredients" VALUES(96,'Beef -  Striploin',0.014,'g',0,8);
INSERT INTO "ingredients" VALUES(97,'Chicken & Apple Sausages',1.0,'g',1,8);
INSERT INTO "ingredients" VALUES(98,'Chicken - Thighes',0.35,'g',1,8);
INSERT INTO "ingredients" VALUES(99,'Chicken -  Buffalo Wings',0.9,'g',1,8);
INSERT INTO "ingredients" VALUES(100,'Chicken -  Burger',0.002,'g',0,8);
INSERT INTO "ingredients" VALUES(101,'Chicken -  Chilli chicken spring rolls',1.0,'g',1,8);
INSERT INTO "ingredients" VALUES(102,'Chicken -  Fillets',0.4,'g',1,8);
INSERT INTO "ingredients" VALUES(103,'Chicken -  Goujons',2.0,'g',1,8);
INSERT INTO "ingredients" VALUES(104,'Chicken -  Kebabs',0.46,'g',1,8);
INSERT INTO "ingredients" VALUES(105,'Chicken -  Liver',0.99,'g',1,8);
INSERT INTO "ingredients" VALUES(106,'Chicken -  Mince',0.3,'g',1,8);
INSERT INTO "ingredients" VALUES(107,'Chicken -  Nuggets',0.006,'g',0,8);
INSERT INTO "ingredients" VALUES(108,'Chicken -  Whole',0.46,'g',1,8);
INSERT INTO "ingredients" VALUES(109,'Chorizo',0.007,'g',0,8);
INSERT INTO "ingredients" VALUES(110,'Duck -  Breast',20.0,'g',1,8);
INSERT INTO "ingredients" VALUES(111,'Duck -  half',10.65,'g',1,8);
INSERT INTO "ingredients" VALUES(112,'Duck -  Livers',5.0,'g',1,8);
INSERT INTO "ingredients" VALUES(113,'Duck -  Sausages chilli ginger garlic',1.0,'g',1,8);
INSERT INTO "ingredients" VALUES(114,'Duck -  Spring Roll',0.35,'g',1,8);
INSERT INTO "ingredients" VALUES(115,'Duck -  Whole',0.4,'g',1,8);
INSERT INTO "ingredients" VALUES(116,'Gammon Boned & Rolled',0.0023,'g',0,8);
INSERT INTO "ingredients" VALUES(117,'Guinea Fowl',8.14,'g',1,8);
INSERT INTO "ingredients" VALUES(118,'Ham -  Crumbed',0.0021,'g',0,8);
INSERT INTO "ingredients" VALUES(119,'Ham -  Hocks',0.00336,'g',0,8);
INSERT INTO "ingredients" VALUES(120,'Ham -  Sliced',0.0261,'g',0,8);
INSERT INTO "ingredients" VALUES(121,'Lamb -  Burger',1.0,'g',1,8);
INSERT INTO "ingredients" VALUES(122,'Lamb -  Diced',0.011,'g',0,8);
INSERT INTO "ingredients" VALUES(123,'Lamb -  Kidneys',0.00618,'g',1,8);
INSERT INTO "ingredients" VALUES(124,'Lamb -  Leg',15.0,'g',1,8);
INSERT INTO "ingredients" VALUES(125,'Lamb -  Mince',0.0116,'g',0,8);
INSERT INTO "ingredients" VALUES(126,'Lamb -  Rack',0.0066,'g',0,8);
INSERT INTO "ingredients" VALUES(127,'Lamb -  Saddle',0.0098,'g',0,8);
INSERT INTO "ingredients" VALUES(128,'Lamb -  Shank',0.018,'g',0,8);
INSERT INTO "ingredients" VALUES(129,'Lamb -  Shoulder',15.0,'g',1,8);
INSERT INTO "ingredients" VALUES(130,'Lamb - Steak',4.0,'g',1,8);
INSERT INTO "ingredients" VALUES(131,'Lambs Liver',0.7,'g',1,8);
INSERT INTO "ingredients" VALUES(132,'Olives Green Pitted',0.006,'g',0,8);
INSERT INTO "ingredients" VALUES(133,'Olives Oriental Aperitif Mix',0.005,'g',0,8);
INSERT INTO "ingredients" VALUES(134,'Parmaham',0.0022,'g',0,8);
INSERT INTO "ingredients" VALUES(135,'Pastrami',0.025,'g',0,8);
INSERT INTO "ingredients" VALUES(136,'Pheasant terrine with girolles',0.001,'g',0,8);
INSERT INTO "ingredients" VALUES(137,'Pork & Leek sauages',0.0121,'g',1,8);
INSERT INTO "ingredients" VALUES(138,'Pork -  BBQ Pork Belly Spare Ribs',0.0026,'g',0,8);
INSERT INTO "ingredients" VALUES(139,'Pork -  Black Pudding',2.59,'g',1,8);
INSERT INTO "ingredients" VALUES(140,'Pork -  Boneless Loin of Pork B/R',0.009,'g',0,8);
INSERT INTO "ingredients" VALUES(141,'Pork -  Chop',0.005,'g',0,8);
INSERT INTO "ingredients" VALUES(142,'Pork -  Cocktail Sausages',0.0121,'g',0,8);
INSERT INTO "ingredients" VALUES(143,'Pork -  Crepine Caul Fat',0.0039,'g',0,8);
INSERT INTO "ingredients" VALUES(144,'Pork -  Gammon',0.0035,'g',0,8);
INSERT INTO "ingredients" VALUES(145,'Pork -  Hot dog sausages',0.008,'g',1,8);
INSERT INTO "ingredients" VALUES(146,'Pork -  Kidney',0.0221,'g',1,8);
INSERT INTO "ingredients" VALUES(147,'Pork -  Leek and black pepper sauce',0.0039,'g',0,8);
INSERT INTO "ingredients" VALUES(148,'Pork -  Leg',0.00742,'g',1,8);
INSERT INTO "ingredients" VALUES(149,'Pork -  Mortadella',0.022,'g',0,8);
INSERT INTO "ingredients" VALUES(150,'Pork -  Pancetta rolled',0.0103,'g',0,8);
INSERT INTO "ingredients" VALUES(151,'Pork -  Pulled BBQ style',0.042,'g',0,8);
INSERT INTO "ingredients" VALUES(152,'Pork -  Rashers Rindless',0.00193,'g',0,8);
INSERT INTO "ingredients" VALUES(153,'Pork -  Sausage Meat',0.003,'g',0,8);
INSERT INTO "ingredients" VALUES(154,'Pork -  Sausages',0.35,'g',1,8);
INSERT INTO "ingredients" VALUES(155,'Pork -  Smoked Streaky Slab',0.008,'g',0,8);
INSERT INTO "ingredients" VALUES(156,'Pork -  Steaks',0.007,'g',0,8);
INSERT INTO "ingredients" VALUES(157,'Pork -  White Pudding',2.59,'g',1,8);
INSERT INTO "ingredients" VALUES(158,'Stuffing -  Turkey & Ham herb',0.009,'g',0,8);
INSERT INTO "ingredients" VALUES(159,'Turkey Breast',2.0,'g',1,8);
INSERT INTO "ingredients" VALUES(160,'Turkey Butterfly',0.00098,'g',0,8);
INSERT INTO "ingredients" VALUES(161,'Turkey crown',25.0,'g',1,8);
INSERT INTO "ingredients" VALUES(162,'Turkey Legs',3.37,'g',1,8);
INSERT INTO "ingredients" VALUES(163,'Veal -  Bones',0.00077,'g',0,8);
INSERT INTO "ingredients" VALUES(164,'Venison sausages',10.0,'g',1,8);
INSERT INTO "ingredients" VALUES(165,'Venison steaks',0.7,'g',1,8);
INSERT INTO "ingredients" VALUES(166,'Anchovies -  Marinated',0.014,'g',0,7);
INSERT INTO "ingredients" VALUES(167,'Anchovy Fillets in Oil',0.016,'g',0,7);
INSERT INTO "ingredients" VALUES(168,'Black sole',0.02,'g',0,7);
INSERT INTO "ingredients" VALUES(169,'Blossom Fillets',0.01026,'g',0,7);
INSERT INTO "ingredients" VALUES(170,'Breaded cod goujon',0.175,'g',0,7);
INSERT INTO "ingredients" VALUES(171,'Clams',0.016,'g',0,7);
INSERT INTO "ingredients" VALUES(172,'Cod Fillet',0.0188,'g',0,7);
INSERT INTO "ingredients" VALUES(173,'Cod fillets -  salted',0.016,'g',0,7);
INSERT INTO "ingredients" VALUES(174,'Cod -  in beer batter',0.007,'g',0,7);
INSERT INTO "ingredients" VALUES(175,'Cod - Smoked',0.031,'g',0,7);
INSERT INTO "ingredients" VALUES(176,'Cold water prawns',3.25,'g',1,7);
INSERT INTO "ingredients" VALUES(177,'Crab cakes',0.032,'g',0,7);
INSERT INTO "ingredients" VALUES(178,'Crab Claws',0.04,'g',0,7);
INSERT INTO "ingredients" VALUES(179,'Crab meat',0.014,'g',0,7);
INSERT INTO "ingredients" VALUES(180,'Cray Fish in brine',3.25,'g',1,7);
INSERT INTO "ingredients" VALUES(181,'Fish cake',0.048,'g',1,7);
INSERT INTO "ingredients" VALUES(182,'Fish - Kippers',0.24,'g',0,7);
INSERT INTO "ingredients" VALUES(183,'Fishbones',0.006,'g',0,7);
INSERT INTO "ingredients" VALUES(184,'Gurnard fillets',0.009,'g',0,7);
INSERT INTO "ingredients" VALUES(185,'Haddock',0.054,'g',0,7);
INSERT INTO "ingredients" VALUES(186,'Haddock fillet',0.062,'g',0,7);
INSERT INTO "ingredients" VALUES(187,'Haddock -  smoked',0.009,'g',0,7);
INSERT INTO "ingredients" VALUES(188,'Hake fillet',0.0039,'g',0,7);
INSERT INTO "ingredients" VALUES(189,'Halibut fillet',0.714,'g',0,7);
INSERT INTO "ingredients" VALUES(190,'Herring rollmops/gherkins',0.0215,'g',0,7);
INSERT INTO "ingredients" VALUES(191,'Languistine',0.014,'g',0,7);
INSERT INTO "ingredients" VALUES(192,'Lemon sole fillets',0.01,'g',0,7);
INSERT INTO "ingredients" VALUES(193,'Lobster Terrine',0.139,'g',0,7);
INSERT INTO "ingredients" VALUES(194,'Mackeral -  Smoked',0.069,'g',0,7);
INSERT INTO "ingredients" VALUES(195,'Mackeral Fillets',0.01,'g',0,7);
INSERT INTO "ingredients" VALUES(196,'Marlon loin',0.0105,'g',0,7);
INSERT INTO "ingredients" VALUES(197,'Mixed fish',0.0029,'g',0,7);
INSERT INTO "ingredients" VALUES(198,'Mussels',0.154,'g',1,7);
INSERT INTO "ingredients" VALUES(199,'Oysters',0.02,'g',0,7);
INSERT INTO "ingredients" VALUES(200,'Plaice fillet',0.032,'g',0,7);
INSERT INTO "ingredients" VALUES(201,'Prawn heads',0.145,'g',0,7);
INSERT INTO "ingredients" VALUES(202,'Prawns',0.0215,'g',0,7);
INSERT INTO "ingredients" VALUES(203,'Ray wings',0.00135,'g',0,7);
INSERT INTO "ingredients" VALUES(204,'Rissotto fish cake hake',0.015,'g',1,7);
INSERT INTO "ingredients" VALUES(205,'Salmon Cutlets',0.0059,'g',0,7);
INSERT INTO "ingredients" VALUES(206,'Salmon fillet',0.055,'g',0,7);
INSERT INTO "ingredients" VALUES(207,'Salmon fish cake',3.25,'g',1,7);
INSERT INTO "ingredients" VALUES(208,'Salmon Roe',0.129,'g',0,7);
INSERT INTO "ingredients" VALUES(209,'Salmon steaks',0.0059,'g',0,7);
INSERT INTO "ingredients" VALUES(210,'Salmon terrine',0.014,'g',0,7);
INSERT INTO "ingredients" VALUES(211,'Salmon - Smoked',0.019,'g',0,7);
INSERT INTO "ingredients" VALUES(212,'Seabass fillets',0.0028,'g',0,7);
INSERT INTO "ingredients" VALUES(213,'Seabream fillets',0.087,'g',0,7);
INSERT INTO "ingredients" VALUES(214,'Seatrout fillet',0.5,'g',0,7);
INSERT INTO "ingredients" VALUES(215,'Shrimp - Brown',0.0043,'g',0,7);
INSERT INTO "ingredients" VALUES(216,'Smoked Mackeral',0.014,'g',0,7);
INSERT INTO "ingredients" VALUES(217,'Sole fillets',0.0115,'g',0,7);
INSERT INTO "ingredients" VALUES(218,'Squid',0.0047,'g',0,7);
INSERT INTO "ingredients" VALUES(219,'Swordfish steaks',0.0132,'g',0,7);
INSERT INTO "ingredients" VALUES(220,'Tiger prawns',0.00215,'g',0,7);
INSERT INTO "ingredients" VALUES(221,'Trout - Rainbow',0.087,'g',0,7);
INSERT INTO "ingredients" VALUES(222,'Trout - Smoked',0.0105,'g',0,7);
INSERT INTO "ingredients" VALUES(223,'Tuna Steak',0.0023,'g',0,7);
INSERT INTO "ingredients" VALUES(224,'Whiting fillets',0.007,'g',0,7);
INSERT INTO "ingredients" VALUES(225,'Apples',0.31,'g',1,1);
INSERT INTO "ingredients" VALUES(226,'Asparagus',0.01,'g',0,1);
INSERT INTO "ingredients" VALUES(227,'Aubergines',0.6,'g',1,1);
INSERT INTO "ingredients" VALUES(228,'Avocado',1.2,'g',1,4);
INSERT INTO "ingredients" VALUES(229,'Baby Corn',0.00118,'g',0,1);
INSERT INTO "ingredients" VALUES(230,'Bean sprouts',0.01377,'g',0,1);
INSERT INTO "ingredients" VALUES(231,'Beans',0.0415,'g',0,1);
INSERT INTO "ingredients" VALUES(232,'Beetroot',0.2,'g',1,1);
INSERT INTO "ingredients" VALUES(233,'Broccoli',0.0285,'g',0,1);
INSERT INTO "ingredients" VALUES(234,'Brussel Sprouts',0.5714,'g',0,1);
INSERT INTO "ingredients" VALUES(235,'Butternut squash',1.2,'g',1,1);
INSERT INTO "ingredients" VALUES(236,'Cabbage',0.0012,'g',0,1);
INSERT INTO "ingredients" VALUES(237,'Carrots',0.0277,'g',0,1);
INSERT INTO "ingredients" VALUES(238,'Cauliflower',0.0012,'g',0,1);
INSERT INTO "ingredients" VALUES(239,'Cannellini Bean''s',0.0025,'g',0,1);
INSERT INTO "ingredients" VALUES(240,'Celeriac',0.00738,'g',0,1);
INSERT INTO "ingredients" VALUES(241,'Celery',0.00144,'g',0,1);
INSERT INTO "ingredients" VALUES(242,'Chestnuts',0.014,'g',0,1);
INSERT INTO "ingredients" VALUES(243,'Chick pea''s',0.0025,'g',0,1);
INSERT INTO "ingredients" VALUES(244,'Chips',0.388,'g',0,1);
INSERT INTO "ingredients" VALUES(245,'Coleslaw',0.003,'g',0,1);
INSERT INTO "ingredients" VALUES(246,'Corn on the Cob',0.055,'g',0,1);
INSERT INTO "ingredients" VALUES(247,'Courgette',0.4,'g',1,1);
INSERT INTO "ingredients" VALUES(248,'Cucumber',0.59,'g',1,1);
INSERT INTO "ingredients" VALUES(249,'Currents',0.0055,'g',1,1);
INSERT INTO "ingredients" VALUES(250,'Dates',0.015,'g',0,1);
INSERT INTO "ingredients" VALUES(251,'Falafel',0.2,'g',1,1);
INSERT INTO "ingredients" VALUES(252,'Fennel',0.057,'g',0,1);
INSERT INTO "ingredients" VALUES(253,'French Beans',0.0415,'g',0,1);
INSERT INTO "ingredients" VALUES(254,'Fries -  sweet potato',0.1543,'g',0,1);
INSERT INTO "ingredients" VALUES(255,'Garlic',0.009,'g',0,1);
INSERT INTO "ingredients" VALUES(256,'Ginger',0.016,'g',0,1);
INSERT INTO "ingredients" VALUES(257,'Hashbrowns',0.15,'g',1,1);
INSERT INTO "ingredients" VALUES(258,'Jalapeno peppers',0.003,'g',0,1);
INSERT INTO "ingredients" VALUES(259,'Juniper Berries',0.016,'g',0,1);
INSERT INTO "ingredients" VALUES(260,'Kale',0.012,'g',0,1);
INSERT INTO "ingredients" VALUES(261,'Kiwi',0.4,'g',0,1);
INSERT INTO "ingredients" VALUES(262,'Leek',0.5,'g',1,1);
INSERT INTO "ingredients" VALUES(263,'Lemon grass',0.85,'g',1,1);
INSERT INTO "ingredients" VALUES(264,'Lettuce',0.0133,'g',0,1);
INSERT INTO "ingredients" VALUES(265,'Lettuce - Rocket',0.0109,'g',0,1);
INSERT INTO "ingredients" VALUES(266,'Lentils',0.011,'g',0,1);
INSERT INTO "ingredients" VALUES(267,'Lollo Rossa',0.00542,'g',0,1);
INSERT INTO "ingredients" VALUES(268,'Mangetout',0.0415,'g',0,1);
INSERT INTO "ingredients" VALUES(269,'Melon',2.5,'g',1,1);
INSERT INTO "ingredients" VALUES(270,'Mushrooms',0.0789,'g',0,1);
INSERT INTO "ingredients" VALUES(271,'Onion - Red',0.00073,'g',0,1);
INSERT INTO "ingredients" VALUES(272,'Onions',0.00073,'g',0,1);
INSERT INTO "ingredients" VALUES(273,'Onions - Battered',0.00221,'g',0,1);
INSERT INTO "ingredients" VALUES(274,'Parsnips',0.0022,'g',0,1);
INSERT INTO "ingredients" VALUES(275,'Pears',0.085,'g',0,1);
INSERT INTO "ingredients" VALUES(276,'Pea''s',0.842,'g',0,1);
INSERT INTO "ingredients" VALUES(277,'Peppers - mixed',0.017,'g',0,1);
INSERT INTO "ingredients" VALUES(278,'Peppers',0.017,'g',0,1);
INSERT INTO "ingredients" VALUES(279,'Plums',0.232,'g',0,1);
INSERT INTO "ingredients" VALUES(280,'Pok choi',0.012,'g',0,1);
INSERT INTO "ingredients" VALUES(281,'Potatoes',0.0008,'g',0,1);
INSERT INTO "ingredients" VALUES(282,'Pumpkin',0.0419,'g',0,1);
INSERT INTO "ingredients" VALUES(283,'Puy Lentils',0.0057,'g',0,1);
INSERT INTO "ingredients" VALUES(284,'Radish',0.0057,'g',0,1);
INSERT INTO "ingredients" VALUES(285,'Ratatouille Mix',0.0055,'g',0,1);
INSERT INTO "ingredients" VALUES(286,'Chilli',0.15,'g',1,1);
INSERT INTO "ingredients" VALUES(287,'Rocolla Baby',0.0109,'g',0,1);
INSERT INTO "ingredients" VALUES(288,'Rocolla Herb',0.0109,'g',0,1);
INSERT INTO "ingredients" VALUES(289,'Samphire',0.0301,'g',0,1);
INSERT INTO "ingredients" VALUES(290,'Scallions',0.0111,'g',0,1);
INSERT INTO "ingredients" VALUES(291,'Soup',0.025,'g',0,1);
INSERT INTO "ingredients" VALUES(292,'Soup 1 litre',2.0,'g',1,1);
INSERT INTO "ingredients" VALUES(293,'Soup Mix',0.00225,'g',0,1);
INSERT INTO "ingredients" VALUES(294,'Spinach',0.0026,'g',0,1);
INSERT INTO "ingredients" VALUES(295,'Swede',0.7,'g',1,1);
INSERT INTO "ingredients" VALUES(296,'Sweet Potato fries',0.0046,'g',0,1);
INSERT INTO "ingredients" VALUES(297,'Tofu',0.01,'g',0,1);
INSERT INTO "ingredients" VALUES(298,'Tomato',0.0142,'g',0,1);
INSERT INTO "ingredients" VALUES(299,'Tomato - Cherry',0.00261,'g',0,1);
INSERT INTO "ingredients" VALUES(300,'Tomato -  Tin 400g',1.19,'g',1,1);
INSERT INTO "ingredients" VALUES(301,'Turnip',0.0318,'g',1,1);
INSERT INTO "ingredients" VALUES(302,'Watercress',0.01,'g',0,1);
INSERT INTO "ingredients" VALUES(303,'Wedges',0.002,'g',0,1);
INSERT INTO "ingredients" VALUES(305,'Apricots - Dried',0.00984,'g',0,4);
INSERT INTO "ingredients" VALUES(307,'Banana',0.12,'g',1,4);
INSERT INTO "ingredients" VALUES(308,'Banana Chips',0.001,'g',0,4);
INSERT INTO "ingredients" VALUES(309,'Blackberries',0.064,'g',0,4);
INSERT INTO "ingredients" VALUES(310,'Blueberries',0.0128,'g',0,4);
INSERT INTO "ingredients" VALUES(311,'Brazil Nuts',0.0185,'g',0,4);
INSERT INTO "ingredients" VALUES(312,'Cashew nuts',0.1805,'g',0,4);
INSERT INTO "ingredients" VALUES(313,'Cherries',0.005,'g',0,4);
INSERT INTO "ingredients" VALUES(314,'Chocolate Raisins case',0.792,'g',0,4);
INSERT INTO "ingredients" VALUES(315,'Clementines',0.243,'g',0,4);
INSERT INTO "ingredients" VALUES(316,'Cranberries',0.0978,'g',0,4);
INSERT INTO "ingredients" VALUES(317,'Fig',0.75,'g',1,4);
INSERT INTO "ingredients" VALUES(318,'Goji Berry',0.0073,'g',0,4);
INSERT INTO "ingredients" VALUES(319,'Gooseberries',0.0128,'g',0,4);
INSERT INTO "ingredients" VALUES(320,'Granola',0.792,'g',0,4);
INSERT INTO "ingredients" VALUES(321,'Grape',0.75,'g',1,4);
INSERT INTO "ingredients" VALUES(322,'Grapes',0.03,'g',0,4);
INSERT INTO "ingredients" VALUES(323,'Kiwi',0.5,'g',1,4);
INSERT INTO "ingredients" VALUES(324,'Lemons',0.39,'g',1,4);
INSERT INTO "ingredients" VALUES(325,'Limes',0.5,'g',1,4);
INSERT INTO "ingredients" VALUES(326,'Mango',2.0,'g',1,4);
INSERT INTO "ingredients" VALUES(327,'Melon',2.5,'g',1,4);
INSERT INTO "ingredients" VALUES(328,'Mixed fruit berries',0.01,'g',0,4);
INSERT INTO "ingredients" VALUES(329,'Mumbai Mix case',0.792,'g',0,4);
INSERT INTO "ingredients" VALUES(330,'Oranges',0.87,'g',1,4);
INSERT INTO "ingredients" VALUES(331,'Passion',0.8,'g',1,4);
INSERT INTO "ingredients" VALUES(332,'Paw Paw',0.85,'g',0,4);
INSERT INTO "ingredients" VALUES(333,'Peach',0.085,'g',0,4);
INSERT INTO "ingredients" VALUES(334,'Pineapple',1.3,'g',1,4);
INSERT INTO "ingredients" VALUES(335,'Plum',0.243,'g',1,4);
INSERT INTO "ingredients" VALUES(336,'Raspberries',0.016,'g',0,4);
INSERT INTO "ingredients" VALUES(337,'Coulis',0.023,'g',0,4);
INSERT INTO "ingredients" VALUES(338,'Red Currants',0.0779,'g',0,4);
INSERT INTO "ingredients" VALUES(339,'Rhubarb',0.79,'g',1,4);
INSERT INTO "ingredients" VALUES(340,'Cashews',0.1805,'g',0,4);
INSERT INTO "ingredients" VALUES(341,'Satsuma',0.0013,'g',0,4);
INSERT INTO "ingredients" VALUES(342,'Star',0.027,'g',0,4);
INSERT INTO "ingredients" VALUES(343,'Strawberries',0.0153,'g',0,4);
INSERT INTO "ingredients" VALUES(344,'Wasabi Peas Good',0.667,'g',0,4);
INSERT INTO "ingredients" VALUES(345,'Water Melon',3.2,'g',1,4);
INSERT INTO "ingredients" VALUES(346,'Yoghurt Raisins case',0.667,'g',0,4);
INSERT INTO "ingredients" VALUES(347,'Bread',0.043,'g',1,2);
INSERT INTO "ingredients" VALUES(348,'Bread - Brown',0.029,'g',0,2);
INSERT INTO "ingredients" VALUES(349,'Cous cous',0.0065,'g',0,2);
INSERT INTO "ingredients" VALUES(350,'Gnocchi',0.002,'g',0,2);
INSERT INTO "ingredients" VALUES(351,'Lentils',0.0057,'g',0,2);
INSERT INTO "ingredients" VALUES(352,'Noodles',0.0093,'g',0,2);
INSERT INTO "ingredients" VALUES(353,'Pasta',0.042,'g',0,2);
INSERT INTO "ingredients" VALUES(354,'Pasta - Fusilli',0.0019,'g',0,2);
INSERT INTO "ingredients" VALUES(355,'Pasta - Linguine',0.0027,'g',0,2);
INSERT INTO "ingredients" VALUES(356,'Pasta -  Macaroni',0.0019,'g',0,2);
INSERT INTO "ingredients" VALUES(357,'Pasta -  Penne',0.0019,'g',0,2);
INSERT INTO "ingredients" VALUES(358,'Pasta -  Sheets',0.0045,'g',0,2);
INSERT INTO "ingredients" VALUES(359,'Pasta -  Spagetti',0.0027,'g',0,2);
INSERT INTO "ingredients" VALUES(360,'Pasta',0.022,'g',0,2);
INSERT INTO "ingredients" VALUES(361,'Rice -  Basmati',0.0087,'g',0,2);
INSERT INTO "ingredients" VALUES(362,'Rice -  Risotto',0.043,'g',0,2);
INSERT INTO "ingredients" VALUES(363,'Sauce -  Cheese',0.006,'g',0,2);
INSERT INTO "ingredients" VALUES(364,'Sauce -  Curry',0.0075,'g',0,2);
INSERT INTO "ingredients" VALUES(365,'Sauce -  Horseradish',0.082,'g',0,2);
INSERT INTO "ingredients" VALUES(366,'Sauce -  Mustard',0.011,'g',0,2);
INSERT INTO "ingredients" VALUES(367,'Sauce -  Tartar',0.082,'g',0,2);
INSERT INTO "ingredients" VALUES(368,'Sauce -  Tomato',0.061,'g',0,2);
INSERT INTO "ingredients" VALUES(369,'Porridge',0.00183,'g',0,2);
INSERT INTO "ingredients" VALUES(370,'Basil',0.0195,'g',0,6);
INSERT INTO "ingredients" VALUES(371,'Bay Leaf',0.1041,'g',0,6);
INSERT INTO "ingredients" VALUES(372,'Chervil',0.0785,'g',0,6);
INSERT INTO "ingredients" VALUES(373,'Chives',0.044,'g',0,6);
INSERT INTO "ingredients" VALUES(374,'Coriander',0.01,'g',0,6);
INSERT INTO "ingredients" VALUES(375,'Dill',0.1041,'g',0,6);
INSERT INTO "ingredients" VALUES(376,'Garnish',0.005,'g',0,6);
INSERT INTO "ingredients" VALUES(377,'Lemon grass',0.044,'g',1,6);
INSERT INTO "ingredients" VALUES(378,'Oregano',0.08,'g',0,6);
INSERT INTO "ingredients" VALUES(379,'Parsley',0.0123,'g',0,6);
INSERT INTO "ingredients" VALUES(380,'Rosemary',0.012,'g',0,6);
INSERT INTO "ingredients" VALUES(381,'Sage',0.0195,'g',0,6);
INSERT INTO "ingredients" VALUES(382,'Tarragon',0.012,'g',0,6);
INSERT INTO "ingredients" VALUES(383,'Thyme',0.012,'g',0,6);
COMMIT;
1,Club Orange,0.00123,ml,0,9
2,Coca cola,0.00158,ml,0,9
3,Fanta Lemon,0.00171,ml,0,9
4,Fanta Orange,0.0012,ml,0,9
5,Fior Uisce Sparkling,0.01,ml,0,9
6,Fior Uisce Still,6.0e-05,ml,0,9
7,Kerry Spring Still water,0.00256,ml,0,9
8,Lilt,0.487,ml,0,9
9,Mi Wadi Orange,0.0083,ml,0,9
10,Oasis Citrus,0.00189,ml,0,9
11,Oasis Summer Fruits,0.00189,ml,0,9
12,Pink Lemonade,0.00771,ml,0,9
13,River Rock Forest Fruits,0.0006,ml,0,9
14,River Rock Lemon and Lime,0.0065,ml,0,9
15,River Rock Sparkling,0.009,ml,0,9
16,River Rock Still,0.009,ml,0,9
17,Sprite,0.001,ml,0,9
18,Ardrahan,0.008,g,0,5
19,Brie Cheese Wheel,0.0024,g,0,5
20,Cashel Blue,0.0081,g,0,5
21,Cheddar,0.0071,g,0,5
22,Cottage cheese,0.0044,g,0,5
23,Creme Fraiche,0.0034,g,0,5
24,Durrus Large,0.0116,g,0,5
25,Emmental Cheese,0.0169,g,0,5
26,Feta Cheese,0.017,g,0,5
27,Goats cheese,0.014,g,0,5
28,Gorganzola Cheese,0.0079,g,0,5
29,Halloumi,0.017,g,0,5
30,Laughing Cow Cheese,0.0142,g,0,5
31,Mascarpone Cheese,0.0061,g,0,5
32,Milleens,0.013,g,0,5
33,Mini Babybel,0.29,g,1,5
34,Mozzarella,0.0074,g,0,5
35,Parmesan granaforma grated,0.00815,g,0,5
36,Philadelphia Full Fat,0.012,g,0,5
37,Provolone soft,0.0099,g,0,5
38,Ricotta,0.0058,g,0,5
39,Butter,0.041,g,0,3
40,Butter - mini,0.7,g,1,3
41,Butter - unsalted,0.00639,g,0,3
42,Cream,0.00236,g,0,3
43,Cream - clotted,0.023,g,0,3
44,Creme Anglaise,0.0185,g,0,3
45,Creme brulee,0.0058,g,0,3
46,Cr̬me Fraiche,0.00487,g,0,3
47,Egg Yolks,0.25,ml,1,3
48,Eggs,0.16,ml,1,3
49,Eggs whites,0.25,ml,1,3
50,Eggs - Duck,0.42,ml,1,3
51,Eggs - Quail,0.33,ml,1,3
52,Ice cream -  Glenown,0.069,g,0,3
53,Ice cream -  Glenown bourbon vanilla,0.069,g,0,3
54,Ice cream -  Glenown caramel,0.069,g,0,3
55,Ice cream -  Glenown chocolate,0.069,g,0,3
56,Ice cream -  Glenown mint chococolate,0.069,g,0,3
57,Ice cream -  Movenpeck Panna Cotta Rasp,0.00666,g,0,3
58,Ice cream -  Movenpeck Vanilla Dream,0.0057,g,0,3
59,Ice cream -  Movenpeck Maple Walnut,0.00695,g,0,3
60,Ice cream -  Movenpeck Strawberry 5ltr,0.0069,g,0,3
61,Ice cream -  Movenpeck Swiss Chocolate,0.0063,g,0,3
62,Icecream -  Lux soft chocolate,0.00438,g,0,3
63,Icecream - Lux soft Strawberry,0.00438,g,0,3
64,Icecream -  Lux soft Vanilla,0.00438,g,0,3
65,Margarine - Stork,0.166,g,0,3
66,Milk,0.0059,g,0,3
67,Milk -  Coconut,0.00111,g,0,3
68,Milk -  Condenced,0.0059,g,0,3
70,Milk -  Light,0.0059,g,0,3
71,Milk -  Lactose Free,0.0059,g,0,3
72,Milk- Low Fat,0.00925,g,0,3
73,Smoothies -  Blackberry & Blueberry,2.24,g,1,3
74,Smoothies -  Cranberry & Raspberry,2.24,g,1,3
75,Smoothies -  Mango & Passionfruit,2.24,g,1,3
76,Smoothies - Strawberry,2.24,g,1,3
77,Sorbet -  Raspberry,0.045,g,0,3
78,Yogurt 200g,0.86,g,1,3
79,Yogurt 500g,0.63,g,1,3
80,Yogurt 55g,0.58,g,1,3
81,Bacon -  Back Bacon,0.042,g,0,8
82,Bacon -  Lardons,0.0089,g,0,8
83,Bacon -  Loin of bacon,0.0058,g,0,8
84,Bacon - Pizza Topping,0.019,g,0,8
85,Bacon -  Rashers,0.0211,g,0,8
86,Beef -  Burgers,2.51,g,1,8
87,Beef -  Diced Beef,0.016,g,0,8
88,Beef -  Kababs,0.99,g,1,8
89,Beef -  Meat ball,0.7,g,1,8
90,Beef -  Prime Sirloin Steaks,6.0,g,1,8
91,Beef -  Rib Eye Steak,9.0,g,1,8
92,Beef -  Roast,0.00723,g,0,8
93,Beef -  Round Mince,0.00723,g,0,8
94,Beef - Silverside,0.0059,g,0,8
95,Beef -  Sliced,0.0291,g,0,8
96,Beef -  Striploin,0.014,g,0,8
97,Chicken & Apple Sausages,1.0,g,1,8
98,Chicken - Thighes,0.35,g,1,8
99,Chicken -  Buffalo Wings,0.9,g,1,8
100,Chicken -  Burger,0.002,g,0,8
101,Chicken -  Chilli chicken spring rolls,1.0,g,1,8
102,Chicken -  Fillets,0.4,g,1,8
103,Chicken -  Goujons,2.0,g,1,8
104,Chicken -  Kebabs,0.46,g,1,8
105,Chicken -  Liver,0.99,g,1,8
106,Chicken -  Mince,0.3,g,1,8
107,Chicken -  Nuggets,0.006,g,0,8
108,Chicken -  Whole,0.46,g,1,8
109,Chorizo,0.007,g,0,8
110,Duck -  Breast,20.0,g,1,8
111,Duck -  half,10.65,g,1,8
112,Duck -  Livers,5.0,g,1,8
113,Duck -  Sausages chilli ginger garlic,1.0,g,1,8
114,Duck -  Spring Roll,0.35,g,1,8
115,Duck -  Whole,0.4,g,1,8
116,Gammon Boned & Rolled,0.0023,g,0,8
117,Guinea Fowl,8.14,g,1,8
118,Ham -  Crumbed,0.0021,g,0,8
119,Ham -  Hocks,0.00336,g,0,8
120,Ham -  Sliced,0.0261,g,0,8
121,Lamb -  Burger,1.0,g,1,8
122,Lamb -  Diced,0.011,g,0,8
123,Lamb -  Kidneys,0.00618,g,1,8
124,Lamb -  Leg,15.0,g,1,8
125,Lamb -  Mince,0.0116,g,0,8
126,Lamb -  Rack,0.0066,g,0,8
127,Lamb -  Saddle,0.0098,g,0,8
128,Lamb -  Shank,0.018,g,0,8
129,Lamb -  Shoulder,15.0,g,1,8
130,Lamb - Steak,4.0,g,1,8
131,Lambs Liver,0.7,g,1,8
132,Olives Green Pitted,0.006,g,0,8
133,Olives Oriental Aperitif Mix,0.005,g,0,8
134,Parmaham,0.0022,g,0,8
135,Pastrami,0.025,g,0,8
136,Pheasant terrine with girolles,0.001,g,0,8
137,Pork & Leek sauages,0.0121,g,1,8
138,Pork -  BBQ Pork Belly Spare Ribs,0.0026,g,0,8
139,Pork -  Black Pudding,2.59,g,1,8
140,Pork -  Boneless Loin of Pork B/R,0.009,g,0,8
141,Pork -  Chop,0.005,g,0,8
142,Pork -  Cocktail Sausages,0.0121,g,0,8
143,Pork -  Crepine Caul Fat,0.0039,g,0,8
144,Pork -  Gammon,0.0035,g,0,8
145,Pork -  Hot dog sausages,0.008,g,1,8
146,Pork -  Kidney,0.0221,g,1,8
147,Pork -  Leek and black pepper sauce,0.0039,g,0,8
148,Pork -  Leg,0.00742,g,1,8
149,Pork -  Mortadella,0.022,g,0,8
150,Pork -  Pancetta rolled,0.0103,g,0,8
151,Pork -  Pulled BBQ style,0.042,g,0,8
152,Pork -  Rashers Rindless,0.00193,g,0,8
153,Pork -  Sausage Meat,0.003,g,0,8
154,Pork -  Sausages,0.35,g,1,8
155,Pork -  Smoked Streaky Slab,0.008,g,0,8
156,Pork -  Steaks,0.007,g,0,8
157,Pork -  White Pudding,2.59,g,1,8
158,Stuffing -  Turkey & Ham herb,0.009,g,0,8
159,Turkey Breast,2.0,g,1,8
160,Turkey Butterfly,0.00098,g,0,8
161,Turkey crown,25.0,g,1,8
162,Turkey Legs,3.37,g,1,8
163,Veal -  Bones,0.00077,g,0,8
164,Venison sausages,10.0,g,1,8
165,Venison steaks,0.7,g,1,8
166,Anchovies -  Marinated,0.014,g,0,7
167,Anchovy Fillets in Oil,0.016,g,0,7
168,Black sole,0.02,g,0,7
169,Blossom Fillets,0.01026,g,0,7
170,Breaded cod goujon,0.175,g,0,7
171,Clams,0.016,g,0,7
172,Cod Fillet,0.0188,g,0,7
173,Cod fillets -  salted,0.016,g,0,7
174,Cod -  in beer batter,0.007,g,0,7
175,Cod - Smoked,0.031,g,0,7
176,Cold water prawns,3.25,g,1,7
177,Crab cakes,0.032,g,0,7
178,Crab Claws,0.04,g,0,7
179,Crab meat,0.014,g,0,7
180,Cray Fish in brine,3.25,g,1,7
181,Fish cake,0.048,g,1,7
182,Fish - Kippers,0.24,g,0,7
183,Fishbones,0.006,g,0,7
184,Gurnard fillets,0.009,g,0,7
185,Haddock,0.054,g,0,7
186,Haddock fillet,0.062,g,0,7
187,Haddock -  smoked,0.009,g,0,7
188,Hake fillet,0.0039,g,0,7
189,Halibut fillet,0.714,g,0,7
190,Herring rollmops/gherkins,0.0215,g,0,7
191,Languistine,0.014,g,0,7
192,Lemon sole fillets,0.01,g,0,7
193,Lobster Terrine,0.139,g,0,7
194,Mackeral -  Smoked,0.069,g,0,7
195,Mackeral Fillets,0.01,g,0,7
196,Marlon loin,0.0105,g,0,7
197,Mixed fish,0.0029,g,0,7
198,Mussels,0.154,g,1,7
199,Oysters,0.02,g,0,7
200,Plaice fillet,0.032,g,0,7
201,Prawn heads,0.145,g,0,7
202,Prawns,0.0215,g,0,7
203,Ray wings,0.00135,g,0,7
204,Rissotto fish cake hake,0.015,g,1,7
205,Salmon Cutlets,0.0059,g,0,7
206,Salmon fillet,0.055,g,0,7
207,Salmon fish cake,3.25,g,1,7
208,Salmon Roe,0.129,g,0,7
209,Salmon steaks,0.0059,g,0,7
210,Salmon terrine,0.014,g,0,7
211,Salmon - Smoked,0.019,g,0,7
212,Seabass fillets,0.0028,g,0,7
213,Seabream fillets,0.087,g,0,7
214,Seatrout fillet,0.5,g,0,7
215,Shrimp - Brown,0.0043,g,0,7
216,Smoked Mackeral,0.014,g,0,7
217,Sole fillets,0.0115,g,0,7
218,Squid,0.0047,g,0,7
219,Swordfish steaks,0.0132,g,0,7
220,Tiger prawns,0.00215,g,0,7
221,Trout - Rainbow,0.087,g,0,7
222,Trout - Smoked,0.0105,g,0,7
223,Tuna Steak,0.0023,g,0,7
224,Whiting fillets,0.007,g,0,7
225,Apples,0.31,g,1,1
226,Asparagus,0.01,g,0,1
227,Aubergines,0.6,g,1,1
228,Avocado,1.2,g,1,4
229,Baby Corn,0.00118,g,0,1
230,Bean sprouts,0.01377,g,0,1
231,Beans,0.0415,g,0,1
232,Beetroot,0.2,g,1,1
233,Broccoli,0.0285,g,0,1
234,Brussel Sprouts,0.5714,g,0,1
235,Butternut squash,1.2,g,1,1
236,Cabbage,0.0012,g,0,1
237,Carrots,0.0277,g,0,1
238,Cauliflower,0.0012,g,0,1
239,Cannellini Bean's,0.0025,g,0,1
240,Celeriac,0.00738,g,0,1
241,Celery,0.00144,g,0,1
242,Chestnuts,0.014,g,0,1
243,Chick pea's,0.0025,g,0,1
244,Chips,0.388,g,0,1
245,Coleslaw,0.003,g,0,1
246,Corn on the Cob,0.055,g,0,1
247,Courgette,0.4,g,1,1
248,Cucumber,0.59,g,1,1
249,Currents,0.0055,g,1,1
250,Dates,0.015,g,0,1
251,Falafel,0.2,g,1,1
252,Fennel,0.057,g,0,1
253,French Beans,0.0415,g,0,1
254,Fries -  sweet potato,0.1543,g,0,1
255,Garlic,0.009,g,0,1
256,Ginger,0.016,g,0,1
257,Hashbrowns,0.15,g,1,1
258,Jalapeno peppers,0.003,g,0,1
259,Juniper Berries,0.016,g,0,1
260,Kale,0.012,g,0,1
261,Kiwi,0.4,g,0,1
262,Leek,0.5,g,1,1
263,Lemon grass,0.85,g,1,1
264,Lettuce,0.0133,g,0,1
265,Lettuce - Rocket,0.0109,g,0,1
266,Lentils,0.011,g,0,1
267,Lollo Rossa,0.00542,g,0,1
268,Mangetout,0.0415,g,0,1
269,Melon,2.5,g,1,1
270,Mushrooms,0.0789,g,0,1
271,Onion - Red,0.00073,g,0,1
272,Onions,0.00073,g,0,1
273,Onions - Battered,0.00221,g,0,1
274,Parsnips,0.0022,g,0,1
275,Pears,0.085,g,0,1
276,Pea's,0.842,g,0,1
277,Peppers - mixed,0.017,g,0,1
278,Peppers,0.017,g,0,1
279,Plums,0.232,g,0,1
280,Pok choi,0.012,g,0,1
281,Potatoes,0.0008,g,0,1
282,Pumpkin,0.0419,g,0,1
283,Puy Lentils,0.0057,g,0,1
284,Radish,0.0057,g,0,1
285,Ratatouille Mix,0.0055,g,0,1
286,Chilli,0.15,g,1,1
287,Rocolla Baby,0.0109,g,0,1
288,Rocolla Herb,0.0109,g,0,1
289,Samphire,0.0301,g,0,1
290,Scallions,0.0111,g,0,1
291,Soup,0.025,g,0,1
292,Soup 1 litre,2.0,g,1,1
293,Soup Mix,0.00225,g,0,1
294,Spinach,0.0026,g,0,1
295,Swede,0.7,g,1,1
296,Sweet Potato fries,0.0046,g,0,1
297,Tofu,0.01,g,0,1
298,Tomato,0.0142,g,0,1
299,Tomato - Cherry,0.00261,g,0,1
300,Tomato -  Tin 400g,1.19,g,1,1
301,Turnip,0.0318,g,1,1
302,Watercress,0.01,g,0,1
303,Wedges,0.002,g,0,1
305,Apricots - Dried,0.00984,g,0,4
307,Banana,0.12,g,1,4
308,Banana Chips,0.001,g,0,4
309,Blackberries,0.064,g,0,4
310,Blueberries,0.0128,g,0,4
311,Brazil Nuts,0.0185,g,0,4
312,Cashew nuts,0.1805,g,0,4
313,Cherries,0.005,g,0,4
314,Chocolate Raisins case,0.792,g,0,4
315,Clementines,0.243,g,0,4
316,Cranberries,0.0978,g,0,4
317,Fig,0.75,g,1,4
318,Goji Berry,0.0073,g,0,4
319,Gooseberries,0.0128,g,0,4
320,Granola,0.792,g,0,4
321,Grape,0.75,g,1,4
322,Grapes,0.03,g,0,4
323,Kiwi,0.5,g,1,4
324,Lemons,0.39,g,1,4
325,Limes,0.5,g,1,4
326,Mango,2.0,g,1,4
327,Melon,2.5,g,1,4
328,Mixed fruit berries,0.01,g,0,4
329,Mumbai Mix case,0.792,g,0,4
330,Oranges,0.87,g,1,4
331,Passion,0.8,g,1,4
332,Paw Paw,0.85,g,0,4
333,Peach,0.085,g,0,4
334,Pineapple,1.3,g,1,4
335,Plum,0.243,g,1,4
336,Raspberries,0.016,g,0,4
337,Coulis,0.023,g,0,4
338,Red Currants,0.0779,g,0,4
339,Rhubarb,0.79,g,1,4
340,Cashews,0.1805,g,0,4
341,Satsuma,0.0013,g,0,4
342,Star,0.027,g,0,4
343,Strawberries,0.0153,g,0,4
344,Wasabi Peas Good,0.667,g,0,4
345,Water Melon,3.2,g,1,4
346,Yoghurt Raisins case,0.667,g,0,4
347,Bread,0.043,g,1,2
348,Bread - Brown,0.029,g,0,2
349,Cous cous,0.0065,g,0,2
350,Gnocchi,0.002,g,0,2
351,Lentils,0.0057,g,0,2
352,Noodles,0.0093,g,0,2
353,Pasta,0.042,g,0,2
354,Pasta - Fusilli,0.0019,g,0,2
355,Pasta - Linguine,0.0027,g,0,2
356,Pasta -  Macaroni,0.0019,g,0,2
357,Pasta -  Penne,0.0019,g,0,2
358,Pasta -  Sheets,0.0045,g,0,2
359,Pasta -  Spagetti,0.0027,g,0,2
360,Pasta,0.022,g,0,2
361,Rice -  Basmati,0.0087,g,0,2
362,Rice -  Risotto,0.043,g,0,2
363,Sauce -  Cheese,0.006,g,0,2
364,Sauce -  Curry,0.0075,g,0,2
365,Sauce -  Horseradish,0.082,g,0,2
366,Sauce -  Mustard,0.011,g,0,2
367,Sauce -  Tartar,0.082,g,0,2
368,Sauce -  Tomato,0.061,g,0,2
369,Porridge,0.00183,g,0,2
370,Basil,0.0195,g,0,6
371,Bay Leaf,0.1041,g,0,6
372,Chervil,0.0785,g,0,6
373,Chives,0.044,g,0,6
374,Coriander,0.01,g,0,6
375,Dill,0.1041,g,0,6
376,Garnish,0.005,g,0,6
377,Lemon grass,0.044,g,1,6
378,Oregano,0.08,g,0,6
379,Parsley,0.0123,g,0,6
380,Rosemary,0.012,g,0,6
381,Sage,0.0195,g,0,6
382,Tarragon,0.012,g,0,6
383,Thyme,0.012,g,0,6
1,Club Orange,0.00123,ml,0,9
2,Coca cola,0.00158,ml,0,9
3,Fanta Lemon,0.00171,ml,0,9
4,Fanta Orange,0.0012,ml,0,9
5,Fior Uisce Sparkling,0.01,ml,0,9
6,Fior Uisce Still,6.0e-05,ml,0,9
7,Kerry Spring Still water,0.00256,ml,0,9
8,Lilt,0.487,ml,0,9
9,Mi Wadi Orange,0.0083,ml,0,9
10,Oasis Citrus,0.00189,ml,0,9
11,Oasis Summer Fruits,0.00189,ml,0,9
12,Pink Lemonade,0.00771,ml,0,9
13,River Rock Forest Fruits,0.0006,ml,0,9
14,River Rock Lemon and Lime,0.0065,ml,0,9
15,River Rock Sparkling,0.009,ml,0,9
16,River Rock Still,0.009,ml,0,9
17,Sprite,0.001,ml,0,9
18,Ardrahan,0.008,g,0,5
19,Brie Cheese Wheel,0.0024,g,0,5
20,Cashel Blue,0.0081,g,0,5
21,Cheddar,0.0071,g,0,5
22,Cottage cheese,0.0044,g,0,5
23,Creme Fraiche,0.0034,g,0,5
24,Durrus Large,0.0116,g,0,5
25,Emmental Cheese,0.0169,g,0,5
26,Feta Cheese,0.017,g,0,5
27,Goats cheese,0.014,g,0,5
28,Gorganzola Cheese,0.0079,g,0,5
29,Halloumi,0.017,g,0,5
30,Laughing Cow Cheese,0.0142,g,0,5
31,Mascarpone Cheese,0.0061,g,0,5
32,Milleens,0.013,g,0,5
33,Mini Babybel,0.29,g,1,5
34,Mozzarella,0.0074,g,0,5
35,Parmesan granaforma grated,0.00815,g,0,5
36,Philadelphia Full Fat,0.012,g,0,5
37,Provolone soft,0.0099,g,0,5
38,Ricotta,0.0058,g,0,5
39,Butter,0.041,g,0,3
40,Butter - mini,0.7,g,1,3
41,Butter - unsalted,0.00639,g,0,3
42,Cream,0.00236,g,0,3
43,Cream - clotted,0.023,g,0,3
44,Creme Anglaise,0.0185,g,0,3
45,Creme brulee,0.0058,g,0,3
46,Cr̬me Fraiche,0.00487,g,0,3
47,Egg Yolks,0.25,ml,1,3
48,Eggs,0.16,ml,1,3
49,Eggs whites,0.25,ml,1,3
50,Eggs - Duck,0.42,ml,1,3
51,Eggs - Quail,0.33,ml,1,3
52,Ice cream -  Glenown,0.069,g,0,3
53,Ice cream -  Glenown bourbon vanilla,0.069,g,0,3
54,Ice cream -  Glenown caramel,0.069,g,0,3
55,Ice cream -  Glenown chocolate,0.069,g,0,3
56,Ice cream -  Glenown mint chococolate,0.069,g,0,3
57,Ice cream -  Movenpeck Panna Cotta Rasp,0.00666,g,0,3
58,Ice cream -  Movenpeck Vanilla Dream,0.0057,g,0,3
59,Ice cream -  Movenpeck Maple Walnut,0.00695,g,0,3
60,Ice cream -  Movenpeck Strawberry 5ltr,0.0069,g,0,3
61,Ice cream -  Movenpeck Swiss Chocolate,0.0063,g,0,3
62,Icecream -  Lux soft chocolate,0.00438,g,0,3
63,Icecream - Lux soft Strawberry,0.00438,g,0,3
64,Icecream -  Lux soft Vanilla,0.00438,g,0,3
65,Margarine - Stork,0.166,g,0,3
66,Milk,0.0059,g,0,3
67,Milk -  Coconut,0.00111,g,0,3
68,Milk -  Condenced,0.0059,g,0,3
70,Milk -  Light,0.0059,g,0,3
71,Milk -  Lactose Free,0.0059,g,0,3
72,Milk- Low Fat,0.00925,g,0,3
73,Smoothies -  Blackberry & Blueberry,2.24,g,1,3
74,Smoothies -  Cranberry & Raspberry,2.24,g,1,3
75,Smoothies -  Mango & Passionfruit,2.24,g,1,3
76,Smoothies - Strawberry,2.24,g,1,3
77,Sorbet -  Raspberry,0.045,g,0,3
78,Yogurt 200g,0.86,g,1,3
79,Yogurt 500g,0.63,g,1,3
80,Yogurt 55g,0.58,g,1,3
81,Bacon -  Back Bacon,0.042,g,0,8
82,Bacon -  Lardons,0.0089,g,0,8
83,Bacon -  Loin of bacon,0.0058,g,0,8
84,Bacon - Pizza Topping,0.019,g,0,8
85,Bacon -  Rashers,0.0211,g,0,8
86,Beef -  Burgers,2.51,g,1,8
87,Beef -  Diced Beef,0.016,g,0,8
88,Beef -  Kababs,0.99,g,1,8
89,Beef -  Meat ball,0.7,g,1,8
90,Beef -  Prime Sirloin Steaks,6.0,g,1,8
91,Beef -  Rib Eye Steak,9.0,g,1,8
92,Beef -  Roast,0.00723,g,0,8
93,Beef -  Round Mince,0.00723,g,0,8
94,Beef - Silverside,0.0059,g,0,8
95,Beef -  Sliced,0.0291,g,0,8
96,Beef -  Striploin,0.014,g,0,8
97,Chicken & Apple Sausages,1.0,g,1,8
98,Chicken - Thighes,0.35,g,1,8
99,Chicken -  Buffalo Wings,0.9,g,1,8
100,Chicken -  Burger,0.002,g,0,8
101,Chicken -  Chilli chicken spring rolls,1.0,g,1,8
102,Chicken -  Fillets,0.4,g,1,8
103,Chicken -  Goujons,2.0,g,1,8
104,Chicken -  Kebabs,0.46,g,1,8
105,Chicken -  Liver,0.99,g,1,8
106,Chicken -  Mince,0.3,g,1,8
107,Chicken -  Nuggets,0.006,g,0,8
108,Chicken -  Whole,0.46,g,1,8
109,Chorizo,0.007,g,0,8
110,Duck -  Breast,20.0,g,1,8
111,Duck -  half,10.65,g,1,8
112,Duck -  Livers,5.0,g,1,8
113,Duck -  Sausages chilli ginger garlic,1.0,g,1,8
114,Duck -  Spring Roll,0.35,g,1,8
115,Duck -  Whole,0.4,g,1,8
116,Gammon Boned & Rolled,0.0023,g,0,8
117,Guinea Fowl,8.14,g,1,8
118,Ham -  Crumbed,0.0021,g,0,8
119,Ham -  Hocks,0.00336,g,0,8
120,Ham -  Sliced,0.0261,g,0,8
121,Lamb -  Burger,1.0,g,1,8
122,Lamb -  Diced,0.011,g,0,8
123,Lamb -  Kidneys,0.00618,g,1,8
124,Lamb -  Leg,15.0,g,1,8
125,Lamb -  Mince,0.0116,g,0,8
126,Lamb -  Rack,0.0066,g,0,8
127,Lamb -  Saddle,0.0098,g,0,8
128,Lamb -  Shank,0.018,g,0,8
129,Lamb -  Shoulder,15.0,g,1,8
130,Lamb - Steak,4.0,g,1,8
131,Lambs Liver,0.7,g,1,8
132,Olives Green Pitted,0.006,g,0,8
133,Olives Oriental Aperitif Mix,0.005,g,0,8
134,Parmaham,0.0022,g,0,8
135,Pastrami,0.025,g,0,8
136,Pheasant terrine with girolles,0.001,g,0,8
137,Pork & Leek sauages,0.0121,g,1,8
138,Pork -  BBQ Pork Belly Spare Ribs,0.0026,g,0,8
139,Pork -  Black Pudding,2.59,g,1,8
140,Pork -  Boneless Loin of Pork B/R,0.009,g,0,8
141,Pork -  Chop,0.005,g,0,8
142,Pork -  Cocktail Sausages,0.0121,g,0,8
143,Pork -  Crepine Caul Fat,0.0039,g,0,8
144,Pork -  Gammon,0.0035,g,0,8
145,Pork -  Hot dog sausages,0.008,g,1,8
146,Pork -  Kidney,0.0221,g,1,8
147,Pork -  Leek and black pepper sauce,0.0039,g,0,8
148,Pork -  Leg,0.00742,g,1,8
149,Pork -  Mortadella,0.022,g,0,8
150,Pork -  Pancetta rolled,0.0103,g,0,8
151,Pork -  Pulled BBQ style,0.042,g,0,8
152,Pork -  Rashers Rindless,0.00193,g,0,8
153,Pork -  Sausage Meat,0.003,g,0,8
154,Pork -  Sausages,0.35,g,1,8
155,Pork -  Smoked Streaky Slab,0.008,g,0,8
156,Pork -  Steaks,0.007,g,0,8
157,Pork -  White Pudding,2.59,g,1,8
158,Stuffing -  Turkey & Ham herb,0.009,g,0,8
159,Turkey Breast,2.0,g,1,8
160,Turkey Butterfly,0.00098,g,0,8
161,Turkey crown,25.0,g,1,8
162,Turkey Legs,3.37,g,1,8
163,Veal -  Bones,0.00077,g,0,8
164,Venison sausages,10.0,g,1,8
165,Venison steaks,0.7,g,1,8
166,Anchovies -  Marinated,0.014,g,0,7
167,Anchovy Fillets in Oil,0.016,g,0,7
168,Black sole,0.02,g,0,7
169,Blossom Fillets,0.01026,g,0,7
170,Breaded cod goujon,0.175,g,0,7
171,Clams,0.016,g,0,7
172,Cod Fillet,0.0188,g,0,7
173,Cod fillets -  salted,0.016,g,0,7
174,Cod -  in beer batter,0.007,g,0,7
175,Cod - Smoked,0.031,g,0,7
176,Cold water prawns,3.25,g,1,7
177,Crab cakes,0.032,g,0,7
178,Crab Claws,0.04,g,0,7
179,Crab meat,0.014,g,0,7
180,Cray Fish in brine,3.25,g,1,7
181,Fish cake,0.048,g,1,7
182,Fish - Kippers,0.24,g,0,7
183,Fishbones,0.006,g,0,7
184,Gurnard fillets,0.009,g,0,7
185,Haddock,0.054,g,0,7
186,Haddock fillet,0.062,g,0,7
187,Haddock -  smoked,0.009,g,0,7
188,Hake fillet,0.0039,g,0,7
189,Halibut fillet,0.714,g,0,7
190,Herring rollmops/gherkins,0.0215,g,0,7
191,Languistine,0.014,g,0,7
192,Lemon sole fillets,0.01,g,0,7
193,Lobster Terrine,0.139,g,0,7
194,Mackeral -  Smoked,0.069,g,0,7
195,Mackeral Fillets,0.01,g,0,7
196,Marlon loin,0.0105,g,0,7
197,Mixed fish,0.0029,g,0,7
198,Mussels,0.154,g,1,7
199,Oysters,0.02,g,0,7
200,Plaice fillet,0.032,g,0,7
201,Prawn heads,0.145,g,0,7
202,Prawns,0.0215,g,0,7
203,Ray wings,0.00135,g,0,7
204,Rissotto fish cake hake,0.015,g,1,7
205,Salmon Cutlets,0.0059,g,0,7
206,Salmon fillet,0.055,g,0,7
207,Salmon fish cake,3.25,g,1,7
208,Salmon Roe,0.129,g,0,7
209,Salmon steaks,0.0059,g,0,7
210,Salmon terrine,0.014,g,0,7
211,Salmon - Smoked,0.019,g,0,7
212,Seabass fillets,0.0028,g,0,7
213,Seabream fillets,0.087,g,0,7
214,Seatrout fillet,0.5,g,0,7
215,Shrimp - Brown,0.0043,g,0,7
216,Smoked Mackeral,0.014,g,0,7
217,Sole fillets,0.0115,g,0,7
218,Squid,0.0047,g,0,7
219,Swordfish steaks,0.0132,g,0,7
220,Tiger prawns,0.00215,g,0,7
221,Trout - Rainbow,0.087,g,0,7
222,Trout - Smoked,0.0105,g,0,7
223,Tuna Steak,0.0023,g,0,7
224,Whiting fillets,0.007,g,0,7
225,Apples,0.31,g,1,1
226,Asparagus,0.01,g,0,1
227,Aubergines,0.6,g,1,1
228,Avocado,1.2,g,1,4
229,Baby Corn,0.00118,g,0,1
230,Bean sprouts,0.01377,g,0,1
231,Beans,0.0415,g,0,1
232,Beetroot,0.2,g,1,1
233,Broccoli,0.0285,g,0,1
234,Brussel Sprouts,0.5714,g,0,1
235,Butternut squash,1.2,g,1,1
236,Cabbage,0.0012,g,0,1
237,Carrots,0.0277,g,0,1
238,Cauliflower,0.0012,g,0,1
239,Cannellini Bean's,0.0025,g,0,1
240,Celeriac,0.00738,g,0,1
241,Celery,0.00144,g,0,1
242,Chestnuts,0.014,g,0,1
243,Chick pea's,0.0025,g,0,1
244,Chips,0.388,g,0,1
245,Coleslaw,0.003,g,0,1
246,Corn on the Cob,0.055,g,0,1
247,Courgette,0.4,g,1,1
248,Cucumber,0.59,g,1,1
249,Currents,0.0055,g,1,1
250,Dates,0.015,g,0,1
251,Falafel,0.2,g,1,1
252,Fennel,0.057,g,0,1
253,French Beans,0.0415,g,0,1
254,Fries -  sweet potato,0.1543,g,0,1
255,Garlic,0.009,g,0,1
256,Ginger,0.016,g,0,1
257,Hashbrowns,0.15,g,1,1
258,Jalapeno peppers,0.003,g,0,1
259,Juniper Berries,0.016,g,0,1
260,Kale,0.012,g,0,1
261,Kiwi,0.4,g,0,1
262,Leek,0.5,g,1,1
263,Lemon grass,0.85,g,1,1
264,Lettuce,0.0133,g,0,1
265,Lettuce - Rocket,0.0109,g,0,1
266,Lentils,0.011,g,0,1
267,Lollo Rossa,0.00542,g,0,1
268,Mangetout,0.0415,g,0,1
269,Melon,2.5,g,1,1
270,Mushrooms,0.0789,g,0,1
271,Onion - Red,0.00073,g,0,1
272,Onions,0.00073,g,0,1
273,Onions - Battered,0.00221,g,0,1
274,Parsnips,0.0022,g,0,1
275,Pears,0.085,g,0,1
276,Pea's,0.842,g,0,1
277,Peppers - mixed,0.017,g,0,1
278,Peppers,0.017,g,0,1
279,Plums,0.232,g,0,1
280,Pok choi,0.012,g,0,1
281,Potatoes,0.0008,g,0,1
282,Pumpkin,0.0419,g,0,1
283,Puy Lentils,0.0057,g,0,1
284,Radish,0.0057,g,0,1
285,Ratatouille Mix,0.0055,g,0,1
286,Chilli,0.15,g,1,1
287,Rocolla Baby,0.0109,g,0,1
288,Rocolla Herb,0.0109,g,0,1
289,Samphire,0.0301,g,0,1
290,Scallions,0.0111,g,0,1
291,Soup,0.025,g,0,1
292,Soup 1 litre,2.0,g,1,1
293,Soup Mix,0.00225,g,0,1
294,Spinach,0.0026,g,0,1
295,Swede,0.7,g,1,1
296,Sweet Potato fries,0.0046,g,0,1
297,Tofu,0.01,g,0,1
298,Tomato,0.0142,g,0,1
299,Tomato - Cherry,0.00261,g,0,1
300,Tomato -  Tin 400g,1.19,g,1,1
301,Turnip,0.0318,g,1,1
302,Watercress,0.01,g,0,1
303,Wedges,0.002,g,0,1
305,Apricots - Dried,0.00984,g,0,4
307,Banana,0.12,g,1,4
308,Banana Chips,0.001,g,0,4
309,Blackberries,0.064,g,0,4
310,Blueberries,0.0128,g,0,4
311,Brazil Nuts,0.0185,g,0,4
312,Cashew nuts,0.1805,g,0,4
313,Cherries,0.005,g,0,4
314,Chocolate Raisins case,0.792,g,0,4
315,Clementines,0.243,g,0,4
316,Cranberries,0.0978,g,0,4
317,Fig,0.75,g,1,4
318,Goji Berry,0.0073,g,0,4
319,Gooseberries,0.0128,g,0,4
320,Granola,0.792,g,0,4
321,Grape,0.75,g,1,4
322,Grapes,0.03,g,0,4
323,Kiwi,0.5,g,1,4
324,Lemons,0.39,g,1,4
325,Limes,0.5,g,1,4
326,Mango,2.0,g,1,4
327,Melon,2.5,g,1,4
328,Mixed fruit berries,0.01,g,0,4
329,Mumbai Mix case,0.792,g,0,4
330,Oranges,0.87,g,1,4
331,Passion,0.8,g,1,4
332,Paw Paw,0.85,g,0,4
333,Peach,0.085,g,0,4
334,Pineapple,1.3,g,1,4
335,Plum,0.243,g,1,4
336,Raspberries,0.016,g,0,4
337,Coulis,0.023,g,0,4
338,Red Currants,0.0779,g,0,4
339,Rhubarb,0.79,g,1,4
340,Cashews,0.1805,g,0,4
341,Satsuma,0.0013,g,0,4
342,Star,0.027,g,0,4
343,Strawberries,0.0153,g,0,4
344,Wasabi Peas Good,0.667,g,0,4
345,Water Melon,3.2,g,1,4
346,Yoghurt Raisins case,0.667,g,0,4
347,Bread,0.043,g,1,2
348,Bread - Brown,0.029,g,0,2
349,Cous cous,0.0065,g,0,2
350,Gnocchi,0.002,g,0,2
351,Lentils,0.0057,g,0,2
352,Noodles,0.0093,g,0,2
353,Pasta,0.042,g,0,2
354,Pasta - Fusilli,0.0019,g,0,2
355,Pasta - Linguine,0.0027,g,0,2
356,Pasta -  Macaroni,0.0019,g,0,2
357,Pasta -  Penne,0.0019,g,0,2
358,Pasta -  Sheets,0.0045,g,0,2
359,Pasta -  Spagetti,0.0027,g,0,2
360,Pasta,0.022,g,0,2
361,Rice -  Basmati,0.0087,g,0,2
362,Rice -  Risotto,0.043,g,0,2
363,Sauce -  Cheese,0.006,g,0,2
364,Sauce -  Curry,0.0075,g,0,2
365,Sauce -  Horseradish,0.082,g,0,2
366,Sauce -  Mustard,0.011,g,0,2
367,Sauce -  Tartar,0.082,g,0,2
368,Sauce -  Tomato,0.061,g,0,2
369,Porridge,0.00183,g,0,2
370,Basil,0.0195,g,0,6
371,Bay Leaf,0.1041,g,0,6
372,Chervil,0.0785,g,0,6
373,Chives,0.044,g,0,6
374,Coriander,0.01,g,0,6
375,Dill,0.1041,g,0,6
376,Garnish,0.005,g,0,6
377,Lemon grass,0.044,g,1,6
378,Oregano,0.08,g,0,6
379,Parsley,0.0123,g,0,6
380,Rosemary,0.012,g,0,6
381,Sage,0.0195,g,0,6
382,Tarragon,0.012,g,0,6
383,Thyme,0.012,g,0,6
1,Club Orange,0.00123,ml,0,9
2,Coca cola,0.00158,ml,0,9
3,Fanta Lemon,0.00171,ml,0,9
4,Fanta Orange,0.0012,ml,0,9
5,Fior Uisce Sparkling,0.01,ml,0,9
6,Fior Uisce Still,6.0e-05,ml,0,9
7,Kerry Spring Still water,0.00256,ml,0,9
8,Lilt,0.487,ml,0,9
9,Mi Wadi Orange,0.0083,ml,0,9
10,Oasis Citrus,0.00189,ml,0,9
11,Oasis Summer Fruits,0.00189,ml,0,9
12,Pink Lemonade,0.00771,ml,0,9
13,River Rock Forest Fruits,0.0006,ml,0,9
14,River Rock Lemon and Lime,0.0065,ml,0,9
15,River Rock Sparkling,0.009,ml,0,9
16,River Rock Still,0.009,ml,0,9
17,Sprite,0.001,ml,0,9
18,Ardrahan,0.008,g,0,5
19,Brie Cheese Wheel,0.0024,g,0,5
20,Cashel Blue,0.0081,g,0,5
21,Cheddar,0.0071,g,0,5
22,Cottage cheese,0.0044,g,0,5
23,Creme Fraiche,0.0034,g,0,5
24,Durrus Large,0.0116,g,0,5
25,Emmental Cheese,0.0169,g,0,5
26,Feta Cheese,0.017,g,0,5
27,Goats cheese,0.014,g,0,5
28,Gorganzola Cheese,0.0079,g,0,5
29,Halloumi,0.017,g,0,5
30,Laughing Cow Cheese,0.0142,g,0,5
31,Mascarpone Cheese,0.0061,g,0,5
32,Milleens,0.013,g,0,5
33,Mini Babybel,0.29,g,1,5
34,Mozzarella,0.0074,g,0,5
35,Parmesan granaforma grated,0.00815,g,0,5
36,Philadelphia Full Fat,0.012,g,0,5
37,Provolone soft,0.0099,g,0,5
38,Ricotta,0.0058,g,0,5
39,Butter,0.041,g,0,3
40,Butter - mini,0.7,g,1,3
41,Butter - unsalted,0.00639,g,0,3
42,Cream,0.00236,g,0,3
43,Cream - clotted,0.023,g,0,3
44,Creme Anglaise,0.0185,g,0,3
45,Creme brulee,0.0058,g,0,3
46,Cr̬me Fraiche,0.00487,g,0,3
47,Egg Yolks,0.25,ml,1,3
48,Eggs,0.16,ml,1,3
49,Eggs whites,0.25,ml,1,3
50,Eggs - Duck,0.42,ml,1,3
51,Eggs - Quail,0.33,ml,1,3
52,Ice cream -  Glenown,0.069,g,0,3
53,Ice cream -  Glenown bourbon vanilla,0.069,g,0,3
54,Ice cream -  Glenown caramel,0.069,g,0,3
55,Ice cream -  Glenown chocolate,0.069,g,0,3
56,Ice cream -  Glenown mint chococolate,0.069,g,0,3
57,Ice cream -  Movenpeck Panna Cotta Rasp,0.00666,g,0,3
58,Ice cream -  Movenpeck Vanilla Dream,0.0057,g,0,3
59,Ice cream -  Movenpeck Maple Walnut,0.00695,g,0,3
60,Ice cream -  Movenpeck Strawberry 5ltr,0.0069,g,0,3
61,Ice cream -  Movenpeck Swiss Chocolate,0.0063,g,0,3
62,Icecream -  Lux soft chocolate,0.00438,g,0,3
63,Icecream - Lux soft Strawberry,0.00438,g,0,3
64,Icecream -  Lux soft Vanilla,0.00438,g,0,3
65,Margarine - Stork,0.166,g,0,3
66,Milk,0.0059,g,0,3
67,Milk -  Coconut,0.00111,g,0,3
68,Milk -  Condenced,0.0059,g,0,3
70,Milk -  Light,0.0059,g,0,3
71,Milk -  Lactose Free,0.0059,g,0,3
72,Milk- Low Fat,0.00925,g,0,3
73,Smoothies -  Blackberry & Blueberry,2.24,g,1,3
74,Smoothies -  Cranberry & Raspberry,2.24,g,1,3
75,Smoothies -  Mango & Passionfruit,2.24,g,1,3
76,Smoothies - Strawberry,2.24,g,1,3
77,Sorbet -  Raspberry,0.045,g,0,3
78,Yogurt 200g,0.86,g,1,3
79,Yogurt 500g,0.63,g,1,3
80,Yogurt 55g,0.58,g,1,3
81,Bacon -  Back Bacon,0.042,g,0,8
82,Bacon -  Lardons,0.0089,g,0,8
83,Bacon -  Loin of bacon,0.0058,g,0,8
84,Bacon - Pizza Topping,0.019,g,0,8
85,Bacon -  Rashers,0.0211,g,0,8
86,Beef -  Burgers,2.51,g,1,8
87,Beef -  Diced Beef,0.016,g,0,8
88,Beef -  Kababs,0.99,g,1,8
89,Beef -  Meat ball,0.7,g,1,8
90,Beef -  Prime Sirloin Steaks,6.0,g,1,8
91,Beef -  Rib Eye Steak,9.0,g,1,8
92,Beef -  Roast,0.00723,g,0,8
93,Beef -  Round Mince,0.00723,g,0,8
94,Beef - Silverside,0.0059,g,0,8
95,Beef -  Sliced,0.0291,g,0,8
96,Beef -  Striploin,0.014,g,0,8
97,Chicken & Apple Sausages,1.0,g,1,8
98,Chicken - Thighes,0.35,g,1,8
99,Chicken -  Buffalo Wings,0.9,g,1,8
100,Chicken -  Burger,0.002,g,0,8
101,Chicken -  Chilli chicken spring rolls,1.0,g,1,8
102,Chicken -  Fillets,0.4,g,1,8
103,Chicken -  Goujons,2.0,g,1,8
104,Chicken -  Kebabs,0.46,g,1,8
105,Chicken -  Liver,0.99,g,1,8
106,Chicken -  Mince,0.3,g,1,8
107,Chicken -  Nuggets,0.006,g,0,8
108,Chicken -  Whole,0.46,g,1,8
109,Chorizo,0.007,g,0,8
110,Duck -  Breast,20.0,g,1,8
111,Duck -  half,10.65,g,1,8
112,Duck -  Livers,5.0,g,1,8
113,Duck -  Sausages chilli ginger garlic,1.0,g,1,8
114,Duck -  Spring Roll,0.35,g,1,8
115,Duck -  Whole,0.4,g,1,8
116,Gammon Boned & Rolled,0.0023,g,0,8
117,Guinea Fowl,8.14,g,1,8
118,Ham -  Crumbed,0.0021,g,0,8
119,Ham -  Hocks,0.00336,g,0,8
120,Ham -  Sliced,0.0261,g,0,8
121,Lamb -  Burger,1.0,g,1,8
122,Lamb -  Diced,0.011,g,0,8
123,Lamb -  Kidneys,0.00618,g,1,8
124,Lamb -  Leg,15.0,g,1,8
125,Lamb -  Mince,0.0116,g,0,8
126,Lamb -  Rack,0.0066,g,0,8
127,Lamb -  Saddle,0.0098,g,0,8
128,Lamb -  Shank,0.018,g,0,8
129,Lamb -  Shoulder,15.0,g,1,8
130,Lamb - Steak,4.0,g,1,8
131,Lambs Liver,0.7,g,1,8
132,Olives Green Pitted,0.006,g,0,8
133,Olives Oriental Aperitif Mix,0.005,g,0,8
134,Parmaham,0.0022,g,0,8
135,Pastrami,0.025,g,0,8
136,Pheasant terrine with girolles,0.001,g,0,8
137,Pork & Leek sauages,0.0121,g,1,8
138,Pork -  BBQ Pork Belly Spare Ribs,0.0026,g,0,8
139,Pork -  Black Pudding,2.59,g,1,8
140,Pork -  Boneless Loin of Pork B/R,0.009,g,0,8
141,Pork -  Chop,0.005,g,0,8
142,Pork -  Cocktail Sausages,0.0121,g,0,8
143,Pork -  Crepine Caul Fat,0.0039,g,0,8
144,Pork -  Gammon,0.0035,g,0,8
145,Pork -  Hot dog sausages,0.008,g,1,8
146,Pork -  Kidney,0.0221,g,1,8
147,Pork -  Leek and black pepper sauce,0.0039,g,0,8
148,Pork -  Leg,0.00742,g,1,8
149,Pork -  Mortadella,0.022,g,0,8
150,Pork -  Pancetta rolled,0.0103,g,0,8
151,Pork -  Pulled BBQ style,0.042,g,0,8
152,Pork -  Rashers Rindless,0.00193,g,0,8
153,Pork -  Sausage Meat,0.003,g,0,8
154,Pork -  Sausages,0.35,g,1,8
155,Pork -  Smoked Streaky Slab,0.008,g,0,8
156,Pork -  Steaks,0.007,g,0,8
157,Pork -  White Pudding,2.59,g,1,8
158,Stuffing -  Turkey & Ham herb,0.009,g,0,8
159,Turkey Breast,2.0,g,1,8
160,Turkey Butterfly,0.00098,g,0,8
161,Turkey crown,25.0,g,1,8
162,Turkey Legs,3.37,g,1,8
163,Veal -  Bones,0.00077,g,0,8
164,Venison sausages,10.0,g,1,8
165,Venison steaks,0.7,g,1,8
166,Anchovies -  Marinated,0.014,g,0,7
167,Anchovy Fillets in Oil,0.016,g,0,7
168,Black sole,0.02,g,0,7
169,Blossom Fillets,0.01026,g,0,7
170,Breaded cod goujon,0.175,g,0,7
171,Clams,0.016,g,0,7
172,Cod Fillet,0.0188,g,0,7
173,Cod fillets -  salted,0.016,g,0,7
174,Cod -  in beer batter,0.007,g,0,7
175,Cod - Smoked,0.031,g,0,7
176,Cold water prawns,3.25,g,1,7
177,Crab cakes,0.032,g,0,7
178,Crab Claws,0.04,g,0,7
179,Crab meat,0.014,g,0,7
180,Cray Fish in brine,3.25,g,1,7
181,Fish cake,0.048,g,1,7
182,Fish - Kippers,0.24,g,0,7
183,Fishbones,0.006,g,0,7
184,Gurnard fillets,0.009,g,0,7
185,Haddock,0.054,g,0,7
186,Haddock fillet,0.062,g,0,7
187,Haddock -  smoked,0.009,g,0,7
188,Hake fillet,0.0039,g,0,7
189,Halibut fillet,0.714,g,0,7
190,Herring rollmops/gherkins,0.0215,g,0,7
191,Languistine,0.014,g,0,7
192,Lemon sole fillets,0.01,g,0,7
193,Lobster Terrine,0.139,g,0,7
194,Mackeral -  Smoked,0.069,g,0,7
195,Mackeral Fillets,0.01,g,0,7
196,Marlon loin,0.0105,g,0,7
197,Mixed fish,0.0029,g,0,7
198,Mussels,0.154,g,1,7
199,Oysters,0.02,g,0,7
200,Plaice fillet,0.032,g,0,7
201,Prawn heads,0.145,g,0,7
202,Prawns,0.0215,g,0,7
203,Ray wings,0.00135,g,0,7
204,Rissotto fish cake hake,0.015,g,1,7
205,Salmon Cutlets,0.0059,g,0,7
206,Salmon fillet,0.055,g,0,7
207,Salmon fish cake,3.25,g,1,7
208,Salmon Roe,0.129,g,0,7
209,Salmon steaks,0.0059,g,0,7
210,Salmon terrine,0.014,g,0,7
211,Salmon - Smoked,0.019,g,0,7
212,Seabass fillets,0.0028,g,0,7
213,Seabream fillets,0.087,g,0,7
214,Seatrout fillet,0.5,g,0,7
215,Shrimp - Brown,0.0043,g,0,7
216,Smoked Mackeral,0.014,g,0,7
217,Sole fillets,0.0115,g,0,7
218,Squid,0.0047,g,0,7
219,Swordfish steaks,0.0132,g,0,7
220,Tiger prawns,0.00215,g,0,7
221,Trout - Rainbow,0.087,g,0,7
222,Trout - Smoked,0.0105,g,0,7
223,Tuna Steak,0.0023,g,0,7
224,Whiting fillets,0.007,g,0,7
225,Apples,0.31,g,1,1
226,Asparagus,0.01,g,0,1
227,Aubergines,0.6,g,1,1
228,Avocado,1.2,g,1,4
229,Baby Corn,0.00118,g,0,1
230,Bean sprouts,0.01377,g,0,1
231,Beans,0.0415,g,0,1
232,Beetroot,0.2,g,1,1
233,Broccoli,0.0285,g,0,1
234,Brussel Sprouts,0.5714,g,0,1
235,Butternut squash,1.2,g,1,1
236,Cabbage,0.0012,g,0,1
237,Carrots,0.0277,g,0,1
238,Cauliflower,0.0012,g,0,1
239,Cannellini Bean's,0.0025,g,0,1
240,Celeriac,0.00738,g,0,1
241,Celery,0.00144,g,0,1
242,Chestnuts,0.014,g,0,1
243,Chick pea's,0.0025,g,0,1
244,Chips,0.388,g,0,1
245,Coleslaw,0.003,g,0,1
246,Corn on the Cob,0.055,g,0,1
247,Courgette,0.4,g,1,1
248,Cucumber,0.59,g,1,1
249,Currents,0.0055,g,1,1
250,Dates,0.015,g,0,1
251,Falafel,0.2,g,1,1
252,Fennel,0.057,g,0,1
253,French Beans,0.0415,g,0,1
254,Fries -  sweet potato,0.1543,g,0,1
255,Garlic,0.009,g,0,1
256,Ginger,0.016,g,0,1
257,Hashbrowns,0.15,g,1,1
258,Jalapeno peppers,0.003,g,0,1
259,Juniper Berries,0.016,g,0,1
260,Kale,0.012,g,0,1
261,Kiwi,0.4,g,0,1
262,Leek,0.5,g,1,1
263,Lemon grass,0.85,g,1,1
264,Lettuce,0.0133,g,0,1
265,Lettuce - Rocket,0.0109,g,0,1
266,Lentils,0.011,g,0,1
267,Lollo Rossa,0.00542,g,0,1
268,Mangetout,0.0415,g,0,1
269,Melon,2.5,g,1,1
270,Mushrooms,0.0789,g,0,1
271,Onion - Red,0.00073,g,0,1
272,Onions,0.00073,g,0,1
273,Onions - Battered,0.00221,g,0,1
274,Parsnips,0.0022,g,0,1
275,Pears,0.085,g,0,1
276,Pea's,0.842,g,0,1
277,Peppers - mixed,0.017,g,0,1
278,Peppers,0.017,g,0,1
279,Plums,0.232,g,0,1
280,Pok choi,0.012,g,0,1
281,Potatoes,0.0008,g,0,1
282,Pumpkin,0.0419,g,0,1
283,Puy Lentils,0.0057,g,0,1
284,Radish,0.0057,g,0,1
285,Ratatouille Mix,0.0055,g,0,1
286,Chilli,0.15,g,1,1
287,Rocolla Baby,0.0109,g,0,1
288,Rocolla Herb,0.0109,g,0,1
289,Samphire,0.0301,g,0,1
290,Scallions,0.0111,g,0,1
291,Soup,0.025,g,0,1
292,Soup 1 litre,2.0,g,1,1
293,Soup Mix,0.00225,g,0,1
294,Spinach,0.0026,g,0,1
295,Swede,0.7,g,1,1
296,Sweet Potato fries,0.0046,g,0,1
297,Tofu,0.01,g,0,1
298,Tomato,0.0142,g,0,1
299,Tomato - Cherry,0.00261,g,0,1
300,Tomato -  Tin 400g,1.19,g,1,1
301,Turnip,0.0318,g,1,1
302,Watercress,0.01,g,0,1
303,Wedges,0.002,g,0,1
305,Apricots - Dried,0.00984,g,0,4
307,Banana,0.12,g,1,4
308,Banana Chips,0.001,g,0,4
309,Blackberries,0.064,g,0,4
310,Blueberries,0.0128,g,0,4
311,Brazil Nuts,0.0185,g,0,4
312,Cashew nuts,0.1805,g,0,4
313,Cherries,0.005,g,0,4
314,Chocolate Raisins case,0.792,g,0,4
315,Clementines,0.243,g,0,4
316,Cranberries,0.0978,g,0,4
317,Fig,0.75,g,1,4
318,Goji Berry,0.0073,g,0,4
319,Gooseberries,0.0128,g,0,4
320,Granola,0.792,g,0,4
321,Grape,0.75,g,1,4
322,Grapes,0.03,g,0,4
323,Kiwi,0.5,g,1,4
324,Lemons,0.39,g,1,4
325,Limes,0.5,g,1,4
326,Mango,2.0,g,1,4
327,Melon,2.5,g,1,4
328,Mixed fruit berries,0.01,g,0,4
329,Mumbai Mix case,0.792,g,0,4
330,Oranges,0.87,g,1,4
331,Passion,0.8,g,1,4
332,Paw Paw,0.85,g,0,4
333,Peach,0.085,g,0,4
334,Pineapple,1.3,g,1,4
335,Plum,0.243,g,1,4
336,Raspberries,0.016,g,0,4
337,Coulis,0.023,g,0,4
338,Red Currants,0.0779,g,0,4
339,Rhubarb,0.79,g,1,4
340,Cashews,0.1805,g,0,4
341,Satsuma,0.0013,g,0,4
342,Star,0.027,g,0,4
343,Strawberries,0.0153,g,0,4
344,Wasabi Peas Good,0.667,g,0,4
345,Water Melon,3.2,g,1,4
346,Yoghurt Raisins case,0.667,g,0,4
347,Bread,0.043,g,1,2
348,Bread - Brown,0.029,g,0,2
349,Cous cous,0.0065,g,0,2
350,Gnocchi,0.002,g,0,2
351,Lentils,0.0057,g,0,2
352,Noodles,0.0093,g,0,2
353,Pasta,0.042,g,0,2
354,Pasta - Fusilli,0.0019,g,0,2
355,Pasta - Linguine,0.0027,g,0,2
356,Pasta -  Macaroni,0.0019,g,0,2
357,Pasta -  Penne,0.0019,g,0,2
358,Pasta -  Sheets,0.0045,g,0,2
359,Pasta -  Spagetti,0.0027,g,0,2
360,Pasta,0.022,g,0,2
361,Rice -  Basmati,0.0087,g,0,2
362,Rice -  Risotto,0.043,g,0,2
363,Sauce -  Cheese,0.006,g,0,2
364,Sauce -  Curry,0.0075,g,0,2
365,Sauce -  Horseradish,0.082,g,0,2
366,Sauce -  Mustard,0.011,g,0,2
367,Sauce -  Tartar,0.082,g,0,2
368,Sauce -  Tomato,0.061,g,0,2
369,Porridge,0.00183,g,0,2
370,Basil,0.0195,g,0,6
371,Bay Leaf,0.1041,g,0,6
372,Chervil,0.0785,g,0,6
373,Chives,0.044,g,0,6
374,Coriander,0.01,g,0,6
375,Dill,0.1041,g,0,6
376,Garnish,0.005,g,0,6
377,Lemon grass,0.044,g,1,6
378,Oregano,0.08,g,0,6
379,Parsley,0.0123,g,0,6
380,Rosemary,0.012,g,0,6
381,Sage,0.0195,g,0,6
382,Tarragon,0.012,g,0,6
383,Thyme,0.012,g,0,6
