import com.xuanzilan.ssm.spring4.factory.ServiceFactory;
import com.xuanzilan.ssm.spring4.service.ISomeService;
import com.xuanzilan.ssm.spring4.service.impl.SomeServiceImpl;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SomeServiceTest {
    Logger logger = Logger.getLogger(SomeServiceTest.class);

    @Test
    public void doSome(){
        //创建容器对象，加载配置文件
        //ClassPathXmlApplicationContext会从类路径下面寻找配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        //ClassPathXmlApplicationContext会从文件路径（即根目录下查找）下面寻找配置文件，如果配置了盘符，如D：等，则从文件系统中查找
//        ApplicationContext ac = new FileSystemXmlApplicationContext("applicationContext.xml");

        ISomeService someService = (ISomeService) ac.getBean("myService");
        someService.doSome();
        ((ClassPathXmlApplicationContext) ac).close();
    }


    /**
     * doSome和doSome1方法带来的思考：
     * ApplicationContext与BeanFactory两个容器的区别：
     * 两个容器对bean的创建时机不同，具体表现在对bean类的无参构造器的调用上：
     * （1）ApplicationContext会在初始化的时候会把所有的bean全部加载
     *      缺点：占用系统资源（内存、cpu等）；
     *      优点：响应速度快
     * （2）BeanFactory只有在真正获取对象的时候才加载
     *      优点：占用系统资源少；
     *      缺点：相对来说响应速度慢
     *  实际对开发中来说，ApplicationContext用的更快些
     */

    @Test
    public void doSome1(){
        //创建BeanFactory容器
        BeanFactory bc = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        ISomeService someService = (ISomeService) bc.getBean("myService");
        someService.doSome();
    }


    @Test
    public void doSome2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ServiceFactory serviceFactory = (ServiceFactory) ac.getBean("serviceFactory");
        serviceFactory.getSomeService().doSome();
    }

    @Test
    public void doSome3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ISomeService someService = (SomeServiceImpl) ac.getBean("myService");
        someService.doSome();
    }

}
