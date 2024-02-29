package com.vn.devmaster.services.demo.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        System.out.println("Nhập số lượng sinh viên: ");
        int n = Integer.parseInt(scanner.nextLine());
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1));
            student.nhap();
            students.add(student);
        }
        System.out.println("Thông tin các sinh viên:");
        for (Student student : students) {
            student.xuat();
            System.out.println("-------------------------");
        }
        while (true) {
            System.out.println("*****************MENU***********************");
            System.out.println("1. Thêm sinh viên.");
            System.out.println("2. Chỉnh sửa sinh viên theo id.");
            System.out.println("3. Xóa sinh viên theo id.");
            System.out.println("4. Sắp xếp hoc sinh theo gpa.");
            System.out.println("5. Sắp xếp hoc sinh theo tên.");
            System.out.println("6. Show ra sinh viên.");
            System.out.println("0. Thoát.");
            System.out.println("*****************MENU***********************");
            System.out.println("Mời bạn nhập lựa chọn");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Nhập thông tin sinh viên mới:");
                    Student student = new Student();
                    student.nhap();
                    students.add(student);
                    break;
                case 2:
                    System.out.println("Nhập id sinh viên cần sửa");
                    int editId = scanner.nextInt();
                    scanner.nextLine();
                    boolean ID = false;
                    for (Student Student : students) {
                        if (Student.id == editId) {
                            System.out.println("Nhập thông tin mới cho sinh viên:");
                            Student.nhap();
                            ID = true;
                            System.out.println("Thông tin sinh viên mới");
                            Student.xuat();
                            break;
                        }
                        if (!ID) {
                            System.out.println("Không tìm thấy sinh viên có id ");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhập id sinh viên cần xóa:");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    boolean xoa = false;
                    for (Student Student : students) {
                        if (Student.id == deleteId) {
                            students.remove(Student);
                            xoa = true;
                            System.out.println("Xóa sinh viên thành công");
                            break;
                        }
                        if (!xoa) {
                            System.out.println("Không tìm thấy sinh viên có id ");
                        }
                    }
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println("Danh sách sinh viên:");
                    for (Student Student : students) {
                        Student.xuat(); /// mai hỏi đoạn này
                        System.out.println("-------------------------");
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}

