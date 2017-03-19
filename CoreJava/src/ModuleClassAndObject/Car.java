
package ModuleClassAndObject;
/**
 * Created by PAPAN on 2/2/2017.
 *
 * Create a class Car and instantiate it 3 times and display all 3 car information
 */
public class Car {
   public String name;
   public String color;
   public double maxSpeed;
   public double length;
   public double weight;

    public void start(){
        System.out.println(name+" started !!!");
    }

    public void move(){
        System.out.println(name+" moving !!!");
    }

    public void stop(){
        System.out.println(name+" stopped !!!");
    }


    public void carDetails(){
        System.out.println("\n --- Car Details --- \n\tName : "+name+"\n\tColor : "+color+"\n\tLength " +
                ": "+length+" cms"+"\n\tWeight : "+weight+" lbs"+"\n\tMax Speed : "+maxSpeed+" kpm\n");
    }
}
