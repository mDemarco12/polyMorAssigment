import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Manager("Employee", "E001", "Mark",
                "Manager", "HR", 15000);


        Employee e2 = new Manager("Employee", "E012", "Peter",
                "Manager", "R&D", 15000);

        Employee e3 = new Clerk("Employee", "E056", "Samual",
                "Clerk", "Accounts", 10000);
        Employee e8 = new Manager("Employee","E089","Todd",
                "Manager","Mergers & Acquisitions",9700);

        e1.displayInfo(e1);
        System.out.println();

        e2.displayInfo(e2);
        System.out.println();

        e3.displayInfo(e3);
        System.out.println();

        System.out.println();

        //Validate e2 and e3 to e1. Return statement if false
        boolean check = e1.getDesignation().equals(e2.getDesignation());
        boolean check2 = e1.getDesignation().equals(e3.getDesignation());

        if (!check) {
            System.out.printf("%s and %s have different Designations\n\n", e1.getName(), e2.getName());
        }
        if (!check2) {
            System.out.printf("%s and %s have different Designations\n\n", e1.getName(), e3.getName());
        }

        //Assign User input to each employee
        Scanner scn1 = new Scanner(System.in);
        Manager e4 = new Manager(e1.getID(), e1.getSalary());
        Manager e5 = new Manager(e2.getID(), e2.getSalary());
        Clerk e6 = new Clerk(e3.getID(), e3.getSalary());
        Manager e7 = new Manager(e8.getID(),e8.getSalary());




        System.out.println("Enter the number of days Employee " + e1.getID() + " is Present out of 20 : ");
        e4.setDaysAbsent(scn1.nextInt());

        System.out.println("Enter the number of days Employee " + e2.getID() + " is Present out of 20 : ");
        e5.setDaysAbsent(scn1.nextInt());

        System.out.println("Enter the number of days Employee " + e3.getID() + " is Present out of 20 : ");
        e6.setDaysAbsent(scn1.nextInt());
        System.out.println("Enter the number of fays Employee " + e8.getID() + " is Present out of 20 : ");
        e7.setDaysAbsent(scn1.nextInt());
        //Display info
        System.out.println("Employee ID \tPresent Absent\tDeductions");
        e4.displayInfo(e4);
        System.out.println();
        e5.displayInfo(e5);
        System.out.println();
        e6.displayInfo(e6);
        System.out.println();
        e7.displayInfo(e7);
        //Calculate total deductions
            System.out.printf("\nTotal Deductions : " + ((e4.employeeDeductions(e4.getDaysAbsent()) +
                e5.employeeDeductions(e5.getDaysAbsent()) + e6.employeeDeductions(e6.getDaysAbsent())+ e7.employeeDeductions((e7.getDaysAbsent())))));  //+ e5.employeeDeductions(),e6.employeeDeductions());


    }
}