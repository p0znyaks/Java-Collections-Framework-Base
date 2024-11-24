package Collections.list;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Anton");
        arrayList1.add(1, "Sanya");
        System.out.println(arrayList1);

        arrayList1.set(1, "Vova");

        System.out.println(arrayList1.size());
        System.out.println(arrayList1.remove("Vova"));
        System.out.println(arrayList1.size());
        System.out.println(arrayList1);

        System.out.println(arrayList1.indexOf("Vova"));
        System.out.println(arrayList1.indexOf("Zaur"));

//        Car c1 = new Car("A",2005);
//        Car c2 = new Car("B",2005);
//        Car c3 = new Car("C",2019);
//
//        Car aggedOutCar = new Car("A", 2005);
//
//        List<Car> carList = new ArrayList<>();
//        carList.add(c1);
//        carList.add(c2);
//        carList.add(c3);
//        carList.remove(aggedOutCar);
//        System.out.println(c1.equals(aggedOutCar));
//        System.out.println(carList);
    }
}
