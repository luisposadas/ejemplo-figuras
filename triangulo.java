/**
 * esta clase reprecenta objetos triangulo con un radio
 * @author Luis Posadas
 * @version 1.0(8-sep-17)
 */
public class triangulo extends Figura
{
    private float base;
    private float altura;
    private float ladoD;//derecho
    private float ladoI;
    
    public triangulo(float usrBase, float usrAltura,float usrLadoD,float usrLadoI)
    {
        base =  usrBase;
        altura = usrAltura;
        ladoD =  usrLadoD;
        ladoI =  usrLadoI;
    }
    
 
    public void calcularArea()
    {
        area = (base * altura)/2;
        
    }
    
    
    public void calculaPerimetro()
    {
        perimetro = base + ladoD +ladoI;
    }
}
