package org.example.rlsb_zxks.server;

import org.example.rlsb_zxks.main.RlsbZxks;

import java.util.List;

public interface UserServer {
    List<RlsbZxks> selectAll();
    String deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(RlsbZxks row);

    int insert(RlsbZxks row);

    RlsbZxks selectByPrimaryKey(Integer id);
}
