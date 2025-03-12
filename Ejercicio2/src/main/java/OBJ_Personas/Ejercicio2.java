
package OBJ_Personas;

public class Ejercicio2 {

    public static void main(String[] args) {
        Personas[] personas = { new Personas(), new Estudiante(), new Profesor() };
        for (Personas persona : personas) {
            persona.presentarse();
        }
    }
}
