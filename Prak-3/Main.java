public class Main{

    public static void main(String[] args){

        Point titik = new Point(10, 9);
        PoliceCar riza = new PoliceCar("D 1920 ITB", titik, 20, 4, "PERTAMAX");

        System.out.println(riza.getDirection());
        System.out.println(riza.getGPSPosition());
        System.out.println(riza.getGPSPosition().getLatitude());
        System.out.println(riza.getGPSPosition().getLongitude());
        System.out.println(riza.getPlateNumber());


    }
}