public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono $200
        salary += 200;
        System.out.println(salary);

        //pension descuento $50
        salary -= 50;
        System.out.println(salary);

        //2 horas extra $30 c/u
        //Comida $45

        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Actualizando cadenas de texto

        String employyeName = "Hiram";
        employyeName = employyeName + " Montesillo";
        System.out.println(employyeName);

    }
}
