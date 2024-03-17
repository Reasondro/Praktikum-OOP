/**
 * Bumblebee.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */

public class Bumblebee extends Robot {

    private int totalTransformation;

    public Bumblebee(int numberOfParts, boolean isActive) {
        // Konstruktor, set totalTransformation = 1
        super(numberOfParts, isActive);
        this.totalTransformation = 1;
    }

    public int getTotalTransformation(){
        // Mengembalikan totalTransformation
        return this.totalTransformation;
    }

    public void addTransformation(){
        // Menambahkan totalTransformation sejumlah 1
        this.totalTransformation ++;
    }

    @Override
    public long getPrice() {
        // Apabila aktif, harga bernilai numberOfParts * 1000 * totalTransformation
        // Apabila tidak aktif, harga bernilai numberOfParts * 1000
        if(this.getIsActive() == true)
        {
            return (this.getNumberOfParts() * 1000 * this.getTotalTransformation()); 
        }
        else
        {
            return (this.getNumberOfParts() * 1000);
        }
    }
}