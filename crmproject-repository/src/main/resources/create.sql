CREATE SCHEMA IF NOT EXISTS crmproject;

CREATE TABLE IF NOT EXISTS crmproject.users (
  id     DECIMAL(18) PRIMARY KEY,
  name   VARCHAR2(30),
  passwd VARCHAR2(50)
);

CREATE SEQUENCE IF NOT EXISTS crmproject.sq_users START WITH 1 INCREMENT BY 1  MINVALUE 1;


CREATE TABLE IF NOT EXISTS crmproject.roles (
  id   DECIMAL(18) PRIMARY KEY,
  code VARCHAR(10),
  name VARCHAR(30));

CREATE SEQUENCE IF NOT EXISTS crmproject.sq_roles START WITH 1 INCREMENT BY 1  MINVALUE 1 CACHE 20;

CREATE TABLE IF NOT EXISTS crmproject.users_roles (
  id       DECIMAL(18) PRIMARY KEY,
  id_users DECIMAL(18),
  id_roles DECIMAL(18));

CREATE SEQUENCE IF NOT EXISTS crmproject.sq_users_roles START WITH 1 INCREMENT BY 1  MINVALUE 1 CACHE 20;

ALTER TABLE crmproject.users_roles ADD FOREIGN KEY (id_users) REFERENCES crmproject.users (id);
ALTER TABLE crmproject.users_roles ADD FOREIGN KEY (id_roles) REFERENCES crmproject.roles (id);


CREATE TABLE IF NOT EXISTS crmproject.project (
  id                  DECIMAL(18) PRIMARY KEY,
  project_name        VARCHAR(30),
  project_code        VARCHAR(10),
  project_status      VARCHAR(2),
  project_start       TIMESTAMP,
  project_end         TIMESTAMP,
  project_description VARCHAR(1024)
);

CREATE SEQUENCE IF NOT EXISTS crmproject.sq_project START WITH 1 INCREMENT BY 1  MINVALUE 1 CACHE 20;

CREATE TABLE IF NOT EXISTS crmproject.task (
  id               DECIMAL(18) PRIMARY KEY,
  task_code        VARCHAR(10),
  task_name        VARCHAR(30),
  task_status      VARCHAR(2),
  task_dev_start   TIMESTAMP,
  task_dev_end     TIMESTAMP,
  task_test_start  TIMESTAMP,
  task_test_end    TIMESTAMP,
  task_anal_start  TIMESTAMP,
  task_anal_end    TIMESTAMP,
  id_dev           DECIMAL(18),
  id_test          DECIMAL(18),
  id_anal          DECIMAL(18),
  dev_description  VARCHAR(1024),
  anal_description VARCHAR(1024),
  test_description VARCHAR(1024),
  id_project       DECIMAL(18)
);

CREATE SEQUENCE IF NOT EXISTS crmproject.sq_task START WITH 1 INCREMENT BY 1  MINVALUE 1 CACHE 20;

ALTER TABLE crmproject.task ADD FOREIGN KEY (id_anal) REFERENCES crmproject.users (id);
ALTER TABLE crmproject.task ADD FOREIGN KEY (id_dev) REFERENCES crmproject.users (id);
ALTER TABLE crmproject.task ADD FOREIGN KEY (id_anal) REFERENCES crmproject.users (id);
ALTER TABLE crmproject.task ADD FOREIGN KEY (id_project) REFERENCES crmproject.project (id);
