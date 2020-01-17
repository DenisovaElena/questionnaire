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