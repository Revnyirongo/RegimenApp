package art.drug;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class NVP {
    Date nextAppointment;
    Date date=new Date();
    int Days;
    public Date calculateDrug(int Weight){

        if((Weight > 2) && (Weight < 6)){
            Days=30;
            return calculateDate(date,Days);
        }
        else if((Weight >= 6) && (Weight < 10)){
            Days=20;
            return calculateDate(date,Days);
        }
        else if((Weight >= 10) && (Weight < 14)){
            Days=15;
            return calculateDate(date,Days);
        }
        else if((Weight >= 14) && (Weight < 20)){
            Days=12;
            return calculateDate(date,Days);
        }
        else if ((Weight >= 20) && (Weight < 25)){
            Days=10;
            return calculateDate(date,Days);
        }
        else if (Weight >= 25){
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
