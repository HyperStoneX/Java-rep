package com.natclar.finanzas.model.fiProceso;

public class Regla {
	private int iIdRegla;
	private String vcDescripcionCorta;
	private String vcDescripcionLarga;
	private Integer iIdTipoReglaValorizacion;
	private Integer iIdPrioridadEvaluacion;
	private Boolean bAplicaMultipleEpi;
	private Integer iIdEstado;
	private String vcUsuarioApp;
	private String vcUsuarioOT;
	public int getiIdRegla() {
		return iIdRegla;
	}
	public void setiIdRegla(int iIdRegla) {
		this.iIdRegla = iIdRegla;
	}
	public String getVcDescripcionCorta() {
		return vcDescripcionCorta;
	}
	public void setVcDescripcionCorta(String vcDescripcionCorta) {
		this.vcDescripcionCorta = vcDescripcionCorta;
	}
	public String getVcDescripcionLarga() {
		return vcDescripcionLarga;
	}
	public void setVcDescripcionLarga(String vcDescripcionLarga) {
		this.vcDescripcionLarga = vcDescripcionLarga;
	}
	public Integer getiIdTipoReglaValorizacion() {
		return iIdTipoReglaValorizacion;
	}
	public void setiIdTipoReglaValorizacion(Integer iIdTipoReglaValorizacion) {
		this.iIdTipoReglaValorizacion = iIdTipoReglaValorizacion;
	}
	public Integer getiIdPrioridadEvaluacion() {
		return iIdPrioridadEvaluacion;
	}
	public void setiIdPrioridadEvaluacion(Integer iIdPrioridadEvaluacion) {
		this.iIdPrioridadEvaluacion = iIdPrioridadEvaluacion;
	}
	public Boolean getbAplicaMultipleEpi() {
		return bAplicaMultipleEpi;
	}
	public void setbAplicaMultipleEpi(Boolean bAplicaMultipleEpi) {
		this.bAplicaMultipleEpi = bAplicaMultipleEpi;
	}
	public Integer getiIdEstado() {
		return iIdEstado;
	}
	public void setiIdEstado(Integer iIdEstado) {
		this.iIdEstado = iIdEstado;
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
	public Regla() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
