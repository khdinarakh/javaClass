package com.company;

public class GroupSubjects {
    private Group groupName;
    private Subject subjectName;

    public Group getGroupName() {
        return groupName;
    }

    public Subject getSubjectName() {
        return subjectName;
    }

    public void setGroupName(Group groupName) {
        this.groupName = groupName;
    }

    public void setSubjectName(Subject subjectName) {
        this.subjectName = subjectName;
    }

    public GroupSubjects() {
    }

    public GroupSubjects(Group groupName, Subject subjectName) {
        this.groupName = groupName;
        this.subjectName = subjectName;
    }
}

