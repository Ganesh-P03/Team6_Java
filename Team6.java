import java.util.ArrayList;
import java.util.Scanner;


interface PersonalInfo{
    void setMobileNo(int x);
}

class Vehicle implements PersonalInfo{
 
    String vehicleNo;
    String uid;
    int mobileNo;

    String wheeler;
    String type;

    public void setMobileNo(int x){
        this.mobileNo=x;
    }

}

class TwoWheeler extends Vehicle{
   
    TwoWheeler(){
        this.wheeler="Two Wheeler";
    }
}

class FourWheeler extends Vehicle{

    FourWheeler(){
        this.wheeler="Four Wheeler";
    }
}

class Bike extends TwoWheeler{
       
    Bike(String s){
        this.type="Bike";
        this.vehicleNo=s;
    }
}

class ElectricBike extends TwoWheeler{
       
    ElectricBike(String s){
        this.type="Electric Bike";
        this.vehicleNo=s;
    }
}

class Cycle extends TwoWheeler{
       
    Cycle(){
        this.type="Cycle";
        this.vehicleNo="NONE";
    }
}

class Car extends FourWheeler{

    Car(String s){
        this.type="Electric Bike";
        this.vehicleNo=s;
    }
}

class ElectricCar extends FourWheeler{
       
    ElectricCar(String s){
        this.type="Electric Car";
        this.vehicleNo=s;
    }
}

class Truck extends FourWheeler{
       
    Truck(String s){
        this.type="Truck";
        this.vehicleNo=s;
    }
}


public class Team6 {

    public static void Display1(ArrayList<Vehicle> list){
        
        Scanner input= new Scanner(System.in);

        System.out.println("Enter :");
        System.out.println("1 - Two Wheeler\n2 - Four Wheeler");

        int x=input.nextInt();

        if(x==1){
            System.out.println("Select :");
            System.out.println("1 - Bike\n2 - Electric Bike\n3 - Cycle");
            
            x=input.nextInt();

            if(x!=3){
                System.out.print("Please Enter Your Vehicle Number :");
                String s= input.next();

                if(x==1){
                    Vehicle object =new Bike(s);
                    list.add(object);
                }
                else if(x==2){
                    Vehicle object =new ElectricBike(s);
                    list.add(object);
                }

            }
            else if(x==3){
                Vehicle object =new Cycle();
                    list.add(object);
            }

        }
        else if(x==2){

            System.out.println("Select :");
            System.out.println("1 - Car\n2 - Electric Car\n3 - Truck");
            x=input.nextInt();
            System.out.print("Please Enter Your Vehicle Number :");
            String s= input.next();

            if(x==1){
                Vehicle object =new Car(s);
                list.add(object);
            }
            else if(x==2){
                Vehicle object =new ElectricCar(s);
                list.add(object);
            }
            else if(x==3){
                Vehicle object =new Truck(s);
                list.add(object);
            }
        }
        input.close();
        
    }
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
                
        ArrayList<Vehicle> list =new ArrayList<>();
        
        Display1(list);
        input.close();
        System.out.println(list.get(0).type+" "+list.get(0).wheeler);

    }

    
}
