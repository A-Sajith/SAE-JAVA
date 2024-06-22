public class Addition extends Operation {

    public Addition(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }


    public double valeur() {
        return this.getOperande1().valeur() + this.getOperande2().valeur();
    }


    public String toString() {
        return "(" + this.getOperande1() + " + " + this.getOperande2() + ") = " + this.valeur();
    }
}
