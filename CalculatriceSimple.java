public class CalculatriceSimple {
    public static void main(String[] args) {

        Expression deux = new Nombre(2);
        Expression trois = new Nombre(3);
        Expression dixSept = new Nombre(17);

        // Test de la soustraction
        try {
            Expression s = new Soustraction(dixSept, deux);
            System.out.println(s + " = " + s.valeur()); // doit afficher (17 - 2) = 15
        } catch (ArithmeticException e) {
            System.out.println("Erreur lors de la soustraction : " + e.getMessage());
        }
        // Test de l'adddition
        try {
            Expression a = new Addition(deux, trois);
            System.out.println(a + " = " + a.valeur()); // doit afficher (2 + 3) = 5
        } catch (ArithmeticException e) {
            System.out.println("Erreur lors de l'addition : " + e.getMessage());
        }
        // Test de la multiplication
        try {
            Expression m = new Multiplication(trois, deux);
            System.out.println(m + " = " + m.valeur()); // doit afficher (3 * 2) = 6
        } catch (ArithmeticException e) {
            System.out.println("Erreur lors de la multiplication : " + e.getMessage());
        }
        // Test de la division
        try {
            Expression d = new Division(new Soustraction(dixSept, deux), new Addition(deux, trois));
            System.out.println(d + " = " + d.valeur()); // doit afficher ((17 - 2) = 15 / (2 + 3) = 5 ) donc 15/3 = 3
        } catch (ArithmeticException e) {
            System.out.println("Erreur lors de la division : " + e.getMessage());
        }
    }
}
