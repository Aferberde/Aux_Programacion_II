public class Instrumento {
    
    public String nombre;     
    private String material;  
    private String tipo;


    public Instrumento(String nombre, String material, String tipo) {
        this.nombre = nombre;
        this.material = material;
        this.tipo = tipo;
    }
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String toString() {
        return "Instrumento [nombre=" + nombre + ", material=" + material + ", tipo=" + tipo + "]";
    }
    public static void main(String[] args) {
        Instrumento i1 = new Instrumento("Piano", "marfil", "Cuerda");
        Instrumento i2 = new Instrumento("Saxofon", "Metal", "Aire");

        System.out.println("Instrumento 1: " + i1);
        System.out.println("Instrumento 2: " + i2);
    }
}
