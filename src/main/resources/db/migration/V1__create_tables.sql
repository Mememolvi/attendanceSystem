create table application_user (
    id int not null,
    email varchar(255) not null,
    password varchar(255) not null,
    role varchar(16) not null
);
create table unit (
    id int not null,
    section_name varchar(30) not null,
    grade int not null
);

create table student (
    id int not null,
    name varchar(50) not null,
    email varchar(50) not null,
    unit_id int not null, -- fk
    roll_number int not null
);

create table attendance_record (
    id int not null,
    student_id int not null, --fk
    date_of_record date not null,
    is_present bit not null
);


ALTER TABLE application_user
ADD constraint user_PK PRIMARY KEY (id);

ALTER TABLE unit
ADD constraint unit_PK PRIMARY KEY (id);

ALTER TABLE student
ADD constraint student_PK PRIMARY KEY (id);

ALTER TABLE attendance_record
ADD constraint attendance_record_PK PRIMARY KEY (id);

ALTER TABLE student
ADD CONSTRAINT FK_student_unit
FOREIGN KEY (unit_id) REFERENCES unit(id);

ALTER TABLE attendance_record
ADD CONSTRAINT FK_attendance_record
FOREIGN KEY (student_id) REFERENCES student(id);