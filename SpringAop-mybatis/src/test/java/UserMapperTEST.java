import com.devil.entity.User;
import com.devil.mapper.UserMapper;
import com.devil.mapper.impl.UserMapperImpl;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * ClassName：UserMapperTEST
 *
 * @author: Devil
 * @Date: 2024/9/10
 * @Description:
 * @version: 1.0
 */
public class UserMapperTEST {
    @Test
    public void Test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapperImpl", UserMapper.class);
        List<User> users = userMapper.getUsers();
        for (User user :
                users) {
            System.out.println(user);
        }
    }

//    @Test
//    public void test2(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserMapper userMapper = context.getBean("userMapperImpl", UserMapperImpl.class);
//        int i = userMapper.addUser(new User(8, "lili", "1111"));
//    }
//
//    @Test
//    public void test03(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserMapper useMapper = context.getBean("userMapperImpl", UserMapperImpl.class);
//        int i = useMapper.deleteUser(10);
//    }
}
