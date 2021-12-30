package mapper;

import com.src.entity.User;

import java.util.List;

/**
 * 操作数据库的接口，主要是操作user表
 *
 */
public interface userMapper {
    /**
    增加一个用户
     */
    int addUser(User user);
    /**
     *
     * 更新一个用户
     * @return
     */
    int update(User user);
    /**
     * 查询用户列表
     */
    List<User>getUsers();

    /**
     * 根据用户id查询用户信息
     * @return
     */
    User getUserByUserId(Integer userId);

    /**
     * 根据用户id进行删除用户
     */
    int deleteUserByUserId(Integer userId);
}
