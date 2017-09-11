
/**
 * esta clase reprecenta objetos circulo con un radio
 * @author Luis Posadas
 * @version 1.0(8-sep-17)
 */
public class Circulo extends Figura
{
    
    private float radio;
    
    
    public Circulo(float usrRadio)
    {
        radio = usrRadio;
    }
    
    
    public void calcularArea()
    {
        area = 3.14f * radio * radio; 
    }
    
    
    public void calculaPerimetro()
    {
        perimetro = 2 * 3.14F * radio;
    }
}