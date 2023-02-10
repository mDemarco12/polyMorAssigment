public class Manager extends Employee {

    private int daysPresent = 20;
    private int daysAbsent;

    public Manager() {

        this("Not salaried", "null", "None", "None", "None", 0.0);
    }

    public Manager(String employee, String ID, String name, String designation, String department, double salary) {

        super(employee, ID, name, designation, department, salary);

    }

    public Manager(String ID, double salary) {
        super(ID, salary);
    }



    public double getSalaryAfterRaise() {
        return (getSalary() + addBonus());
    }

    public double addBonus() {
        return 300;
    }


    public int getDaysAbsent() {
        return daysAbsent;
    }

    public void setDaysAbsent(int daysAbsent) {
        if (daysAbsent < 0 || daysAbsent > 20) {
            System.out.println("Error...Please enter a number between 0 - 20");
            System.exit(0);
        } else {

            this.daysAbsent = daysPresent - daysAbsent;
        }
    }

    public double employeeDeductions(int daysAbsent) {

        return (((getSalary() + addBonus()) / 20) * daysAbsent);

    }


    public boolean equals(Manager manager) {

        return getDesignation().equals(manager.getDesignation());
    }

    public void displayInfo(Manager manager) {

        System.out.printf(getID() + "\t\t\t" + (daysPresent - daysAbsent)
                + "\t\t" + daysAbsent + "\t\t$" + employeeDeductions(daysAbsent));

    }


}//Main
