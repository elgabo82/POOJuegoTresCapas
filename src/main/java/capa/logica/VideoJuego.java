package capa.logica;

/**
 * POO - 2023-S1 26.06.2023 13.20
 * Ejercicio de Gestión de clases simulando video juegos
 * Capa Lógica - Clase VideoJuego
 * @author Gabriel Eduardo Morejón López
 */
public class VideoJuego {
    private int codigo;
    private String nombreJuego;
    private String consola;
    private int totalJugadores;
    private String categoria;

    public VideoJuego() {
    }

    public VideoJuego(int codigo, String nombreJuego, String consola, int totalJugadores, String categoria) {
        this.codigo = codigo;
        this.nombreJuego = nombreJuego;
        this.consola = consola;
        this.totalJugadores = totalJugadores;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getTotalJugadores() {
        return totalJugadores;
    }

    public void setTotalJugadores(int totalJugadores) {
        this.totalJugadores = totalJugadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "VideoJuego{" + "codigo=" + codigo + ", nombreJuego=" + nombreJuego + ", consola=" + consola + ", totalJugadores=" + totalJugadores + ", categoria=" + categoria + '}';
    }
    
    
    
}
