import java.util.ArrayList;
import java.util.Scanner;




class Person {
 
    String vehicleNo;
    String uid;
    int mobileNo;

    String wheeler;
    String type;

    public void setMobileNo(int x){
        this.mobileNo=x;
    }


    public void setWheeler(int x){
          if(x==1){
              this.wheeler="Two Wheeler";
          }
          else if(x==2){
             this.wheeler="Four Wheeler";
          }
    }

    public void setType(int x){

        if(this.wheeler=="Two Wheeler"){

            if(x==1){
                this.type="Bike";
            }
            else if(x==2){
                this.type="Electric Bike";
            }
            else if(x==3){
                this.type="Cycle";
            }
        }
        else if(this.wheeler=="Four Wheeler"){
            if(x==1){
                this.type="Car";
            }
            else if(x==2){
                this.type="Electric Car";
            }
            else if(x==3){
                this.type="Truck";
            }
        }
    }

    void setVehicleNo(String x){
        this.vehicleNo=x;
    }

}

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


public class Team6 {


    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
                
        ArrayList<Person> list =new ArrayList<>();

        Message msg =new Message();
        
        msg.display1(list);
        input.close();
        System.out.println(list.get(0).type+" "+list.get(0).wheeler);
        System.out.println(list.get(0).vehicleNo);

    }

    
}
