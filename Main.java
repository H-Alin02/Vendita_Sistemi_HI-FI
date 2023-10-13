import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        System.out.println("Scegli il tipo di supporto che vuoi usare :\n[1] Natro \n[2] Compact Disc\n[-1] ESCI\n");
        
        
        while(choice != -1){
            choice = Integer.parseInt(in.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("\nHai scelto un supporto a Nastro !!\n");
                    AbstractFactorySupport tapeFactory = new FactoryTape();
                    tapeFactory.usaSupport();
                    tapeFactory.recordSupport();
                    tapeFactory.playSupport();
                    break;
                case 2 :
                    System.out.println("\nHai scelto un supporto a Compact Disc !!\n");
                    AbstractFactorySupport CDFactory = new FactoryCD();
                    CDFactory.usaSupport();
                    CDFactory.recordSupport();
                    CDFactory.playSupport();
                    break;
                case -1: 
                    break;
                default:
                    System.out.println("\nInserisci 1 o 2 . ");
                    break;
            }
        }   
        in.close();
    }
}