package annotation.bean;


public class Color
{
    @Override
    public String toString() {
        return "Color{" +
                "car=" + car +
                '}';
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    private  Car car;

}
