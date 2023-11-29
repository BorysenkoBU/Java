package thirdLab.controller;

import thirdLab.models.Department;
import thirdLab.models.Group;
import thirdLab.models.Human;

import java.util.List;

public class DepartmentCreator {
    public Department createDepartment(List<Group> groups, String departmentName, Human headOfDepartmentName) {
        Department newDepartment = new Department();
        newDepartment.setGroups(groups);
        newDepartment.setDepartmentName(departmentName);
        newDepartment.setHeadOfDepartmentName(headOfDepartmentName);
        return newDepartment;
    }
}