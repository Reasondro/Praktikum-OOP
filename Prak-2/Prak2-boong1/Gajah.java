/**
 * Gajah.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */

 public class Gajah extends Animal {

    private long basePower;
    private long jumlahGading;

    public Gajah(long basePower, int jumlahGading) {
     
        super(4);
        this.basePower = basePower;
        if(jumlahGading > 2)
        {
            this.jumlahGading = 2;
        }
        else{
            this.jumlahGading = 2;
        }


        // Konstruktor, jumlah gading minimal 0 maksimal 2
    }

    public long getJumlahGading(){
        // Mengembalikan jumlahGading
        return this.jumlahGading;
    }

    @Override
    public long getAnimalPower() {
        return 3 * this.basePower * (1 + this.jumlahGading);
        // Mengembalikan kekuatan Gajah dengan formula 3 * basePower * (1 + jumlahGading)
    }
}