import com.src.entity.User;
import junit.framework.TestCase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class userMapperTest extends TestCase {

    public void testAddUser()  {
        /**
         * 操作数据的方式
         * 1、使用原生API
         * 2、使用映射器接口类的方式
         */
        try {
            //狗建sqlSessionFactory
            InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
            //通过sqlseesionbuilder生成SqlsessionFactory对象
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
            //通过sqlsessionFactory 生成sqlsession对象，真正操作数据的是sqlsession对象。
            SqlSession sqlSession=factory.openSession();
            //sqlsession对象通过mybatisAPI操作数据库
            //User user=new User("AA",new Date());
            User user1=new User("bb",new Date());
            //statement就是usermap.xml文件下namespace名称加上对应的操作得到id；
            //int row=sqlSession.insert("mapper.userMapper.addUser",user);
            int row1=sqlSession.insert("mapper.userMapper.addUser",user1);
            System.out.println(row1);
            sqlSession.commit();
            sqlSession.close();

        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void testUpdate() {
    }

    public void testGetUsers() {
    }

    public void testGetUserByUserId() {
    }

    public void testDeleteUserByUserId() {
    }
}