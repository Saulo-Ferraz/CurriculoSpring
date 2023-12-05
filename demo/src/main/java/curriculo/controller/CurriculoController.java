package curriculo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import curriculo.model.Curriculo;
import curriculo.service.CurriculoService;

import java.util.List;

@RestController
@RequestMapping("/curriculos")
public class CurriculoController {
    @Autowired
    private CurriculoService curriculoService;

    @GetMapping
    public List<Curriculo> listarCurriculos() {
        return curriculoService.listarCurriculos();
    }

    @GetMapping("/{id}")
    public Curriculo obterCurriculo(@PathVariable Long id) {
        return curriculoService.obterCurriculoPorId(id);
    }

    @PostMapping
    public Curriculo criarCurriculo(@RequestBody Curriculo curriculo) {
        return curriculoService.criarCurriculo(curriculo);
    }

    @PutMapping("/{id}")
    public Curriculo atualizarCurriculo(@PathVariable Long id, @RequestBody Curriculo curriculo) {
        return curriculoService.atualizarCurriculo(id, curriculo);
    }

    @DeleteMapping("/{id}")
    public void deletarCurriculo(@PathVariable Long id) {
        curriculoService.deletarCurriculo(id);
    }
}

