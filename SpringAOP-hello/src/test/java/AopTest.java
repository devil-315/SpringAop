import com.devil.service.UserService;
import com.devil.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName：AopTest
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
public class AopTest {
    @Test
    public void Test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Aop.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();

        //正常情况下：前置通知 ===》 执行方法 ===》 返回通知 ===》 后置通知
        //异常情况下：前置通知 ===》 执行方法 ===》 异常通知 ===》 后置通知


        //正常情况下：环绕前 ===》 前置通知 ===》 执行方法 ===》 返回通知 ===》 后置通知 ===》 环绕后
        //异常情况下：环绕前 ===》 前置通知 ===》 执行方法 ===》 异常通知 ===》 后置通知
    }
}
