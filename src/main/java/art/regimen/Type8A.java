package art.regimen;

import art.drug.ATVR;
import art.drug.AZT3TC;

import java.util.Date;

public class Type8A implements Regimen {

    public String validate(String RegimenInput,int Weight) {
        AZT3TC azt3TC=new AZT3TC();
        Date date = azt3TC.calculateDrug(Weight);
        System.out.println("Next Appointment Date is: "+date.toString());
        ATVR atvr=new ATVR();
        Date date2 = atvr.calculateDrug(Weight);
        System.out.println("Next Appointment Date is: "+date2.toString());
        return null;
    }
}
//done
