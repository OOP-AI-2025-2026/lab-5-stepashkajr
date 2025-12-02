package main.java.ua.opnu;

public class Person {
    private String lastName;
    private String name;
    private int age;

    public Person(String lastName, String name, int age){
        this.lastName = lastName;
        this.name = name;
        this.age = age;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return " Людина " + getLastName() + " " +  getName() + " " + " вік: " + getAge();
    }
}
