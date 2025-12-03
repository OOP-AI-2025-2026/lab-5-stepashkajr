package main.java.ua.opnu;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Lastnamenko", "Gorge", 20, "AI-323", 12233445);
        Student student2 = new Student("Namecovich", "Edith", 19, "AI-4455", 532435);

        Lecturer lecturer1 = new Lecturer("Romanenko", "John", 40, "Fisics", 30000);
        Lecturer lecturer2 = new Lecturer("Teachenko", "Nataly", 35, "Neurobiology", 32000);

        Person[] people = {student1, student2, lecturer1, lecturer2};
        for(int i=0; i<people.length; i++){

            System.out.println(people[i].toString());
        }
    }
}
