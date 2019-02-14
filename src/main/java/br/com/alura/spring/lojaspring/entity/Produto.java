package br.com.alura.spring.lojaspring.entity;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Produto {
	
	private int id;
	
	@NotBlank
	@Size(min=3, max=50)
	private String titulo;
	
	@NotBlank
	@Size(min=10, max=200, message="Campo requerido entre {min} e {max} caracteres.")
	private String descricao;
	
	private int paginas;
	
	@NotNull(message="Esse campo não pode ser nulo.")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate dataPublicacao;
	private TipoStatus status;
	
	public TipoStatus getStatus() {
		return status;
	}
	public void setStatus(TipoStatus status) {
		this.status = status;
	}
	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", paginas=" + paginas
				+ ", dataPublicacao=" + dataPublicacao + ", status=" + status + "]";
	}
	
}
