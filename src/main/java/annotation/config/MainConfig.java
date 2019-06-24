package annotation.config;

import annotation.bean.Person;
import annotation.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import static org.springframework.context.annotation.FilterType.ANNOTATION;
import static org.springframework.context.annotation.FilterType.ASSIGNABLE_TYPE;
import static org.springframework.context.annotation.FilterType.CUSTOM;

@Configuration
@ComponentScan(value = "annotation", includeFilters = {
      /* @ComponentScan.Filter(type = ANNOTATION, value = {Controller.class,Service.class}),
        @ComponentScan.Filter(type = ASSIGNABLE_TYPE,value = {BookDao.class})*/
      @ComponentScan.Filter(type = CUSTOM, value = {MyFilterType.class})
},useDefaultFilters = false)
public class MainConfig
{
    @Bean(name="test" )
    public Person person()
    {
        Person person = new Person("zhangsan",18);
        return person;
    }

}
