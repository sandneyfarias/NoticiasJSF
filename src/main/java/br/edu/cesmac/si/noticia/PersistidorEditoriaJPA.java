package br.edu.cesmac.si.noticia;

import java.util.List;

import br.edu.cesmac.si.noticia.domain.Editoria;
import br.edu.cesmac.si.noticia.repository.EditoriaJpa;

public class PersistidorEditoriaJPA {
	
	public static void main(String[] args) {
		EditoriaJpa jpaEditoriaDAO = new EditoriaJpa();

		Editoria editoria = new Editoria();
		editoria.setNome("teste");
		
		jpaEditoriaDAO.cadastrar(editoria);
		
		List<Editoria> editorias = jpaEditoriaDAO.listar();

		for (Editoria e : editorias) {
			System.out.println("Editoria " + e.getNome());
		}

	}

}
