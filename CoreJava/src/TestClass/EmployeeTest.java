/**
 * Created by PAPAN on 2/1/2017.
 */
class EmployeeTest {
    public static void main(String[] papan){
        Employee emp1=new Employee(110,10001,"Rahul Sharma",
                45600,789456123,"rahul@gmail.com");
        emp1.showEmployeeDetails();
        emp1.doSomething();

        Employee emp2=new Employee(120,10002,"Nishant Jha");
        emp2.showEmployeeDetails();
        emp2.doSomething();

        Employee emp3=new Employee();
        emp3.showEmployeeDetails();
        emp3.doSomething();
    }
}
