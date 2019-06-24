package annotation.bean;

import org.springframework.beans.factory.annotation.Value;

public class Person
{
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    @Value("${person.name}")
    String name;
    @Value("#{12}")
    Integer age;

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person()
    {
        super();
    }
    public Person(String name, Integer age)
    {
        this.name = name;
        this.age = age;
    }
}
