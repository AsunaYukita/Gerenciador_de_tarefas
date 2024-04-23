package Controller;

import java.util.ArrayList;

import Model.Membro_equipe;

public class Projeto_controller {
	private ArrayList<Membro_equipe> projeto = new ArrayList<Membro_equipe>();
	
	public void adicionarProjeto (Membro_equipe membros_equipe) {
		projeto.add(membros_equipe);
	}
}
