package br.com.aldtech.sistema.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.aldtech.sistema.dao.UserDAO;
import br.com.aldtech.sistema.model.User;

@Stateless
public class UserService {

	@Inject
	private UserDAO userDAO;
	
	public User findOne(Integer id) {
		return userDAO.findOne(id);
	}
	
	public List<User> findAll() {
		return userDAO.findAll();
	}
	
	public void create(User user) {
		userDAO.persist(user);
	}
	
	public void update(User user) {
		userDAO.merge(user);
	}
	
	public void delete(Integer id) {
		userDAO.deleteById(id);
	}
	
	
	
}
