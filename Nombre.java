public class Nombre extends Expression {
    private int valeurNombre;

    public Nombre(int unNombre) {
        this.valeurNombre = unNombre;
    }

    public double valeur() {
        return this.valeurNombre;
    }

    public String toString() {
        return "nombre : " + this.valeurNombre;
    }
}
