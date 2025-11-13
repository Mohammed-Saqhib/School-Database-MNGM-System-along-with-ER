-- Create Database
CREATE DATABASE university_mgmt;
USE university_mgmt;

-- Department Table
CREATE TABLE Department (
    dept_id INT AUTO_INCREMENT PRIMARY KEY,
    dept_name VARCHAR(100) NOT NULL,
    location VARCHAR(100)
);

-- Instructor Table
CREATE TABLE Instructor (
    instructor_id INT AUTO_INCREMENT PRIMARY KEY,
    instructor_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    phone VARCHAR(15),
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
);

-- Student Table
CREATE TABLE Student (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    student_name VARCHAR(100) NOT NULL,
    gender ENUM('Male', 'Female', 'Other'),
    dob DATE,
    email VARCHAR(100) UNIQUE,
    phone VARCHAR(15),
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
);

-- Course Table
CREATE TABLE Course (
    course_id INT AUTO_INCREMENT PRIMARY KEY,
    course_name VARCHAR(100) NOT NULL,
    credits INT,
    dept_id INT,
    instructor_id INT,
    FOREIGN KEY (dept_id) REFERENCES Department(dept_id),
    FOREIGN KEY (instructor_id) REFERENCES Instructor(instructor_id)
);

-- Enrollment Table (Many-to-Many between Students & Courses)
CREATE TABLE Enrollment (
    enrollment_id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT,
    course_id INT,
    semester VARCHAR(20),
    grade CHAR(2),
    FOREIGN KEY (student_id) REFERENCES Student(student_id),
    FOREIGN KEY (course_id) REFERENCES Course(course_id)
);

-- Insert Departments
INSERT INTO Department (dept_name, location)
VALUES 
('Computer Science', 'Block A'),
('Information Technology', 'Block B'),
('Electronics', 'Block C');

-- Insert Instructors
INSERT INTO Instructor (instructor_name, email, phone, dept_id)
VALUES
('Dr. Ramesh Kumar', 'ramesh@univ.edu', '9876543210', 1),
('Prof. Anita Sharma', 'anita@univ.edu', '9876543211', 2),
('Dr. Suresh Patil', 'suresh@univ.edu', '9876543212', 3);

-- Insert Students
INSERT INTO Student (student_name, gender, dob, email, phone, dept_id)
VALUES
('Mohammed Saqhib', 'Male', '2003-06-15', 'saqhib@univ.edu', '9001234567', 1),
('Arshid Khan', 'Male', '2003-09-10', 'arshid@univ.edu', '9001234568', 1),
('Priya Verma', 'Female', '2002-12-20', 'priya@univ.edu', '9001234569', 2);

-- Insert Courses
INSERT INTO Course (course_name, credits, dept_id, instructor_id)
VALUES
('Database Management Systems', 4, 1, 1),
('Operating Systems', 3, 1, 1),
('Web Technologies', 3, 2, 2),
('Digital Circuits', 4, 3, 3);

-- Insert Enrollments
INSERT INTO Enrollment (student_id, course_id, semester, grade)
VALUES
(1, 1, 'Sem 5', 'A'),
(1, 2, 'Sem 5', 'B'),
(2, 1, 'Sem 5', 'A'),
(3, 3, 'Sem 5', 'A');


USE university_mgmt;

SELECT * FROM Department;
SELECT * FROM Instructor;
SELECT * FROM Student;
SELECT * FROM Course;
SELECT * FROM Enrollment;
