INSERT INTO site VALUES (1,'Site 1');
INSERT INTO site VALUES (2,'Site 2');
INSERT INTO site VALUES (3,'Site 3');
INSERT INTO chaine values (1,1, 'Chaine 1 du site 1');
INSERT INTO chaine values (2,1, 'Chaine 2 du site 1');
INSERT INTO chaine values (3,1, 'Chaine 3 du site 1');
INSERT INTO type_conso values (1, 'Électricité', 'KWh');
INSERT INTO modele VALUES (1, 'Bras robot');
INSERT INTO consommation_normale(conso, id_modele, type_id, description) VALUES (750,1,1, 'Consommation Bras Robot');
INSERT INTO machine(id_chaine, id_modele) values (1,1);
INSERT INTO machine(id_chaine, id_modele) values (2,1);
/*INSERT INTO releve(conso, id_machine, id_type, date_releve, date) VALUES (750,2,1, '2022-05-07T08:10:05Z');
INSERT INTO releve(conso, id_machine, id_type, date_releve, date) VALUES (750,2,1, '2022-05-07T09:10:05Z');
INSERT INTO releve(conso, id_machine, id_type, date_releve, date) VALUES (800,3,1, '2022-05-07T10:10:05Z');*/
