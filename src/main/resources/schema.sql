DROP TABLE IF EXISTS question.user CASCADE;
DROP TABLE IF EXISTS question.role CASCADE;
DROP TABLE IF EXISTS question.role_users CASCADE;
DROP TABLE IF EXISTS question.quest CASCADE;
DROP TABLE IF EXISTS question.question CASCADE;
DROP TABLE IF EXISTS question.question_type CASCADE;;
DROP TABLE IF EXISTS question.catalog CASCADE;
DROP TABLE IF EXISTS question.catalogelem CASCADE;
DROP TABLE IF EXISTS question.result CASCADE;
DROP TABLE IF EXISTS question.answer CASCADE;


DROP SEQUENCE IF EXISTS question.global_seq CASCADE;

CREATE SEQUENCE question.global_seq START 100000;

CREATE TABLE question.user
(
    id                      INTEGER PRIMARY KEY DEFAULT nextval('question.global_seq'),
    name                    VARCHAR                               ,
    firstname               VARCHAR                               ,
    lastname                VARCHAR                               ,
    patronym                VARCHAR                               ,
    position                VARCHAR                               ,
    email                   VARCHAR                               ,
    phone                   VARCHAR                               ,
    photo                   VARCHAR
);

CREATE TABLE question.role
(
    id                      INTEGER PRIMARY KEY DEFAULT nextval('question.global_seq'),
    name                    VARCHAR
);

CREATE TABLE question.role_users
(
    role_id                     INTEGER,
    user_id                 INTEGER,
    FOREIGN KEY (role_id) REFERENCES question.role (id) ON DELETE CASCADE,
    FOREIGN KEY (user_id) REFERENCES question.user (id) ON DELETE CASCADE
);

CREATE TABLE question.quest
(
    id                      INTEGER PRIMARY KEY DEFAULT nextval('question.global_seq'),
    name                    VARCHAR                                 ,
    create_date             TIMESTAMP                               ,
    is_active               BOOLEAN
);

CREATE TABLE question.question_type
(
    id                        INTEGER PRIMARY KEY DEFAULT nextval('question.global_seq'),
    name                      VARCHAR
);

CREATE TABLE question.catalog
(
    id                        INTEGER PRIMARY KEY DEFAULT nextval('question.global_seq'),
    name                      VARCHAR
);

CREATE TABLE question.question
(
    id                      INTEGER PRIMARY KEY DEFAULT nextval('question.global_seq'),
    name                    VARCHAR                                    ,
    ordering                INTEGER                                    ,
    quest_id                INTEGER                                    ,
    question_type_id        INTEGER                                    ,
    catalog_id              INTEGER                                    ,
    FOREIGN KEY (quest_id) REFERENCES question.question(id)            ,
    FOREIGN KEY (question_type_id) REFERENCES question.question_type(id),
    FOREIGN KEY (catalog_id) REFERENCES question.catalog(id)
);

CREATE TABLE question.catalogelem
(
  id                        INTEGER PRIMARY KEY DEFAULT nextval('question.global_seq'),
  name                      VARCHAR                                        ,
  catalog_id                INTEGER                                        ,
  FOREIGN KEY (catalog_id) REFERENCES question.catalogelem(id)
);

CREATE TABLE question.result
(
    id                      INTEGER PRIMARY KEY DEFAULT nextval('question.global_seq'),
    answer_start            TIMESTAMP                                          ,
    answer_modified         TIMESTAMP                                          ,
    quest_id                INTEGER                                            ,
    username                VARCHAR                                            ,
    status_id               INTEGER                                            ,
    FOREIGN KEY (quest_id) REFERENCES question.quest(id)
);

CREATE TABLE question.answer
(
  id                        INTEGER PRIMARY KEY DEFAULT nextval('question.global_seq'),
  name                      VARCHAR                                         ,
  rate_first                INTEGER                                         ,
  wish                      VARCHAR                                         ,
  goal                      VARCHAR                                         ,
  question_id               INTEGER                                         ,
  rate_second               INTEGER                                         ,
  catalogelem_id            INTEGER                                         ,
  result_id                 INTEGER                                         ,
  FOREIGN KEY (question_id) REFERENCES question.answer(id)                  ,
  FOREIGN KEY (catalogelem_id) REFERENCES question.catalogelem(id)          ,
  FOREIGN KEY (result_id) REFERENCES question.result(id)
);




