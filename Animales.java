import java.util.ArrayList;

public class Animales {
    String especie;
    String especieStr;
    String nombre;
    int edad;
    String ubicacion;
    static String[] especies = { //lista de especies
        "Leones",       //0
        "Jirafas",      //1
        "Zebras",       //2
        "Hipopotamos",  //3
        "Pinguinos",    //4
        "Monos"         //5
    };

    public Animales(String especie, String nombre, int edad, String ubicacion) {
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
        this.ubicacion = ubicacion;
    }
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
