public class PoliceCar implements TrackeableVehicle {
    
    private String plateNumber;
    private Point gpsPosition;
    private int speed;
    private String direction;
    private int wheel;
    private String fuelType;
    private Boolean started;

    public PoliceCar(String plateNumber, Point gpsPosition, int speed, int wheel, String fuelType){
        this.plateNumber = plateNumber;
        this.gpsPosition = gpsPosition;
        this.speed = speed;
        this.wheel = wheel;
        this.fuelType = fuelType;
        this.direction = "North";
        this.started = false;
    
    }
    public String getPlateNumber(){
        return this.plateNumber;
    }
    
    public Point getGPSPosition()
    {
        return this.gpsPosition;
    }


    public int getMaxSpeed()
    {
        return this.speed;
    }

    public String getDirection(){
        return this.direction;
    }
    public int getNumberofWheels(){
        return this.wheel;
    }
    public String getFuelType()
    {
        return this.fuelType;
    }
    public Boolean getStarted()
    {
        return this.started;
    }

    public void start(){
        this.started = true;
    }
    public void stop(){
        this.started = false;
    }

    public void turn(String direction)
    {
        this.direction = direction;
    }


}
