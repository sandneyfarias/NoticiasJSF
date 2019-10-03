package br.edu.cesmac.si.noticia.repository;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.cesmac.si.noticia.JPA.JpaUtil;
import br.edu.cesmac.si.noticia.domain.Noticia;

public class NoticiaJpa {

	public void cadastrar(Noticia noticia) {
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(noticia);
		em.getTransaction().commit();
		em.close();
	}
	
	public void alterar(Noticia noticia) {
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(noticia);
		em.getTransaction().commit();
		em.close();
	}	

	public void remover(Noticia noticia) {
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		noticia = em.merge(noticia);
		em.remove(noticia);
		em.getTransaction().commit();
		em.close();
	}	
	
	public List<Noticia> listar() {
		EntityManager em = JpaUtil.getEntityManager();

		List<Noticia> noticias = em.createQuery("select n from noticia n").getResultList();
		em.close();
		
		return noticias;
	}

}
