package org.example.rlsb_zxks.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.example.rlsb_zxks.main.RlsbZxks;

@Mapper
public interface RlsbZxksMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RlsbZxks row);

    RlsbZxks selectByPrimaryKey(Integer id);

    List<RlsbZxks> selectAll();

    int updateByPrimaryKey(RlsbZxks row);

    List<RlsbZxks> off();
}