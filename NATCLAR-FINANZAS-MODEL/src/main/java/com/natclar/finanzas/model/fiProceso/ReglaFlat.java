package com.natclar.finanzas.model.fiProceso;

public class ReglaFlat {
	private int iIdReglaFlat;
	private int iIdRegla;
	private String vcIdGrupoPrestacion;
	private String vcIdPrestacion;
	private String vcIdPruebaLaboratorio;
	private Double nuMonto;
	private Boolean bAplicaValidacion;
	private Integer iIdEstado;
	private String vcUsuarioApp;
	private String vcUsuarioOT;
	public int getiIdReglaFlat() {
		return iIdReglaFlat;
	}
	public void setiIdReglaFlat(int iIdReglaFlat) {
		this.iIdReglaFlat = iIdReglaFlat;
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
	public String getVcIdPrestacion() {
		return vcIdPrestacion;
	}
	public void setVcIdPrestacion(String vcIdPrestacion) {
		this.vcIdPrestacion = vcIdPrestacion;
	}
	public String getVcIdPruebaLaboratorio() {
		return vcIdPruebaLaboratorio;
	}
	public void setVcIdPruebaLaboratorio(String vcIdPruebaLaboratorio) {
		this.vcIdPruebaLaboratorio = vcIdPruebaLaboratorio;
	}
	public Double getNuMonto() {
		return nuMonto;
	}
	public void setNuMonto(Double nuMonto) {
		this.nuMonto = nuMonto;
	}
	public Boolean getbAplicaValidacion() {
		return bAplicaValidacion;
	}
	public void setbAplicaValidacion(Boolean bAplicaValidacion) {
		this.bAplicaValidacion = bAplicaValidacion;
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
	public ReglaFlat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
