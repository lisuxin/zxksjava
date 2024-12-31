package org.example.rlsb_zxks.main;
import java.io.Serializable;

public class Student implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String classg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClassg() {
        return classg;
    }

    public void setClassg(String classg) {
        this.classg = classg;
    }

    public Student(Integer id, String username, String password, String classg) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.classg = classg;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", classg='" + classg + '\'' +
                '}';
    }
}