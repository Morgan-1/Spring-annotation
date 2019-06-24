package ioc;

import annotation.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_PropertyValue
{

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);
    @Test
    public void test01()
    {
        Object person = applicationContext.getBean("person");
        System.out.println(person);

    }


}
