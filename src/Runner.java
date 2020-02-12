public class Runner {
    public static void main (String[] args){
        Car myCar = new Car(2001,"mercedes",25000,"s550");
        System.out.println(myCar.toString());
        myCar.drive(15000);
        System.out.println(myCar.toString());
        Rectangle myRect = new Rectangle( 40, 40);

        System.out.println(myRect.getArea());
        System.out.println(myRect.isSquare());
        System.out.println(myRect.getDiagonal());

    }

    }







