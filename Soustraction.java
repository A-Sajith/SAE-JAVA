public class Soustraction extends Operation {

    public Soustraction(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    public double valeur() {
        return this.getOperande1().valeur() - this.getOperande2().valeur();
    }

    public String toString() {
        return "(" + getOperande1() + " - " + getOperande2() + ") = " + this.valeur();
    }
}
