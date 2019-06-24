package annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName: Boss
 * @description: boss
 * @author: huangyunhui
 * @create: 2019-06-24 15:09
 **/
@Component
public class Boss
{

    public Boss(@Autowired  Car car)
    {
        this.car = car;
        System.out.println(car);
    }

    private Car car;
}
