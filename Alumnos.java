public class Alumnos extends Personajes{
    
    public Alumnos(String nombre, String genero){

        super(nombre, genero);
    
    }

    public void MostrarAlumnos(){

        System.out.println(nombre+" es un alumno");
    }
}
