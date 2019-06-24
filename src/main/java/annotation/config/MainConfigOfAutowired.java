package annotation.config;

import annotation.bean.Car;
import annotation.bean.Color;
import annotation.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



/*
* 自动装配：
* */
@Configuration
@ComponentScan({"annotation.service","annotation.dao","annotation.controller","annotation.bean"})
public class MainConfigOfAutowired
{
    @Bean("bookDao2")

    public BookDao bookDao()
    {
        BookDao dao=  new BookDao();
        dao.setName("lable2");
        return dao;
    }

    @Bean
    public Color color(Car car)
    {
        Color color = new Color();
        color.setCar(car);
        return color;
    }
}
