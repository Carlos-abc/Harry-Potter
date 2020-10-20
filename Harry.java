public class Harry extends Alumnos{
    
    String poder;

    public Harry(String nombre, String genero, String poder){

        super(nombre, genero);
        this.poder = poder;


    }

    public void MostrarHarry(){
    
        System.out.println(nombre+" tiene el poder de: "+poder);

    }

}
