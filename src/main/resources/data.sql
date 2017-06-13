INSERT IGNORE INTO user VALUES (1, '$2a$10$Z/ZmQPEtyWqrie0KGhfAM.h2.al2N0nks9Tz.tJYSbFTmhnrRm8b2', '', 'mohsenkw', 'mohsen.jahan01@gmail.com', 1);

INSERT IGNORE INTO permission VALUES 
(1, 'admin_content_manage', 1, 'مدیریت مطالب'),
(2, 'admin_content_delete', 1, 'حذف مطالب'),
(3, 'admin_category_manage', 1, 'مدیریت دسته بندی');

INSERT IGNORE INTO role VALUES 
(1, 'super_admin', 1, 'super admin'),
(2, 'normal_user', 0, 'normal user');

INSERT IGNORE INTO user_role VALUES 
(1, 1);

INSERT IGNORE INTO role_permission VALUES 
(1, 1),
(1, 2),
(1, 3);

INSERT IGNORE INTO province VALUES 
(1, 'province 1'),
(2, 'province 2'),
(3, 'province 3'),
(4, 'province 4'),
(5, 'province 5');

INSERT IGNORE INTO city VALUES 
(1, 'city 1', 1),
(2, 'city 2', 1),
(3, 'city 3', 1),
(4, 'city 4', 4),
(5, 'city 5', 4);