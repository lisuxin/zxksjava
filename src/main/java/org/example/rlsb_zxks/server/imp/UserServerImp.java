package org.example.rlsb_zxks.server.imp;

import org.example.rlsb_zxks.main.RlsbZxks;
import org.example.rlsb_zxks.mapper.RlsbZxksMapper;
import org.example.rlsb_zxks.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServerImp implements UserServer {

    @Autowired
    private RlsbZxksMapper rlsbZxksMapper;

    public List<RlsbZxks> selectAll() {
        return rlsbZxksMapper.selectAll();
    }

    @Override
    public String deleteByPrimaryKey(Integer id) {
        int rowsAffected = rlsbZxksMapper.deleteByPrimaryKey(id);
        if (rowsAffected > 0) {
            String age = ("删除成功，删除了 " + rowsAffected + " 行记录。");
            return age;
        }
        String age = ("未找到匹配的记录，无数据被删除。");
        return age;

    }

    @Override
    public int updateByPrimaryKey(RlsbZxks row) {
        return rlsbZxksMapper.updateByPrimaryKey(row);
    }

    @Override
    public int insert(RlsbZxks row) {
        return rlsbZxksMapper.insert(row);
    }

    @Override
    public RlsbZxks selectByPrimaryKey(Integer id) {
        return rlsbZxksMapper.selectByPrimaryKey(id);
    }

    @Override
    public int off(RlsbZxks row) {
        List list = rlsbZxksMapper.off();
        if (row.getFirstName() == (String) list.get(0)){
            if (row.getEncryptedPassword() == (String) list.get(1)){
                return 2;
            }else {
                return 1;
            }
        }
        return 0;
    }


}
