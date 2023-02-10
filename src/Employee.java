public class Employee {

    private double salary;
    private int daysAbsent;
    private int daysPresent  = 20;
    private String employee, ID, name,department,designation;

    public Employee() {


        this("Not an Employee", "000000","None", "None", "None", 0.0);
    }


    public Employee(String employee, String ID, String name, String designation, String department, double salary){

        setEmployee(employee);
        setID(ID);
        setName(name);
        setDesignation(designation);
        setDepartment(department);
        setSalary(salary);

    }

    public Employee(String ID, double salary){
        setID(ID);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            System.out.println("Error... salary cannot be less than 0;");
            System.exit(0);
        }else {

            this.salary = salary;
        }
    }


    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        if(employee.equals("")){
            System.out.println("Error... cannot process an empty employee");
            System.exit(0);
        }else{
            this.employee = employee;
        }

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        if(ID.equals("")){
            System.out.println("Error...please enter a valid ID");
            System.exit(0);
        }else {
            this.ID = ID;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals("")){
            System.out.println("Error...please enter a valid name");
            System.exit(0);
        }else {
            this.name = name;
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if(department.equals("")){
            System.out.println("Error...enter a valid department");
            System.exit(0);
        }else {
            this.department = department;
        }
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {

        if(designation.equals("")){
            System.out.println("Error...please enter a valid designation");
            System.exit(0);
        }else {
            this.designation = designation;
        }
    }


    public double addBonus(){
        return 200;
    }
    public double getSalaryAfterRaise(){
        return (getSalary() + addBonus());

    }

    public int getDaysAbsent(){return daysAbsent;}
    public void setDaysAbsent(int daysAbsent){
        if(daysAbsent < 0 || daysAbsent > 20 ){
            System.out.println("Error...Please enter");
            System.exit(0);
        }else{
                this.daysAbsent = daysAbsent;
        }
    }

    public double employeeDeductions(int daysAbsent){
        return (getSalary() + addBonus() / 20) * daysAbsent;
    }
    public void displayInfo(Employee employee){



        System.out.printf("Employee ID : %s\n",getID());
        System.out.printf("Employee name : %s\n", getName());
        System.out.printf("Department name : %s\n", getDepartment());
        System.out.printf("Salary : %.2f\n", getSalary());
        System.out.printf("Designation : %s\n", getDesignation());
        System.out.printf("Salary after adding the bonus is : %s\n", getSalaryAfterRaise());

    }


public boolean equals(Employee employee){

        return getName().equals(employee.getName()) && getDesignation().equals(employee.getDesignation());




}
}



