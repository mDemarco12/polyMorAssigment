public class Clerk extends Employee {

    private int daysAbsent;
    private double employeeDeductions;
    private int daysPresent = 20;

    public Clerk() {

        this("Not salaried", "000", "None", "None", "None", 0.0);
    }

    public Clerk(String employee, String ID, String name, String designation, String department, double salary) {

        super(employee, ID, name, designation, department, salary);


    }


    public Clerk(String ID, double salary) {
        super(ID, salary);


    }


    public double employeeDeductions(int daysAbsent) {
        return ((getSalary() + addBonus()) / 20) * daysAbsent;
    }

    public void setDaysAbsent(int daysAbsent) {
        if (daysAbsent < 0 || daysAbsent > 20) {
            System.out.println("Error...Please enter a number between 0 - 20");
            System.exit(0);
        } else {

            this.daysAbsent = daysPresent - daysAbsent;
        }
    }

    public int getDaysAbsent() {
        return daysAbsent;
    }


    public double addBonus() {

        return 100;

    }

    public boolean equals(Clerk clerk) {

        return getDesignation().equals(clerk.getDesignation());
    }


    public void displayInfo(Clerk clerk) {
        System.out.printf(getID() + "\t\t\t" + (daysPresent - daysAbsent)
                + "\t\t" + daysAbsent + "\t\t$" + employeeDeductions(daysAbsent));
    }

}
