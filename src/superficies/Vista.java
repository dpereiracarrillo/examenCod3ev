package superficies;

/**
 * visualiza los datos y el resultado
 * @author dpereiracarrillo
 */
public class Vista {
    
    /**
     * cuadrado
     *
     */
    public void verCuadrado(Modelo mod){
        System.out.println("Si el lado es: "+mod.getLength()+" el area sera: "+mod.getArea());
    }

    /**
     * rectangulo
     * 
     */
    public void verRectangulo(Modelo mod){
        System.out.println("Si la base es: "+mod.getLength()+" y la altura: "+mod.getHeight()+" el area sera: "+mod.getArea());
    }

    /**
     * triangulo
     * 
     */
    public void verTriangulo(Modelo mod){
        System.out.println("Si la base es: "+mod.getLength()+" y la altura: "+mod.getHeight()+" el area sera: "+mod.getArea());
    }

    /**
     * circulo
     * 
     */
    public void verCirculo(Modelo mod){
        System.out.println("Si el radio es: "+mod.getLength()+" el area sera: "+mod.getArea());
    }
}
