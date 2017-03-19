import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

/**
 * Created by PAPAN on 2/16/2017.
 */
public class ExceptionHandling {

    public static int div (int num1 ,int num2) throws ArithmeticException{
        return num1/num2;
    }

    private static int  boySalary;
    static String  boycolor;
    static double  boyheight;

   public static void setBoySalary(int salary) {
       boySalary = salary;
   }
    public static int getBoySalary() {
        return boySalary;
    }


   public static class SalaryException extends RuntimeException{
      private SalaryException(String msg){
           super(msg);
       }
   }

   public static class ColorException extends RuntimeException{
       private ColorException(String msg){
           super(msg);
       }
   }

    public static class HeightException extends RuntimeException{
        private HeightException(String msg){
            super(msg);
        }
    }


    public static void boysChanceToGetMarried() throws SalaryException,ColorException{
        if(boySalary<=60000)
            throw new SalaryException("Inadequate Salary");
        if(boycolor!="fair")
            throw new ColorException("Inappropriate color");
        if(boyheight < 5.5)
            throw new HeightException("Inadequate height");
    }

}
