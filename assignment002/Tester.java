package assignment002;

public class Tester {
    public static String getEmployeeDetails(Employee e) {
        if(e instanceof ContractEmployee)
            return e + ",\n\twage=" + ((ContractEmployee) e).getWage() +
                ",\n\thoursWorked=" + ((ContractEmployee) e).getHoursWorked() +
                " }\n";

        if(e instanceof PermanentEmployee)
            return e + ",\n\tbasicPay=" +  ((PermanentEmployee) e).getBasicPay()+
                ",\n\thra=" + ((PermanentEmployee) e).getHra() +
                ",\n\texperience=" + ((PermanentEmployee) e).getExperience() +
                " }\n";

        return e.toString();
    }

    public static void main(String[] args) {

        PermanentEmployee e1 = new PermanentEmployee(1, "Shubham Kumar",
                60000.0, (10 / 100.0), 3);
        e1.calculateMonthlySalary();
        System.out.println(getEmployeeDetails(e1));

        ContractEmployee e2 = new ContractEmployee(2,"Rahul Poudyal",2000,4);
        e2.calculateSalary();
        System.out.println(getEmployeeDetails(e2));


    }

    
}
