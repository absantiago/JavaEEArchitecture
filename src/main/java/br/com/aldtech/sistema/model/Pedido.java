package br.com.aldtech.sistema.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pedidos")
public class Pedido implements java.io.Serializable {
 
 private static final long serialVersionUID = 1L;
 @Id
 private Long id;
 private String descricao;
 private double total;
 private Calendar dataPedido;
 
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public Calendar getDataPedido() {
	return dataPedido;
}
public void setDataPedido(Calendar dataPedido) {
	this.dataPedido = dataPedido;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
}