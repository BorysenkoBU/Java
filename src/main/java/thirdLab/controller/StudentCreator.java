package thirdLab.controller;

import thirdLab.models.Sex;
import thirdLab.models.Student;

public class StudentCreator {
    public Student createStudent(String lastName, String firstName, String patronymicName, Sex sex) {
        return new Student(lastName, firstName, patronymicName, sex);
    }
}
