package org.example.rlsb_zxks.controller;

import org.example.rlsb_zxks.main.RlsbZxks;
import org.example.rlsb_zxks.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/zxks")
@CrossOrigin//跨域
public class ZxksController {

    @Autowired
    private UserServer userServer;


    @GetMapping("/select")
    public List<RlsbZxks> selwectAll(){
        return userServer.selectAll();
    }//查询全部

    @DeleteMapping("/delect/{id}")
    public String deleteByPrimaryKey(@PathVariable Integer id){
        return userServer.deleteByPrimaryKey(id);
    }//更具id删除某一行

    @PostMapping("/insert")
    public int insert(@RequestBody RlsbZxks insert){
        return userServer.insert(insert);
    }//新增

    @PutMapping("/update")
    public int  updateByPrimaryKey(@RequestBody RlsbZxks row){
        return userServer.updateByPrimaryKey(row);
    }//修改

    @GetMapping("/selectid/{id}")
    public RlsbZxks selectByPrimaryKey(@PathVariable Integer id){
        return userServer.selectByPrimaryKey(id);
    }

    @PostMapping("/denglu")
    public int off(@RequestBody RlsbZxks row){
        return userServer.off(row);
    }
}