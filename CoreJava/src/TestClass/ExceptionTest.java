import java.io.EOFException;

/**
 * Created by PAPAN on 2/16/2017.
 */
public class ExceptionTest {
    public static void main(String[] args){
       try{
           System.out.println(ExceptionHandling.div(1,0));//exception thrown by JVM itself
       }catch (ArithmeticException e){
           System.out.println("Some exceptional case..."+e);
       }finally {
           System.out.println("I will execute always...cuz im finally block");
       }

       ExceptionHandling.setBoySalary(55000);
       ExceptionHandling.boycolor="normal";
       ExceptionHandling.boyheight=5.3;


       try{
           ExceptionHandling.boysChanceToGetMarried();
       }catch(ExceptionHandling.SalaryException e){
           System.out.println(" Change your job \n"+e);
       }finally {
           ExceptionHandling.setBoySalary(650000);
           System.out.println("changed salary : "+ExceptionHandling.getBoySalary());
           try{
               ExceptionHandling.boysChanceToGetMarried();
           }catch (ExceptionHandling.ColorException e){
               System.out.println("Change your color \n"+e);
           }finally {
               ExceptionHandling.boycolor="fair";
               System.out.println("changed color : "+ExceptionHandling.boycolor);
               try{
                   ExceptionHandling.boysChanceToGetMarried();
               }catch(ExceptionHandling.HeightException e){
                   System.out.println("Change your H \n"+e);
               }finally {
                   ExceptionHandling.boyheight=5.9;
                   System.out.println("changed H : "+ExceptionHandling.boyheight);
               }
           }
       }


      /*
      try{
          ExceptionHandling.boysChanceToGetMarried();
      }catch(ExceptionHandling.SalaryException e){
          ExceptionHandling.setBoySalary(60000);
          System.out.println("Salary caught here.... Change your job"+e);
          try{
              ExceptionHandling.boysChanceToGetMarried();
          }catch (ExceptionHandling.ColorException e){
              ExceptionHandling.boycolor="fair";
              System.out.println("Color exc.... Change your choice buddy..."+e);
              try{
                  ExceptionHandling.boysChanceToGetMarried();
              }catch(ExceptionHandling.HeightException e){
                  System.out.println("height probs"+e);
              }finally {
                  System.out.println("Why do girls get to choose...");
              }
          }
      */

    }
}
