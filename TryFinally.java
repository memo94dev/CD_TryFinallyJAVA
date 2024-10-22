public class TryFinally {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Esto causará una excepción
        } catch (ArithmeticException e) {
            System.out.println("¡No se puede dividir por cero!");
        } finally {
            System.out.println("Este bloque se ejecuta siempre.");
        }
    }
}
