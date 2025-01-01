package org.example.rlsb_zxks.server;

import org.example.rlsb_zxks.main.RlsbZxks;
import org.example.rlsb_zxks.mapper.RlsbZxksMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServer {

    @Autowired
    private RlsbZxksMapper rlsbZxksMapper;

    public List<RlsbZxks> selectAll(){
        return rlsbZxksMapper.selectAll();
    }
}
