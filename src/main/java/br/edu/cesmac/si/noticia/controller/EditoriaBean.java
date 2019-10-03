package br.edu.cesmac.si.noticia.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.edu.cesmac.si.noticia.domain.Editoria;
import br.edu.cesmac.si.noticia.repository.EditoriaJpa;


@ManagedBean
public class EditoriaBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private Editoria editoria = new Editoria();
	private List<Editoria> editorias;

	public void salvar(Editoria editoria) {
		new EditoriaJpa().cadastrar(editoria);
	}

	public List<Editoria> getLista() {
		editorias = new EditoriaJpa().listar();
		return editorias;
	}
	
	public void remover(Editoria editoria) {
		new EditoriaJpa().remover(editoria);
	}
	
	public Editoria getEditoria() {
		return editoria;
	}

	public void setEditoria(Editoria editoria) {
		this.editoria = editoria;
	}

}