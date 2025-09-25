public class App {

    public static final String FONDO_NEGRO = "\u001B[40m";
    public static final String FONDO_ROJO = "\u001B[41m";
    public static final String FONDO_VERDE = "\u001B[42m";
    public static final String FONDO_AMARILLO = "\u001B[43m";
    public static final String FONDO_AZUL = "\u001B[44m";
    public static final String FONDO_PURPURA = "\u001B[45m";
    public static final String FONDO_CYAN = "\u001B[46m";
    public static final String FONDO_BLANCO = "\u001B[47m";
    public static final String RESET = "\033[0m";

    public static void main(String[] args) throws Exception {
        
        System.out.print(FONDO_CYAN);
        System.out.println("                                                                                               ");
        System.out.print("                                            ");
        System.out.print(FONDO_ROJO);
        System.out.print("    ");
        System.out.print(FONDO_CYAN);
        System.out.println("                                          FIN AZUL");
        System.out.println(RESET);
        System.out.print(FONDO_CYAN);
        System.out.println("                                          FIN AZUL");
        System.out.print(FONDO_ROJO);
        System.out.print("    ");
        System.out.print(FONDO_CYAN);
        System.out.println("                                          ");
        
        System.out.println(RESET);
    }

    
}
