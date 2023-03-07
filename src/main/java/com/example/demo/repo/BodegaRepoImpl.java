package com.example.demo.repo;

import java.util.List;



import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Bodega;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class BodegaRepoImpl implements IBodegaRepo{

	@PersistenceContext
	private EntityManager entityManager;


	@Override
	public void insertarBodega(Bodega bodega) {
		// TODO Auto-generated method stub
				this.entityManager.persist(bodega);
		
	}

	@Override
	public void actualizarBodega(Bodega bodega) {
		// TODO Auto-generated method stub
		this.entityManager.merge(bodega);
		
	}


	
	
}
