import com.xuanzilan.ssm.spring4.bean.annotation.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-annotation.xml");
        Student student = (Student) ac.getBean("myStudent");
        System.out.println(student);
    }
}
