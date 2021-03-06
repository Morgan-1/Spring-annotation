package annotation.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;



public class LinuxCondition implements Condition
{


    public boolean matches (ConditionContext context, AnnotatedTypeMetadata metadata)
    {

        //获取到 ioc使用的beanfactory
        ConfigurableListableBeanFactory beanFactory  = context.getBeanFactory();
        context.getClassLoader();
        //获取类加载器
        ClassLoader classLoader = context.getClassLoader();
        //获取当前环境信息
        Environment environment = context.getEnvironment();

        //获取注册信息
       // BeanDefinitionRegistry registry =  context.getRegistry();
        context.getRegistry();
        String property = environment.getProperty("os.name");
        if (property.contains("Mac"))
        {
            return true;
        }
        return  false;


    }
}
