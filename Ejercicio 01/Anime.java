public class Anime {

    public String nombre;     
    public String genero;     
    private int nroEpisodios; 
    private String[] episodios; 

    
    public Anime(String nombre, String genero, int nroEpisodios) {
        this.nombre = nombre;
        this.genero = genero;
        this.nroEpisodios = nroEpisodios;
        this.episodios = new String[nroEpisodios]; 
    }


    public int getNroEpisodios() {
        return nroEpisodios;
    }

    public void setNroEpisodios(int nroEpisodios) {
        this.nroEpisodios = nroEpisodios;
        this.episodios = new String[nroEpisodios]; 
    }

    public String[] getEpisodios() {
        return episodios;
    }

    public void setEpisodio(int indice, String titulo) {
        if (indice >= 0 && indice < nroEpisodios) {
            episodios[indice] = titulo;
        }
    }

    
    public String toString() {
        return "Anime [nombre=" + nombre + ", genero=" + genero + 
               ", nroEpisodios=" + nroEpisodios + "]";
    }
    
public static void main(String[] args) {
        System.out.println("Anime 1:");
        Anime a1 = new Anime("Heidi", "komodo", 3);
        a1.setEpisodio(0, " Hacia la montaña");
        a1.setEpisodio(1, "En casa del abuelo ");
        a1.setEpisodio(2, "El primer día en la pradera");
        System.out.println(a1);
        System.out.println("Número de episodios: " + a1.getNroEpisodios());

        System.out.println("Anime 2:");
        Anime a2 = new Anime("BNA", "Suspenso", 2);
        a2.setEpisodio(0, "Mapache en fuga");
        a2.setEpisodio(1, "Sueñose delfín");
        System.out.println(a2);
        System.out.println("Número de episodios:" + a2.getNroEpisodios());
    
}

}
