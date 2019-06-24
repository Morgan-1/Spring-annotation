import annotation.bean.Person;
import annotation.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest
{
   public static void main(String[] arges)
   {
      /* ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       Person person = (Person)context.getBean("person");
       System.out.println(person);*/

       ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);


       Person person = (Person) context.getBean(Person.class);
       System.out.println(person);

       String[] names =context.getBeanDefinitionNames();
       for (String name : names)
           System.out.println(name);
   }

}
