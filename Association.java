class car{
    String carName;
    int carId;
    car(String carName,int carId){
        this.carName=carName;
        this.carId=carId;
    }
}
class Driver extends car{
    String driverName;
    Driver(String driverName,String cname,int cid){
        super(cname,cid);
        this.driverName=driverName;
    }
}
public class TransportCompany{
    public static void main(String args[]){
        Driver obj=new Driver("sai","ford",1327);
        System.out.println(obj.driverName+" "+obj.carId+" "+obj.carName);
    }
}