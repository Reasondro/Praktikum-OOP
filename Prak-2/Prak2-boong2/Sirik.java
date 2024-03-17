/**
 * Sirik.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */

public class Sirik extends Robot {

    private long price;
    private int totalModel;

    public Sirik(long price) {
        super(5,false);
        this.price = price;
        this.totalModel = 1;
        // Konstruktor, set jumlah model bernilai 1
    }

    public int getTotalModel(){
        return this.totalModel;
        // Mengembalikan junlah
    }

    public void addModel(){
        totalModel++;
        // Menambahkan model sejumlah 1
    }

    @Override
    public long getPrice() {
        // Apabila total model lebih dari 2, 
        // maka formula = price + (500 * numberOfParts - (100 * totalModel))
            // Apabila total model kurang dari/sama dengan 2,
        // maka formula = price + (500 * numberOfParts * totalModel)
        if(this.getTotalModel() > 2)
        {
            return this.price + (500* this.getNumberOfParts() - (100 * this.getTotalModel()));
        }
        else
        {
            return this.price + (500 * this.getNumberOfParts() * this.getTotalModel());
        }
    }
}










