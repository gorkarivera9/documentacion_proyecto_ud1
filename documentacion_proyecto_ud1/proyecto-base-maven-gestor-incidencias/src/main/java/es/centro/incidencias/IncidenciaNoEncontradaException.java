package es.centro.incidencias;
/**
 * Excepción que se lanzaa cuando no se encuentra una incidencia con el identificador especificado.
 *
 * @author gorka
 * @version 1.0
 * @since 1.0
 * */
public class IncidenciaNoEncontradaException extends Exception {
    /**
     * Crea una excepcion indicando el identificador de la incidencia que no se ha encontrado
     *
     * @param id es el identificador de la incidencia que no se encuentra
     */
    public IncidenciaNoEncontradaException(String id) {
        super("No existe ninguna incidencia con el identificador " + id + ".");
    }
}
