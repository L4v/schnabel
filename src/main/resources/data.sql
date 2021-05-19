-- -- TODO(Jovan): Move to separate .sql files

insert into pharmacies(id, "name", city, postcode, street, street_no) values(1, 'aaa', 'ababa', '12222', 'aaaa', 6);

insert into warehouse values(1,1);

insert into drugs values(1, 'anestetik', 'lidokain');
insert into drugs values(2, 'anestetik', 'prokain');
insert into drugs values(3, 'anestetik', 'tetrakain');
insert into drugs values(4, 'sedativ', 'bensedin');
insert into drugs values(5, 'sedativ', 'xanax');

insert into drugprice values(1, 100, '2022-06-01', '2020-01-01', 1);
insert into drugprice values(2, 100, '2022-06-01', '2020-01-01', 2);
insert into drugprice values(3, 100, '2022-06-01', '2020-01-01', 3);
insert into drugprice values(4, 100, '2022-06-01', '2020-01-01', 4);
insert into drugprice values(5, 100, '2022-06-01', '2020-01-01', 5);

insert into warehouseitem values(1, 20, 10, 1, 1);
insert into warehouseitem values(2, 20, 10, 2, 1);
insert into warehouseitem values(3, 20, 10, 3, 1);
insert into warehouseitem values(4, 20, 10, 4, 1);
insert into warehouseitem values(5, 20, 10, 5, 1);

insert into patients(id, "name", surname, email, "password", city, postcode, street, street_no, is_activated) values (1, 'Petar', 'Petrovic', 'petar@gmail.com', '$2y$10$y4R0ENDjGsrlx7g81GDvce2x/NYPrV5jlNuig6T0bV9gNoblcSgHK', '21000', 'Novi Sad', 'Bulevar', '1', false);

insert into dermatologists(id, "name", surname, email, "password", city, postcode, street, street_no, is_activated) values (2, 'Mamma', 'Mia', 'mamma@gmail.com', '123', '11000', 'Beograd', 'Bulevar', '1', true);

insert into suppliers(id, "name", surname, email, "password", city, postcode, street, street_no, firm, is_activated) values (3, 'Zoki', 'Zokic', 'zokidoo@gmail.com', '123', '11000', 'Beograd', 'Bulevar', '1', 'Dobavljac Zoki', true);

insert into pharmacyadmins(id, "name", surname, email, "password", city, postcode, street, street_no, pharmacy_id, is_activated) values (4, 'Mika', 'Mikic', 'miki@gmail.com', '123', '11000', 'Beograd', 'Bulevar', '1', 1, true);


--insert into pharmacyadmins(id, "name", surname, date_of_birth, email, "password", city, postcode, street, street_no, pharmacy_id) values (4, 'Mika', 'Mikic', '2000-06-01', 'miki@gmail.com', '123', '11000', 'Beograd', 'Bulevar', 1, 1);

--insert into pharmacists(id, "name", surname, date_of_birth, email, "password", city, postcode, street, street_no, pharmacy_id) values (5, 'Ana', 'Anic', '2000-06-01', 'ana@gmail.com', '12345678', 'Beograd', '11000', 'Bulevar', 1, 1);

insert into pharmacists(id, "name", surname, email, "password", city, postcode, street, street_no, pharmacy_id, is_activated) values (5, 'Ana', 'Anic', 'ana@gmail.com', '123', '11000', 'Beograd', 'Bulevar', '1', 1, true);


insert into orders(id, deadline, "description", pharmacyadmin_id) values (1, '2021-05-10', 'My order', 4);

insert into orderitems(id, quantity, drug_id, order_id) values (1, 1, 1, 1);

insert into offers(id, price, date_of_delivery, order_id, supplier_id) values (1, 500, '2021-05-05', 1, 3);

insert into dermatologist_pharmacy(dermatologist_id, pharmacy_id) values (2, 1);

insert into promotions(id, "description", start_time, end_time, pharmacy_id) values (1, 'New promotion!!!', '2021-05-04','2021-06-04', 1);

insert into vacations(id, start_time, end_time, pharmacy_id, medical_employee_id) values (1, '2021-06-01', '2021-06-11', 1, 5);

insert into appointments values (1, false, '2020-12-20 12:30:00', '2020-12-20 12:15:00', 3000, 5, 1, 1);
insert into appointments values (2, false, '2020-11-20 08:45:00', '2020-11-20 08:15:00', 5000, 2, 1, 1);

insert into app_report values(1, 'BO', 1);
insert into app_report values(2, 'BO', 2);

insert into recommended_meds values(1, 20, 2, 5, 1);
insert into recommended_meds values(2, 30, 3, 4, 1);
insert into recommended_meds values(3, 7, 1, 1, 2);


insert into allergies values(1, 'Sta god', 4, 1);

insert into complaints values(1, null, 'Ana Anic neljubazna full', 1);
insert into complaints values(2, 'Nema se novaca. Srdacno, Mika Mikic', 'Zasto imate samo jednu apoteku pobogu?', 1);

insert into recipes values(1, 1, 1, 5);
insert into recipe_items values(1, 2, 1, 1);
insert into recipe_items values(2, 5, 5, 1);

insert into drugs_reservations values(1, '2021-05-20', 2, '2021-05-04', 1, 1, 1);


insert into availability_request values(1, 10, 1, 5, 1);
insert into availability_request values(2, 5, 2, 5, 1);
insert into availability_request values(3, 7, 3, 5, 1);
-- INSERT INTO hospitals("name", api_key) VALUES('sacred_heart_hospital', 'apishh1234');
-- INSERT INTO hospitals("name", api_key) VALUES('princeton_plainsboro', 'apipp1234');
-- INSERT INTO hospitals("name", api_key) VALUES('limanska_ambulanta', 'apila1234');
--
-- INSERT INTO drugs( "name", description, quantity, price, start_time, end_time) VALUES( 'Brufen 600mg', 'Analgetik Brufen 600mg film tableta', 1, 250.0, '2020-07-01', '2021-07-01');
-- INSERT INTO drugs( "name", description, quantity, price, start_time, end_time) VALUES( 'Vitamin C 1000mg', 'Vitaminski suplement 1000mg film tableta', 2, 55.0, '2020-07-01', '2021-08-01');
-- INSERT INTO drugs( "name", description, quantity, price, start_time, end_time) VALUES( 'B12 1000mcg', 'Vitaminski supleent 1000mcg B12, cijankobalamin', 5, 99.0, '2020-07-01', '2021-09-01');
-- INSERT INTO pharmacies(city, postcode, street, street_no, avg_rating, "name")
-- VALUES('Novi Sad', '21000', 'Balzakova', 44, 4.5, 'Cvjetkovic');
--
-- INSERT INTO patients(city, postcode, street, street_no, "name", surname, email)
-- VALUES('Novi Sad', '21000', 'Balzakova', 69, 'Jovan', 'Ivosevic', 'ivosevic.jovan@uns.ac.rs');
-- INSERT INTO patients(city, postcode, street, street_no, "name", surname, email)
-- VALUES('Beograd', '11000', 'Carlija Caplina', 12, 'Petar', 'Petrovic', 'petrovic.petar@bc.ac.rs');
--
-- INSERT INTO drugreservations(valid_until, drug_id, patient_id)
-- VALUES('2021-02-03', 1, 1);
-- INSERT INTO drugreservations(valid_until, drug_id, patient_id)
-- VALUES('2021-02-01', 1, 2);
--
-- INSERT INTO employed_users(dtype, city, postcode, street, street_no, email, "name", "password", surname)
-- VALUES('Dermatologist', 'Novi Sad', '21000', 'Balzakova', 69, 'ivosevic.jovan@uns.ac.rs', 'Jovan', 'mojasifralol', 'Ivosevic');
--
-- INSERT INTO dermatologist_pharmacy(dermatologist_id, pharmacy_id)
-- VALUES(1, 1);
--
-- INSERT INTO shifts(employed_user_id, pharmacy_id, start_time, end_time)
-- VALUES (1, 1, '08:00:00', '12:00:00');

--INSERT INTO terms(start_time, end_time, pharmacy_id, employee_id, patient_id)
--VALUES ('2020-12-22 09:10:00', '2020-12-22 09:40:00', 1, 1, 1);
--INSERT INTO terms(start_time, end_time, pharmacy_id, employee_id, patient_id)
--VALUES ('2020-12-23 10:00:00', '2020-12-23 10:20:00', 1, 1, 2);

-- INSERT INTO orders("description", deadline)
-- VALUES ('Ordering drugs', '2021-02-20');
-- INSERT INTO orders("description", deadline)
-- VALUES ('Ordering brufen', '2021-03-20');
--
-- INSERT INTO orderitems(order_id, drug_id, quantity)
-- VALUES (1, 1, 2);
-- INSERT INTO orderitems(order_id, drug_id, quantity)
-- VALUES (1, 2, 3);
-- INSERT INTO orderitems(order_id, drug_id, quantity)
-- VALUES (2, 3, 1);
