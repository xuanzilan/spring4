import com.xuanzilan.ssm.spring4.service.ISomeService;
import com.xuanzilan.ssm.spring4.service.IUserService;
import com.xuanzilan.ssm.spring4.service.impl.SomeServiceImpl;
import com.xuanzilan.ssm.spring4.service.impl.UserServiceImpl;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
    private final static Logger logger = Logger.getLogger(UserServiceTest.class);


    @Test
    public void testSome(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = (IUserService) ac.getBean("userService");
        userService.doSome();
        userService.doOther();
    }

}
