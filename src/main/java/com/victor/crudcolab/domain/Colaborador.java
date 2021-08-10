package com.victor.crudcolab.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "tb_colaborador")
public class Colaborador implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@NotEmpty(message = "Campo NOME é requerido")
	@Length(min = 3, max = 100, message = "O campo NOME deve ter entre 3 e 100 caracteres")
	private String nome;
	
	@NotEmpty(message = "Campo SOBRENOME é requerido")
	@Length(min = 3, max = 100, message = "O campo SOBRENOME deve ter entre 3 e 100 caracteres")
	private String sobrenome;
	
	@NotEmpty(message = "Campo CARGO é requerido")
	@Length(min = 3, max = 50, message = "O campo NOME deve ter entre 3 e 50 caracteres")
	private String cargo;
	
	@NotEmpty(message = "Campo DATA DE NASCIMENTO é requerido")
	@Length(min = 10, max = 10, message = "O campo DATA DE NASCIMENTO deve ter 10 caracteres")
	private String dataDeNascimento;
	
	@NotEmpty(message = "Campo ENDEREÇO é requerido")
	@Length(min = 3, max = 100, message = "O campo ENDEREÇO deve ter entre 3 e 100 caracteres")
	private String endereco;
	
	
	public Colaborador() {
		super();
	}
	
	public Colaborador(Long id, String nome, String sobrenome, String cargo, String dataDeNascimento, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cargo = cargo;
		this.dataDeNascimento = dataDeNascimento;
		this.endereco = endereco;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Colaborador other = (Colaborador) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Colaborador [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", cargo=" + cargo
				+ ", dataDeNascimento=" + dataDeNascimento + ", endereco=" + endereco + "]";
	}
}
