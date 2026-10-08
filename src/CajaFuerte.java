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

    }
}
