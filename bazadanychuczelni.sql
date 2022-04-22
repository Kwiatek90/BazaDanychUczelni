use BazaDanychUczelni
create database BazaDanychUczelni
-----------------Tworzenie tabel--------------------

create table Prowadzacy
(id int primary key identity(1,1), 
imie varchar(20),
nazwisko varchar(20),
PrzedmiotID int references Przedmiot(id))

create table Student
(id int primary key identity(1,1), 
imie varchar(20),
nazwisko varchar(20),
PrzedmiotID int references Przedmiot(id))

create table Przedmiot
(id int primary key identity(1,1), 
Nazwa varchar(20),
Dzien date,
Godzina varchar(20),
Sala int)
---------------------Dodawanie wartoœæi-----------------
insert into Prowadzacy values
('Jan','Nowak',4),
('Piotr','Walczak',4)

insert into Student values
('Marcin','Krajewski',1),
('Radek','Jankowski',2)

insert into Przedmiot values
('Rachunkowoœæ','2022-05-03','08:00:00',12),
('Testowanie aplikacji','2022-01-23','16:00:00',12),
('Przedsiebiorstwo','2022-03-15','13:30:00',432),
('Statystyka','2022-04-11','17:45:00',123),
('Systemy baz danych','2022-06-22','19:30:00',412),
('Matematyka','2022-03-25','8:45:00',134),
('Filozofia','2022-03-01','11:30:00',342),
('Podstawy Zarzadzania','2022-04-17','15:15:00',123),
('Finanse','2022-02-28','8:00:00',24),
('Programowanie','2022-02-18','14:15:00',156)


--------------------Wyswietlanie tabel------------------------

select * from Student
select * from Prowadzacy
select * from Przedmiot

---------------Procedury--------------------------
---------------Przedmiot--------------------------
create procedure wyswietlPrzedmiot

as

begin

select * from Przedmiot

end

go

CREATE PROCEDURE dodajPrzedmiot
@Nazwa varchar(20),
@Dzien date,
@Godzina varchar(20),
@Sala int

AS

BEGIN

INSERT INTO Przedmiot(Nazwa,Dzien,Godzina,Sala)

VALUES     (@Nazwa,@Dzien, @Godzina, @Sala)
end
go

CREATE PROCEDURE aktualizujPrzedmiot
@Nazwa varchar(20),
@Dzien date,
@Godzina varchar(20),
@Sala int,
@id int

AS

BEGIN

update Przedmiot 
set 
Nazwa=@Nazwa, 
Dzien=@Dzien,
Godzina=@Godzina,
Sala=@Sala 
where 
id=@id
end
go

create procedure usunPrzedmiot
@id int

as

begin

delete from Przedmiot where id=@id

end

go

---------------Prowadz¹cy--------------------------
create procedure wyswietlProwadzacy

as

begin

select * from Prowadzacy

end

go

CREATE PROCEDURE dodajProwadzacy
@imie varchar(20),
@nazwisko varchar(20),
@PrzedmiotID int

AS

BEGIN

INSERT INTO Prowadzacy(imie,nazwisko,PrzedmiotID)

VALUES     (@imie,@nazwisko,@PrzedmiotID)
end
go

CREATE PROCEDURE aktualizujProwadzacy
@imie varchar(20),
@nazwisko varchar(20),
@PrzedmiotID int,
@id int

AS

BEGIN

update Prowadzacy
set 
imie=@imie, 
nazwisko=@nazwisko,
PrzedmiotID=@PrzedmiotID
where 
id=@id
end
go

create procedure usunProwadzacy
@id int

as

begin

delete from Prowadzacy where id=@id

end

go
---------------Student--------------------------
create procedure wyswietlStudent

as

begin

select * from Student

end

go

CREATE PROCEDURE dodajStudent
@imie varchar(20),
@nazwisko varchar(20),
@PrzedmiotID int

AS

BEGIN

INSERT INTO Student(imie,nazwisko,PrzedmiotID)

VALUES     (@imie,@nazwisko,@PrzedmiotID)
end
go

CREATE PROCEDURE aktualizujStudent
@imie varchar(20),
@nazwisko varchar(20),
@PrzedmiotID int,
@id int

AS

BEGIN

update Student
set 
imie=@imie, 
nazwisko=@nazwisko,
PrzedmiotID=@PrzedmiotID
where 
id=@id
end
go

create procedure usunStudent
@id int

as

begin

delete from Student where id=@id

end

go