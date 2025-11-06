package alumnos.alumnos.service;

import alumnos.alumnos.entity.Asesoria;
import alumnos.alumnos.repository.AsesoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AsesoriaServiceImpl implements AsesoriaService {

    private final AsesoriaRepository asesoriaRepository;

    @Override
    public Asesoria agendarAsesoria(Asesoria asesoria) {
        return asesoriaRepository.save(asesoria);
    }

    @Override
    public List<Asesoria> listarAsesorias() {
        return asesoriaRepository.findAll();
    }
}
