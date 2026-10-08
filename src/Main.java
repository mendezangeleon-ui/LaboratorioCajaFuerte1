public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Iniciando simulador de caja fuerte");

        //Creación de objeto
        CajaFuerte caja = new CajaFuerte("00202601","SecureBox a1", 1234,5000.0);
        System.out.println("Caja fuerte creada correctamente");
    caja.abrir(1232);
    caja.abrir(1232);
    caja.abrir(1232);
    caja.cerrar();
    }
}
