package art.regimen;

import art.drug.AZT3TC;


import java.util.Date;

public class Type4A implements Regimen {

    public String validate(String RegimenInput,int Weight) {
        AZT3TC azt3TC=new AZT3TC();
        Date date = azt3TC.calculateDrug(Weight);
        System.out.println("Next Appointment Date is: "+date.toString());
       /* EVF nvp=new EVF();
        Date date2 = abc3TC.calculateDrug(Weight);
        System.out.println("Next Appointment Date is: "+date2.toString());*/
        return null;
    }
}
