package Model;

import Model.Usuario;

public class Tarefa_java {
	protected String IdProjeto, Status;
	protected String ID;
	    protected String descricao;
	    protected String Nome;
	    protected String prazo;
	    

public Tarefa_java(String IdProjeto, String Status, String descricao,String ID, String prazo) {
	this.IdProjeto= IdProjeto;
	this.Status=Status;
	this.descricao= descricao;
	this.ID = ID;
	this.prazo = prazo;
}
public String getID() {
    return ID;
	}

public void setID(String ID) {
    this.ID = ID;
	}

public String getIdProjeto() {
    return IdProjeto;
	}

public void setIdProjeto(String IdProjeto) {
    this.IdProjeto = IdProjeto;
	}

public String getStatus() {
    return Status;
	}

public void setStatus(String Status) {
    this.Status = Status;
	}
public String getdescricao() {
	return descricao;
	}
public void setdescricao () {
 this.descricao= descricao; 
}

public String getNome() {
    return Nome;
	}
public void setNome() {
	this.Nome = Nome;
	}

public String getprazo() {
	return prazo;
	}
public void setprazo () {
	this.prazo = prazo;
	}

}