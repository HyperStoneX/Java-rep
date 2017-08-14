package com.natclar.finanzas.model.fiProceso;

public class ProcesoPrestacionDetalle {

	private Integer iIdProcesoPrestacionDetalle;

	private Integer iIdProcesoPrestacion;

	private String vcIdProceso;

	private String vcNumero;

	private String vcIdPerfil;

	private Double nuPrecio;

	private Double nuPrecioNeto;

	private Integer iIdEstado;

	private Integer iIdValorizacion;

	private Integer iIdEstadoValorizacion;
	
	private Integer iIdEstadoCosteo;

	private String vcUsuarioApp;
	private String vcUsuarioOT;
	private String vcIdPlanCobertura;
	
	
	public String getVcIdPlanCobertura() {
		return vcIdPlanCobertura;
	}

	public void setVcIdPlanCobertura(String vcIdPlanCobertura) {
		this.vcIdPlanCobertura = vcIdPlanCobertura;
	}

	public String getVcUsuarioApp() {
		return vcUsuarioApp;
	}

	public void setVcUsuarioApp(String vcUsuarioApp) {
		this.vcUsuarioApp = vcUsuarioApp;
	}

	public String getVcUsuarioOT() {
		return vcUsuarioOT;
	}

	public void setVcUsuarioOT(String vcUsuarioOT) {
		this.vcUsuarioOT = vcUsuarioOT;
	}

	public Integer getiIdEstadoCosteo() {
		return iIdEstadoCosteo;
	}

	public void setiIdEstadoCosteo(Integer iIdEstadoCosteo) {
		this.iIdEstadoCosteo = iIdEstadoCosteo;
	}

	public Integer getiIdProcesoPrestacionDetalle() {
		return iIdProcesoPrestacionDetalle;
	}

	public void setiIdProcesoPrestacionDetalle(Integer iIdProcesoPrestacionDetalle) {
		this.iIdProcesoPrestacionDetalle = iIdProcesoPrestacionDetalle;
	}

	public Integer getiIdProcesoPrestacion() {
		return iIdProcesoPrestacion;
	}

	public void setiIdProcesoPrestacion(Integer iIdProcesoPrestacion) {
		this.iIdProcesoPrestacion = iIdProcesoPrestacion;
	}

	public String getVcIdProceso() {
		return vcIdProceso;
	}

	public void setVcIdProceso(String vcIdProceso) {
		this.vcIdProceso = vcIdProceso;
	}

	public String getVcNumero() {
		return vcNumero;
	}

	public void setVcNumero(String vcNumero) {
		this.vcNumero = vcNumero;
	}

	public String getVcIdPerfil() {
		return vcIdPerfil;
	}

	public void setVcIdPerfil(String vcIdPerfil) {
		this.vcIdPerfil = vcIdPerfil;
	}

	public Double getNuPrecio() {
		return nuPrecio;
	}

	public void setNuPrecio(Double nuPrecio) {
		this.nuPrecio = nuPrecio;
	}

	public Double getNuPrecioNeto() {
		return nuPrecioNeto;
	}

	public void setNuPrecioNeto(Double nuPrecioNeto) {
		this.nuPrecioNeto = nuPrecioNeto;
	}

	public Integer getiIdEstado() {
		return iIdEstado;
	}

	public void setiIdEstado(Integer iIdEstado) {
		this.iIdEstado = iIdEstado;
	}

	public Integer getiIdValorizacion() {
		return iIdValorizacion;
	}

	public void setiIdValorizacion(Integer iIdValorizacion) {
		this.iIdValorizacion = iIdValorizacion;
	}

	public Integer getiIdEstadoValorizacion() {
		return iIdEstadoValorizacion;
	}

	public void setiIdEstadoValorizacion(Integer iIdEstadoValorizacion) {
		this.iIdEstadoValorizacion = iIdEstadoValorizacion;
	}

	public ProcesoPrestacionDetalle() {
	}
}
