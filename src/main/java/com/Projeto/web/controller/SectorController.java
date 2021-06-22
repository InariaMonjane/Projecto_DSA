package com.Projeto.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SectorController {
	@GetMapping("/")
	public String home() {
		return "/sector";
	}
}
