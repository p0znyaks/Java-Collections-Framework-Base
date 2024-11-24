package Collections.list;

import java.util.Objects;

public class Car {
    private String name;
    private int age;

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if(o == null || o.getClass() != this.getClass()) return false;
        Car car = (Car) o;
        return this.age == car.age && Objects.equals(this.name, car.name);
    }
}