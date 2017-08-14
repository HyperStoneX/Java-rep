package com.natclar.finanzas.model.fiProceso;

public class ReglaGrupoPrestacion {
	private int iIdReglaGrupoPrestacion;
	private int iIdRegla;
	private String vcIdGrupoPrestacion;
	private String cPrestacionCosteada;
	private Integer iIdEstado;
	private String vcUsuarioApp;
	private String vcUsuarioOT;
	public int getiIdReglaGrupoPrestacion() {
		return iIdReglaGrupoPrestacion;
	}
	public void setiIdReglaGrupoPrestacion(int iIdReglaGrupoPrestacion) {
		this.iIdReglaGrupoPrestacion = iIdReglaGrupoPrestacion;
	}
	public int getiIdRegla() {
		return iIdRegla;
	}
	public void setiIdRegla(int iIdRegla) {
		this.iIdRegla = iIdRegla;
	}
	public String getVcIdGrupoPrestacion() {
		return vcIdGrupoPrestacion;
	}
	public void setVcIdGrupoPrestacion(String vcIdGrupoPrestacion) {
		this.vcIdGrupoPrestacion = vcIdGrupoPrestacion;
	}
	public String getcPrestacionCosteada() {
		return cPrestacionCosteada;
	}
	public void setcPrestacionCosteada(String cPrestacionCosteada) {
		this.cPrestacionCosteada = cPrestacionCosteada;
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
	public ReglaGrupoPrestacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
