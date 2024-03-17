/**
 * WallE.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */

public class WallE extends Robot {

    private long mileage;

    public WallE(long mileage, boolean isActive) {
        // Konstruktor
        super(10, isActive);
        this.mileage = mileage;
    }

    public long getMileage(){
        return this.mileage;
        // Mengembalikan mileage
    }

    public void addMileage(long increment){
        // Menambahkan mileage dengan increment
        this.mileage += increment;
    }

    @Override
    public long getPrice() {
        // Apabila sedang aktif, maka harga total adalah mileage * 1000, 
        // Apabila tidak aktif maka ada tambahan biaya 500
        if(this.getIsActive() == true)
        {
            return (this.getMileage() * 1000 );
        }
        else
        {
            return (this.getMileage() *1000) + 500;
        }
    }
}
