import java.lang.String;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student students [] = {
                new Student("Ермохин Дмитрий Евгеньевич", 18, "+79032671222", 2, "Пивоведение", 2022),
                new Student("Лапицкий Даниил Владимирович", 17, "+79042691369", 3, "Спортивная жизнь", 2021),
                new Student("Уханов Алексей Александрович", 17, "+79534678989", 5, "Киберспорт", 2019)
        };
        System.out.println("Все студенты");
        for (Student student : students)
        {
            System.out.printf("ФИО: %s\nВозраст:%s\n", student.Name, student.getAge());
        }
        System.out.println();

        System.out.print("Введите факультет: ");
        Scanner input = new Scanner(System.in);
        String inputFac = input.nextLine();

        System.out.println("Все студенты с заданного факультета");
        for (Student student : students)
        {
            if(student.Faculty.equals(inputFac))
            {
                System.out.printf("ФИО: %s\nФакультет:%s\n", student.Name, student.Faculty);
            }
        }
        System.out.println();

        System.out.print("Введите год: ");
        int inputDate = input.nextInt();

        for (Student student : students)
        {
            if(student.getReceptionDate() > inputDate)
            {
                System.out.printf("ФИО: %s\nГод поступления:%s\n", student.Name, student.getReceptionDate());
            }
        }
    }
}
class Person
{
    public String Name;
    private int Age;
    public String PhoneNumber;
    Person (String name, int age, String phoneNumber)
    {
        this.Name = name;
        this.Age = age;
        this.PhoneNumber = phoneNumber;
    }
    public int getAge(){return Age;}
}
class Student extends Person
{
    public int Course;
    public String Faculty;
    private int ReceptionDate;
    public int getReceptionDate(){return ReceptionDate;}
    Student(String name, int age, String phoneNumber, int course, String faculty, int receptionDate) {
        super(name, age, phoneNumber);
        this.Course = course;
        this.Faculty = faculty;
        this.ReceptionDate = receptionDate;
    }
}