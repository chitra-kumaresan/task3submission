package TTTasktwo;

public class XYZ {
    public static void main(String[] args) {
        System.out.println("Employee salary:");
        Employee employee1=new Employee(1,"chitra",900000);
        Employee employee2=new Employee(2,"arulmozhi",500000);
        Employee employee3=new Employee(3,"pavin",700000);
        employee1.calcTax();
        employee2.calcTax();;
        employee3.calcTax();
        System.out.println("Product price:");

        Product product1=new Product(33,20,2);
        Product product2=new Product(56,70,1);
        Product product3=new Product(78,45,4);
        product1.calcTax();
        product2.calcTax();
        product3.calcTax();
    }
}
