package logic_1;

public class alarmclock {
    public String alarmClock(int day, boolean vacation) {
        if(((day==0 || day==6) && !vacation) || ((day>=1 && day<=5)&& vacation))
          return "10:00";
        if((day==0 || day==6) && vacation)
          return "off";
        return "7:00";
      }      
}
