public class Person implements Comparable<Person>, Payable{
    private static int idd = 1;
    private int id = 0;
    private String name;
    private String surname;
    public Person(){
        id = idd++;

    }
    public Person(String name, String surname){
        setName(name);
        setSurname(surname);
        id = idd++;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getId(){
        return id;
    }

    public String getPosition(){
        return "Student";
    }

    @Override
    public String toString(){
        return id + "." + name + " " + surname;
    }


    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public int compareTo(Person o) {
        if (this.getPaymentAmount() > o.getPaymentAmount()){
            return 1;
        }else return -1;
    }
}
