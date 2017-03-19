
package TestClass;
import ModuleClassAndObject.Car;
/**
 * Created by PAPAN on 2/2/2017.
 */

class CarTest {
    public static void main(String[] papan){
        Car car1=new Car();
        car1.name="Audi R8";
        car1.color="Red";
        car1.weight=1450;
        car1.length=175;
        car1.maxSpeed=450;

        car1.carDetails();
        car1.start();
        car1.move();
        car1.stop();

        Car car2=new Car();
        car2.name="BMW i8";
        car2.color="Blue";
        car2.weight=1550;
        car2.length=185;
        car2.maxSpeed=350;

        car2.carDetails();
        car2.start();
        car2.move();
        car2.stop();


        Car car3=new Car();
        car3.name="Mclaren P1";
        car3.color="Black";
        car3.weight=1670;
        car3.length=145;
        car3.maxSpeed=550;

        car3.carDetails();
        car3.start();
        car3.move();
        car3.stop();

    }
}
