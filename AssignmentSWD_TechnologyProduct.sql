CREATE DATABASE SWD_Assignment_TechnologyProduct
USE SWD_Assignment_TechnologyProduct

CREATE TABLE ACCOUNT
(
    id varchar(10) PRIMARY KEY,
	password varchar(128),
	fullname varchar(30),
	email varchar(100) UNIQUE,
	phone varchar(12) UNIQUE,
	address varchar(200),
	role varchar(10),
	createDate datetime DEFAULT GETDATE(),
	updateDate datetime,
)
CREATE TABLE CATEGORY
(
    cateID varchar(10) PRIMARY KEY,
	name varchar(30),
)

CREATE TABLE PRODUCT
(
    productID varchar(10) PRIMARY KEY,
	name varchar(30),
	price float,
	img varchar(200),
	description varchar(2000),
	status varchar(10) DEFAULT 'Active', 
	quantity int,
	createBy varchar(10) FOREIGN KEY REFERENCES Account(id),
	createDate datetime DEFAULT GETDATE(),
	category varchar(10) FOREIGN KEY REFERENCES CATEGORY(cateID),
	counter int,
	rating float,
	updateBy varchar(10) FOREIGN KEY REFERENCES Account(id),
	updateDate datetime, 
)
CREATE TABLE PAYMENT
(
	id varchar(10) PRIMARY KEY,
	paymentMethod varchar(30),
)
CREATE TABLE ORDER_PRODUCT
(
    orderID varchar(20) PRIMARY KEY,
	customer varchar(10) FOREIGN KEY REFERENCES ACCOUNT(id),
	buyerName varchar(30),
	buyDate datetime DEFAULT GETDATE(),
	phone varchar(12),
	shipAddress varchar(200),
	total float,
	status varchar(30),
)
CREATE TABLE PAYMENT_DETAIL 
(
	paymentDetailID varchar(30) PRIMARY KEY,
	paymentMethod varchar(10) FOREIGN KEY REFERENCES PAYMENT(id),
	orderID varchar(20) FOREIGN KEY REFERENCES ORDER_PRODUCT(orderID),
	create_at datetime DEFAULT GETDATE(),
	account_number varchar(20),
	payment_status varchar(20),
)
CREATE TABLE CANCELED_ORDER 
(
	cancelOrderID varchar(20) FOREIGN KEY REFERENCES ORDER_PRODUCT(orderID),
	PRIMARY KEY(cancelOrderID),
	cancelDate datetime DEFAULT GETDATE(),
	cancelUser varchar(10) FOREIGN KEY REFERENCES ACCOUNT(id),
	cancelReason varchar(200),
)

CREATE TABLE ORDER_DETAIL
(
    orderDetailID varchar(30) PRIMARY KEY,
	orderID varchar(20) FOREIGN KEY REFERENCES ORDER_PRODUCT(orderID),
	productID varchar(10) FOREIGN KEY REFERENCES PRODUCT(productID),
	
	quantity int, 
	price float,
)
CREATE TABLE NOTIFICATION
(
    id int IDENTITY(1,1) PRIMARY KEY,
	idReceiver varchar(10) FOREIGN KEY REFERENCES ACCOUNT(id),
	content varchar(500),
	create_date datetime NOT NULL DEFAULT GETDATE(),
)

CREATE TABLE REVIEW
(
    reviewID varchar(30) PRIMARY KEY,
	customer varchar(10) FOREIGN KEY REFERENCES ACCOUNT(id),
	orderID varchar(20) FOREIGN KEY REFERENCES ORDER_PRODUCT(orderID),
	productID varchar(10) FOREIGN KEY REFERENCES PRODUCT(productID),
	review_rate float,
	review_comment varchar(500),
	status varchar(50),
	create_at datetime NOT NULL DEFAULT GETDATE(),
	update_at datetime ,
)

INSERT [dbo].[ACCOUNT] ([id], [password], [fullname], [email], [phone], [address], [role], [createDate], [updateDate]) VALUES (N'A-1', N'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', N'Hoang Gia Thien Phuc', N'thienphuccoder@gmail.com', N'0979812398', N'BMT', N'admin', CAST(N'2021-10-19 17:30:06.070' AS DateTime), NULL)
INSERT [dbo].[ACCOUNT] ([id], [password], [fullname], [email], [phone], [address], [role], [createDate], [updateDate]) VALUES (N'A-2', N'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', N'Le Dac Hoang Phuc', N'phuchgt.work@gmail.com', N'0948838848', N'HCM', N'customer', CAST(N'2021-10-19 17:30:53.163' AS DateTime), NULL)
INSERT [dbo].[ACCOUNT] ([id], [password], [fullname], [email], [phone], [address], [role], [createDate], [updateDate]) VALUES (N'A-3', N'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', N'Tran Quoc Cuong', N'thienphucymq@gmail.com', N'0949858848', N'HCM', N'customer', CAST(N'2021-10-19 17:31:30.127' AS DateTime), NULL)
INSERT [dbo].[ACCOUNT] ([id], [password], [fullname], [email], [phone], [address], [role], [createDate], [updateDate]) VALUES (N'A-4', N'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', N'0984838844', N'phuchgtse141133@fpt.edu.com', N'BMT', N'Phuc Hoang', N'customer', CAST(N'2021-10-19 23:04:58.173' AS DateTime), NULL)
INSERT [dbo].[ACCOUNT] ([id], [password], [fullname], [email], [phone], [address], [role], [createDate], [updateDate]) VALUES (N'A-5', N'8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', N'Le Phuc', N'ledachoangphuc249@gmail.com', N'0772008835', N'Tan Phu Ho Chi Minh', N'customer', CAST(N'2021-10-20 13:17:52.560' AS DateTime), NULL)
INSERT [dbo].[CATEGORY] ([cateID], [name]) VALUES (N'C-1', N'Phone')
INSERT [dbo].[CATEGORY] ([cateID], [name]) VALUES (N'C-2', N'Laptop')
INSERT [dbo].[CATEGORY] ([cateID], [name]) VALUES (N'C-3', N'Tablet')
INSERT [dbo].[CATEGORY] ([cateID], [name]) VALUES (N'C-4', N'Smart Watch')
INSERT [dbo].[CATEGORY] ([cateID], [name]) VALUES (N'C-5', N'Accessory')
INSERT [dbo].[CATEGORY] ([cateID], [name]) VALUES (N'C-6', N'PC')
INSERT [dbo].[CATEGORY] ([cateID], [name]) VALUES (N'C-7', N'Old Model')
INSERT [dbo].[PAYMENT] ([id], [paymentMethod]) VALUES (N'P-1', N'Cash on Delivery')
INSERT [dbo].[PAYMENT] ([id], [paymentMethod]) VALUES (N'P-2', N'Paypal')
INSERT [dbo].[PRODUCT] ([productID], [name], [price], [img], [description], [status], [quantity], [createBy], [createDate], [category], [counter], [rating], [updateBy], [updateDate]) VALUES (N'C-1-1', N'Xiaomi Redmi Note 10s', 252.93, N'img/C-1-1.jpg', N'4G Bands: 1, 2, 3, 4, 5, 7, 8, 20, 28, 38, 40, 41
Display: AMOLED, 450 nits (typ), 1100 nits (peak) | 6.43 inches, 99.8 cm2 (~83.5% screen-to-body ratio) | 1080 x 2400 pixels, 20:9 ratio (~409 ppi density) | Corning Gorilla Glass 3
Cameras: 64 MP, f/1.8, 26mm (wide), 1/1.97", 0.7µm, PDAF | 8 MP, f/2.2, 118° (ultrawide), 1/4.0", 1.12µm | 2 MP, f/2.4, (macro) | 2 MP, f/2.4, (depth)
Battery: Li-Po 5000 mAh, non-removable | Fast charging 33W
Performance: Mediatek Helio G95 (12 nm) | Octa-core (2x2.05 GHz Cortex-A76 & 6x2.0 GHz Cortex-A55) | Mali-G76 MC4
Factory Unlocked Smartphones are compatible with most GSM carriers. This phone is not compatible with CDMA carriers like Verizon, Sprint, or Boost.', N'Inactive', 1195, N'A-1', CAST(N'2021-10-19 17:39:30.137' AS DateTime), N'C-1', NULL, NULL, N'A-1', CAST(N'2021-10-19 19:56:08.673' AS DateTime))
INSERT [dbo].[PRODUCT] ([productID], [name], [price], [img], [description], [status], [quantity], [createBy], [createDate], [category], [counter], [rating], [updateBy], [updateDate]) VALUES (N'C-1-2', N'Samsung Note 10', 321.72, N'img/C-1-2.jpg', N'Fast charging, long lasting intelligent power and super speed processing outlast whatever you throw at Note 10
S pen’s newest Evolution gives you the power of air gestures, a remote shutter and playlist button and handwriting to text, all in One Magic wand
With a full set of Pro lenses, super stabilization, live video bokeh and precision audio recording, Note 10 is a studio in your pocket
Note 10’s nearly bezel less Infinity display gives an immersive, cinematic quality to whatever you’re viewing
Internet usage time(LTE) (hours) up to 14. Internet usage time(wi fi) (hours) up to 14. Audio playback time (hours, wireless) up to 60. Talk time (4G LTE) (hours) up to 38. Video playback time (hours, wireless) up to 19', N'Inactive', 3440, N'A-1', CAST(N'2021-10-19 17:41:02.060' AS DateTime), N'C-1', NULL, NULL, N'A-1', CAST(N'2021-10-19 19:56:34.013' AS DateTime))
INSERT [dbo].[PRODUCT] ([productID], [name], [price], [img], [description], [status], [quantity], [createBy], [createDate], [category], [counter], [rating], [updateBy], [updateDate]) VALUES (N'C-1-3', N'iPhone 11', 139.99, N'img/C-1-3.jpg', N'This phone is unlocked and compatible with any carrier of choice on GSM and CDMA networks (e.g. AT&T, T-Mobile, Sprint, Verizon, US Cellular, Cricket, Metro, Tracfone, Mint Mobile, etc.).
Tested for battery health and guaranteed to have a minimum battery capacity of 80%.
Successfully passed a full diagnostic test which ensures like-new functionality and removal of any prior-user personal information.
The device does not come with headphones or a SIM card. It does include a generic (Mfi certified) charger and charging cable.
Inspected and guaranteed to have minimal cosmetic damage, which is not noticeable when the device is held at arm''s length.', N'Active', 4330, N'A-1', CAST(N'2021-10-19 17:43:28.570' AS DateTime), N'C-1', NULL, NULL, NULL, NULL)
INSERT [dbo].[PRODUCT] ([productID], [name], [price], [img], [description], [status], [quantity], [createBy], [createDate], [category], [counter], [rating], [updateBy], [updateDate]) VALUES (N'C-1-4', N'Samsung Galaxy Z Flip 3 5G', 1069.989990234375, N'img/C-1-4.jpg', N'Flex Your Best Angle: With Flex Mode, just unfold your mobile phoneâ??s screen to your best angle for hands-free pics and video calls; Choose what you want to capture, set it down, stand back and shoot your best shot
A Camera That Goes Steady: Thanks to Samsung Galaxy Z Flip3â??s Super Steady* feature, you can just set it down and strike a pose for picture perfect selfies
Ultra Compact, Ultra Cool: Show off your style game without the tradeoffs; With a compact design that unfolds, you donâ??t have to compromise screen size for your favorite outfit
Array of Colors: Whether youâ??re into sophisticated neutrals or vibrant tones, youâ??ll turn heads with every take; Complete your look with statement-making color choices of Phantom Black, Lavender, Green, or Cream
Fast Charging for Fast Living: Galaxy Z Flip3 smart phone charges fast so that all your moments last; There''s a right time for downtime and a low battery signal, isn''t it                                       
                                    ', N'Active', 12, N'A-1', CAST(N'2021-10-19 19:20:41.117' AS DateTime), N'C-1', NULL, NULL, NULL, NULL)
INSERT [dbo].[PRODUCT] ([productID], [name], [price], [img], [description], [status], [quantity], [createBy], [createDate], [category], [counter], [rating], [updateBy], [updateDate]) VALUES (N'C-2-1', N'Dell Xps 13', 209.99, N'img/C-2-1.jpg', N'Every little detail comes to life on the XPS 13''s Full HD infinity display. Its 1920 x 1080 resolution delivers twice as many pixels as standard HD (720p) for beautiful clarity no matter what you''re looking at. It''s perfect for kicking back with some entertainment or leaning in for precise photo and video edits.
Premium craftsmanship and design make this laptop a real head-turner. Its all-aluminum body is strong, durable, and stylish, while its carbon-fiber base is tough and thin like aluminum but cooler to the touch. And since it''s ultra-thin and weighs just 2.6 pounds, it''s a breeze to carry wherever you''re headed.
Leave your charger at home. With an industry-best 15 hours* of battery life, the XPS 13 keeps you powered up for full days of work and long nights of play.
The powerful fifth-generation Intel Core i5 processor is 30% more efficient than previous models and uses less power while enabling much longer battery life. And with smart features like Intel Turbo Boost Technology 2.0 and Intel Hyper-Threading Technology, you get full processing power exactly where and when you need it.', N'Active', 4536, N'A-1', CAST(N'2021-10-19 17:47:20.733' AS DateTime), N'C-2', NULL, NULL, NULL, NULL)
INSERT [dbo].[PRODUCT] ([productID], [name], [price], [img], [description], [status], [quantity], [createBy], [createDate], [category], [counter], [rating], [updateBy], [updateDate]) VALUES (N'C-2-2', N'Macbook Pro 13 inch (Apple M1)', 305.79, N'img/C-2-2.jpg', N'Apple-designed M1 chip for a giant leap in CPU, GPU, and machine learning performance
Get more done with up to 20 hours of battery life, the longest ever in a Mac
8-core CPU delivers up to 2.8x faster performance to fly through workflows quicker than ever
8-core GPU with up to 5x faster graphics for graphics-intensive apps and games
16-core Neural Engine for advanced machine learning
8GB of unified memory so everything you do is fast and fluid
Superfast SSD storage launches apps and opens files in an instant', N'Active', 2121, N'A-1', CAST(N'2021-10-19 17:49:43.610' AS DateTime), N'C-2', NULL, NULL, NULL, NULL)
INSERT [dbo].[PRODUCT] ([productID], [name], [price], [img], [description], [status], [quantity], [createBy], [createDate], [category], [counter], [rating], [updateBy], [updateDate]) VALUES (N'C-2-3', N'Asus Zenbook Flip UX363EA ', 249.69, N'img/C-2-3.jpg', N'14-Inch wide-view Full-HD nano-edge bezel touch display in 13.3” chassis with Stylus pen and Windows 10 Pre-installed
Latest 8th generation Intel Core i7-8550U Quad Core Processor 8M Cache, up to 4.00 GHz
Fast storage and memory featuring NVMe PCIe 512GB SSD with 16GB LPDDR3 2133MHz RAM and NVIDIA GeForce MX150 2GB GDDR5 discrete graphics
Extensive connectivity with HDMI/USB Type C, 802.11ac Wi-Fi, and SD Card Reader
Sleek and lightweight 3.3 lbs., 0.5-inch thickness, aluminum body for comfortable portability
Built-in fingerprint reader with one-touch login via Windows Hello feature. With ZenBook Flip 14 voice-recognition capabilities, you can control Cortana with your voice', N'Active', 3437, N'A-1', CAST(N'2021-10-19 17:51:26.333' AS DateTime), N'C-2', NULL, NULL, NULL, NULL)
INSERT [dbo].[PRODUCT] ([productID], [name], [price], [img], [description], [status], [quantity], [createBy], [createDate], [category], [counter], [rating], [updateBy], [updateDate]) VALUES (N'C-3-1', N'Samsung Galaxy Tab S6 Lite ', 90.39, N'img/C-3-1.jpg', N'S PEN INCLUDED: The included S Pen makes it easier than ever to write notes and personalize photos and videos, all without needing to charge. The S Pen attaches magnetically right to your tablet and is always ready to go.
SLIM METAL DESIGN: Take this sleek, lightweight tablet anywhere. Its slim design slips right into your bag and comes in your choice of stylish colors.
ENTERTAINMENT READY: A vivid, crystal clear display draws you into content while dual speakers with sound by AKG supply spacious Dolby Atmos surround sound. With discovery powered by Spotify, setting a personal soundtrack to your waking moments has never been easier.
LONG-LASTING BATTERY: A long-lasting battery lets you stream for up to 12 hours¹ on a single charge. The fast-charging USB-C port allows you to quickly get back to where you left off when you need to recharge.
ONE UI CONNECTIVITY: Sync up multiple devices and double down on your todos with Galaxy Tab S6 Lite. Use it as a hotspot and create share-ready content all at once.
DEX EXPERIENCE: Get more done each day by turning your Galaxy devices into an expanded desktop workstation. Send multiple windows to the devices of your choice and control them all from your Galaxy Tab S6 Lite like a boss.²
¹Battery power consumption depends on usage patterns. Results may vary. ²DeX will be available on R OS or above.', N'Active', 3221, N'A-1', CAST(N'2021-10-19 17:53:52.900' AS DateTime), N'C-3', NULL, NULL, NULL, NULL)
INSERT [dbo].[PRODUCT] ([productID], [name], [price], [img], [description], [status], [quantity], [createBy], [createDate], [category], [counter], [rating], [updateBy], [updateDate]) VALUES (N'C-3-2', N'Lenovo Tab M8 TB-8505X', 89.99, N'img/C-3-2.jpg', N'Stunning performance and stylish design combine in this quick, powerful Android tablet, powered by a Quad-Core, 2.0 GHz processor and Android 9 Pie
The modern, refined look and feel are accentuated by the full metal cover and 82% panel-to-body ratio
The stunning 8" HD (1280 x 800) display brings you a crisper and brighter image, so you can watch your favorite movies and shows without missing a detail
Stay connected with built-in Bluetooth 5.0 and Wi-Fi 802.11 a/b/g/n/ac (2.4/5 GHz), and capture the moment with front and rear cameras
Long-life battery – Watch or browse all day long without the need to recharge with 5000 mAh battery capacity', N'Active', 3232, N'A-1', CAST(N'2021-10-19 17:55:51.680' AS DateTime), N'C-3', NULL, NULL, NULL, NULL)
INSERT [dbo].[PRODUCT] ([productID], [name], [price], [img], [description], [status], [quantity], [createBy], [createDate], [category], [counter], [rating], [updateBy], [updateDate]) VALUES (N'C-3-3', N'iPad Pro M1 2021 11 inch', 98.89, N'img/C-3-3.jpg', N'Apple M1 chip for next-level performance
Stunning 11-inch Liquid Retina display with ProMotion, True Tone, and P3 wide color
TrueDepth camera system featuring Ultra Wide front camera with Center Stage
12MP Wide camera, 10MP Ultra Wide camera, and LiDAR Scanner for immersive AR
Stay connected with ultrafast Wi-Fi
Go further with all-day battery life
Thunderbolt port for connecting to fast external storage, displays, and docks', N'Active', 5332, N'A-1', CAST(N'2021-10-19 17:58:35.693' AS DateTime), N'C-3', NULL, NULL, NULL, NULL)
INSERT [dbo].[PRODUCT] ([productID], [name], [price], [img], [description], [status], [quantity], [createBy], [createDate], [category], [counter], [rating], [updateBy], [updateDate]) VALUES (N'C-4-1', N'Apple Watch Series 6', 469.99, N'img/C-4-1.jpg', N'GPS model lets you take calls and reply to texts from your wrist
Measure your blood oxygen with an all-new sensor and app
Check your heart rhythm with the ECG app
The Always-On Retina display is 2.5x brighter outdoors when your wrist is down
S6 SiP is up to 20% faster than Series 5
5GHz Wi-Fi and U1 Ultra Wideband chip
Track your daily activity on Apple Watch and see your trends in the Fitness app on iPhone', N'Active', 1232, N'A-1', CAST(N'2021-10-19 18:00:52.017' AS DateTime), N'C-4', NULL, NULL, NULL, NULL)
INSERT [dbo].[PRODUCT] ([productID], [name], [price], [img], [description], [status], [quantity], [createBy], [createDate], [category], [counter], [rating], [updateBy], [updateDate]) VALUES (N'C-4-2', N'Samsung Galaxy Watch 4', 299.99, N'img/C-4-2.jpg', N'Get ready to crush your wellness goals with body readings right on your wrist.
Better Sleep Starts Here: Wake up feeling refreshed and recharged with advanced sleep tracking; When you go to bed, your Galaxy Watch4 Classic sleep tracker starts monitoring your sleep and SpO2 levels continuously.
Take care of your heart with accurate ECG monitoring and keep an eye on possible atrial fibrillation, a common form of irregular heart rhythm; Share personalized readings with your doctor using the Samsung Health Monitor app on your Galaxy phone.
Get the most out of every exercise session with advanced workout tracking that recognizes 6 popular activities, from running to rowing to swimming, automatically in just 3 minutes; Stay motivated by connecting to live coaching sessions via your smartphone.
Go the Extra Mile: Improve your runs with advanced running coaching technology; VO2 Max readings assess your oxygen levels to manage and track your heart and lung endurance.
Keep Crushing Your Day: Put the phone features you need right on your wrist and stay connected to calls, texts, notifications, and music streaming, all accessible with a simple tap.
Google on Your Wrist: Tap into the power and convenience of select Google services and apps; Pay for coffee, get directions to the park, use Google Assistant or Bixby, and stream from YouTube Music.
Fashion Meets Function: Sleek, lightweight and customizable, Galaxy Watch 4 is made to move with you while working out and matches your mood and outfit with bands ranging from green, silver, pink and black plus a variety of faces.', N'Active', 4334, N'A-1', CAST(N'2021-10-19 18:03:00.467' AS DateTime), N'C-4', NULL, NULL, NULL, NULL)
INSERT [dbo].[PRODUCT] ([productID], [name], [price], [img], [description], [status], [quantity], [createBy], [createDate], [category], [counter], [rating], [updateBy], [updateDate]) VALUES (N'C-4-3', N'Fitbit Sense', 239.99, N'img/C-4-3.jpg', N'EDA Scan app detects electrodermal activity which may indicate your body''s response to stress and a built-in skin temperature sensor logs yours each night so you can see when it varies
Assess your heart for atrial fibrillation –a heart rhythm irregularity- and easily share results with your doctor (The Fitbit ECG app is only available in select countries. Not intended for use by people under 22 years old.Operating temperature: 14° to 113°F
An on-wrist skin temperature sensor tracks yours each night so you can see how it varies. You can also see your nightly blood oxygen levels at a glance with our collection of clock faces.Radio transceiver: Bluetooth 5.0.Operating temperature: -10° to 45° C
High & low heart rate notifications alert you if yours seems above or below your average.Battery lasts 6 plus days plus, fast charging gives you a full day''s charge in just 12 minutes (Varies with use and other factors; up to 12 hours with continuous GPS).Use built-in GPS during runs, hikes, rides and more to see pace & distance without your phone and use the built-in mic and speaker to take Bluetooth calls hands-free when your phone is nearby (Requires more frequent charging).', N'Active', 4324, N'A-1', CAST(N'2021-10-19 18:04:56.930' AS DateTime), N'C-4', NULL, NULL, NULL, NULL)
INSERT [dbo].[PRODUCT] ([productID], [name], [price], [img], [description], [status], [quantity], [createBy], [createDate], [category], [counter], [rating], [updateBy], [updateDate]) VALUES (N'C-5-1', N'Headphone', 23.99, N'img/C-5-1.jpg', N'POWERFUL PRO AUDIO - Designed by top esports professionals to deliver precision surround sound with 50mm HD Speaker Drivers. Features 3D Audio for best PS5 performance.
WIRELESS & WIRED CAPABILITY - Wirelessly connect up to 40 feet or connect with included 3.5mm cable to power the headset for tournament play. Officially licensed by PlayStation for PlayStation 4 (PS4), PlayStation 5 (PS5), PC (Windows 10 Computer).
NOISE-CANCELING MIC - For crystal clear voice audio Flip up to mute microphone on the fly.
ALL DAY COMFORT - Ultra-Lightweight design, durable frame, cool vegan leather cushions. 16+ Hour battery life for long gaming sessions. USB charging included.
NEXT-GEN ESPORTS GAMING - Tuned for games like Fortnite, Call of Duty (COD) Modern Warfare / Black Ops, DOTA 2, Overwatch, Rainbow 6, APEX Legends, Monster Hunter, Grand Turismo, Battlefield 2042. Great gifts for competitive gamers, holidays, Christmas, birthdays.', N'Active', 1211, N'A-1', CAST(N'2021-10-19 18:07:44.460' AS DateTime), N'C-5', NULL, NULL, NULL, NULL)
INSERT [dbo].[PRODUCT] ([productID], [name], [price], [img], [description], [status], [quantity], [createBy], [createDate], [category], [counter], [rating], [updateBy], [updateDate]) VALUES (N'C-5-2', N'Phone case', 9.99, N'img/C-5-2.jpg', N'?Durable Liquid Silicone Case?for 12, 12 Pro (6.1 inch), Provide Multiple Color Choices. Support Wireless Charging
?Full Body Protection? 1.2mm Raised Lips to Protect Screen and Camera from Scratching and Dropping, Soft Microfiber Lining Inside Will Not Scratch Your Phone Like Other Cases
?Excellent Grip and Non-slip?Unique Premium Liquid Silicone Material Offering Sleek but Non-slip Grip; This Material is Easy to Clean with Wipe
?Slim & Perfect Fits?Precise Cutouts for Easy Access to All Ports, Not Interfere with Microphone Using; Slim but Protective, Add No Extra Bulk to Your Phone
?Lifetime Replacement?Offers Lifetime Replacement for Your 12/12 Pro Silicone Case. You are always the First for us', N'Active', 2133, N'A-1', CAST(N'2021-10-19 18:09:00.537' AS DateTime), N'C-5', NULL, NULL, NULL, NULL)
INSERT [dbo].[PRODUCT] ([productID], [name], [price], [img], [description], [status], [quantity], [createBy], [createDate], [category], [counter], [rating], [updateBy], [updateDate]) VALUES (N'C-6-1', N'HHPC GAMING', 1090.9, N'img/C-6-1', N'? MAINBOARD: MSI H510M-A PRO
? CPU: INTEL CORE i3 10100F up to 4.3G |  4 CORE | 8 THREAD
? RAM: G.SKILL 8GB (1x8GB) DDR4 2400MHz
? VGA: NVIDIA GTX 1050Ti 4GB GDDR5
? SSD: GIGABYTE SSD 240G SATA III
? HDD: QUÝ KHÁCH TÙY CH?N THEO NHU C?U 
? NGU?N: COOLER MASTER MWE V2 230 450 450W 80 PLUS BRONZE 
? CASE:  JETEK KAMADO ( NO FANS )', N'Active', 3423, N'A-1', CAST(N'2021-10-19 18:11:15.767' AS DateTime), N'C-6', NULL, NULL, NULL, NULL)
INSERT [dbo].[PRODUCT] ([productID], [name], [price], [img], [description], [status], [quantity], [createBy], [createDate], [category], [counter], [rating], [updateBy], [updateDate]) VALUES (N'C-7-1', N'Old PC', 830.29, N'img/C-7-1', N'Like new 99%', N'Active', 21, N'A-1', CAST(N'2021-10-19 18:13:41.767' AS DateTime), N'C-7', NULL, NULL, NULL, NULL)
INSERT [dbo].[ORDER_PRODUCT] ([orderID], [customer], [buyerName], [buyDate], [phone], [shipAddress], [total], [status]) VALUES (N'OP-1', N'A-5', N'Hoang Phuc', CAST(N'2021-10-20 16:57:33.133' AS DateTime), N'0772008835', N'Tan Phu Ho Chi Minh', 252.93, N'Wait for Confirmation')
INSERT [dbo].[ORDER_PRODUCT] ([orderID], [customer], [buyerName], [buyDate], [phone], [shipAddress], [total], [status]) VALUES (N'OP-10', N'A-5', N'Hoang Phuc', CAST(N'2021-10-20 16:57:33.137' AS DateTime), N'0772008835', N'Tan Phu Ho Chi Minh', 643.44, N'Canceled')
INSERT [dbo].[ORDER_PRODUCT] ([orderID], [customer], [buyerName], [buyDate], [phone], [shipAddress], [total], [status]) VALUES (N'OP-2', N'A-5', N'Hoang Phuc', CAST(N'2021-10-20 16:57:33.137' AS DateTime), N'0772008835', N'Tan Phu Ho Chi Minh', 461.71, N'Confirmed')
INSERT [dbo].[ORDER_PRODUCT] ([orderID], [customer], [buyerName], [buyDate], [phone], [shipAddress], [total], [status]) VALUES (N'OP-3', N'A-5', N'Hoang Phuc', CAST(N'2021-10-20 16:57:33.137' AS DateTime), N'0772008835', N'Tan Phu Ho Chi Minh', 765.47, N'Delivering')
INSERT [dbo].[ORDER_PRODUCT] ([orderID], [customer], [buyerName], [buyDate], [phone], [shipAddress], [total], [status]) VALUES (N'OP-4', N'A-5', N'Hoang Phuc', CAST(N'2021-10-20 16:57:33.137' AS DateTime), N'0772008835', N'Tan Phu Ho Chi Minh', 502.62, N'Completed')
INSERT [dbo].[ORDER_PRODUCT] ([orderID], [customer], [buyerName], [buyDate], [phone], [shipAddress], [total], [status]) VALUES (N'OP-5', N'A-5', N'Hoang Phuc', CAST(N'2021-10-20 16:57:33.137' AS DateTime), N'0772008835', N'Tan Phu Ho Chi Minh', 1230.42, N'Canceled')
INSERT [dbo].[ORDER_PRODUCT] ([orderID], [customer], [buyerName], [buyDate], [phone], [shipAddress], [total], [status]) VALUES (N'OP-6', N'A-5', N'Hoang Phuc', CAST(N'2021-10-20 16:57:33.137' AS DateTime), N'0772008835', N'Tan Phu Ho Chi Minh', 749.07, N'Wait for Confirmation')
INSERT [dbo].[ORDER_PRODUCT] ([orderID], [customer], [buyerName], [buyDate], [phone], [shipAddress], [total], [status]) VALUES (N'OP-7', N'A-5', N'Hoang Phuc', CAST(N'2021-10-20 16:57:33.137' AS DateTime), N'0772008835', N'Tan Phu Ho Chi Minh', 1049.95, N'Confirmed')
INSERT [dbo].[ORDER_PRODUCT] ([orderID], [customer], [buyerName], [buyDate], [phone], [shipAddress], [total], [status]) VALUES (N'OP-8', N'A-5', N'Hoang Phuc', CAST(N'2021-10-20 16:57:33.137' AS DateTime), N'0772008835', N'Tan Phu Ho Chi Minh', 461.71, N'Delivering')
INSERT [dbo].[ORDER_PRODUCT] ([orderID], [customer], [buyerName], [buyDate], [phone], [shipAddress], [total], [status]) VALUES (N'OP-9', N'A-5', N'Hoang Phuc', CAST(N'2021-10-20 16:57:33.137' AS DateTime), N'0772008835', N'Tan Phu Ho Chi Minh', 389.68, N'Completed')
INSERT [dbo].[ORDER_DETAIL] ([orderDetailID], [orderID], [productID], [quantity], [price]) VALUES (N'OD-1', N'OP-1', N'C-1-1', 1, 252.93)
INSERT [dbo].[ORDER_DETAIL] ([orderDetailID], [orderID], [productID], [quantity], [price]) VALUES (N'OD-10', N'OP-5', N'C-1-1', 1, 252.93)
INSERT [dbo].[ORDER_DETAIL] ([orderDetailID], [orderID], [productID], [quantity], [price]) VALUES (N'OD-11', N'OP-5', N'C-1-2', 1, 321.72)
INSERT [dbo].[ORDER_DETAIL] ([orderDetailID], [orderID], [productID], [quantity], [price]) VALUES (N'OD-12', N'OP-5', N'C-1-3', 1, 139.99)
INSERT [dbo].[ORDER_DETAIL] ([orderDetailID], [orderID], [productID], [quantity], [price]) VALUES (N'OD-13', N'OP-5', N'C-2-1', 1, 209.99)
INSERT [dbo].[ORDER_DETAIL] ([orderDetailID], [orderID], [productID], [quantity], [price]) VALUES (N'OD-14', N'OP-5', N'C-2-2', 1, 305.79)
INSERT [dbo].[ORDER_DETAIL] ([orderDetailID], [orderID], [productID], [quantity], [price]) VALUES (N'OD-15', N'OP-6', N'C-2-3', 3, 249.69)
INSERT [dbo].[ORDER_DETAIL] ([orderDetailID], [orderID], [productID], [quantity], [price]) VALUES (N'OD-16', N'OP-7', N'C-2-1', 5, 209.99)
INSERT [dbo].[ORDER_DETAIL] ([orderDetailID], [orderID], [productID], [quantity], [price]) VALUES (N'OD-17', N'OP-8', N'C-1-2', 1, 321.72)
INSERT [dbo].[ORDER_DETAIL] ([orderDetailID], [orderID], [productID], [quantity], [price]) VALUES (N'OD-18', N'OP-8', N'C-1-3', 1, 139.99)
INSERT [dbo].[ORDER_DETAIL] ([orderDetailID], [orderID], [productID], [quantity], [price]) VALUES (N'OD-19', N'OP-9', N'C-2-3', 1, 249.69)
INSERT [dbo].[ORDER_DETAIL] ([orderDetailID], [orderID], [productID], [quantity], [price]) VALUES (N'OD-2', N'OP-10', N'C-1-2', 2, 321.72)
INSERT [dbo].[ORDER_DETAIL] ([orderDetailID], [orderID], [productID], [quantity], [price]) VALUES (N'OD-20', N'OP-9', N'C-1-3', 1, 139.99)
INSERT [dbo].[ORDER_DETAIL] ([orderDetailID], [orderID], [productID], [quantity], [price]) VALUES (N'OD-3', N'OP-2', N'C-1-3', 1, 139.99)
INSERT [dbo].[ORDER_DETAIL] ([orderDetailID], [orderID], [productID], [quantity], [price]) VALUES (N'OD-4', N'OP-2', N'C-1-2', 1, 321.72)
INSERT [dbo].[ORDER_DETAIL] ([orderDetailID], [orderID], [productID], [quantity], [price]) VALUES (N'OD-5', N'OP-3', N'C-2-1', 1, 209.99)
INSERT [dbo].[ORDER_DETAIL] ([orderDetailID], [orderID], [productID], [quantity], [price]) VALUES (N'OD-6', N'OP-3', N'C-2-2', 1, 305.79)
INSERT [dbo].[ORDER_DETAIL] ([orderDetailID], [orderID], [productID], [quantity], [price]) VALUES (N'OD-7', N'OP-3', N'C-2-3', 1, 249.69)
INSERT [dbo].[ORDER_DETAIL] ([orderDetailID], [orderID], [productID], [quantity], [price]) VALUES (N'OD-8', N'OP-4', N'C-2-3', 1, 249.69)
INSERT [dbo].[ORDER_DETAIL] ([orderDetailID], [orderID], [productID], [quantity], [price]) VALUES (N'OD-9', N'OP-4', N'C-1-1', 1, 252.93)
INSERT [dbo].[PAYMENT_DETAIL] ([paymentDetailID], [paymentMethod], [orderID], [create_at], [account_number], [payment_status]) VALUES (N'PD-1', N'P-1', N'OP-1', CAST(N'2021-10-21 22:57:37.413' AS DateTime), N'A-1', N'Sucess')
INSERT [dbo].[PAYMENT_DETAIL] ([paymentDetailID], [paymentMethod], [orderID], [create_at], [account_number], [payment_status]) VALUES (N'PD-10', N'P-2', N'OP-10', CAST(N'2021-10-21 23:03:20.573' AS DateTime), N'A-1', N'Sucess')
INSERT [dbo].[PAYMENT_DETAIL] ([paymentDetailID], [paymentMethod], [orderID], [create_at], [account_number], [payment_status]) VALUES (N'PD-2', N'P-2', N'OP-2', CAST(N'2021-10-21 22:57:37.417' AS DateTime), N'A-1', N'Waiting')
INSERT [dbo].[PAYMENT_DETAIL] ([paymentDetailID], [paymentMethod], [orderID], [create_at], [account_number], [payment_status]) VALUES (N'PD-3', N'P-1', N'OP-3', CAST(N'2021-10-21 23:03:20.570' AS DateTime), N'A-1', N'Sucess')
INSERT [dbo].[PAYMENT_DETAIL] ([paymentDetailID], [paymentMethod], [orderID], [create_at], [account_number], [payment_status]) VALUES (N'PD-4', N'P-2', N'OP-4', CAST(N'2021-10-21 23:03:20.570' AS DateTime), N'A-1', N'Sucess')
INSERT [dbo].[PAYMENT_DETAIL] ([paymentDetailID], [paymentMethod], [orderID], [create_at], [account_number], [payment_status]) VALUES (N'PD-5', N'P-1', N'OP-5', CAST(N'2021-10-21 23:03:20.570' AS DateTime), N'A-1', N'Waiting')
INSERT [dbo].[PAYMENT_DETAIL] ([paymentDetailID], [paymentMethod], [orderID], [create_at], [account_number], [payment_status]) VALUES (N'PD-6', N'P-1', N'OP-6', CAST(N'2021-10-21 23:03:20.570' AS DateTime), N'A-1', N'Sucess')
INSERT [dbo].[PAYMENT_DETAIL] ([paymentDetailID], [paymentMethod], [orderID], [create_at], [account_number], [payment_status]) VALUES (N'PD-7', N'P-1', N'OP-7', CAST(N'2021-10-21 23:03:20.573' AS DateTime), N'A-1', N'Waiting')
INSERT [dbo].[PAYMENT_DETAIL] ([paymentDetailID], [paymentMethod], [orderID], [create_at], [account_number], [payment_status]) VALUES (N'PD-8', N'P-2', N'OP-8', CAST(N'2021-10-21 23:03:20.573' AS DateTime), N'A-1', N'Sucess')
INSERT [dbo].[PAYMENT_DETAIL] ([paymentDetailID], [paymentMethod], [orderID], [create_at], [account_number], [payment_status]) VALUES (N'PD-9', N'P-1', N'OP-9', CAST(N'2021-10-21 23:03:20.573' AS DateTime), N'A-1', N'Waiting')

CREATE TRIGGER trg_Order ON ORDER_DETAIL 
AFTER INSERT AS 
BEGIN
	UPDATE PRODUCT
	SET quantity = PRODUCT.quantity - (
		SELECT quantity
		FROM inserted
		WHERE productID = PRODUCT.productID
	), counter=PRODUCT.counter+1
	FROM PRODUCT
	JOIN inserted ON PRODUCT.productID = inserted.productID
END
GO

CREATE TRIGGER trg_Notification ON ORDER_PRODUCT
AFTER INSERT AS
BEGIN
     DECLARE @orderID nvarchar(50), @buyDate datetime, @content varchar(500), @idReceiver varchar(10)
	 SET @orderID=(SELECT orderID
	                   FROM inserted)
	 SET @buyDate=(SELECT buyDate
	                   FROM inserted)
	 SET @idReceiver=(SELECT customer
	                   FROM inserted)
	SET @content=N'Order #'+@orderID+' successfully checkout at '+convert(nvarchar(MAX), @buyDate, 7)
	INSERT INTO Notification(idReceiver, content)
	VALUES(@idReceiver, @content)
END
GO

CREATE TRIGGER trg_NotificationUpdate ON ORDER_PRODUCT
AFTER UPDATE AS
BEGIN
    DECLARE @idReceiver varchar(10), @content varchar(500), @orderID nvarchar(50), @status varchar(20)
    SET @idReceiver=(SELECT customer
	                 FROM inserted)
	SET @orderID=(SELECT orderID
	                   FROM inserted)
	SET @status=(SELECT orderID
	                   FROM inserted)
	SET @content='Order #'+ @orderID
	if (@status = 'delivering')  SET @content='Order #'+ @orderID + 'is delivering'
	ELSE SET @content='Order #'+ @orderID +' have been ' + @status
	INSERT INTO Notification(idReceiver, Content)
	VALUES(@idReceiver, @content)
END