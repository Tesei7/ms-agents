INSERT INTO zip_code (id, zip_code) VALUES (1, '90210');
INSERT INTO zip_code (id, zip_code) VALUES (2, '90211');
INSERT INTO zip_code (id, zip_code) VALUES (3, '90216');

INSERT INTO agent (id, first_name, last_name, email, phone) VALUES (1, 'Ilia', 'Bochkarev', 'ilia@mail.ru', '+19111234567');
INSERT INTO agent (id, first_name, last_name, email, phone) VALUES (2, 'Ivan', 'Ivanov', 'ivanov@mail.ru', '+19871234567');

INSERT INTO agent_zipcode (agent_id, zipcode_id) VALUES (1, 1);
INSERT INTO agent_zipcode (agent_id, zipcode_id) VALUES (1, 2);
INSERT INTO agent_zipcode (agent_id, zipcode_id) VALUES (2, 2);
INSERT INTO agent_zipcode (agent_id, zipcode_id) VALUES (2, 3);