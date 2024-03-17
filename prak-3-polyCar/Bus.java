/**
 * Bus.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */
public class Bus{//Jangan lupa tambahkan kata kunci untuk melakukan polymorphism antar kelas
    private int passengerCapacity;
    private Boolean isUsedForLongTrip;

    public Bus(int numberOfWheels,int engineCapacity, int passengerCapacity, Boolean isUsedForLongTrip) {
        //Konstruktor
        //passengerCapacity merupakan kapasitas penumpang
        //isUsedForLongTrip merupakan status apakah bis dapat digunakan untuk perjalanan jauh
    }

    public int getPassengerCapacity(){
        //Mengembalikan nilai dari kapasitas penumpang
    }

    public Boolean getLongTripStatus(){
        //Mengembalikan status dari bis apakah dapat digunakan untuk perjalanan jauh
    }    
    public String sound(){
        //Mengembalikan string berisi "Cesss"
    }

    public String honk(){
        //Mengembalikan string berisi "Notnot"
    }

    public String printDescription(){
        //Mengembalikan string yang berformat dan berkondisi
        //Apabila isUsedForLongTrip true, maka mengembalikan: "Mobil ini memiliki a roda dengan kapasitas mesin b cc, memiliki kapasitas penumpang c orang, dan digunakan untuk perjalanan jauh", dimana a adalah numberOfWheels, b adalah engineCapacity dan c adalah passengerCapacity
        //Apabila isUsedForLongTrip false, maka mengembalikan: "Mobil ini memiliki a roda dengan kapasitas mesin b cc, memiliki kapasitas penumpang c orang, dan tidak digunakan untuk perjalanan jauh", dimana a adalah numberOfWheels, b adalah engineCapacity dan c adalah passengerCapacity
    }
}
