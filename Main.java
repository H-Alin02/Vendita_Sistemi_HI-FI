
public class Main {
    public static void main(String[] args) {
        AbstractFactorySupport CDFactory = new FactoryCD();
        AbstractFactorySupport TapeFactory = new FactoryTape();

        //usa support CD
        CDFactory.usaSupport();
        //usa support Tape
        TapeFactory.usaSupport();
        //play  CD
        CDFactory.playSupport();
        //play  tape
        TapeFactory.playSupport();
        //record  CD
        CDFactory.recordSupport();
        //record tape
        TapeFactory.recordSupport();
    }
}