package ModuleIO;

/**
 * Created by PAPAN on 2/22/2017.
 */
public class ChatApp {

    public static void startChat(String ip,int port){
        System.out.println("ip : "+ip+"\tport : "+port);
    }

    public static void main(String[] args) {
        try{
            startChat(args[0],Integer.parseInt(args[1]));
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Enter valid Info");
        }
    }

}
