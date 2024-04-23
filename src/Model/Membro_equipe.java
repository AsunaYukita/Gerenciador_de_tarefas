package Model;
import Model.Usuario;
public class Membro_equipe {
	protected String ID;
	protected String Nome;
	protected String Email;
	protected String Usuario (String Nome, String ID, String Email) {
		this.Nome = Nome;
		this.ID = ID;
		return this.Email = Email;
	}
	
	  // Getters e Setters
    public String getNome() {
        return Nome;
    	}

    public void setNome(String Nome) {
        this.Nome = Nome;
    	}
    public String getID() {
    	return ID;
    	}
    public void setID(String ID) {
    	this.ID= ID;
    	}
    public String getEmail() {
    	return Email;
    	}
    public void setEmail(String Email) {
    	this.Email = Email;
    	}
}
	















}





