public class Division extends Operation {

    public Division(Expression operande1, Expression operande2) throws ArithmeticException {
        super(operande1, operande2);
        if (operande2.valeur() == 0) {
            throw new ArithmeticException("Division par zéro impossible.");
        }
    }


    public double valeur() {
        return this.getOperande1().valeur() / this.getOperande2().valeur();
    }


    public String toString() {
        return "(" + this.getOperande1() + " / " + this.getOperande2() + ") = " + this.valeur();
    }
}
