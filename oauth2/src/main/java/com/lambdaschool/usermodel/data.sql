INSERT INTO section (sectionid, name, created_by, created_date, last_modified_by, last_modified_date) VALUES (1, 'Fiction', 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);
INSERT INTO section (sectionid, name, created_by, created_date, last_modified_by, last_modified_date) VALUES (2, 'Technology', 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);
INSERT INTO section (sectionid, name, created_by, created_date, last_modified_by, last_modified_date) VALUES (3, 'Travel', 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);
INSERT INTO section (sectionid, name, created_by, created_date, last_modified_by, last_modified_date) VALUES (4, 'Business', 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);
INSERT INTO section (sectionid, name, created_by, created_date, last_modified_by, last_modified_date) VALUES (5, 'Religion', 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);

INSERT INTO author (authorid, fname, lname, created_by, created_date, last_modified_by, last_modified_date) VALUES (1, 'John', 'Mitchell', 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);
INSERT INTO author (authorid, fname, lname, created_by, created_date, last_modified_by, last_modified_date) VALUES (2, 'Dan', 'Brown', 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);
INSERT INTO author (authorid, fname, lname, created_by, created_date, last_modified_by, last_modified_date) VALUES (3, 'Jerry', 'Poe', 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);
INSERT INTO author (authorid, fname, lname, created_by, created_date, last_modified_by, last_modified_date) VALUES (4, 'Wells', 'Teague', 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);
INSERT INTO author (authorid, fname, lname, created_by, created_date, last_modified_by, last_modified_date) VALUES (5, 'George', 'Gallinger', 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);
INSERT INTO author (authorid, fname, lname, created_by, created_date, last_modified_by, last_modified_date) VALUES (6, 'Ian', 'Stewart', 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);

INSERT INTO book (bookid, title, ISBN, copy, sectionid, created_by, created_date, last_modified_by, last_modified_date) VALUES (1, 'Flatterland', '9780738206752', 2001, 1, 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);
INSERT INTO book (bookid, title, ISBN, copy, sectionid, created_by, created_date, last_modified_by, last_modified_date) VALUES (2, 'Digital Fortess', '9788489367012', 2007, 1, 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);
INSERT INTO book (bookid, title, ISBN, copy, sectionid, created_by, created_date, last_modified_by, last_modified_date) VALUES (3, 'The Da Vinci Code', '9780307474278', 2009, 1, 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);
INSERT INTO book (bookid, title, ISBN, copy, sectionid, created_by, created_date, last_modified_by, last_modified_date) VALUES (4, 'Essentials of Finance', '1314241651234', 0, 4, 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);
INSERT INTO book (bookid, title, ISBN, copy, sectionid, created_by, created_date, last_modified_by, last_modified_date) VALUES (5, 'Calling Texas Home', '1885171382134', 2000, 3, 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);

INSERT INTO wrote (bookid, authorid, created_by, created_date, last_modified_by, last_modified_date) VALUES (1, 6, 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);
INSERT INTO wrote (bookid, authorid, created_by, created_date, last_modified_by, last_modified_date) VALUES (2, 2, 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);
INSERT INTO wrote (bookid, authorid, created_by, created_date, last_modified_by, last_modified_date) VALUES (3, 2, 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);
INSERT INTO wrote (bookid, authorid, created_by, created_date, last_modified_by, last_modified_date) VALUES (4, 5, 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);
INSERT INTO wrote (bookid, authorid, created_by, created_date, last_modified_by, last_modified_date) VALUES (4, 3, 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);
INSERT INTO wrote (bookid, authorid, created_by, created_date, last_modified_by, last_modified_date) VALUES (5, 4, 'SYSTEM', CURRENT_TIMESTAMP, 'SYSTEM', CURRENT_TIMESTAMP);

alter sequence hibernate_sequence restart with 25;