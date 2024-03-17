/**
 * Perari.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */
public class Perari{//Jangan lupa tambahkan kata kunci untuk melakukan polymorphism antar kelas
    private int averageSpeed;
    private Boolean isInsuranced;

    public Perari(int numberOfWheels,int engineCapacity, int averageSpeed, Boolean isInsuranced) {
        //Konstruktor
        //averageSpeed merupakan nilai kecepatan rata-rata dari perari dalam satuan km/h
        //isInsuranced merupakan status apakah perari didaftarkan asuransi atau tidak
    }

    public int getAverageSpeed(){
        //Mengembalikan nilai dari kecepatan rata-rata perari
    }

    public Boolean getInsuranceStatus(){
        //Mengembalikan status asuransi dari perari
    }    
    public String sound(){
        //Mengembalikan string berisi "Brmmm"
    }

    public String honk(){
        //Mengemabilakn string berisi "Siuuu"
    }

    public String printDescription(){
        //Mengembalikan string yang berformat dan berkondisi
        //Apabila isInsurance true, maka mengembalikan: "Mobil ini memiliki a roda dengan kapasitas mesin b cc, memiliki kecepatan rata-rata c km/h, dan sedang dalam perlindungan asuransi", dimana a adalah numberOfWheels, b adalah engineCapacity dan c adalah averageSpeed
        //Apabila isInsurance false, maka mengembalikan: "Mobil ini memiliki a roda dengan kapasitas mesin b cc, memiliki kecepatan rata-rata c km/h, dan sedang tidak dalam perlindungan asuransi", dimana a adalah numberOfWheels, b adalah engineCapacity dan c adalah averageSpeed
    }
}


