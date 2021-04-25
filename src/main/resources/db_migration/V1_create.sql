CREATE TABLE books(
    book_id             int AUTO_INCREMENT PRIMARY KEY,
    book_title          VARCHAR(100),
    book_author         VARCHAR(50),
    book_genre          VARCHAR(20),
    book_published_year int,
    book_user_id        int
);

CREATE TABLE users(
    user_id             int AUTO_INCREMENT PRIMARY KEY,
    user_name           varchar(100),
    user_surname        varchar(100),
    user_email          varchar(100),
    user_password       varchar(255),
)