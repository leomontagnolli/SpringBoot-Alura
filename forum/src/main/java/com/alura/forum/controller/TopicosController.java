package com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alura.forum.controller.dto.TopicoDto;
import com.alura.forum.model.Curso;
import com.alura.forum.model.Topico;
import com.alura.forum.repository.TopicoRepository;

@RestController
@RequestMapping("/topicos")
public class TopicosController {
	
	@Autowired
	private TopicoRepository topicoRepository;
	
	
	@GetMapping
	public List<TopicoDto> listar () {
		List<Topico> topicos = topicoRepository.findAll();
		
		return TopicoDto.converter(topicos);
		
		
		
	}
	
	
}
