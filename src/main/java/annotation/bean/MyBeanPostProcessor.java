package annotation.bean;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor
{
    public Object postProcessBeforeInitialization(Object bean, String beanName )
    {
        System.out.println("postProcessBefore....." + beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName)
    {
        System.out.println("postProcessAfterInitialization...." + beanName);
        return bean;
    }


}
