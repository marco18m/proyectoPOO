import java.util.ArrayList;
public class Ubicacion{
    String nombre;
    int capacidad;
    int fila;
    int columna;
    int filaExtra;
    int raizCuadrada;
    ArrayList<ArrayList<String>> mapa;
    
    
    public Ubicacion(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;


    }

    public void generarMapa(){
        // se calcula la raiz cuadrada para hacer la representación de la matriz lo mas cuadrada posible
        // si la raiz cuadrada tiene decimales, se hace la matriz cuadrada y se suma una fila para mantener el orden del mapa
        // ejemplo sqrt(200) = 14.14, se hace una matriz de 14 * 14 y como faltan 4 espacios, se hace una fila extra  
        raizCuadrada = (int)Math.sqrt(capacidad);
        filaExtra = capacidad - (raizCuadrada * raizCuadrada);
        fila = raizCuadrada;
        columna = raizCuadrada;
        if (filaExtra != 0 ){ 
            fila++;
        }
        ///////

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
}
