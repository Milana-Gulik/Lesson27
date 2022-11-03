package by.itstep.gulik.controller;

import by.itstep.gulik.model.entity.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        try {
            student.setAge(10);
        } catch (Exception e) {
            System.out.println("Data Error. User input was invalid.");
        }

//        try {
//            FileInputStream fileInputStream = new FileInputStream("File");
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//            //... log.write()
//        }
    }
}
