package Model;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

	
	    private List<Usuario> usuarios = new ArrayList<>();
	 private String Nome, ID, descricao , prazo;
	 public void adicionarUsuario(Usuario usuario) {
	        usuarios.add(usuario);
	    	}
	         
	public Usuario (String Nome, String ID, String prazo, String descricao)	{
		this.Nome = Nome;
		this.ID = ID;
		this.prazo = prazo;
		this.descricao = descricao;
		
	}
	
	public String getID() {
	    return ID;
		}

	public void setID(String ID) {
	    this.ID = ID;
		}
	
	public String getNome() {
		return Nome;
	}
	
    public void setNome(String Nome) {
    	this.Nome = Nome;
    }
    
    public String getprazo() {
    	return prazo;
    }
    
    public void setprazo(String prazo) {
    	this.prazo = prazo;
    }
    
    public String getdescricao() {
    	return descricao;
    }
    
    public void setdescricao(String descricao) {
    	this.descricao = descricao;
    }
    
    
}
	
	        
	        
