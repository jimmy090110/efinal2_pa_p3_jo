package com.example.demo.repo;



import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Inventario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;



@Repository
@Transactional
public class InventarioRepoImpl implements IInventarioRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crearInventario(Inventario inventario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(inventario);
	}

	@Override
	public void actualizaInventario(Inventario inventario) {
		// TODO Auto-generated method stub
		this.entityManager.merge(inventario);
	}



	@Override
	public Inventario buscarInventario(Integer id) {
		// TODO Auto-generated method stub
	
		return 	this.entityManager.find(Inventario.class, id);
	}

	@Override
	public Inventario buscarCodigoBarras(String codigoBarrasIndividual) {
		// TODO Auto-generated method stub
		TypedQuery<Inventario> miTypedQuery = this.entityManager.createQuery("select v from Inventario v where v.codigoBarrasIndividual=:codigoBarrasIndividual", Inventario.class);
		miTypedQuery.setParameter("codigoBarrasIndividual", codigoBarrasIndividual);
		return miTypedQuery.getSingleResult();
	}





	


}
