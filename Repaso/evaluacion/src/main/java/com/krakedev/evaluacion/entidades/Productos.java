package com.krakedev.evaluacion.entidades;

import java.math.BigDecimal;

public class Productos {

	private String id;
	private String nombre;
	private BigDecimal precioVenta;
	private BigDecimal precioCompra;
	private Categoria categoria_id;

	public Productos() {

	}

	public Productos(String id, String nombre, BigDecimal precioVenta, BigDecimal precioCompra,
			Categoria categoria_id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precioVenta = precioVenta;
		this.precioCompra = precioCompra;
		this.categoria_id = categoria_id;
	}
	
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	public BigDecimal getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precioCompra = precioCompra;
	}

	public Categoria getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(Categoria categoria_id) {
		this.categoria_id = categoria_id;
	}

	@Override
	public String toString() {
		return "Productos [id=" + id + ", nombre=" + nombre + ", precioVenta=" + precioVenta + ", precioCompra="
				+ precioCompra + ", categoria_id=" + categoria_id + "]";
	}

}
