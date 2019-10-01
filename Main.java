class Student {

   public void univer() {
   }
   
   DZStrategy dzStrategy;

   public void dz() {
       dzStrategy.dz();
   }
}


class Otl extends Student {
    
    public Otl() {
       this.dzStrategy = new OtlDZStrategy();
   }
}



class Hor extends Student {
     public Hor() {
       this.dzStrategy = new HorDZStrategy();
   }
}





class Ud extends Student {
     public Ud() {
       this.dzStrategy = new UdDZStrategy();
   }
}



public class Main {

   public static void main(String[] args) {

   Student otl = new Otl();
   Student hor = new Hor();
   Student ud = new Ud();
   
   }
}

interface DZStrategy {

   public void dz();
}

class OtlDZStrategy implements DZStrategy {

   @Override
   public void dz() {
       System.out.println("Delayu");
   }
}

class HorDZStrategy implements DZStrategy {

   @Override
   public void dz() {
       System.out.println("Inogda delayu");
   }
}

class UdDZStrategy implements DZStrategy {
   @Override
   public void dz() {
       System.out.println("Ne delayu");
   }
}