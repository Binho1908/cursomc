package com.augustofabio.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController  //mostra que vai ser um controlador rest
@RequestMapping(value="/categorias")
public class CategoriaResource {
	@RequestMapping(method=RequestMethod.GET) // associando com um metodo http
	public String listar() {
		return "Rest está funcionando!";
	}
}
