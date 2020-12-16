package art.regimen;

import art.drug.AZT3TC;
import art.drug.NVP;
import art.drug.TDF3TC;

import java.util.Date;

public class Type6A implements Regimen {

    public String validate(String RegimenInput,int Weight) {
        TDF3TC tdf3TC=new TDF3TC();
        Date date = tdf3TC.calculateDrug(Weight);
        System.out.println("Next Appointment Date is: "+date.toString());
        NVP nvp=new NVP();
        Date date2 = nvp.calculateDrug(Weight);
        System.out.println("Next Appointment Date is: "+date2.toString());
        return null;
    }
}
//done
