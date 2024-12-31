package org.example.rlsb_zxks.controller;

import org.example.rlsb_zxks.main.Rseult;
import org.example.rlsb_zxks.main.Student;
import org.example.rlsb_zxks.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/zxks")
public class ZxksController {

    @Autowired
    private UserServer userServer;

    @RequestMapping("/chaxun")
    public Rseult chaxun(@RequestBody Student student){
        userServer.addStudent(student);
        return new Rseult<>(200,"成功1");
    }
    @RequestMapping("/shancu")
    public String shancu(){
        return null;
    }
}
