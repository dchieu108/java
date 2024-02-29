package com.vn.devmaster.services.demo.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    Scanner scanner =new Scanner(System.in);
    int id;
    String name;
    int age;
    String address;
    float gpa;
    public void nhap(){
        System.out.println("Nhập id");
        id= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên sinh vien");
        name=scanner.nextLine();
        System.out.println("Nhập tuổi");
        age= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ sinh viên");
        address= scanner.nextLine();
        System.out.println("Nhập GPA");
        gpa= scanner.nextFloat();
    }
    public void xuat(){
        System.out.println("Id sinh viên: "+ id);
        System.out.println("Ten sinh viên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
        System.out.println("GPA: " + gpa);
    }
}
