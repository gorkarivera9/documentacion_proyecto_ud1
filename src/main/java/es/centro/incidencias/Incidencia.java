package es.centro.incidencias;

import java.util.Locale;

/**
 * Representa una incidencia del sistema, almacenando su identificador, titulo, prioridad y estado
 *
 * @author gorka
 * @version 1.0
 * @since 1.0
 */
public final class Incidencia {

    private final String id;
    private final String titulo;
    private final String prioridad;
    private final boolean abierta;

    /**
     * Crea una incidenia con los dato indicados
     *
     * @param id
     * @param titulo
     * @param prioridad
     * @param abierta
     */
    public Incidencia(String id, String titulo, String prioridad, boolean abierta) {
        this.id = id;
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.abierta = abierta;
    }

    /**
     * Obtendremos el idenficador de la incidencia
     *
     * @return identificador de la incidencia
     */
    public String getId() {
        return id;
    }

    /**
     * Obtiene el titulo de la incidencia
     *
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene la prioridad de la incidencia
     * @return prioridad
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * Comprueba si la incidencia esta abierta
     * @return true si está abierta false cerrada
     */
    public boolean isAbierta() {
        return abierta;
    }

    /**
     * Comprueba si el texto indicado coincide con el identificador o el titulo d ela incidencia
     * @param texto el texto que querramos buscar
     * @return true si encuentra la incidencia, false sino
     */
    public boolean coincideCon(String texto) {
        String criterio = texto.toLowerCase(Locale.ROOT);
        return id.toLowerCase(Locale.ROOT).contains(criterio)
                || titulo.toLowerCase(Locale.ROOT).contains(criterio);
    }

}
