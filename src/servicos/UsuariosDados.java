package servicos;

import java.util.ArrayList;
import java.util.List;

import enums.PerfisEnum;
import model.Disponibilidade;
import model.Usuario;
import model.Voluntaria;

public class UsuariosDados {
	private static List<Usuario> usuarios = new ArrayList<>();
	private static Usuario usuarioLogado;
	
	
	
	public UsuariosDados() {
		if (usuarios.isEmpty()) {
			Usuario gestor = new Usuario("Ana", "ana@email.com", "123", "000.000.000-00", PerfisEnum.GESTOR);
			cadastraUsuario(gestor);
			
			Disponibilidade disponibilidade = new Disponibilidade(true, false, false);
			Voluntaria voluntario = new Voluntaria("Maria", "maria@email.com","123", "001.000.000-00", disponibilidade);
			cadastraUsuario(voluntario);
			
			Usuario funcionario = new Usuario("Bia", "bia@email.com", "123", "012.345.678-99", PerfisEnum.FUNCIONARIO);
			cadastraUsuario(funcionario);
		}
	}
	
	
	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}

	public void setUsuarioLogado(Usuario usuarioLogado) {
		UsuariosDados.usuarioLogado = usuarioLogado;
	}


	public Usuario buscaPorEmail(String email) {
		for (Usuario usuario: usuarios) {
			if(email.equals(usuario.getEmail())) {
				return usuario;
			} 				
		}
		return null;
	}
	
	public boolean validaLogin(String email, String senha) {
		Usuario retorno = buscaPorEmail(email);
		if (retorno == null) {
			return false;
		} else {
			return retorno.getSenha().equals(senha);			
		}			
	}
	
	public void cadastraUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public void removerUsuario(Usuario usuario) {
		usuarios.remove(usuario);
	}
	
	public List<Usuario> buscaPorPerfil(PerfisEnum perfil) {
		List<Usuario> usuariosFiltrados = new ArrayList<>();
		for (Usuario usuario: usuarios) {
			if (usuario.getPerfil().equals(perfil)) {
				usuariosFiltrados.add(usuario);
			}
		}
		return usuariosFiltrados;		
	}
	
	
}


