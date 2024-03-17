/**
 * Animal.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */

 public abstract class Animal {

    private int numberOfLegs;
    private long children;

    public Animal(int numberOfLegs) {

        this.numberOfLegs = numberOfLegs;
        this.children = 0;
        // Konstruktor, set children = 0
    }

    public int getNumberOfLegs() {
        return this.getNumberOfLegs();
        // Mengembalikan atribut numberOfLegs
    }

    public long getNumberOfChildren() {
        return this.children;
        // Mengembalikan atribut children
    }

    public void increaseChild(long inc) {
        this.children += inc;
        // Meningkatkan nilai atribut children
    }

    public String toString()
     {
       return String.format("Number of Legs: %d, Children: %d", this.numberOfLegs,this.children);
        // Mengembalikan informasi hewan dengan format: "Number of Legs: {numberOfLegs}, Children: {children}"
    }

    public abstract long getAnimalPower();
}