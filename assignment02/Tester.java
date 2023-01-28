


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

        PermanentEmployee e1 = new PermanentEmployee(1, "Gautam Chandra Saha",
                30000.0, (10 / 100.0), 3);
        e1.calculateMonthlySalary();
        System.out.println(getEmployeeDetails(e1));

        ContractEmployee e2 = new ContractEmployee(2,"Rishabh Prasad",2000,4);
        e2.calculateSalary();
        System.out.println(getEmployeeDetails(e2));


    }
}


/*

OUTPUT

Employee {
	type= PermanentEmployee,
	employeeId=1,
	employeeName='Gautam Chandra Saha',
	salary=33005.0,
	basicPay=30000.0,
	hra=3000.0,
	experience=3.0 }

Employee {
	type= ContractEmployee,
	employeeId=2,
	employeeName='Rishabh Prasad',
	salary=8000.0,
	wage=2000.0,
	hoursWorked=4.0 }


 */