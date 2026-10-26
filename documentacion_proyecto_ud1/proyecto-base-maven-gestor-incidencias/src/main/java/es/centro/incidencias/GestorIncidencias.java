package es.centro.incidencias;

import java.util.List;

/**
 * Gestiona las incidencias del sitama y permite listarlas y buscarlas
 *
 * @author gorka
 * @version 1.0
 * @since 1.0
 */

public final class GestorIncidencias {

    private final List<Incidencia> incidencias;

    /**
     * Crea un gestor con una lista inicial de incidencias
     */
    public GestorIncidencias() {
        incidencias = List.of(
                new Incidencia("INC-001", "No se puede iniciar sesión", "alta", true),
                new Incidencia("INC-002", "Actualizar el navegador", "media", false),
                new Incidencia("INC-003", "Impresora sin conexión", "baja", true),
                new Incidencia("INC-004", "Fallo de red en el aula", "alta", true)
        );
    }

    /**
     * Obtiene todas las incidencias registradas.
     *
     * @return lista de todas las incidencias
     */
    public List<Incidencia> listar() {
        return incidencias;
    }

    /**
     * Obtierne las incidencias que estan abiertas
     * @return lista de incidencias abiertas
     */
    public List<Incidencia> listarAbiertas() {
        return incidencias.stream()
                .filter(Incidencia::isAbierta)
                .toList();
    }
    /**
     * Busca lincidencias cuyo identificador o titulo contenga el texto indicado
     *
     * @param texto texto que se utiliza para realizar la búsqueda
     * @return lista de todas las incidencias
     */
    public List<Incidencia> buscar(String texto) {
        return incidencias.stream()
                .filter(incidencia -> incidencia.coincideCon(texto))
                .toList();
    }

    /**
     * Busca una incidencia mediante su id, sin distinguir de mayusculas y minusculas
     *
     * @param id Lo que se desea buscar
     * @return incidencia correspondiente al id
     * @throws IncidenciaNoEncontradaException sino existe una incidencia con ese id
     */
    public Incidencia buscarPorId(String id) throws IncidenciaNoEncontradaException {
        return incidencias.stream()
                .filter(incidencia -> incidencia.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new IncidenciaNoEncontradaException(id));
    }

    /**
     * Obtiene una incidencia a partir de su id
     * @param id lo que deseamos obtener
     * @return incidencia encontrada o null sino existe
     * @deprecated desde la version 1.0.0; utilizar{@link  #buscarPorId(String)} en su lugar,
     * ya que informa mediante una excepcion cuando no la encuentra
     */
    @Deprecated(since = "1.0.0", forRemoval = false)
    public Incidencia obtenerIncidencia(String id) {
        try {
            return buscarPorId(id);
        } catch (IncidenciaNoEncontradaException excepcion) {
            return null;
        }
    }
}
