/**
 * KebunBinatang.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */
import java.util.Scanner;
 public class KebunBinatang {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int kode = input.nextInt();

        if(kode == 1)
        {

            Elang biden = new Elang(5);
            
            int child = input.nextInt();
            biden.increaseChild(child);


            int egg = input.nextInt();
            for (int i = 0 ; i < egg; i++)
            {
            biden.bertelur();
            }

            System.out.println(biden.toString());
            System.out.printf("Jumlah Telur: %d\n", biden.getJumlahTelur());
            System.out.printf("Animal Power: %d\n", biden.getAnimalPower());
        }
        else if (kode == 2)
        {
            int child = input.nextInt();
            int gading = input.nextInt();

            Gajah gane = new Gajah(10,gading);

            gane.increaseChild(child);

            System.out.println(gane.toString());
            System.out.printf("Jumlah Gading: %d\n", gane.getJumlahGading());
            System.out.printf("Animal Power: %d\n", gane.getAnimalPower());

        }
        else if(kode == 3)
        {
            int child = input.nextInt();

            boolean gaul = input.nextBoolean();
            
            Serigala geralt = new Serigala(10, gaul);


            geralt.increaseChild(child);

            System.out.println(geralt.toString());
            
            if(gaul == false)
            {
            System.out.printf("Serigala tidak berada di dalam kawanan\n");

            }
            else
            {
            System.out.printf("Serigala berada di dalam kawanan\n");

            }
            System.out.printf("Animal Power: %d\n", geralt.getAnimalPower());

        }
        input.close();

    }
}