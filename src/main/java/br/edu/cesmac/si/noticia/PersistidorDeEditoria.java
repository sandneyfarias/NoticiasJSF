package br.edu.cesmac.si.noticia;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.edu.cesmac.si.noticia.JPA.JpaUtil;
import br.edu.cesmac.si.noticia.domain.Editoria;

public class PersistidorDeEditoria {
	public static void main(String[] args) {
		EntityManager em = JpaUtil.getEntityManager();

		Editoria editoria = new Editoria();
		editoria.setNome("Editoria JPA II");
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(editoria);
		tx.commit();
		em.close();
	}
}
