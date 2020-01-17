INSERT  INTO question.user(id, name, lastname, firstname, patronym, position, email, phone) VALUES (1, 'user1',
                                                                                                   'Иванов',
                                                                                                   'Иван','Иванович',
                                                                                                    'директор',
                                                                                                    'iv@mail.ru',
                                                                                                    '15551');
INSERT  INTO question.user(id, name, lastname, firstname, patronym, position, email, phone) VALUES (2, 'user2',
                                                                                                    'Петров',
                                                                                                    'Петр','Петрович',
                                                                                                    'Начальник всех управлений',
                                                                                                    'pet@mail.ru',
                                                                                                    '15552');
INSERT  INTO question.user(id, name, lastname, firstname, patronym, position, email, phone) VALUES (3, 'user3',
                                                                                                    'Сидоров',
                                                                                                    'Сидр','Сидорович',
                                                                                                    'администратор',
                                                                                                    'sid@mail.ru',
                                                                                                    '15553');
INSERT  INTO question.user(id, name, lastname, firstname, patronym, position, email, phone) VALUES (4, 'user4',
                                                                                                    'Федоров',
                                                                                                    'Федор',
                                                                                                    'Федорович',
                                                                                                    'инженер',
                                                                                                    'fed@mail.ru',
                                                                                                    '15554');
INSERT  INTO question.user(id, name, lastname, firstname, patronym, position, email, phone) VALUES (5, 'user5',
                                                                                                    'Сотрудников',
                                                                                                    'Сотрудник',
                                                                                                    'Сотрудникович',
                                                                                                    'сотрудник',
                                                                                                    'sotr@mail.ru',
                                                                                                    '15555');

INSERT into question.role(id, name) VALUES (10, 'admin');
INSERT INTO question.role(id, name) VALUES (11, 'руководитель');
INSERT INTO question.role(id, name) VALUES (12, 'пользователь');

INSERT INTO question.role_users(role_id, user_id) VALUES (10, 3);
INSERT INTO question.role_users(role_id, user_id) VALUES (11, 1);
INSERT INTO question.role_users(role_id, user_id) VALUES (11, 2);
INSERT INTO question.role_users(role_id, user_id) VALUES (12, 4);
INSERT INTO question.role_users(role_id, user_id) VALUES (12, 5);

INSERT INTO question.quest(id, name, create_date, is_active) VALUES (1, 'satisf', null, true);
INSERT INTO question.question(id, name, ordering, quest_id, question_type, catalog_id) VALUES (10, 'question1',
                                                                                                  NULL, 1, 'RATE', null);
INSERT INTO question.result(id, answer_start, answer_modified, quest_id, username, status) VALUES (100, NULL, NULL, 1,
                                                                                                      NULL,
                                                                                                   'COMPLETED');
INSERT INTO question.answer(id, name, rate_first, wish, goal, question_id, rate_second, catalogelem_id, result_id)
VALUES (1000, 'answer1', 5, 'jfdkj', 'dsfdf', 10, NULL, 10000, 100);

INSERT INTO question.catalogelem(id, name, catalog_id) VALUES (10000, 'el', 100000);
INSERT INTO question.catalog(id, name) VALUES (100000, 'catalog1');
