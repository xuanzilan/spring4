import com.xuanzilan.ssm.spring4.bean.annotation.Student;
import com.xuanzilan.ssm.spring4.bean.annotation.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-annotation.xml");
        Student student = (Student) ac.getBean("myStudent");
        System.out.println(student);
        ((ClassPathXmlApplicationContext) ac).close();
    }

    /**
     * 这个例子在这里其实跟注入和注解无关了
     * 主要为了验证一个问题：
     * 创建子类时，会先调用父类的无参构造器
     */
    @Test
    public void test02(){
        Teacher teacher = new Teacher();
        System.out.println(teacher);
    }
}
