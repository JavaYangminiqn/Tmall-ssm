package ssm.tmall.service;

import ssm.tmall.pojo.User;

/**
 * @author 杨敏钦
 */
public interface LoginService {
    User loginUser(String uname,String password);
}
