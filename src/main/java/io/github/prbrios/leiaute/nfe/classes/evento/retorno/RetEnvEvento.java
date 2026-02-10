package io.github.prbrios.leiaute.nfe.classes.evento.retorno;

import io.github.prbrios.leiaute.nfe.Base;
import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "retEnvEvento", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
public class RetEnvEvento extends Base {

	@XmlAttribute(name = "versao")
	private String versao;

	@XmlElement(name = "idLote", namespace = "http://www.portalfiscal.inf.br/nfe")
	private String idLote;

	@XmlElement(name = "tpAmb", namespace = "http://www.portalfiscal.inf.br/nfe")
	private String tpAmb;

	@XmlElement(name = "verAplic", namespace = "http://www.portalfiscal.inf.br/nfe")
	private String verAplic;

	@XmlElement(name = "cOrgao", namespace = "http://www.portalfiscal.inf.br/nfe")
	private String cOrgao;

	@XmlElement(name = "cStat", namespace = "http://www.portalfiscal.inf.br/nfe")
	private String cStat;

	@XmlElement(name = "xMotivo", namespace = "http://www.portalfiscal.inf.br/nfe")
	private String xMotivo;

	@XmlElement(name = "retEvento")
	private RetEnvEventoRetEvento retEvento;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getIdLote() {
		return idLote;
	}

	public void setIdLote(String idLote) {
		this.idLote = idLote;
	}

	public String getTpAmb() {
		return tpAmb;
	}

	public void setTpAmb(String tpAmb) {
		this.tpAmb = tpAmb;
	}

	public String getVerAplic() {
		return verAplic;
	}

	public void setVerAplic(String verAplic) {
		this.verAplic = verAplic;
	}

	public String getcOrgao() {
		return cOrgao;
	}

	public void setcOrgao(String cOrgao) {
		this.cOrgao = cOrgao;
	}

	public String getcStat() {
		return cStat;
	}

	public void setcStat(String cStat) {
		this.cStat = cStat;
	}

	public String getxMotivo() {
		return xMotivo;
	}

	public void setxMotivo(String xMotivo) {
		this.xMotivo = xMotivo;
	}

	public RetEnvEventoRetEvento getRetEvento() {
		return retEvento;
	}

	public void setRetEvento(RetEnvEventoRetEvento retEvento) {
		this.retEvento = retEvento;
	}

}