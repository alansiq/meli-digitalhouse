public class PraticaExcecoes {
    private static int a = 0;
    private static int b = 300;

    public static int calcular() {
        try {
            return b / a;
        } catch (Exception e) {
            System.out.println("Não pode ser dividido por 0");
            throw new IllegalArgumentException(e);
        }
    }
}
