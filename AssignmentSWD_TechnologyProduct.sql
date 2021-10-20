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
	id varchar(10),
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
	status varchar(20),
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
	review_rate float,
	review_comment varchar(500),
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
	SET @content=N'Order #'+@orderID+' successfully checkout at '+@buyDate
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