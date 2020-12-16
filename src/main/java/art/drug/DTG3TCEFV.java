package art.drug;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DTG3TCEFV {
    Date nextAppointment;
    Date date=new Date();
    int Days;
    public Date calculateDrug(int Weight){

        if (Weight >= 35){
            Days=30;
            return calculateDate(date,Days);
        }
        else {
            System.out.println("No Drug exists for the corresponding weight of: "+Weight);
            System.exit(0);
        }
        return null;
    }

    public Date calculateDate(Date date,int Days){
        GregorianCalendar calendar=new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,Days);
        nextAppointment=calendar.getTime();
        return nextAppointment;
    }
    
}
