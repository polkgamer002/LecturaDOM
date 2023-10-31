
import java.io.File;

public class UsaAccesoDOM {

    public static void main(String[] args) {
       File archivoXML = new File("Libros.xml"); // Ruta al archivo XML
        AccesoDOM accesoDOM = new AccesoDOM(); // Instancia de la clase AccesoDOM
        int resultado = accesoDOM.abriXMLaDOM(archivoXML); // Abrir el archivo XML
        
        if (resultado == 0) {
            System.out.println("Recorriendo el árbol DOM y mostrando la información de los nodos:");
            accesoDOM.recorreDOMyMuestra(); // Mostrar información de los nodos
        } else {
            System.out.println("Error al abrir el archivo XML.");
        }
    }
        
    }
