package com.natclar.finanzas.model.fiProceso;

public class ReglaEmpresa {
	private int iIdReglaEmpresa;
	private int iIdRegla;
	private String vcRucEmpresa;
	private String vcIdPlanCobertura;
	private Boolean bAplica;
	private Integer iIdEstado;
	private String vcUsuarioApp;
	private String vcUsuarioOT;
	public int getiIdReglaEmpresa() {
		return iIdReglaEmpresa;
	}
	public void setiIdReglaEmpresa(int iIdReglaEmpresa) {
		this.iIdReglaEmpresa = iIdReglaEmpresa;
	}
	public int getiIdRegla() {
		return iIdRegla;
	}
	public void setiIdRegla(int iIdRegla) {
		this.iIdRegla = iIdRegla;
	}
	public String getVcRucEmpresa() {
		return vcRucEmpresa;
	}
	public void setVcRucEmpresa(String vcRucEmpresa) {
		this.vcRucEmpresa = vcRucEmpresa;
	}
	public String getVcIdPlanCobertura() {
		return vcIdPlanCobertura;
	}
	public void setVcIdPlanCobertura(String vcIdPlanCobertura) {
		this.vcIdPlanCobertura = vcIdPlanCobertura;
	}
	public Boolean getbAplica() {
		return bAplica;
	}
	public void setbAplica(Boolean bAplica) {
		this.bAplica = bAplica;
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
	public ReglaEmpresa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
