/**
 * Fespa.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */
public class Fespa extends Motor{
    private String color;
    private Boolean isRoundedFrontLamp;

    public Fespa(int numberOfWheels,int engineCapacity, String color, Boolean isRoundedFrontLamp) {
        //Konstruktor
        //color merupakan warna dari fespa
        //isRoundedFrontLamp merupakan bentuk dari lampu depan fespa. Apabila true maka bentuknya lingkaran dan apabila false maka bentuknya persegi panjang
    }

    public String getColor(){
        //Mengembalikan teks berupa warna fespa
    }

    public Boolean getLampRoundedShape(){
        //Mengembalikan status kebenaran dari apakah bentuk lampu depan fespa lingkaran
    }
    
    public String sound(){
        //Mengembalikan string berisi "Trototong"
    }

    public String printDescription(){
        //Mengembalikan string yang berformat dan berkondisi
        //Apabila isRoundedFrontLamp true, maka mengembalikan: "Motor ini memiliki a roda dengan kapasitas mesin b cc, memiliki warna c, dan memiliki lampu depan berbentuk lingkaran" dengan a adalah numberOfWheels, b adalah engineCapacity dan c adalah color
        //Apabila isRoundedFrontLamp false, maka mengembalikan: "Motor ini memiliki a roda dengan kapasitas mesin b cc, memiliki warna c, dan memiliki lampu depan berbentuk persegi panjang" dengan a adalah numberOfWheels, b adalah engineCapacity dan c adalah color
    }
}
