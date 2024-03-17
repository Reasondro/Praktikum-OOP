/**
 * Elang.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */

 public class Elang extends Animal {

    private long basePower;
    private int jumlahTelur;

    public Elang(long basePower) {
        super(2);
        this.basePower = basePower;
        this.jumlahTelur = 0;
        // Konstruktor, set jumlahTelur ke 0
    }

    public int getJumlahTelur(){
        return this.jumlahTelur;
        // Mengembalikan atribut jumlahTelur
    }

    public void bertelur(){
        this.jumlahTelur ++;
        // Menambah jumlahTelur dengan 1
    }

    @Override
    public long getAnimalPower() {
        return this.basePower * super.getNumberOfChildren() - this.jumlahTelur;
        // Mengembalikan kekuatan Elang dengan formula basePower * children - jumlahTelur
    }
}
