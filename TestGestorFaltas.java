/**
 * Punto de entrada a la aplicaci�n
 */
public class TestGestorFaltas {
    /**
     * Se acepta como argumento del main() el n� m�ximo de estudiantes
     * y una vez creado el gestor de faltas se muestra la informaci�n solicitada
     * (ver enunciado)
     */
    public static void main(String[] args) {
       GestorFaltas gestorFaltas = new GestorFaltas(9);
       gestorFaltas.leerDeFichero();
       System.out.println(gestorFaltas.toString());
    }
    

}
