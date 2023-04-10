package OopsAlpha;

public class Problem {
    public static void main(String args[]){
      final Car car = new ElectricCar();
      System.out.println(car.drive());
    }
}


class Automobile{
    private String drive(){
        return "prem chutiya hai";
    }
}

class Car extends Automobile{
    protected String drive(){
        return "han mai hun to kya karloge";
    }
}


public class ElectricCar extends Car{
    
    @Override

     public final String drive(){
         return " this is big mistake in my life";
     }
}