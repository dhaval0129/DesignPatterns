/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.j2ee.TransferObject;

/**
 *
 * @author djoshi
 */
public class TransferObjectPatternDemo {

    public static void main(String[] args) {
        StudentBO studentBusinessObject = new StudentBO();

        //print all students
        for (Student student : studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [RollNo : " + student.getRollNo() 
                + ", Name : " + student.getName() + " ]");
        }

        //update student
        Student student = studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        //get the student
        student = studentBusinessObject.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() 
            + ", Name : " + student.getName() + " ]");
    }
}
