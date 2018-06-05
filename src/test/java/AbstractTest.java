import com.xuanzilan.ssm.spring4.bean.abstractClass.Student;
import com.xuanzilan.ssm.spring4.bean.abstractClass.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AbstractTest {

    /**
     * 同类抽象bean注入
     */
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-abstract.xml");
        Student student1 = (Student) ac.getBean("student1");
        System.out.println(student1);

        Student student2 = (Student) ac.getBean("student2");
        System.out.println(student2);
    }


    /**
     * 异类抽象bean注入
     */
    @Test
    public void test02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-abstract.xml");
        Student student1 = (Student) ac.getBean("student3");
        System.out.println(student1);

        Teacher teacher = (Teacher) ac.getBean("teacher");
        System.out.println(teacher);
    }
}
