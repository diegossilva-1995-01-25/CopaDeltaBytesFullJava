package br.com.silva.diego.copadeltabytes.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.silva.diego.copadeltabytes.domain.Usuario;
import br.com.silva.diego.copadeltabytes.service.UsuarioService;

@Controller
@RequestMapping("/copadeltabytes/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping(value = "/salvar", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public String menuPageUsuarioSalvar(Model model, @RequestParam Map<String, String> body) {
		Usuario usuario = new Usuario();
		usuario.setEmail(body.get("txtEmail"));
		
		if(body.get("txtSenha").equals(body.get("txtConfirmarSenha"))) {
			usuario.setSenha(body.get("txtSenha"));
			usuarioService.criarUsuario(usuario);
	        return "menu";
		} else {
			return "login";
		}
		
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
