CREATE TABLE Student (Student_number STRING PRIMARY KEY UNIQUE NOT NULL, Name STRING NOT NULL, Class INTEGER NOT NULL, Major STRING)

CREATE TABLE Course (Course_number STRING PRIMARY KEY UNIQUE NOT NULL, Course_name STRING NOT NULL, Credit_hours INTEGER NOT NULL, Department STRING NOT NULL)

CREATE TABLE Section (Section_identifier INTEGER PRIMARY KEY UNIQUE NOT NULL, Course_number STRING NOT NULL, Semester STRING NOT NULL, Year INTEGER NOT NULL, Instructor STRING NOT NULL, CONSTRAINT Section_C_FK FOREIGN KEY (Course_number) REFERENCES Course (Course_number))

CREATE TABLE Grade_report (Student_number STRING NOT NULL, Section_identifier INTEGER NOT NULL, Grade STRING NOT NULL, CONSTRAINT GR_Section_FK FOREIGN KEY (Section_identifier) REFERENCES Section (Section_identifier), CONSTRAINT GR_Student_FK FOREIGN KEY (Student_number) REFERENCES Student (Student_number))

CREATE TABLE Prerequisite (Course_number STRING NOT NULL, Prerequisite_number STRING NOT NULL, CONSTRAINT Prerequisite_Course_FK1 FOREIGN KEY (Cource_number) REFERENCES Course (Course_number), CONSTRAINT Prerequisite_Course_FK2 FOREIGN KEY (Prerequisite_number) REFERENCES Course (Course_number))