package br.edu.cesmac.si.noticia.repository;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.cesmac.si.noticia.JPA.JpaUtil;
import br.edu.cesmac.si.noticia.domain.Editoria;

public class EditoriaJpa {

	public void cadastrar(Editoria editoria) {
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(editoria);
		em.getTransaction().commit();
		em.close();
	}
	
	public void alterar(Editoria editoria) {
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(editoria);
		em.getTransaction().commit();
		em.close();
	}	

	public void remover(Editoria editoria) {
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(editoria);
		em.getTransaction().commit();
		em.close();
	}	
	
	public List<Editoria> listar() {
		EntityManager em = JpaUtil.getEntityManager();

		List<Editoria> editorias = em.createQuery("select e from editoria e").getResultList();
		em.close();
		
		System.out.println("Lá");
		
		return editorias;
	}

}
