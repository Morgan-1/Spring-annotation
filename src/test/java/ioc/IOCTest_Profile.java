package ioc;

import annotation.config.MainConfigOfProfile;
import com.mchange.v2.c3p0.DataSources;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @ClassName: IOCTest_Profile
 * @description: profileTest
 * @author: huangyunhui
 * @create: 2019-06-24 16:55
 **/
public class IOCTest_Profile
{
    @Test
    public void test01()
    {
        AnnotationConfigApplicationContext applicationContext =
                new  AnnotationConfigApplicationContext();

        applicationContext.getEnvironment().setActiveProfiles("test");
        applicationContext.register(MainConfigOfProfile.class);
        applicationContext.refresh();

        String[] namesForType = applicationContext.getBeanNamesForType(DataSource.class);
        for (String string : namesForType)
        {
            System.out.println(string);
        }

        Object yellow = applicationContext.getBean("yellow");
        System.out.println(yellow);

    }
}
