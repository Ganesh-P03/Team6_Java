import java.util.Scanner;
import java.util.ArrayList;
class Message{

    void display1(ArrayList<Person> list){
    
           Scanner input= new Scanner(System.in);
    
            System.out.println("Enter :");
            System.out.println("1 - Two Wheeler\n2 - Four Wheeler");
    
            int x=input.nextInt();
            Person object =new Person();
            list.add(object);
            object.setWheeler(x);
            if(x==1){
                System.out.println("Select :");
                System.out.println("1 - Bike\n2 - Electric Bike\n3 - Cycle");
                
                x=input.nextInt();
                object.setType(x);
    
                if(x!=3){
                    System.out.print("Please Enter Your Vehicle Number :");
                    String s= input.next();
                    object.setVehicleNo(s);
                }
                
            }
            else if(x==2){
    
                System.out.println("Select :");
                System.out.println("1 - Car\n2 - Electric Car\n3 - Truck");
                x=input.nextInt();
                object.setType(x);
                System.out.print("Please Enter Your Vehicle Number :");
                String s= input.next();
               object.setVehicleNo(s);  
            }
            input.close();
            
        
    }
}