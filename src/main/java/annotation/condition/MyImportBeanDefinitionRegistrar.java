package annotation.condition;

import annotation.bean.RaniBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;


public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar
{
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry)
    {
        boolean definition = registry.containsBeanDefinition("annotation.bean.Yellow");
        boolean definition2 = registry.containsBeanDefinition("annotation.bean.Red");
        if (definition && definition2)
        {
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(RaniBow.class);
            registry.registerBeanDefinition("rainBow", rootBeanDefinition);
        }
    }
}
