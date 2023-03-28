package JavaProject2;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Teacher Mouni = new Teacher(1,"Mouni",3000);
        Teacher Chandu = new Teacher(2,"Chandu",5000);
        Teacher Pushpa = new Teacher(3,"Pushpa",7000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Mouni);
        teacherList.add(Chandu);
        teacherList.add(Pushpa);

        Student Yamini = new Student(1,"Yamini", 3);
        Student Prasu = new Student(2,"Prasu",5); 
        Student Avi = new Student(3,"Avi",7); 
        List<Student> studentList = new ArrayList<>();

        studentList.add(Yamini);
        studentList.add(Prasu);
        studentList.add(Avi);

        School Sasi = new School(teacherList, studentList);
        System.out.println(Sasi.getTotalMoneyEarned());

        Yamini.payFees(7000);
        System.out.println("Sasi has Earned $"+ Sasi.getTotalMoneyEarned());

        Prasu.payFees(5000);
        System.out.println("Sasi has Earned $"+ Sasi.getTotalMoneyEarned());

        System.out.println("--Making Sasi pay salary--");
        Mouni.receiveSalary(Mouni.getSalary());
        System.out.println("Sasi has spent for salary to " + Mouni.getName()
        +" and now has $" + Sasi.getTotalMoneyEarned());

        
        System.out.println(Yamini);

        Mouni.receiveSalary(Mouni.getSalary());

        System.out.println(Mouni);
    }
    
}

