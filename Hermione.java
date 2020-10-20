public class Hermione extends Alumnos {
    
    String poder;

    public Hermione(String nombre, String genero, String poder){

        super(nombre, genero);
        this.poder = poder;

    }

    public void MostrarHermaione(){


        System.out.println(nombre+" es muy estudiosa y su poder es: "+poder);
    }


}
