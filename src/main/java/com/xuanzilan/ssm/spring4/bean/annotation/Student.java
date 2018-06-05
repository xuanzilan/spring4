package com.xuanzilan.ssm.spring4.bean.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @Component 中的value属性，对应的是spring配置文件中的<bean id>
 * 另外， Spring 还提供了 3 个功能基本和@Component 等效的注解：
 *  @Repository 用于对 DAO 实现类进行注解
 *  @Service 用于对 Service 实现类进行注解
 *  @Controller 用于对 Controller 实现类进行注解
 *
 *
 * @Scope 作用域，与bean中配置相同，默认为singleton（单例），可以指定为prototype（原型）
 *
 * @Value 类中无需 setter。当然，若属性有 setter，则也可将其加到 setter 上
 *
 * @Autowired 默认使用byType进行了bean的装配，若属性有 setter，则也可将其加到 setter 上，@Autowired有个参数是required，默认为true
 *
 * @Qualifier 如果想使用byName注入，需要将@Autowired和@Qualifier联合使用
 *
 * @Resource 基于JSR-250规范，@Resource表示通过byType注入，@Resource(name="myTeacher")表示通过byName注入
 */
//@Scope("prototype")
@Component("myStudent")
public class Student{
    @Value("1")
    private int sid;
    @Value("张三")
    private String name;
    @Value("5")
    private int age;
//    @Qualifier("myTeacher")
//    @Autowired(required = false)
//    @Autowired
    @Resource
//    @Resource(name="myTeacher")
    private Teacher teacher;


    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", teacher=" + teacher +
                '}';
    }

    @PostConstruct
    public void afterInit(){
        System.out.println("初始化刚刚结束");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("对象即将关闭");
    }
}
