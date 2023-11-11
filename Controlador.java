import javax.swing.JOptionPane;
class Controlador{  // se crea espacio estático para guardar una instancia de Zoo
    static Zoo zoo;
    public static void main(String[] args){

        nuevoZoologico(); // se ejecuta el metodo que devuelve una instacia de Zoo
        menuPrincipal();

    }
    public static void menuPrincipal(){
        //variables
        String especie;
        String nombre;
        int edad;
        String ubicacion;

        //lista de opciones
        Object[] opciones = {
            "Añadir Animal",
            "Buscar Animal",
            "Mover Animal",
            "Remover Animal",
            "General Reporte",
            "Salir"
        };
        //

        while (true) {
        int opcion = JOptionPane.showOptionDialog( //despliega un menú con opciones en forma de botones
        null,
        "Seleccione una opción", 
        "Seleccione una opción", 
        JOptionPane.DEFAULT_OPTION, 
        JOptionPane.PLAIN_MESSAGE, 
        null, 
        opciones, 
        opciones[5]
        );
        switch (opcion) {
            case 0:
                String edadStr;
                especie = seleccionarEspecie();
                nombre = JOptionPane.showInputDialog("Ingrese el nombre del animal");
                do{ 
                    edadStr = JOptionPane.showInputDialog("Ingrese la edad de " + nombre);
                }while(!edadStr.matches("\\d+")); //valida que sea un numero
                edad = Integer.parseInt(edadStr);
                ubicacion = JOptionPane.showInputDialog("Ingrese la ubicacion de " + nombre);
                
                //la variable ubicacion tiene que cambiar cuando se programen los mapas!!!!!!
                
                Animales animal = new Animales(especie,nombre,edad,ubicacion); 
                zoo.addAnimal(animal);
                break;
            case 1:
                //buscar animal
            case 2:
                //moverAnimal(animales);
                break;
            case 3:
                //removerAnimal(animales);
                break;
            case 4:
                //generarReporte(animales);
                break;
            case 5:
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida. Inténtalo de nuevo.");
        }
    }

    }
    static void nuevoZoologico() {
        int capacidad;
        String capacidadStr;
        String nombre = JOptionPane.showInputDialog("Nombre del zoológico:");
        String localidad = JOptionPane.showInputDialog("Localidad del zoológico:");
        do{
            capacidadStr = JOptionPane.showInputDialog("Capacidad máxima del zoológico:");
        }while(!capacidadStr.matches( "\\d+")); // se compara "\\d+" con un string usando .matches para saber si es un valor numerico 
        capacidad = Integer.parseInt(capacidadStr);
        zoo = new Zoo(nombre, localidad, capacidad);
    }
    public static String seleccionarEspecie(){
        int opcion = JOptionPane.showOptionDialog(
        null,
        "Seleccione la especie", 
        "Seleccione la especie", 
        JOptionPane.DEFAULT_OPTION, 
        JOptionPane.PLAIN_MESSAGE, 
        null, 
        Animales.especies, 
        Animales.especies[0]
        );
        String opcionStr = Animales.especies[opcion];
        return opcionStr;
    }
}