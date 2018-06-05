import com.xuanzilan.ssm.spring4.bean.spel.SpelBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpelBeanTest {

    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-autowire.xml");
        SpelBean spelBean = (SpelBean) ac.getBean("spelBean");
        System.out.println(spelBean);
    }
}
