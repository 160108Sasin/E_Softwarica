package com.sasin.esoftwarica.model;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name,address,gender;
    private int age;

   static List<Student> studentList = new ArrayList<>();

    public Student(String name, String address, String gender,  int age) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
