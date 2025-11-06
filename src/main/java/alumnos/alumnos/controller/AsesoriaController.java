package alumnos.alumnos.controller;

import alumnos.alumnos.entity.Asesoria;
import alumnos.alumnos.service.AsesoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asesorias")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class AsesoriaController {

    private final AsesoriaService asesoriaService;

    @PostMapping("/agendar")
    public Asesoria agendar(@RequestBody Asesoria asesoria) {
        return asesoriaService.agendarAsesoria(asesoria);
    }

    @GetMapping("/listar")
    public List<Asesoria> listar() {
        return asesoriaService.listarAsesorias();
    }
}
