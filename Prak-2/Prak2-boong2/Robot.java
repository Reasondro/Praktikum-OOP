/**
 * Robot.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */

public abstract class Robot {

    private int numberOfParts;
    private boolean isActive;

    public Robot(int numberOfParts, boolean isActive) {
        this.numberOfParts = numberOfParts;
        this.isActive = isActive;
        // Konstruktor
    }

    public int getNumberOfParts() {
        return this.numberOfParts;
        // Mengembalikan atribut numberOfParts
    }

    public boolean getIsActive() {
        return this.isActive;
        // Mengembalikan atribut isActive
    }

    public void setActivation(boolean isActive) {
        // Menetapkan atribut isActive
    }

    public String toString() 
    {
        return String.format("Number of Parts: %d, IsActive: %s", this.getNumberOfParts(), this.getIsActive());
        // Mengembalikan informasi hewan dengan format: "Number of Parts: {numberOfParts}, IsActive: {isActive}"
    }

    public abstract long getPrice();
}
