package br.com.alura.forum.controller;

import br.com.alura.forum.controller.dto.TopicoDto;
import model.Curso;
import model.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {
    @RequestMapping("/topicos")

    public List<TopicoDto> lista (){
        Topico topico = new Topico("Dúvidas", "Dúvidas Springboot", new Curso("Spring", "Programação"));

        return Arrays.asList(topico,topico,topico);
    }

}
