/**
 * Serigala.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */

 public class Serigala extends Animal {

    private long basePower;
    private boolean kawanan;

    public Serigala(long basePower, boolean kawanan) {
        // Konstruktor
        super(4);
        this.basePower = basePower;
        this.kawanan = kawanan;
    }

    private boolean hasKawanan(){
        return this.kawanan;
        // Mengembalikan state apakah ia memiliki kawanan atau tidak
    }

    @Override
    public long getAnimalPower() {
        if (this.hasKawanan() == true && super.getNumberOfChildren() > 0 )
        {
            return this.basePower*3 * super.getNumberOfChildren();
        }
        else
    {
        return this.basePower;
    }
        // Mengembalikan kekuatan serigala.
        // Apabila ia memiliki kawanan dan anak, formulanya basePower * 3 * children
        // Selain itu, kekuatan hanya bernilai basePower
    }
}