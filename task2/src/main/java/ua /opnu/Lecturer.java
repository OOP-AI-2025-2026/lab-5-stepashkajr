package main.java.ua.opnu;

public class Lecturer extends Person{
    private String department;
    private int salary;

    public Lecturer(String lastName, String name, int age, String department, int salary){
        super(lastName, name, age);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Викладач кафедри "  + getDepartment() +", " +  getLastName() +" "
                +  getName()  + " вік: "+  getAge()+ ". Зарплата: " +
                getSalary();
    }
}
