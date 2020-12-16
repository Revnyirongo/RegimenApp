package art.regimen;

public class FactoryRegimen {
    public Regimen GetDrugs(String Inputs) {
        if (Inputs == null) {
            return null;
        }
        if (Inputs.equalsIgnoreCase("0A")) {
            System.out.println("The following are Drugs under Regimen: "+Inputs+"\n ABC 600/3TC 300 + NVP");
            return new Type0A();
        } else if (Inputs.equalsIgnoreCase("2A")) {
            System.out.println("The following are Drugs under Regimen: "+Inputs+"\n AZT 300/3TC 150/NVP 200");
            return new Type2A();
        }
        else if (Inputs.equalsIgnoreCase("4A")) {
            System.out.println("The following are Drugs under Regimen: "+Inputs+"\n AZT 300/3TC 150 + EFV");
            return new Type4A();
        }
        else if (Inputs.equalsIgnoreCase("6A")) {
            System.out.println("The following are Drugs under Regimen: "+Inputs+"\n TDF 300/3TC 150 + NVP 200");
            return new Type6A();
        }
        else if (Inputs.equalsIgnoreCase("7A")) {
            System.out.println("The following are Drugs under Regimen: "+Inputs+"\n TDF 300/3TC 150 + ATV/r 300/100");
            return new Type7A();
        }
        else if (Inputs.equalsIgnoreCase("8A")) {
            System.out.println("The following are Drugs under Regimen: "+Inputs+"\n AZT 300/3TC 150 + ATV/r 300/100");
            return new Type8A();
        }
        else if (Inputs.equalsIgnoreCase("12A")) {
            System.out.println("The following are Drugs under Regimen: "+Inputs+"\n DRV 600/R 100 + LPV/r 200/50");
            return new Type12A();
        }
        else if (Inputs.equalsIgnoreCase("13A")) {
            System.out.println("The following are Drugs under Regimen: "+Inputs+"\n AZT 300/3TC 150 + EFV");
            return new Type13A();
        }
        else if (Inputs.equalsIgnoreCase("14A")) {
            System.out.println("The following are Drugs under Regimen: "+Inputs+"\n AZT 300/3TC 150 + EFV");
            return new Type14A();
        }
        else if (Inputs.equalsIgnoreCase("15A")) {
            System.out.println("The following are Drugs under Regimen: "+Inputs+"\n AZT 300/3TC 150 + EFV");
            return new Type15A();
        }
        else{
            System.out.println("Sorry no such Regimen Exist or Has not Been Configured Yet. Try Another Regimen");
            System.exit(0);
        }
        return null;
    }

}
