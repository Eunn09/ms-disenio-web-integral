package alumnos.alumnos.service;

import alumnos.alumnos.entity.Asesoria;
import java.util.List;

public interface AsesoriaService {
    Asesoria agendarAsesoria(Asesoria asesoria);
    List<Asesoria> listarAsesorias();
}
