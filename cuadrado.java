
/**
 * funcion que calcula el area y el perimetro de un cuadrado mediante su lado
 * 
 * @author Luis Martin Lopez Posadas
 * @version 2.0(11/09/17)
 */
public class cuadrado extends Figura
{
    private float lado;
    
    public cuadrado(float usrLado)
    {
        lado = usrLado;
    }
    
   
    public void calcularArea()
    {
        area = lado * lado;
    }
    
    public void calculaPerimetro()
    {
        perimetro = lado * lado * lado * lado;
    }
}