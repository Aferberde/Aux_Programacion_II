public class Televisor {
    
    private String marca;
    private int resolucion;
    private String tipo; 

    public Televisor(String marca, int resolucion, String tipo) {
        this.marca = marca;
        this.resolucion = resolucion;
        this.tipo = tipo;
    }

    public Televisor() {
        this.marca = "";
        this.resolucion = 0;
        this.tipo = "";
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String toString() {
        return "Televisor [marca=" + marca + ", resolucion=" + resolucion + ", tipo=" + tipo + "]";
    }
    public static void main(String[] args) {
        Televisor tv1 = new Televisor("Samsung", 720, "IPS");
        Televisor tv2 = new Televisor();
        tv2.setMarca("LG");
        tv2.setResolucion(1080);
        tv2.setTipo("OLED");

        System.out.println("Televisor 1: " + tv1);
        System.out.println("Televisor 2: " + tv2);
    }
}
