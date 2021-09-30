import java.util.ArrayList;


class Person {
    
    //list
    //0-wheeler    (two/four wheeler)
    //1-type       (type of vehicle)
    //2-vehicleNo
    //3-uid         (unique id)
    //4-mobileNo
    //5-floor
    //6-Slot        (parking slot)
    //7-entryTime
    //8-exitTime
    //9-estimatedTime

    ArrayList<Object> l =new ArrayList<>();
    
    //0-wheeler
    public void setWheeler(int x){
          
          if(x==1){
              this.l.add(0,"Two Wheeler");
          }
          else if(x==2){
             this.l.add(0,"Four Wheeler");
          }
    }
    
    //1-type
    public void setType(int x){

        if(this.l.get(0)=="Two Wheeler"){

            if(x==1){
                this.l.add(1,"Bike");
            }
            else if(x==2){
                this.l.add(1,"Electric Bike");
            }
            else if(x==3){
                this.l.add(1,"Cycle");
            }
        }
        else if(this.l.get(0)=="Four Wheeler"){
            if(x==1){
                this.l.add(1,"Car");
            }
            else if(x==2){
                this.l.add(1,"Electric Car");
            }
            else if(x==3){
                this.l.add(1,"Truck");
            }
        }
    }
   
    //2-vehicleNo
    void setVehicleNo(String x){
        this.l.add(2,x);
    }

    //3-uid
    //to be filled............................


           //using random func();


    //.........................................

    //4-mobileNo
    void setMobileNo(int x){
        this.l.add(4,x);
    }

    //5-floor...................................

             //to be filled using parking class

    //.........................................

    //6-slot...................................

             //to be filled using parking class

    //.........................................

    //7-entryTime.............................

            //to be filled

    //........................................

    //8-exitTime..............................

              //to be filled

    //........................................

    //9-setEstimatedTime.........................

                //to be filled

    //........................................

}




