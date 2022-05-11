CREATE DATABASE QUANLYMAYTINHCNPM

USE QUANLYMAYTINHCNPM

CREATE TABLE CUSTOMER 
(
	Customer_id int identity(1,1) primary key,
	DisplayName nvarchar(100),
	Address nvarchar(100),
	Phone nvarchar(20),
	Email nvarchar(100),
	MoreInfo nvarchar(max),
	ContactDate datetime
)
go

CREATE TABLE UNIT
(
	Unit_id int identity(1,1) primary key,
	DisplayName nvarchar(30)
)
go

CREATE TABLE SUPPLIERTYPE
(
	SupplierType_id int identity(1,1) primary key,
	DisplayName nvarchar(100)
)
go

CREATE TABLE SUPPLIER
(
	Supplier_id int identity(1,1) primary key,
	DisplayName nvarchar(100),
	Address nvarchar(100),
	Phone nvarchar(20),
	Email nvarchar(100),
	MoreInfo nvarchar(max),
	ContactDate datetime,
	SupplierType_id int
)
go

CREATE TABLE PRODUCTTYPE
(
	ProductType_id int identity(1,1) primary key,
	DisplayName nvarchar(100)
)
go 

CREATE TABLE PRODUCT
(
	Product_id int identity(1,1) primary key,
	DisplayName nvarchar(100),
	Status nvarchar(100),
	MoreInfo nvarchar(max),
	Unit_id int,
	Supplier_id int,
	ProductType_id int
)
go

CREATE TABLE USERROLE
(
	UserRole_id int identity(1,1) primary key,
	DisplayName nvarchar(100)
)
go

CREATE TABLE USERS
(
	User_id int identity(1,1) primary key,
	DisplayName nvarchar(100),
	UserName nvarchar(100),
	Password  nvarchar(max),
	UserRole_id int
)
go

CREATE TABLE BUYBILL
(
	BuyBill_id int identity(1,1) primary key,
	ContactTime smalldatetime,
	FinalTotalPrice money
)
go

CREATE TABLE SALEBILL
(
	SaleBill_id int identity(1,1) primary key,
	ContactTime smalldatetime,
	FinalTotalPrice money
)
go

CREATE TABLE INPUT
(
	input_id int identity(1,1) primary key,
	ContactTime smalldatetime,
	TotalPrice money,
	BuyBill_id int
)
go

CREATE TABLE INPUTINFO
(
	InputInfo_id int identity(1,1) primary key,
	Counts int,
	InputPrice money,
	OutputPrice money,
	Product_id int,
	Input_id int,
)
go

CREATE TABLE OUTPUT
(
	Output_id int identity(1,1) primary key,
	ContactTime smalldatetime,
	TotalPrice money,
	Customer_id int,
	SaleBill_id int,
)
go

CREATE TABLE OUTPUTINFO
(
	OutputInfo_id int identity(1,1) primary key,
	Counts int,
	Status nvarchar(100),
	Product_id int,
	InputInfo_id int,
	Output_id int,
)
go

CREATE TABLE SERVICE
(
	Service_id int identity(1,1) primary key,
	DisplayName nvarchar(100),
	MoreInfo nvarchar(max),
)
go

CREATE TABLE SERVICEBILL
(
	ServiceBill_id int identity(1,1) primary key,
	ContactTime smalldatetime,
	FinalTotalPrice money,
	Customer_id int,
)
go

CREATE TABLE SERVICEBILLINFO
(
	ServiceBillInfo_id int identity(1,1) primary key,
	ProductName nvarchar(100),
	TotalPrice money,
	Service_id int,
	ServiceBill_id int
)
go

ALTER TABLE SUPPLIER
ADD CONSTRAINT FK_SUPPLIER_SUPPLIERTYPE
FOREIGN KEY (SupplierType_id)
REFERENCES SUPPLIERTYPE(SupplierType_id)

ALTER TABLE PRODUCT
ADD CONSTRAINT FK_PRODUCT_UNIT
FOREIGN KEY (Unit_id)
REFERENCES UNIT(Unit_id)

ALTER TABLE PRODUCT
ADD CONSTRAINT FK_PRODUCT_SUPPLIER
FOREIGN KEY (Supplier_id)
REFERENCES SUPPLIER(Supplier_id)

ALTER TABLE PRODUCT
ADD CONSTRAINT FK_PRODUCT_PRODUCTTYPE
FOREIGN KEY (ProductType_id)
REFERENCES PRODUCTTYPE(ProductType_id)

ALTER TABLE USERS
ADD CONSTRAINT FK_USERS_USERROLE
FOREIGN KEY (UserRole_id)
REFERENCES USERROLE(UserRole_id)

ALTER TABLE INPUT
ADD CONSTRAINT FK_INPUT_BUYBILL
FOREIGN KEY (BuyBill_id)
REFERENCES BUYBILL(BuyBill_id)

ALTER TABLE INPUTINFO
ADD CONSTRAINT FK_INPUTINFO_PRODUCT
FOREIGN KEY (Product_id)
REFERENCES PRODUCT(Product_id)

ALTER TABLE INPUTINFO
ADD CONSTRAINT FK_INPUTINFO_INPUT
FOREIGN KEY (Input_id)
REFERENCES INPUT(Input_id)

ALTER TABLE OUTPUT
ADD CONSTRAINT FK_OUTPUT_CUSTOMER
FOREIGN KEY (Customer_id)
REFERENCES CUSTOMER(Customer_id)

ALTER TABLE OUTPUT
ADD CONSTRAINT FK_OUTPUT_SALEBILL
FOREIGN KEY (SaleBill_id)
REFERENCES SALEBILL(SaleBill_id)

ALTER TABLE OUTPUTINFO
ADD CONSTRAINT FK_OUTPUTINFO_PRODUCT
FOREIGN KEY (Product_id)
REFERENCES Product(Product_id)

ALTER TABLE OUTPUTINFO
ADD CONSTRAINT FK_OUTPUTINFO_INPUTINFO
FOREIGN KEY (InputInfo_id)
REFERENCES INPUTINFO(InputInfo_id)

ALTER TABLE OUTPUTINFO
ADD CONSTRAINT FK_OUTPUTINFO_OUTPUT
FOREIGN KEY (Output_id)
REFERENCES OUTPUT(Output_id)

ALTER TABLE SERVICEBILL
ADD CONSTRAINT FK_SERVICEBILL_CUSTOMER
FOREIGN KEY (Customer_id)
REFERENCES CUSTOMER(Customer_id)

ALTER TABLE SERVICEBILLINFO
ADD CONSTRAINT FK_SERVICEBILLINFO_SERVICE
FOREIGN KEY (Service_id)
REFERENCES SERVICE(Service_id)

ALTER TABLE SERVICEBILLINFO
ADD CONSTRAINT FK_SERVICEBILLINFO_SERVICEBILL
FOREIGN KEY (ServiceBill_id)
REFERENCES SERVICEBILL(ServiceBill_id)

INSERT INTO USERROLE 
VALUES (N'Quản lí'),
       (N'Nhân viên')

INSERT INTO USERS
VALUES (N'Huỳnh Thành Lợi',N'huynhloi',N'123',1),
       (N'Nguyễn Đức Hiếu',N'darkhero',N'123',2)

SELECT COUNT(*) FROM CUSTOMER