INSERT INTO tb_user (name, email, password) VALUES ('Alex', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) VALUES ('Bootcamp Fullstack', 'https://www.ncertbooks.guru/wp-content/uploads/2022/05/Course-details.png', 'https://lacaseminusp.com.br/moodle/theme/image.php/premium3/theme/1657635001/course-default');

INSERT INTO tb_offer(edition, start_Moment, end_Moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2020-07-14T10:00:00Z', TIMESTAMP WITH TIME ZONE '2020-07-29T10:00:00Z', 1);
INSERT INTO tb_offer(edition, start_Moment, end_Moment, course_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2020-11-14T10:00:00Z', TIMESTAMP WITH TIME ZONE '2020-12-29T10:00:00Z', 1);

INSERT INTO tb_resource(title, description, position, img_Uri, type, offer_id) VALUES ('Track Fullstack', 'Main Track', 1, 'https://www.ncertbooks.guru/wp-content/uploads/2022/05/Course-details.png', 1, 1);
INSERT INTO tb_resource(title, description, position, img_Uri, type, offer_id) VALUES ('FORUM', 'No Doubts!', 2, 'https://www.ncertbooks.guru/wp-content/uploads/2022/05/Course-details.png', 2, 1);
INSERT INTO tb_resource(title, description, position, img_Uri, type, offer_id) VALUES ('Lives', 'Exclusive lives', 3, 'https://www.ncertbooks.guru/wp-content/uploads/2022/05/Course-details.png', 0, 1);

INSERT INTO tb_section(title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Cap. 1', 'We will learn form zero to hero!', 1, 'https://www.ncertbooks.guru/wp-content/uploads/2022/05/Course-details.png', 1, null);
INSERT INTO tb_section(title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Cap. 2', 'We will learn form two to hero!', 2, 'https://www.ncertbooks.guru/wp-content/uploads/2022/05/Course-details.png', 1, 1);
INSERT INTO tb_section(title, description, position, img_Uri, resource_id, prerequisite_id) VALUES ('Cap. 3', 'We will learn form three to hero!', 3, 'https://www.ncertbooks.guru/wp-content/uploads/2022/05/Course-details.png', 1, 2);

INSERT INTO tb_enrollment(user_id, offer_id, enroll_Moment, refund_Moment, available, only_Update) VALUES (1, 1, TIMESTAMP WITH TIME ZONE '2020-07-14T10:00:00Z', null, true, false);
INSERT INTO tb_enrollment(user_id, offer_id, enroll_Moment, refund_Moment, available, only_Update) VALUES (2, 2, TIMESTAMP WITH TIME ZONE '2020-07-15T10:00:00Z', TIMESTAMP WITH TIME ZONE '2020-07-16T10:00:00Z', true, true);
INSERT INTO tb_enrollment(user_id, offer_id, enroll_Moment, refund_Moment, available, only_Update) VALUES (3, 1, TIMESTAMP WITH TIME ZONE '2020-07-16T10:00:00Z', null, true, false);