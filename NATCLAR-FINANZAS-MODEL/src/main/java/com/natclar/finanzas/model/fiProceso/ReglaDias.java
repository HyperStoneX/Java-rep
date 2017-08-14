package com.natclar.finanzas.model.fiProceso;

public class ReglaDias {
	private int iIdReglaDias;
	private int iIdRegla;
	private String vcCondicion;
	private Integer iCantidadDias1;
	private Integer iCantidadDias2;
	private String vcTipoExamenes;
	private Integer iIdEstado;
	private String vcUsuarioApp;
	private String vcUsuarioOT;
	public int getiIdReglaDias() {
		return iIdReglaDias;
	}
	public void setiIdReglaDias(int iIdReglaDias) {
		this.iIdReglaDias = iIdReglaDias;
	}
	public int getiIdRegla() {
		return iIdRegla;
	}
	public void setiIdRegla(int iIdRegla) {
		this.iIdRegla = iIdRegla;
	}
	public String getVcCondicion() {
		return vcCondicion;
	}
	public void setVcCondicion(String vcCondicion) {
		this.vcCondicion = vcCondicion;
	}
	public Integer getiCantidadDias1() {
		return iCantidadDias1;
	}
	public void setiCantidadDias1(Integer iCantidadDias1) {
		this.iCantidadDias1 = iCantidadDias1;
	}
	public Integer getiCantidadDias2() {
		return iCantidadDias2;
	}
	public void setiCantidadDias2(Integer iCantidadDias2) {
		this.iCantidadDias2 = iCantidadDias2;
	}
	public String getVcTipoExamenes() {
		return vcTipoExamenes;
	}
	public void setVcTipoExamenes(String vcTipoExamenes) {
		this.vcTipoExamenes = vcTipoExamenes;
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
	public ReglaDias() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
