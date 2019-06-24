package annotation.config;

import annotation.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("annotation.bean")

public class MainConfigOfLifeCycle
{




   // @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "detory")
    public Car car()
    {
        return new Car();
    }

}
