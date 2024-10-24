package com.krakedev.evaluacion.entidades;

import java.util.Date;

public class HistorialMovimientos {

	private int id;
	private Productos producto_id;
	private int cantidad;
	private Date fecha_movimiento;

	public HistorialMovimientos() {

	}

	public HistorialMovimientos(int id, Productos producto_id, int cantidad, Date fecha_movimiento) {
		super();
		this.id = id;
		this.producto_id = producto_id;
		this.cantidad = cantidad;
		this.fecha_movimiento = fecha_movimiento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Productos getProducto_id() {
		return producto_id;
	}

	public void setProducto_id(Productos producto_id) {
		this.producto_id = producto_id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha_movimiento() {
		return fecha_movimiento;
	}

	public void setFecha_movimiento(Date fecha_movimiento) {
		this.fecha_movimiento = fecha_movimiento;
	}

	@Override
	public String toString() {
		return "HistorialMovimientos [id=" + id + ", producto_id=" + producto_id + ", cantidad=" + cantidad
				+ ", fecha_movimiento=" + fecha_movimiento + "]";
	}

}
