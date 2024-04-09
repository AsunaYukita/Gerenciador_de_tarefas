package Model;
import java.util.ArrayList;
import java.util.List;

import Model.Usuario;
import Model.Tarefa_java;
import Model.Membro_equipe;
public class Usuario {

	
	    private List<Usuario> usuarios = new ArrayList<>();
	 private String Nome, ID, descricao , prazo;
	 public void adicionarUsuario(Usuario usuario) {
	        usuarios.add(usuario);
	    	}
	 public Usuario buscarUsuario(String Nome, String ID) {
	        for (Usuario usuarios : usuarios) {
	            if (usuarios.getNome().equals(ID)) {
	                return usuario;
	            }else {
	            	
	        }
	        return null;
	public Usuario (String Nome, String ID, String prazo)	{
		this.Nome = Nome;
		this.ID = ID;
		this.prazo = prazo;		
	}
		
	        	}
	 }
	 
}

	        
	        
