package thirdLab.controller;

import thirdLab.models.Department;
import thirdLab.models.Faculty;
import thirdLab.models.Human;

import java.util.List;

public class FacultyCreator {
    public Faculty createFaculty(List<Department> departments, String facultyName, Human headOfFacultyName) {
        Faculty newFaculty = new Faculty();
        newFaculty.setDepartments(departments);
        newFaculty.setFacultyName(facultyName);
        newFaculty.setHeadOfFacultyName(headOfFacultyName);
        return newFaculty;
    }
}