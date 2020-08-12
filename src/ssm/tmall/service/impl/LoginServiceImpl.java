package ssm.tmall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.tmall.mapper.LoginMapper;
import ssm.tmall.pojo.User;
import ssm.tmall.service.LoginService;

/**
 * @author 杨敏钦
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;
    @Override
    public User loginUser(String uname, String password) {
        return loginMapper.loginUser(uname,password);
    }

    @Override
    public int registered(String uname,String password) {
        return loginMapper.registered(uname,password);
    }
}
