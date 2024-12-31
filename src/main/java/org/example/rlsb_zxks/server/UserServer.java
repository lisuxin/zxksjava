package org.example.rlsb_zxks.server;

import org.example.rlsb_zxks.main.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServer {
    private static List<Student> list =new ArrayList<Student>();

    static {
        Student student = new Student(1,"张三","123654","1");
        list.add(student);
        Student student1 = new Student(2,"李四","123654","1");
        list.add(student1);
        Student student2 = new Student(3,"王五","123654","1");
        list.add(student2);
    }
    //添加
    public void addStudent(Student student){
        list.add(student);
        for (Student student1 : list) {
            System.out.println(student1);
        }
    }
}
