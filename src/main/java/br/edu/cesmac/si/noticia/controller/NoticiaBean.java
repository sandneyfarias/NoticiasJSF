package br.edu.cesmac.si.noticia.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.edu.cesmac.si.noticia.domain.Noticia;
import br.edu.cesmac.si.noticia.repository.NoticiaJpa;


@ManagedBean
public class NoticiaBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private Noticia editoria = new Noticia();
	private List<Noticia> editorias;

	public void salvar(Noticia editoria) {
		new NoticiaJpa().cadastrar(editoria);
	}

	public List<Noticia> getLista() {
		editorias = new NoticiaJpa().listar();
		return editorias;
	}
	
	public void remover(Noticia editoria) {
		new NoticiaJpa().remover(editoria);
	}
	
	public Noticia getNoticia() {
		return editoria;
	}

	public void setNoticia(Noticia editoria) {
		this.editoria = editoria;
	}

}