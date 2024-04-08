package Controller;
import java.util.ArrayList;
import java.util.UUID;
import Model.Usuario;

public class Usuario_controller {
	private ArrayList<Usuario>usuarios;
	Usuario usuario = new Usuario(null, null, null, null, null);


	public String CriarUsuario(
			String Nome, String CPF, 
			String Celular, String Senha, String Email) 	{
			Usuario usuarioNovo = new Usuario(CPF, Senha, Nome, Celular, Email);
		usuarios.add(usuarioNovo);
		return "Usuario cadastrado";
		}
	
	public String Autenticacao(String email, String senha) {
		if(usuario.getEmail() == email && usuario.getSenha() == senha) {
			return "Autenticado";
		} else {
			return "Não autenticado";
		}
		
	}	
}
	
	
	
	
