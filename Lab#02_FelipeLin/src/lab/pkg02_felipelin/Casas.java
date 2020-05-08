
package lab.pkg02_felipelin;


public class Casas {
    private int NCasa;
    private int NBloque;
    private String Color;
    private int largo;
    private int ancho;
    private int comprado;
    private String Estado;
    private String Inge;

    public Casas(int NCasa, int NBloque, String Color, int largo, int ancho, int comprado, String Estado, String Inge) {
        this.NCasa = NCasa;
        this.NBloque = NBloque;
        this.Color = Color;
        this.largo = largo;
        this.ancho = ancho;
        this.comprado = comprado;
        this.Estado = Estado;
        this.Inge = Inge;
    }

    public int getNCasa() {
        return NCasa;
    }

    public void setNCasa(int NCasa) {
        this.NCasa = NCasa;
    }

    public int getNBloque() {
        return NBloque;
    }

    public void setNBloque(int NBloque) {
        this.NBloque = NBloque;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getComprado() {
        return comprado;
    }

    public void setComprado(int comprado) {
        this.comprado = comprado;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getInge() {
        return Inge;
    }

    public void setInge(String Inge) {
        this.Inge = Inge;
    }

    @Override
    public String toString() {
        return "Casas{" + "NCasa=" + NCasa + ", NBloque=" + NBloque + ", Color=" + Color + ", largo=" + largo + ", ancho=" + ancho + ", comprado=" + comprado + ", Estado=" + Estado + ", Inge=" + Inge + '}';
    }
    
    
    
}
