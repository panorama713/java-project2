package com.example.javaproject2.week2.day3;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.no = 1;
        classInSchool.teacher = new Teacher();
        classInSchool.teacher.name = "김미미";
        classInSchool.teacher.age = 33;
        classInSchool.teacher.address = "경기도 수원시 ~~";

        System.out.println(classInSchool.teacher.name);
        System.out.printf("%d반 선생님의 이름은 %s입니다\n", classInSchool.no, classInSchool.teacher.name);
    }
}
