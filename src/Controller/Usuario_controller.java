package Controller;
import java.lang.reflect.Array;

import java.util.ArrayList;
import java.util.UUID;
import Model.Usuario;
import Model.Tarefa_java;
public class Usuario_controller { 
	private ArrayList<Tarefa_java> tarefas = new ArrayList<>();
    private ArrayList<Usuario> usuarios1 = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario) {
        usuarios1.add(usuario);
    }
	private Usuario usuarios;

	 public  Usuario criarProjeto(String tipo, Usuario titular) {
	        String numeroID = UUID.randomUUID().toString(); // Gera um número de ID
	        Usuario novaConta;
			Usuario IdProjeto = null;
			return IdProjeto;
	 }
	





}
	
