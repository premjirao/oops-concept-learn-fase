package OopsAlpha;

public class StaticK {
    public static void main(String agrs[]){
        Prem s1 = new Prem();
        s1.schoolName="CSJM";
        //System.out.println(s1.schoolName);

        Prem s2 =new Prem();
        //s2.schoolName="Polytechnic";
        System.out.println(s2.schoolName);

        Prem s3 = new Prem();
        System.out.println(s3.schoolName);

        Prem s4 =new Prem();
        s4.schoolName="government";
        System.out.println(s4.schoolName);

    }
    
}


class Prem {
    String name;
    int roll;
    
    static String schoolName;
    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}