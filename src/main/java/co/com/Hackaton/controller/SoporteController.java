package co.com.Hackaton.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("soporte")
public class SoporteController {

	@GetMapping
	public String inicio() {
		return "soporte";
	}
}
