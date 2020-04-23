package school.management.system;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Teacher ana = new Teacher(1,"Ana",500);
        Teacher marija = new Teacher(2,"Marija",700);
        Teacher maja = new Teacher(3,"Maja",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(ana);
        teacherList.add(marija);
        teacherList.add(maja);


        Student sara = new Student(1,"Sara",4);
        Student marko = new Student(2,"Marko",12);
        Student ivan = new Student(3,"Ivan",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(sara);
        studentList.add(marko);
        studentList.add(ivan);




        School ghs = new School(teacherList,studentList);

        Teacher ivana = new Teacher(6,"Ivana", 900);

        ghs.addTeacher(ivana);


        sara.payFees(5000);
        marko.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        ana.receiveSalary(ana.getSalary());
        System.out.println("GHS has spent for salary to " + ana.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        maja.receiveSalary(maja.getSalary());
        System.out.println("GHS has spent for salary to " + maja.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(marko);

        marija.receiveSalary(marija.getSalary());

        System.out.println(marija);


    }
}