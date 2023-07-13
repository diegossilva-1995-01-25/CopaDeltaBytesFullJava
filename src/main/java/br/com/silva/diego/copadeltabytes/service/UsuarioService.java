package br.com.silva.diego.copadeltabytes.service;

import org.springframework.stereotype.Service;

import br.com.silva.diego.copadeltabytes.domain.Usuario;

@Service
public class UsuarioService {
	
	public void criarUsuario(Usuario usuario) {
		System.out.println("Usuário criado: " + usuario.getEmail());
	}
	
	public void atualizarUsuario(Usuario usuario) {
		System.out.println("Usuário atualizado: " + usuario.getEmail());
	}

	public void alterarSenhaUsuario(Usuario usuario) {
		System.out.println("Senha alterada: " + usuario.getEmail());
	}
	
	public void deletarUsuario(Usuario usuario) {
		System.out.println("Usuário deletado: " + usuario.getEmail());
	}
	
	public void buscarUsuario(Usuario usuario) {
		System.out.println("Usuário encontrado: " + usuario.getEmail());
	}
	
	public void listarUsuario(Usuario usuario) {
		System.out.println("Usuários: " + usuario.getEmail());
	}
	
}
