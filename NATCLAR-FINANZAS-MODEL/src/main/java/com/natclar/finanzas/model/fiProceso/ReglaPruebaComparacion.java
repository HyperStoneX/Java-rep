package com.natclar.finanzas.model.fiProceso;

public class ReglaPruebaComparacion {
	private int iIdReglaPruebaComparacion;
	private int iIdRegla;
	private Integer iIdTipoPrueba;
	private String vcPruebaResultante;
	private String vcPruebasComparacion;
	private Integer iIdEstado;
	private String vcUsuarioApp;
	private String vcUsuarioOT;
	public int getiIdReglaPruebaComparacion() {
		return iIdReglaPruebaComparacion;
	}
	public void setiIdReglaPruebaComparacion(int iIdReglaPruebaComparacion) {
		this.iIdReglaPruebaComparacion = iIdReglaPruebaComparacion;
	}
	public int getiIdRegla() {
		return iIdRegla;
	}
	public void setiIdRegla(int iIdRegla) {
		this.iIdRegla = iIdRegla;
	}
	public Integer getiIdTipoPrueba() {
		return iIdTipoPrueba;
	}
	public void setiIdTipoPrueba(Integer iIdTipoPrueba) {
		this.iIdTipoPrueba = iIdTipoPrueba;
	}
	public String getVcPruebaResultante() {
		return vcPruebaResultante;
	}
	public void setVcPruebaResultante(String vcPruebaResultante) {
		this.vcPruebaResultante = vcPruebaResultante;
	}
	public String getVcPruebasComparacion() {
		return vcPruebasComparacion;
	}
	public void setVcPruebasComparacion(String vcPruebasComparacion) {
		this.vcPruebasComparacion = vcPruebasComparacion;
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
	public ReglaPruebaComparacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
