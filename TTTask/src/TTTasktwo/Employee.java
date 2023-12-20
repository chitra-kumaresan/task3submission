package TTTasktwo;

public class Employee implements Taxable{
    public Integer empId;
    public String name;
    public Integer salary;
    public double annualSalary;
    public  double totalTax;



    public Employee(Integer empId,String name,Integer salary){
        this.empId=empId;
        this.name=name;
        this.salary=salary;
    }
    @Override
    public void calcTax() {
        totalTax= incomeTax*salary;
        annualSalary=salary-totalTax;
        System.out.println("annualTax : "+totalTax);

        System.out.println("salary : "+annualSalary);


    }
}
