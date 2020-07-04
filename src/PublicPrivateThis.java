public class PublicPrivateThis {
    public static void main(String [] args){
        Data2 obj = new Data2();
        obj.Intergers(0,0,0);
        obj.getresult();
    }
}

class Data2{
    private int x=1;   //here x,y,z(1,2,3) values are declared as private , so if we create object for this class always
    private int y=2;     //java take 1,2,3 only
    private int z=3;
    public void Intergers(int x, int y , int z){        // if you want x,y,z(10,11,12) values instead of private ones
        this.x = 10;                                         //you have to tell java with "this" keyword
        this.y = 11;
        this.z = 12;
    }
    public void getresult(){
        System.out.println("X value is: " +x+"\nY value is: "+y+"\nZ value is: " +z);
        // conclusion:if "this" is not there output is 1,2,3 or if "this" is there output is 10,11,12
    }
}