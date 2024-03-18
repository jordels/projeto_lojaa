package jordelsondev.projeto.loja.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "marca_produto") // AQUI É CRIADA A TABELA COM SEU NOME

// USA ESTÁ ANOTAÇÃO @SequenceGenerator PARA O PRODUTO SER CADASTRADO EM SEQUENCIA NO BANCO DE UM EM UM...
@SequenceGenerator(name = "sequenc_marca_produto", sequenceName = "sequenc_marca_produto", allocationSize = 1, initialValue = 1)

public class marcaProduto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenc_marca_produto")
	private long id;

	private String nomeDesc;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeDesc() {
		return nomeDesc;
	}

	public void setNomeDesc(String nomeDesc) {
		this.nomeDesc = nomeDesc;
	}

}
