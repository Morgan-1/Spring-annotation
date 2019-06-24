package annotation.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

public class ColorFactoryBean implements FactoryBean<Color>
{
    @Nullable
    public Color getObject() throws Exception
    {
        System.out.println("获取这个bean");

        return new Color();
    }

    @Nullable
    public Class<?> getObjectType()
    {
        return Color.class;
    }

    // true  这个bean 是单实例，在容器中保存一份
    public boolean isSingleton()
    {
        return false;
    }
}
