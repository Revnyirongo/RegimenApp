import art.regimen.FactoryRegimen;
import art.regimen.Regimen;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter Regimen:");
        String RegimenInput=scanner.next(); //Receiving input for Regimen

        FactoryRegimen factoryRegimen= new FactoryRegimen();
        Regimen first=factoryRegimen.GetDrugs(RegimenInput);
        System.out.println("Enter Weight to determine dosage and date of next appointment: \n");
        int WeightInput=scanner.nextInt();
        first.validate(RegimenInput,WeightInput);//passing weight

    }
}
