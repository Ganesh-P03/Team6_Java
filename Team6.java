import java.util.Scanner;
import java.util.ArrayList;

public class Team6 {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
                
        ArrayList<Person> list =new ArrayList<>();
        
        System.out.println("hello");
        Message msg =new Message();
        String x= input.next();
        msg.display();

        if(x=="1"){
            msg.display1(list);
        }
        else if(x=="2"){
            msg.display2(list);
        }
        else{

            Check ch= new Check();

            if(ch.verifyUID(list,x)){

                 //assign parking slot............

            }
            else{
                msg.display();
            }
        }
        
        input.close();
    }
}
