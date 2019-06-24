package annotation.config;

import annotation.bean.Color;
import annotation.bean.ColorFactoryBean;
import annotation.bean.Person;
import annotation.bean.Red;
import annotation.condition.LinuxCondition;
import annotation.condition.MyImportBeanDefinitionRegistrar;
import annotation.condition.MyImportSelector;
import annotation.condition.WindowsCondition;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.context.annotation.*;
@Conditional({LinuxCondition.class})
@Configuration
@Import({Color.class, Red.class, MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class MainConfig2
{

   // @Scope(value = "prototype")
    @Lazy
    @Bean("person")
    public Person person()
    {
        System.out.println("生成对象person");
        return new Person("wangwu",27);
    }

    @Conditional({WindowsCondition.class})
    @Bean("zhangsan")
    public Person person01()
    {
        System.out.println("生成对象person");
        return new Person("zhangsan",30);
    }

    @Conditional({LinuxCondition.class})
    @Bean("lisi")
    public Person person02()
    {
        System.out.println("生成对象person lisi");
        return new Person("lisi", 40);
    }

    @Bean
    public ColorFactoryBean colorFactoryBean()
    {
        return new ColorFactoryBean();
    }
}
