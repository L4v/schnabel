DROP TABLE IF EXISTS hospitals;
CREATE TABLE hospitals(api_key VARCHAR(255) PRIMARY KEY, "name" VARCHAR(255));

DROP TABLE IF EXISTS specialoffers;
CREATE TABLE specialoffers(id SERIAL PRIMARY KEY, "name" VARCHAR(255), content VARCHAR(255), valid_from DATE, valid_until DATE, pharmacy_id VARCHAR(255));

