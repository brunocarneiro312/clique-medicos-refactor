package main.java.com.hepta.cliquemedicos.persistence;

import main.java.com.hepta.cliquemedicos.entity.Servico;

import javax.persistence.EntityManager;
import java.io.Serializable;


/**
 * 
 * Classe que faz acesso à entidade Servico
 * 
 * @author bruno.carneiro
 *
 */
public class ServicoDAO extends SuperDAO<Servico, Serializable> {

	private EntityManager em;
	
	public ServicoDAO() throws Exception {
		this.em = HibernateUtil.getEntityManager();
	}
	
	/**
	 * 
	 * Busca um serviço por id
	 * 
	 * @param id
	 * @return
	 * @throws Exception 
	 */
	//TODO usar apenas o find da superDAO andressa.valadares
	public Servico findOne(Integer id) throws Exception {
		Servico obj = null;
		try {
			obj = this.em.find(Servico.class, id);
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new Exception(e);
		} finally {
			em.close();
		}
		return obj;
	}
	
	
}
