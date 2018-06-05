import com.xuanzilan.ssm.spring4.bean.autowire.School;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireTest {

    /**
     * 这里实际上测试了三种方法，具体看配置文件中的说明
     */
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-autowire.xml");
        School school = (School) ac.getBean("school");
        System.out.println(school);
    }
}
