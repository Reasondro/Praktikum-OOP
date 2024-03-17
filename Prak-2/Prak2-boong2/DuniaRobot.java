import java.util.Scanner;

/**
 * DuniaRobot.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */

public class DuniaRobot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kode  = input.nextInt();

        if(kode == 1)
        {
            int parts = input.nextInt();
            int nTrans = input.nextInt();
            boolean state = input.nextBoolean();

            Bumblebee bee = new Bumblebee(parts, state);
            for (int i  =0 ; i < nTrans;i++)
            {
                bee.addTransformation();
            }
            System.out.println(bee.toString());
            System.out.printf("Jumlah transformasi: %d\n",bee.getTotalTransformation());
            System.out.printf("Harga robot: %d\n",bee.getPrice());
            
        }
        else if(kode ==2)
        {
            long price = input.nextLong();
            int nModel = input.nextInt();

            Sirik gpt = new Sirik(price);

            for(int i = 0 ; i< nModel; i++)
            {
                gpt.addModel();
            }
            System.out.println(gpt.toString());
            System.out.printf("Jumlah model: %d\n", gpt.getTotalModel());
            System.out.printf("Harga robot: %d\n", gpt.getPrice());

        }
        else if(kode ==3)
        {
            long mileage = input.nextLong();
            boolean state = input.nextBoolean();
            WallE garbo = new WallE(mileage, state);

            System.out.println(garbo.toString());
            System.out.printf("Jumlah mileage: %d\n", garbo.getMileage());
            System.out.printf("Harga robot: %d\n", garbo.getPrice());
            
        }

        // Integer.parseInt(input.nextLine()); //? could use this
        // Long.parseLong(input.nextLine()); //? could use this
        // Boolean.parseBoolean(input.nextLine()); //? could use this

        input.close();
    }
}
