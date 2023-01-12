import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Student("Yernar", "Koshkarbay", 3.4);
        Person p2 = new Student("sd", "ss", 2.5);
        Person p3 = new Employee("sd", "ss", 15000);
        Person p4 = new Employee("sd", "ss", 25000);
        Person p5 = new Employee("sd", "ss", 45000);
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

    public static void printData(ArrayList<Person> list){
        for (Person p: list) {
            System.out.println(p.getPosition() + ": " + p.toString() + " earns " + p.getPaymentAmount() + " tenge");
        }
    }
}