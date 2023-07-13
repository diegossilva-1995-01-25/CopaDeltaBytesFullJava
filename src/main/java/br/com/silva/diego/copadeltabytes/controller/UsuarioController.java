package br.com.silva.diego.copadeltabytes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/copadeltabytes/usuario")
public class UsuarioController {
	
	@PostMapping("/salvar")
    public String menuPageUsuarioSalvar(Model model) {
        return "menu";
    }
	
	@PostMapping("/alterar")
    public String menuPageUsuarioAlterar(Model model) {
        return "menu";
    }
	
	@PostMapping("/excluir")
    public String menuPageUsuarioExcluir(Model model) {
        return "menu";
    }
	
	@GetMapping("/ver")
    public String menuPageUsuarioVer(Model model) {
        return "usuario";
    }
	
}
