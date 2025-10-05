import java.util.Scanner;

public class SalaryHike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Salary hike of 10%");
        System.out.print("Enter the emp id: ");
        int empId = sc.nextInt();

        switch (empId){
            //cases
            case 1 :
                String name = "Kunal";
                int salary = 100000;
                double newSalary = hikePercentage(salary)+salary;
                System.out.println("EmpName: "+name);
                System.out.println("New Salary : "+newSalary);
                break;
            case 2 :
                name = "Rohit";
                salary = 10000;
                newSalary = hikePercentage(salary)+salary;
                System.out.println("EmpName: "+name);
                System.out.println("New Salary : "+newSalary);

                break;
            case 3 :
                name = "Pankaj";
                salary = 1000;
                newSalary = hikePercentage(salary)+salary;
                System.out.println("EmpName: "+name);
                System.out.println("New Salary : "+newSalary);
                break;
            default:
                System.out.println("INVALID ID!");
        }
    }
    public static double hikePercentage(int salary){

        double hikeOf = (0.1)* salary;
        return hikeOf;
    }


}
