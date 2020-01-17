INSERT INTO question.quest(id, name, create_date, is_active) VALUES (1, 'Опрос удовлетворенности качеством
 информационного сопровождения', '10-04-19 12:00:17', true);

INSERT INTO question.question(id, name, ordering, quest_id, question_type, catalog_id) VALUES (10, '1.	Оснащенность ' ||
                                                                                                   'рабочего места ' ||
                                                                                                   'техникой', 1, 1,
                                                                                               'RATE', 11);

INSERT INTO question.catalog(id, name) VALUES (11, 'Тип оборудования');
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (111, 'Персональный компьютер', 11);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (112, 'Принтер черно-белый', 11);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (113, 'Принтер цветной', 11);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (114, 'Плоттер', 11);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (115, 'Монитор', 11);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (116, 'Принтер цветной', 11);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (117, 'Клавиатура / мышь', 11);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (118, 'Сканер', 11);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (119, 'WiFi', 11);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (120, 'Многофункциональное устройство', 11);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (120, 'Иное оборудование', 11);

INSERT INTO question.question(id, name, ordering, quest_id, question_type, catalog_id) VALUES (20, '2.	Оцените ' ||
                                                                                                   'качество технической поддержки работоспособности оборудования
', 2, 1, 'RATE', 0);

INSERT INTO question.question(id, name, ordering, quest_id, question_type, catalog_id) VALUES (30, '3. Используемое ' ||
                                                                                                   'программное обеспечение
', 3, 1, 'RATE', 0);

INSERT INTO question.catalog(id, name) VALUES (31, 'Справочник «ПО»');
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (311, 'MS WORD', 12);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (312, 'WINRAR', 12);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (313, 'MS EXCEL', 12);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (314, 'MS ACCESS', 12);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (315, 'MS VISIO', 12);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (316, 'MS POWERPOINT', 12);


