package superficies;

/**
 * Esta es la clase donde se crea el objeto
 * @author dpereiracarrillo
 */
public class Modelo {



public float height,length,area;


 /*constructores

*/
    public Modelo() {

    }

    public Modelo(float length, float area) {
        this.length = length;
        this.area = area;

    }

    public Modelo(float height, float length, float area) {
        this.height = height;
        this.length = length;
        this.area = area;
    }

    /*getters y setters
    
    */
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

   

    
}


