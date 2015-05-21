package prontuario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medico")
public class Funcionario {
	
	@Id
    @GeneratedValue
	private String id;
	private String nome;
	private String senha;
	private String email;
	private String telefone;
	private String endereco;
    
	@Enumerated(EnumType.STRING)
    @Column(name = "user_role")
    private Role role;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String id, String nome, String senha, String email,
			String telefone, String endereco) {
		super();
		id = id;
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	


}
