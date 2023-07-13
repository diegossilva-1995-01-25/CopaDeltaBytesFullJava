package br.com.silva.diego.copadeltabytes.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/copadeltabytes")
public class MainController {
	@Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "login";
    }
    
    @GetMapping("/home")
    public String homePageTeste(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }
    
    @GetMapping("/login")
    public String homePageSecundario(Model model) {
    	model.addAttribute("appName", appName);
        return "login";
    }
    
    @PostMapping("/login")
    public String menuPagePostLogin(Model model) {
    	model.addAttribute("appName", appName);
        return "menu";
    }
    
    @GetMapping("/usuario")
    public String usuarioPage(Model model) {
        model.addAttribute("appName", appName);
        return "usuario";
    }
    
    @GetMapping("/campeonato")
    public String campeonatoPage(Model model) {
        model.addAttribute("appName", appName);
        return "campeonato";
    }
    
    @GetMapping("/confronto")
    public String confrontoPage(Model model) {
        model.addAttribute("appName", appName);
        return "confronto";
    }
    
    @GetMapping("/trocarsenha")
    public String trocarsenhaPage(Model model) {
        model.addAttribute("appName", appName);
        return "trocarsenha";
    }
    
    @GetMapping("/jogador")
    public String jogadorPage(Model model) {
        model.addAttribute("appName", appName);
        return "jogador";
    }
    
    @GetMapping("/esquecisenha")
    public String esquecisenhaPage(Model model) {
        model.addAttribute("appName", appName);
        return "esquecisenha";
    }
    
    @GetMapping("/menu")
    public String menuPage(Model model) {
        model.addAttribute("appName", appName);
        return "menu";
    }
    
    @GetMapping("/resetsenha")
    public String resetsenhaPage(Model model) {
        model.addAttribute("appName", appName);
        return "resetsenha";
    }
    
    @GetMapping("/listajogador")
    public String listajogadorPage(Model model) {
        model.addAttribute("appName", appName);
        return "listajogador";
    }
    
    @GetMapping("/listacampeonato")
    public String listacampeonatoPage(Model model) {
        model.addAttribute("appName", appName);
        return "listacampeonato";
    }
    
    @GetMapping("/chaveamento")
    public String resetsenhaPage(Model model, @RequestParam int jogadores) {
        model.addAttribute("appName", appName);
        return "chaveamento" + jogadores;
    }
    
}
