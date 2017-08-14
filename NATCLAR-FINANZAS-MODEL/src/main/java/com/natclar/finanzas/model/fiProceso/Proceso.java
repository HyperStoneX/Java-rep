package com.natclar.finanzas.model.fiProceso;

import java.util.Date;

public class Proceso {
	private String vcIdProceso;
	private String vcIdSede;
    private Integer iIdSistema;
    private String vcIdServicio;
    private String vcHistoriaClinica;
    private String vcRucCliente;
    private String dtFecha;
    private Integer iIdPuesto;
    private Integer iIdProtocolo;
    private String vcIdPlanCobertura;
    private String vcTipoPago;
    private String vcIdZona;
    private String vcIdArea;
    private Integer iAltura;
    private Double nuImportePaciente;
    private Double nuImporteEmpresa;
    private Double nuImporteTotal;
    private Double nuImporteTotalNeto;
    private Double nuImportePacienteNeto;
    private Double nuImporteEmpresaNeto;
    private String vcTipoCobro;
    private Integer iIdEstado;
    private String vcRucEmpresaTitular;
    private String vcRucEmpresaContrata;
    private String vcIdUnidad;
    private Integer iIdCita;
    private Integer iIdCitaDetalle;
    private String vcDelegacionCita;
    private Integer iIdUltimaValorizacion;
    private Integer iIdEstadoValorizacion;
    private Integer iIdEstadoCosteo;
    private String vcUsuarioApp;
	private String vcUsuarioOT;
    
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
	public Double getNuImportePacienteNeto() {
		return nuImportePacienteNeto;
	}
	public void setNuImportePacienteNeto(Double nuImportePacienteNeto) {
		this.nuImportePacienteNeto = nuImportePacienteNeto;
	}
	public Double getNuImporteEmpresaNeto() {
		return nuImporteEmpresaNeto;
	}
	public void setNuImporteEmpresaNeto(Double nuImporteEmpresaNeto) {
		this.nuImporteEmpresaNeto = nuImporteEmpresaNeto;
	}
	private Boolean bMultimina;
    private String vcIdProcesoEvaluadoMultimina;
	
    public Boolean getbMultimina() {
		return bMultimina;
	}
	public void setbMultimina(Boolean bMultimina) {
		this.bMultimina = bMultimina;
	}
	public String getVcIdProcesoEvaluadoMultimina() {
		return vcIdProcesoEvaluadoMultimina;
	}
	public void setVcIdProcesoEvaluadoMultimina(String vcIdProcesoEvaluadoMultimina) {
		this.vcIdProcesoEvaluadoMultimina = vcIdProcesoEvaluadoMultimina;
	}
	public String getVcIdProceso() {
		return vcIdProceso;
	}
	public void setVcIdProceso(String vcIdProceso) {
		this.vcIdProceso = vcIdProceso;
	}
	public String getVcIdSede() {
		return vcIdSede;
	}
	public void setVcIdSede(String vcIdSede) {
		this.vcIdSede = vcIdSede;
	}
	public Integer getiIdSistema() {
		return iIdSistema;
	}
	public void setiIdSistema(Integer iIdSistema) {
		this.iIdSistema = iIdSistema;
	}
	public String getVcIdServicio() {
		return vcIdServicio;
	}
	public void setVcIdServicio(String vcIdServicio) {
		this.vcIdServicio = vcIdServicio;
	}
	public String getVcHistoriaClinica() {
		return vcHistoriaClinica;
	}
	public void setVcHistoriaClinica(String vcHistoriaClinica) {
		this.vcHistoriaClinica = vcHistoriaClinica;
	}
	public String getVcRucCliente() {
		return vcRucCliente;
	}
	public void setVcRucCliente(String vcRucCliente) {
		this.vcRucCliente = vcRucCliente;
	}
	public String getDtFecha() {
		return dtFecha;
	}
	public void setDtFecha(String dtFecha) {
		this.dtFecha = dtFecha;
	}
	public Integer getiIdPuesto() {
		return iIdPuesto;
	}
	public void setiIdPuesto(Integer iIdPuesto) {
		this.iIdPuesto = iIdPuesto;
	}
	public Integer getiIdProtocolo() {
		return iIdProtocolo;
	}
	public void setiIdProtocolo(Integer iIdProtocolo) {
		this.iIdProtocolo = iIdProtocolo;
	}
	public String getVcIdPlanCobertura() {
		return vcIdPlanCobertura;
	}
	public void setVcIdPlanCobertura(String vcIdPlanCobertura) {
		this.vcIdPlanCobertura = vcIdPlanCobertura;
	}
	public String getVcTipoPago() {
		return vcTipoPago;
	}
	public void setVcTipoPago(String vcTipoPago) {
		this.vcTipoPago = vcTipoPago;
	}
	public String getVcIdZona() {
		return vcIdZona;
	}
	public void setVcIdZona(String vcIdZona) {
		this.vcIdZona = vcIdZona;
	}
	public String getVcIdArea() {
		return vcIdArea;
	}
	public void setVcIdArea(String vcIdArea) {
		this.vcIdArea = vcIdArea;
	}
	public Integer getiAltura() {
		return iAltura;
	}
	public void setiAltura(Integer iAltura) {
		this.iAltura = iAltura;
	}
	public Double getNuImportePaciente() {
		return nuImportePaciente;
	}
	public void setNuImportePaciente(Double nuImportePaciente) {
		this.nuImportePaciente = nuImportePaciente;
	}
	public Double getNuImporteEmpresa() {
		return nuImporteEmpresa;
	}
	public void setNuImporteEmpresa(Double nuImporteEmpresa) {
		this.nuImporteEmpresa = nuImporteEmpresa;
	}
	public Double getNuImporteTotal() {
		return nuImporteTotal;
	}
	public void setNuImporteTotal(Double nuImporteTotal) {
		this.nuImporteTotal = nuImporteTotal;
	}
	public Double getNuImporteTotalNeto() {
		return nuImporteTotalNeto;
	}
	public void setNuImporteTotalNeto(Double nuImporteTotalNeto) {
		this.nuImporteTotalNeto = nuImporteTotalNeto;
	}
	public String getVcTipoCobro() {
		return vcTipoCobro;
	}
	public void setVcTipoCobro(String vcTipoCobro) {
		this.vcTipoCobro = vcTipoCobro;
	}
	public Integer getiIdEstado() {
		return iIdEstado;
	}
	public void setiIdEstado(Integer iIdEstado) {
		this.iIdEstado = iIdEstado;
	}
	public String getVcRucEmpresaTitular() {
		return vcRucEmpresaTitular;
	}
	public void setVcRucEmpresaTitular(String vcRucEmpresaTitular) {
		this.vcRucEmpresaTitular = vcRucEmpresaTitular;
	}
	public String getVcRucEmpresaContrata() {
		return vcRucEmpresaContrata;
	}
	public void setVcRucEmpresaContrata(String vcRucEmpresaContrata) {
		this.vcRucEmpresaContrata = vcRucEmpresaContrata;
	}
	public String getVcIdUnidad() {
		return vcIdUnidad;
	}
	public void setVcIdUnidad(String vcIdUnidad) {
		this.vcIdUnidad = vcIdUnidad;
	}
	public Integer getiIdCita() {
		return iIdCita;
	}
	public void setiIdCita(Integer iIdCita) {
		this.iIdCita = iIdCita;
	}
	public Integer getiIdCitaDetalle() {
		return iIdCitaDetalle;
	}
	public void setiIdCitaDetalle(Integer iIdCitaDetalle) {
		this.iIdCitaDetalle = iIdCitaDetalle;
	}
	public String getVcDelegacionCita() {
		return vcDelegacionCita;
	}
	public void setVcDelegacionCita(String vcDelegacionCita) {
		this.vcDelegacionCita = vcDelegacionCita;
	}
	public Integer getiIdUltimaValorizacion() {
		return iIdUltimaValorizacion;
	}
	public void setiIdUltimaValorizacion(Integer iIdUltimaValorizacion) {
		this.iIdUltimaValorizacion = iIdUltimaValorizacion;
	}
	public Integer getiIdEstadoValorizacion() {
		return iIdEstadoValorizacion;
	}
	public void setiIdEstadoValorizacion(Integer iIdEstadoValorizacion) {
		this.iIdEstadoValorizacion = iIdEstadoValorizacion;
	}	
	
	public Integer getiIdEstadoCosteo() {
		return iIdEstadoCosteo;
	}
	public void setiIdEstadoCosteo(Integer iIdEstadoCosteo) {
		this.iIdEstadoCosteo = iIdEstadoCosteo;
	}
	public Proceso() {}
    
}