package ioc;

import annotation.bean.Boss;
import annotation.bean.Car;
import annotation.bean.Color;
import annotation.config.MainConfigOfAutowired;
import annotation.dao.BookDao;
import annotation.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Autowired
{

    @Test
    public void test01()
    {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService);
       // BookDao bean = applicationContext.getBean(BookDao.class);
       // System.out.println(bean);
        Boss boss = applicationContext.getBean(Boss.class);
        System.out.println(boss);
        Car car = applicationContext.getBean(Car.class);
        System.out.println(car);

        Color color = applicationContext.getBean(Color.class);
        System.out.println(color);
        applicationContext.close();


    }
}
