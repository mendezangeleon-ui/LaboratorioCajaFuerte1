public class CajaFuerte
{
    //Declaración de campos
    private String numeroSerie;
    private String modelo;
    private int claveAcceso;
    private boolean estado;
    private byte intentosFallidos;
    private double capacidadMaxima;
    private double saldoActual;
    private boolean alarmaActivada;

    //Declaración de constructor
    public CajaFuerte(String numeroSerie, String modelo,
                      int claveAcceso, double capacidadMaxima)
    {
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.claveAcceso = claveAcceso;
        this.capacidadMaxima = capacidadMaxima;
        // la caja se encuentra cerrada
        estado = false;
        intentosFallidos = 0;
        saldoActual = 0.0;
        alarmaActivada = false;

    }


        public void abrir(int claveIngresada)
        {
        if (intentosFallidos >= 3)
        {
            System.out.println("Caja fuerte bloqueada");
            return;
        }

         // si ya esta abierta manda un mensaje
        if (estado)
        {
            System.out.println("La caja fuerte ya esta abierta");
            return;
        }
        //La caja a sido abierta
        if (claveIngresada == claveAcceso)
        {
            estado = true;
            intentosFallidos = 0;
            System.out.println("Acceso autorizado");
        }

        else
        {
            // suma 1 a intentosFallidos
            intentosFallidos++;

            System.out.println("Clave incorrecta. Intentos restantes: " +
                    (3 - intentosFallidos));

        }
            if (intentosFallidos >= 3)
            {
                estado = false;
                alarmaActivada = true;
                System.out.println("Caja fuerte bloqueada. ALARMA ACTIVADA");
            }


        }
    public void cerrar()
    {
        if (estado)
        {
            estado = false;
            System.out.println("Se ha cerrado la caja");
        }
        else
        {
            System.out.println("La caja ya esta cerrada");
        }
    }

    public void depositar(double cantidad){
        if (!estado){
            System.out.println("Primero abre la caja");
            return;
        }

        if (cantidad <= 0 || saldoActual + cantidad > capacidadMaxima){
            System.out.println("Depósito no permitido");
            return;
        }

        saldoActual += cantidad;
        System.out.println("Depósito realizado");
    }


    public void retirar(double cantidad)
    {
        if (!estado)
        {
            System.out.println("Primero abre la caja");
            return;
        }

        if (cantidad <=0 || cantidad > saldoActual)
        {
            System.out.println("Retiro no permitido");
            return;
        }

        saldoActual -= cantidad;
        System.out.println("Retiro realizado");
    }


    public void mostrarEstado()
    {
        System.out.println("Modelo: " + modelo);
        System.out.println("Numero Serie: " + numeroSerie);
        System.out.print("La caja esta: " );
        System.out.println("Alarma activada"+alarmaActivada);

        if (estado){
            System.out.println("abierta");
        }else{
            System.out.println("cerrada");
        }

        System.out.println("Intentos fallidos: " + intentosFallidos);

        if (estado)
        {
            System.out.println("Saldo: " + saldoActual);
        }
        else
        {
            System.out.println("Saldo: información protegida");
        }


    }

}