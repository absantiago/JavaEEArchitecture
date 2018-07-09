package br.com.aldtech.sistema.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.aldtech.sistema.dao.PedidoDAO;
import br.com.aldtech.sistema.model.Pedido;

@Stateless
public class PedidoService {
	
	@Inject 
	private PedidoDAO pedidoDAO;
	
	public Pedido findOne(Integer id) {
		return pedidoDAO.findOne(id);
	}
	
	public List<Pedido> findAll() {
		return pedidoDAO.findAll();
	}
	
	public void create(Pedido pedido) {
		pedidoDAO.persist(pedido);
	}
	
	public void update(Pedido pedido) {
		pedidoDAO.merge(pedido);
	}
	
	public void delete(Integer id) {
		pedidoDAO.deleteById(id);
	}
}
