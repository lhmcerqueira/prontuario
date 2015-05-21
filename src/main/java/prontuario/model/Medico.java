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
public class Medico {
   
	@Id
    @GeneratedValue
	private int id;
	private String nome;
	private String especialidade;
	private boolean disponivel;
	private String email;
	private String senha;
	private String telefone;
	private String endereco;
	
    @Enumerated(EnumType.STRING)
    @Column(name = "user_role")
    private Role role;
	
	public Medico() {
		
	}

	
	public Medico(int id, String nome, String especialidade,
			boolean disponivel, String email, String senha, String telefone, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.especialidade = especialidade;
		this.disponivel = disponivel;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
		this.endereco = endereco;
	}


	public int getId() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public boolean getDisponivel() {
		return disponivel;
	}

	public void setAgenda(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public String getEmail() {
		return email;
	}

	public void setLogin(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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


	public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Medico){
            Medico medico = (Medico) object;
            return medico.id == id;
        }

        return false;
    }
    
    @Override
    public int hashCode() {
        return id;
    }
}
