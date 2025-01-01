package org.example.rlsb_zxks.controller;

import org.example.rlsb_zxks.main.RlsbZxks;
import org.example.rlsb_zxks.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/zxks")
public class ZxksController {

    @Autowired
    private UserServer userServer;

    @RequestMapping("/select")
    public List<RlsbZxks> selwectAll(){
        return userServer.selectAll();
    }
}