
/**
 * esta clase reprecenta objetos circulo con un radio
 * @author Luis Posadas
 * @version 1.0(8-sep-17)
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Figura
{
    private float radio;
    public  Circulo(float unRadio)
    {
        radio= unRadio;
        
    }
    @Override
    
    public void calcularArea()
    {
        area = 3.14f * radio * radio;
        
    }
}
