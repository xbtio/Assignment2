public class Employee extends Person implements Payable{
    private String position;
    private double salary;
    public Employee(){

    }
    public Employee(String name, String surname, double salary){
        super(name, surname);
        setPosition();
        setSalary(salary);
    }


    public void setPosition(){
        this.position = getPosition();
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

    @Override
    public String getPosition(){
        return "Employee";
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
