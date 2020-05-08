package lab.pkg02_felipelin;

public class Casas {

    private int NCasa;
    private int NBloque;
    private String Color;
    private int largo;
    private int ancho;
    private int comprado;
    private int piso;
    private int bano;
    private int cuarto;
    private String landlord;
    private int Estado;
    private String Inge;

    public Casas(int NCasa, int NBloque, String Color, int largo, int ancho, int comprado, int piso, int bano, int cuarto, String landlord, int Estado, String Inge) {
        this.NCasa = NCasa;
        this.NBloque = NBloque;
        this.Color = Color;
        this.largo = largo;
        this.ancho = ancho;
        this.comprado = comprado;
        this.piso = piso;
        this.bano = bano;
        this.cuarto = cuarto;
        this.landlord = landlord;
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

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getBano() {
        return bano;
    }

    public void setBano(int bano) {
        this.bano = bano;
    }

    public int getCuarto() {
        return cuarto;
    }

    public void setCuarto(int cuarto) {
        this.cuarto = cuarto;
    }

    public String getLandlord() {
        return landlord;
    }

    public void setLandlord(String landlord) {
        this.landlord = landlord;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
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
        //return "Casas{" + "NCasa=" + NCasa + ", NBloque=" + NBloque + ", Color=" + Color + ", largo=" + largo + ", ancho=" + ancho + ", comprado=" + comprado + ", piso=" + piso + ", bano=" + bano + ", cuarto=" + cuarto + ", landlord=" + landlord + ", Estado=" + Estado + ", Inge=" + Inge + '}';
        return "Casa[ Numero de casa: " + NCasa + ", Numero de bloque: " + NBloque + ", Color: " + Color + ", Largo: " + largo + ", Ancho: " + ancho + ", Comprado = 1. Si 2. No: " + comprado + ", Piso: " + piso + ", Baño: " + bano + ", Cuarto: " + cuarto + ", Dueño: " + landlord + ", Estadoos = 1. Listo 2. En Construccion 3. Construccion en espera 4. en espera de demolicion: " + Estado
                + ", Ingeniero: " + Inge;
    }

}
