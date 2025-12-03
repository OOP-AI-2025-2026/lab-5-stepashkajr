package main.java.ua.opnu;

public class Student extends Person{
    private String group;
    private int studentIdNmbr;

    public Student(String lastName, String name, int age, String group, int studentIdNmbr){
       // super(Person.class.getLastName(), Person.class.getName(), Person.class.getAge);
        super(lastName, name, age);

        this.group = group;
        this.studentIdNmbr = studentIdNmbr;
    }

    public String getGroup(){
        return group;
    }

    public void setGroup(String group){
        this.group = group;
    }

    public long getStudentIdNmbr(){
        return studentIdNmbr;
    }
    public void setStudentIdNmbr(int studentIdNmbr){
        this.studentIdNmbr = studentIdNmbr;
    }

    @Override
    public String toString() {
        return "Студент групи "  + getGroup() +", " +  getLastName() +" "
                +  getName()  + " вік:"+  getAge()+ ". Номер студентського квитка: " +
                 getStudentIdNmbr();
    }
}
