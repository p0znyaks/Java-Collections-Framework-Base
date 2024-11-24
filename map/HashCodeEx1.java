package Collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);
        System.out.println(map);

        Student st4 = new Student("Zaur", "Tregulov", 3);
        boolean result = map.containsKey(st4);
        System.out.println(result);

        for(Map.Entry<Student,Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "; " + entry.getValue());
        }

        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);
    }
}

class Student {
    private String name;
    private String surname;
    private int course;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourse() {
        return course;
    }

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) return true;
        if(o == null || o.getClass() != this.getClass()) return false;
        Student s = (Student) o;
        return Objects.equals(name,((Student) o).name) &&
                Objects.equals(surname, ((Student) o).surname) &&
                course == ((Student) o).course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}