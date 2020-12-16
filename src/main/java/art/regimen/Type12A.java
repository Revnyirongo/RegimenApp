package art.regimen;

import art.drug.AZT3TC;
import art.drug.DRV;
import art.drug.R;

import java.util.Date;

public class Type12A implements Regimen {

    public String validate(String RegimenInput,int Weight) {

        DRV drv=new DRV();
        Date date = drv.calculateDrug(Weight);
        System.out.println("Next Appointment Date is: "+date.toString());
        R r=new R();
        Date date2 = r.calculateDrug(Weight);
        System.out.println("Next Appointment Date is: "+date2.toString());
        return null;
    }
}
