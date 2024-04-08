package Model;

public class Usuario {
	 private String Nome, ID, descricao , prazo, Senha;
	 private boolean EstaLogado = false;	
	public Usuario (String Nome, String ID, String prazo, String Senha, String CPF )	{
		this.Nome = Nome;
		this.ID = ID;
		this.prazo = prazo;		
		this.Senha = Senha;
	}
	
	public String getEmail() {
		return this.Email;
	}
	public String getSenha() {
	return this.Senha;	
		}
}
