import java.util.Scanner;
import java.util.ArrayList;

class Check{

    Scanner input= new Scanner(System.in);
         
    int verifyVehicleNo(ArrayList<Person> list){
        String x=input.next();
        boolean status=false;
        int i=0;

        for(;i<list.size();i++){
            if(list.get(i).l.get(2)==x){
                   status=true;
                    break;
            }
        }
        
        if(!status){
            System.out.println("vehicle number not registered !");
            System.out.println("Redirecting to home menu...");
            i=-1;   
        } 
        
        return i;
        
    }

    boolean verifyMobileNo(ArrayList<Person> list,int i){

        String y=input.next();

        if(list.get(i).l.get(4)==y){
                return true;
        }
        return false;
    }

    boolean verifyUID(ArrayList<Person> list,String x){
        
        
        for(int i=0;i<list.size();i++){
            
            if(list.get(i).l.get(3)==x){
                return true;
            }
        }
        System.out.println("Entered UID is invalid");
        System.out.println("Redirecting to home menu...");
        return false;
    }

   
}


class Message{

    void display(){
     
           System.out.println("Welcome to Team6 Parking Lot!");
           System.out.println("If you are new user enter 1");
           System.out.println("If you are old user enter your uid");
           System.out.println("If you forgot your uid enter 2");

    }

     

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

    void display2(ArrayList<Person> list){
        System.out.println("VERIFICATION");
        System.out.print("enter your vehicle number:");

        Check ch =new Check();

        int value=ch.verifyVehicleNo(list);

       if(value!=-1){
          System.out.print("enter your registered mobile number:");
          if(ch.verifyMobileNo(list,value)){
             System.out.print("verification successful");
             System.out.print("your uid has been reset");
             //..............


             //..............
          }
          else{
            System.out.print("entered mobile number doesnt match");
            System.out.println("Redirecting to home menu...");
            this.display();
          }
       }
       else{
        this.display(); 
       }

    }
}