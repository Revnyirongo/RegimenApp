package art.regimen;

import art.drug.ABC3TC;
import art.drug.NVP;

import java.util.Date;

public class Type0A implements Regimen {

    public String validate(String RegimenInput,int Weight) {
        ABC3TC abc3TC=new ABC3TC();
        Date date = abc3TC.calculateDrug(Weight);
        System.out.println("Next Appointment Date is: "+date.toString());
        NVP nvp=new NVP();
        Date date2 = abc3TC.calculateDrug(Weight);
        System.out.println("Next Appointment Date is: "+date2.toString());
        return null;
    }
}
