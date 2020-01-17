INSERT INTO question.catalog(id, name) VALUES (11, 'Тип оборудования');
INSERT INTO question.catalog(id, name) VALUES (31, 'Справочник «ПО»');

INSERT INTO question.quest(id, name, create_date, is_active) VALUES (1, 'Опрос удовлетворенности качеством
 информационного сопровождения', '10-04-19 12:00:17', true);


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
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (311, 'MS WORD', 12);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (312, 'WINRAR', 12);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (313, 'MS EXCEL', 12);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (314, 'MS ACCESS', 12);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (315, 'MS VISIO', 12);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (316, 'MS POWERPOINT', 12);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (317, 'MS OUTLOOK', 12);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (318, 'MS PROJECT', 12);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (319, 'МЕГАПЛАН', 12);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (320, 'АИС ТАРИФ (ЕСРД ТАРИФ)', 12);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (321, 'Автоматизированная информационная система города' ||
                                                                    ' Москвы «Управление инвестиционной деятельностью» (АИС УИД)', 12);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (322, 'Автоматизированная информационная система ' ||
                                                                    'координации работы органов исполнительной власти города Москвы по обеспечению поступления в бюджет города Москвы доходов от отдельных видов налогов и сборов (АИС ОПН)', 12);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (323, 'Система автоматизации формирования Адресной ' ||
                                                                    'инвестиционной программы города Москвы и Программы реновации жилищного фонда в городе Москве «Строительные инвестиции» (АИС Строительные инвестиции)', 12);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (324, 'Информационно-аналитическая система мониторинга ' ||
                                                                    'комплексного развития города Москвы (ИАС МКР)', 12);

INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (325, 'Информационная система многофункционального ' ||
                                                                    'миграционного центра (ИС ММЦ)', 12);

INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (326, 'Информационная система многофункционального ' ||
                                                                                                                                                                             'миграционного центра (ИС ММЦ)', 12);

INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (327, 'Подсистема приема и обработки заявок ' ||
                                                                    'Автоматизированной системы управления «Объединенная диспетчерская служба» (АСУ ОДС ЕДЦ)', 12);
INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (328, 'Подсистема приема и обработки заявок Автоматизированной системы управления «Объединенная диспетчерская служба» (АСУ ОДС ЕДЦ))', 12);

INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (329, 'Единая информационная система Объединения ' ||
                                                                    'административно-технических инспекций города Москвы (ЕИС ОАТИ)', 12);

INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (330, 'Подсистема инвентаризации объектов городского ' ||
                                                                   'хозяйства Автоматизированной системы управления «Объединенная диспетчерская служба» (АСУ ОДС ПИ)', 12);

INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (331, 'Единая автоматизированная информационная система' ||
                                                                    ' торгов города Москвы (ЕАИСТ)', 12);

INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (332, 'Автоматизированная информационная система «Портал поставщиков» (АИС «Портал поставщиков»)', 12);

INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (333, 'Автоматизированная информационная система Государственной инспекции по контролю за использованием объектов недвижимости города Москвы (АИС Контроль недвижимости города Москвы)', 12);

INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (334, 'Информационная система реестра единых объектов ' ||
                                                                    'недвижимости города Москвы (ИС РЕОН)', 12);

INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (335, 'Информационная система реестра единых объектов ' ||
                                                                    'недвижимости города Москвы (ИС РЕОН)', 12);

INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (336, 'Автоматизированная информационная система ' ||
                                                                    '«Реестр собственности города Москвы» (АИС РСМ)', 12);

INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (337, 'АИС Госуслуги', 12);

INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (338, 'Единая информационная система «Жилище» (ЕИС «Жилище»)', 12);

INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (339, 'Автоматизированная информационная система ' ||
                                                                    '«Реестр объектов собственности города Москвы в жилищной сфере»  (АИС «Реестр СЖС»)', 12);

INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (340, 'Автоматизированная система «Одно окно» (АС «Одно' ||
                                                                    ' окно»)', 12);

INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (341, 'Информационно-аналитическая система ' ||
                                                                   '«Недвижимость-2» (ИАС «Недвижимость-2»)', 12);

INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (342, 'Информационная система «Реестр участников ' ||
                                                                   'жилищных программ» (ИС «РУЖП»)', 12);

INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (343, 'Электронный офис руководителя (ЭОР)', 12);

INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (344, 'Гранд-смета', 12);

INSERT INTO question.question(id, name, ordering, quest_id, question_type, catalog_id) VALUES (40, '4. Пожелания по ' ||
                                                                                                   'приобретению ' ||
                                                                                                   'программного обеспечения', 4, 1, 'GOAL_WISHES_MULTI', 0);

INSERT INTO question.question(id, name, ordering, quest_id, question_type, catalog_id) VALUES (30, '3. Используемое ' ||
                                                                                                   'программное обеспечение
', 3, 1, 'CATALOG_GOAL_TWO_RATE_WISHES', 0);

INSERT INTO question.question(id, name, ordering, quest_id, question_type, catalog_id) VALUES (10, '1.	Оснащенность ' ||
                                                                                                   'рабочего места ' ||
                                                                                                   'техникой', 1, 1,
                                                                                               'WISHES_WITH_RATE', 11);

INSERT INTO question.question(id, name, ordering, quest_id, question_type, catalog_id) VALUES (20, '2.	Оцените ' ||
                                                                                                   'качество технической поддержки работоспособности оборудования
', 2, 1, 'CATALOG_WISHES_MULTI', 0);