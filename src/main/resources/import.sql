INSERT INTO `user` (username, password, name, lastname, email, enabled) VALUES('tonnystark', '1234', 'Tonny', 'Stark', 'stark@google.com', 1);
INSERT INTO `user` (username, password, name, lastname, email, enabled) VALUES('michaelx', '1234', 'Michael', 'Stark', 'michael@google.com', 1);

INSERT INTO `role` (name) VALUES ('ROLE_USER');
INSERT INTO `role` (name) VALUES ('ROLE_ADMIN');

INSERT INTO `user_role` (user_id, role_id) VALUES(1, 1);
INSERT INTO `user_role` (user_id, role_id) VALUES(2, 2);
INSERT INTO `user_role` (user_id, role_id) VALUES(2, 1);