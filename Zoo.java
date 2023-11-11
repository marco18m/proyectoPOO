import java.util.ArrayList;
public class Zoo {
    String nombre;
    String localidad;
    int capacidad;
    static ArrayList<Animales> animales = new ArrayList<>();//Contiene todos los animales
    static ArrayList<Ubicacion> listaUbicacion = new ArrayList<>();//Contiene todas las ubicaciones (todas las instancias de Ubicacion)
    


    public Zoo(String nombre, String localidad, int capacidad){
        this.nombre = nombre;
        this.localidad = localidad;
        this.capacidad = capacidad;
        crearUbicaciones();

    }

    public void addAnimal(Animales animal){
        // falta comprobar capacidad antes de añadir
        animales.add(animal);
    }
    public void moverAnimal(Animales animal){

    }
    public void removerAnimal(Animales animal){

    }
    public void generarReporte(){

    }
    // static String[] especies = { //lista de especies
    //     "Leones",       //0
    //     "Jirafas",      //1
    //     "Zebras",       //2
    //     "Hipopotamos",  //3
    //     "Pinguinos",    //4
    //     "Monos"         //5
    // };
    public void crearUbicaciones(){
        Ubicacion jaulaLeones = new Ubicacion("Jaula de los leones", (int)Math.round(capacidad * 0.20));
        Ubicacion jaulaJirafas = new Ubicacion("Jaula de las jirafas", (int) Math.round(capacidad * 0.15));
        Ubicacion jaulaZebras = new Ubicacion("Jaula de las Zebras", (int)Math.round(capacidad * 0.15));
        Ubicacion jaulaHipopotamos = new Ubicacion("Jaula de los Hipopotamos", (int)Math.round(capacidad * 0.5));
        Ubicacion jaulaPinguinos = new Ubicacion("Jaula de los Pingüinos", (int)Math.round(capacidad * 0.25));
        Ubicacion jaulaMonos = new Ubicacion("Jaula de los Monos", (int)Math.round(capacidad * 0.20));
    }

}

