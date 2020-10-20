public class Personajes {
    
    String nombre, genero;

    public Personajes(String nombre, String genero){

        this.nombre = nombre;
        this.genero = genero;

    }

    public void MostrarPersonajes(){


        System.out.println(nombre+" es un personaje");
    }

}
