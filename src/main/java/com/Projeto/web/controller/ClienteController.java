package com.Projeto.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ClienteController {
	@GetMapping("/")
	public String home() {
		return "/cliente";
	}

}
