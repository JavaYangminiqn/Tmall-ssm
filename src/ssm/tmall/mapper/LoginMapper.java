package ssm.tmall.mapper;

import org.springframework.stereotype.Repository;
import ssm.tmall.pojo.User;

/**
 * @author 杨敏钦
 */
@Repository
public interface LoginMapper {
    User loginUser(String uname, String password);
}
