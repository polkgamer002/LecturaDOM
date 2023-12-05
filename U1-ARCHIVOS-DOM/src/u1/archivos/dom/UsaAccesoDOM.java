package u1.archivos.dom;

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

        //Abre el XML y carga el archivo DOM
        int resultadoApertura = accesoDOM.abriXMLaDOM(archivoXML);

        //Verifica si el archivo se abrió
        if (resultadoApertura == 0) {
            // Título del libro que deseas borrar, en este caso el libro de la jungla
            String tituloABorrar = "El Libro de la Jungla"; 

            //Llama al método para borrar el nodo
            int resultadoBorrado = accesoDOM.deleteNode(tituloABorrar);

            //Comprueba si el nodo se borró
            if (resultadoBorrado == 0) {
                System.out.println("Nodo con título '" + tituloABorrar + "' borrado exitosamente.");
            } else {
                System.out.println("No se pudo borrar el nodo.");
            }

        } else {
            System.out.println("Error al abrir el archivo XML.");
        }
    }
    
}
