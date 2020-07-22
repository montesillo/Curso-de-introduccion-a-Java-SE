public class ifStartement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if(isBluetoothEnabled){
            fileSended++;
            System.out.println("Archivo enviado");
        }else{
            System.out.println("Por favor enciende tu Bluetooth, para iniciar la transferencia");
        }

        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
    }
}
