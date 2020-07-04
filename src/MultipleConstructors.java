public class MultipleConstructors {
    public static void main(String[] args){
        time obj = new time();
        time obj1 = new time(7);
        time obj2 = new time(2,3);
        time obj3 = new time(2,3,4);
        obj.finalTime();
        obj1.finalTime();
        obj2.finalTime();
        obj3.finalTime();

    }
}

class time{
    private int hour;
    private int minute;
    private int second;

    public time()
    {
        this(0,0,0);
    }
    public time(int h)
    {
        this(h,0,0);
    }
    public time(int h, int m)
    {
        this(h,m,0);
    }
    public time(int h, int m, int s)
    {
        setTime(h,m,s);
    }

    public void setTime(int h, int m, int s)
    {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setHour(int h) { hour = h; }
    public void setMinute(int m) { minute = m; }
    public void setSecond(int s) { second = s; }

    public int getHour(){return hour;}
    public int getMinute(){return minute;}
    public int getSecond(){return second;}

    public void finalTime()
    {
        System.out.println(getHour()+" : "+getMinute()+" : "+getSecond());
    }

}
