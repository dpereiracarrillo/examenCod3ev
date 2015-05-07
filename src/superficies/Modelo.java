package superficies;

/**
 * Clase donde está el objeto
 *
 * @author dpereiracarrillo
 */
public class Modelo {

    public float height, length, area, base, radius;

    /**
     * constructores
     *
     *
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

    /**
     * getters y setters
     *
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

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

}

