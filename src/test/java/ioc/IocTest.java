package ioc;


import annotation.bean.Person;
import annotation.config.MainConfig2;
import annotation.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

public class IocTest
{

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);


    @Test
    public void testImport()
    {


        printBeans(context);
        Object colorFactoryBean = context.getBean("colorFactoryBean");
        Object colorFactoryBean1 = context.getBean("colorFactoryBean");

        System.out.println(colorFactoryBean.getClass());
        System.out.println(colorFactoryBean == colorFactoryBean1);

        Object colorFactoryBean2 = context.getBean("&colorFactoryBean");
        System.out.println(colorFactoryBean2.getClass());


    }


    private void printBeans(AnnotationConfigApplicationContext applicationContext)
    {
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames)
        {
            System.out.println(name);
        }
    }

    @Test
    public void test03()
    {
        String [] namesForType = context.getBeanNamesForType(Person.class);

        ConfigurableEnvironment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);
        for (String name : namesForType)
        {
            System.out.println(name);
        }

       Map<String, Person> persons = context.getBeansOfType(Person.class);
        System.out.println(persons);



    }


    @Test
    public void MainConfig2Test()
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);

        System.out.println("定义好ioc 容器");
        Person person1 = (Person) context.getBean("person");
        Person person2 = (Person) context.getBean("person");
        System.out.println(person1 == person2);
    }



    @Test
    public void test05()
    {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成。。。。。。");
       // applicationContext.getBean("car");
        applicationContext.close();
    }
}
