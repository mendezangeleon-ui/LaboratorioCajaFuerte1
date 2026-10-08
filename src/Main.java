public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Iniciando simulador de caja fuerte");

        //Creación de objeto
        CajaFuerte caja = new CajaFuerte("00202601","SecureBox a1", 1234,5000.0);
        System.out.println("Caja fuerte creada correctamente");
    caja.abrir(1234);
    caja.depositar(1500);
    caja.retirar(500);
    caja.mostrarEstado();
    caja.cerrar();
    }
}
