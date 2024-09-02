package br.com.horario_docente.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/")
	public String principal()
	{
		return "principal";
	}
	@GetMapping("/principal")
	public String home()
	{
		return "principal";
	}	
}
