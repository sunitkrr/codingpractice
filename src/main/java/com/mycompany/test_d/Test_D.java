/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.test_d;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author sunit
 */
// 
public class Test_D {

    public static void main(String[] args) {

        System.out.println("Hello");

        // class of students you have list of students avaliable with you TusharA, TusharB I want to print that perticular tushar whose last name is in Accending order
        // Tushar A, Tushar c, Tushar B  - Input
        //Tushar A
        List<Student> students = Arrays.asList(new Student("Tushar", "A"),
                new Student("Tushar", "C"),
                new Student("Tushar", "B"));

        List<Student> collectName = students.stream().filter(a -> a.getFirstName().equalsIgnoreCase("Tushar"))
                .sorted(Comparator.comparing(Student::getLastName)).collect(Collectors.toList());
        
        System.out.println("list ::" + collectName);
        
        }

    }


