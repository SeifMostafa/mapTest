package mobile;
import oracle.adf.model.datacontrols.device.DeviceManagerFactory;
public class POINT {
    double latitude,longitude;
    public POINT() {  
        super();
        getPOINT();
    }

    public POINT(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void getPOINT(){
        if(DeviceManagerFactory.getDeviceManager().hasGeolocation()) {
             this.latitude = DeviceManagerFactory.getDeviceManager().getCurrentPosition(500, 50,false).getLatitude();
                this.longitude=DeviceManagerFactory.getDeviceManager().getCurrentPosition(500, 50,false).getLongitude();
    System.out.print(String.valueOf(this.latitude+ this.longitude));
        } 
    }
    @Override
    public String toString() {
        // TODO Implement this method
        return String.valueOf(latitude+","+longitude);
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}