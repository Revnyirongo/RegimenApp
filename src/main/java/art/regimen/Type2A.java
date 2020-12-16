package art.regimen;

import art.drug.ABC3TC;
import art.drug.AZT3TCNVP;
import art.drug.NVP;

import java.util.Date;

public class Type2A implements Regimen {

    public String validate(String RegimenInput,int Weight) {
        AZT3TCNVP azt3TCNVP=new AZT3TCNVP();
        Date date = azt3TCNVP.calculateDrug(Weight);
        System.out.println("Next Appointment Date is: "+date.toString());
        return null;
    }
}
