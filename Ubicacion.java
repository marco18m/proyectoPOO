import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ubicacion{
    String nombre;
    int capacidad;
    int filas;
    int columnas;
    int filaExtra;
    int raizCuadrada;
    StringBuilder mapaStr = new StringBuilder();
    ArrayList<ArrayList<String>> mapa = new ArrayList<ArrayList<String>>();
    
    
    public Ubicacion(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        generarMapa();
    }

    public void generarMapa(){
        // se calcula la raiz cuadrada para hacer la representación de la matriz lo mas cuadrada posible
        // si la raiz cuadrada tiene decimales, se hace la matriz cuadrada y se suma una fila para mantener el orden del mapa
        // ejemplo sqrt(200) = 14.14, se hace una matriz de 14 * 14 y como faltan 4 espacios, se hace una fila extra  
        raizCuadrada = (int)Math.sqrt(capacidad);
        filaExtra = capacidad - (raizCuadrada * raizCuadrada);
        filas = raizCuadrada;
        columnas = raizCuadrada;
        if (filaExtra != 0 ){ 
            filas++;
        }

        //// se crea el mapa
        int contador = 0;
        for (int i = 0; i < filas; i++){
            ArrayList<String> filaArray = new ArrayList<String>();
            for (int j = 0; j < columnas; j++){
                String anadir = "[ " + contador + " ]";
                filaArray.add(anadir);
                contador++;
            }
            mapa.add(filaArray);
        }
        contador = 0;


        ///////
    }
    public void imprimirMapa(){
        JOptionPane.showMessageDialog(null, mapaToString());
    }
    public String getNombre() {
        return nombre;
    }
    
    public String mapaToString(){
        StringBuilder builder = new StringBuilder();
        for (ArrayList<String> x: mapa){
            for (String y: x){
                builder.append(y + "    ");
            }
            builder.append("\n");
        }

        return builder.toString();
    }

}


