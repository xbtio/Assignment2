import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Student("Yernar", "Koshkarbay", "Student", 3.4);
        Person p2 = new Student("sd", "ss", "Student" ,2.5);
        Person p3 = new Employee("sd", "ss", "Employee", 15000);
        Person p4 = new Employee("sd", "ss", "Employee",500);
        Person p5 = new Employee("sd", "ss", "Employee",100000);
        ArrayList<Person> arr = new ArrayList<>();

        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        arr.add(p4);
        arr.add(p5);
        printData(arr);
        Collections.sort(arr);
        printData(arr);
    }

    public static void printData(Iterable<Person> list){

        list.forEach((element) -> {
            System.out.println(element.getPosition() + ": " + element.toString() + " earns " + element.getPaymentAmount() + " tenge");
        });

    }
}