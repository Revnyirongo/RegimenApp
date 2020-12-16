package art.regimen;

import art.drug.AZT3TC;
import art.drug.TDF3TC;
import art.drug.TDF3TCDTG;

import java.util.Date;

public class Type13A implements Regimen {

    public String validate(String RegimenInput,int Weight) {
        TDF3TCDTG tdf3TCDTG=new TDF3TCDTG();
        Date date = tdf3TCDTG.calculateDrug(Weight);
        System.out.println("Next Appointment Date is: "+date.toString());
        return null;
    }
}
