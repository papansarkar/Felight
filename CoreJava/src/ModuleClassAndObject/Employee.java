/**
 * Created by PAPAN on 2/1/2017.
 *
 * Create Employee class with at least 5 data member and
 * 1 behaviour and 3 different overloaded constructor.,
 * create 3 objects using different constructor to store
 * 3 different employee details and display all  the employees details.
 *
 */
class Employee {
    int id;
    int departmentID;
    int mobileNo;
    double salary;
    String name;
    String emailID;

    public Employee(){
         this.id=-1;
         this.departmentID=-1;
         this.name="Not specified";
         this.mobileNo=-1;
         this.salary=-1;
         this.emailID="Not specified";
    }

    public Employee(int id,int departmentID,String name){
        this();
        this.id=id;
        this.departmentID=departmentID;
        this.name=name;
    }

    public Employee(int id,int departmentID,String name,double salary,int mobileNo,String emailID){
        this(id,departmentID,name);
        this.salary=salary;
        this.mobileNo=mobileNo;
        this.emailID=emailID;
    }

    public void doSomething(){
        if(id!=-1)
          System.out.println(name+" is doing something...");
    }

    public void showEmployeeDetails(){
        System.out.println("\nEmoployee Details :\n\tName : "+name+"\n\tEmployee ID : "+id+"\n\tDepartment ID : "+departmentID);
        System.out.println("Contact Details : \n\tMoblie No : "+mobileNo+"\n\tEmail ID : "+emailID);
        System.out.println("Salary : Rs "+salary);
    }
}
