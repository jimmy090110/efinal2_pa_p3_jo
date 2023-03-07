package com.example.demo.repo;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.demo.repo.modelo.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductoRepoImpl implements IProductoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarProducto(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	public void actualizarProducto(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(producto);
	}


	@Override
	public Producto buscarProductoCodigoBarras(String codigoBarras) {
		// TODO Auto-generated method stub

		TypedQuery<Producto> miTypedQuery = this.entityManager
				.createQuery("select p from Producto p where p.codigoBarras =:codigoBarras", Producto.class);
		miTypedQuery.setParameter("codigoBarras", codigoBarras);

		return miTypedQuery.getSingleResult();
	}

	@Override
	public List<Producto> listaProductos() {
		// TODO Auto-generated method stub
		TypedQuery<Producto> miTypedQuery = this.entityManager.createQuery("SELECT p from Producto p", Producto.class);

		return miTypedQuery.getResultList();
	}

}
