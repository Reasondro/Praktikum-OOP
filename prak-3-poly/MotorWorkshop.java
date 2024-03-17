public class MotorWorkshop {

    public void changeTyre(Motor motor, Tyre tyre) {
        // Melakukan penggantian tyre pada motor
        motor.setTyre(tyre);
        // motor.getTyre().getTyreName(); //TODO COBA TES NANTI
    }

    public void changeEngine(Motor motor, Engine engine) {
        // Melakukan penggantian engine pada motor
        motor.setEngine(engine);
    }
}
