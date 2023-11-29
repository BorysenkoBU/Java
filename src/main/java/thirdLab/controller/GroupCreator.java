package thirdLab.controller;

import thirdLab.models.Group;
import thirdLab.models.Human;
import thirdLab.models.Student;

import java.util.List;

public class GroupCreator {
    public Group createGroup(List<Student> students, String groupName, Human headOfGroupName) {
        Group newGroup = new Group();
        newGroup.setStudents(students);
        newGroup.setGroupName(groupName);
        newGroup.setHeadOfGroup(headOfGroupName);
        return newGroup;
    }
}