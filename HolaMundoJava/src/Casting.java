public class Casting {
    public static void main(String[] args) {
        //En un año ubicar 30 perritos
        //Cuántos perritos ubique al mes
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //ESTIMACIÓN
        int estimatedMontglyDogs = (int) monthlyDogs;
        System.out.println(estimatedMontglyDogs);

        //Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double)a/b);
    }
}
