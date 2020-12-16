package art.regimen;

import art.drug.ATVR;
import art.drug.AZT3TC;
import art.drug.TDF3TC;

import java.util.Date;

public class Type7A implements Regimen {

    public String validate(String RegimenInput,int Weight) {
        TDF3TC tdf3TC=new TDF3TC();
        Date date = tdf3TC.calculateDrug(Weight);
        System.out.println("Next Appointment Date is: "+date.toString());
        ATVR atvr=new ATVR();
        Date date2 = atvr.calculateDrug(Weight);
        System.out.println("Next Appointment Date is: "+date2.toString());
        return null;
    }
}
//DONE
