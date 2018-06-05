import com.xuanzilan.ssm.spring4.bean.MyCollections;
import com.xuanzilan.ssm.spring4.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyCollectionTest {


    /**
     * 为数组赋值
     */
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-collections.xml");
        MyCollections collections = (MyCollections) ac.getBean("MyCo");
        System.out.println(collections);
    }


    /**
     * 如果一个ac需要使用多个配置文件（比如需要使用的bean不在同一个配置文件中），可以如下配置（配置文件平等关系）
     * spring对同一配置文件中相同id或者name的两个或以上的bean时，做直接抛异常的处理，而对不同配置文件中相同id或者名称的bean，只会在打印日志级别为info的信息，信息内容大概为"Overriding bean definition for bean xxx : replacing xxx with beanDefinition ".
     * 会出现的问题是：最终spring容器只会实例化后面的这个bean，后者将前者覆盖了
     */
    @Test
    public void test02(){
        //注意这里引入了两个配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-collections.xml","spring-student.xml");
        MyCollections collections = (MyCollections) ac.getBean("MyCo");
        System.out.println(collections);

        //注意这里使用的id（student2）在两个配置文件中都有，最终获得的是后面加载的配置文件中的
        Student student = (Student) ac.getBean("student2");
        System.out.println(student);
    }

    /**
     * 如果一个ac需要使用多个配置文件（比如需要使用的bean不在同一个配置文件中），可以如下配置（配置文件平等关系）
     * 也可以使用通配符来进行配置
     * ！！！！！！这里使用通配符一直有问题，后面看下这块
     */
    @Test
    public void test03(){
        String conf = "spring-*.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        MyCollections collections = (MyCollections) ac.getBean("MyCo");
        System.out.println(collections);

        Student student = (Student) ac.getBean("student4");
        System.out.println(student);
    }

    /**
     * 如果一个ac需要使用多个配置文件（比如需要使用的bean不在同一个配置文件中），可以如下配置（包含关系）
     */
    @Test
    public void test04(){
        String conf = "springTotal.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        MyCollections collections = (MyCollections) ac.getBean("MyCo");
        System.out.println(collections);

        Student student = (Student) ac.getBean("student4");
        System.out.println(student);
    }
}
