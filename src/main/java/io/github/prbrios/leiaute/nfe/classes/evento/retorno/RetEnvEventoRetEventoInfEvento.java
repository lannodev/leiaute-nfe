package io.github.prbrios.leiaute.nfe.classes.evento.retorno;

import io.github.prbrios.leiaute.nfe.Base;
import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "infEvento")
@XmlAccessorType(XmlAccessType.FIELD)
public class RetEnvEventoRetEventoInfEvento extends Base {

	@XmlAttribute(name = "Id")
    private String id;

    @XmlElement(name = "tpAmb")
    private String tpAmb;

    @XmlElement(name = "verAplic")
    private String verAplic;

    @XmlElement(name = "cOrgao")
    private String cOrgao;

    @XmlElement(name = "cStat")
    private String cStat;

    @XmlElement(name = "xMotivo")
    private String xMotivo;

    @XmlElement(name = "chNFe")
    private String chNFe;

    @XmlElement(name = "tpEvento")
    private String tpEvento;

    @XmlElement(name = "xEvento")
    private String xEvento;

    @XmlElement(name = "nSeqEvento")
    private String nSeqEvento;
    
    @XmlElement(name = "cOrgaoAutor")
    private String cOrgaoAutor;

    @XmlElement(name = "CNPJDest")
    private String CNPJDest;

    @XmlElement(name = "CPFDest")
    private String CPFDest;

    @XmlElement(name = "emailDest")
    private String emailDest;

    @XmlElement(name = "dhRegEvento")
    private String dhRegEvento;

    @XmlElement(name = "nProt")
    private String nProt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getChNFe() {
		return chNFe;
	}

	public void setChNFe(String chNFe) {
		this.chNFe = chNFe;
	}

	public String getTpEvento() {
		return tpEvento;
	}

	public void setTpEvento(String tpEvento) {
		this.tpEvento = tpEvento;
	}

	public String getxEvento() {
		return xEvento;
	}

	public void setxEvento(String xEvento) {
		this.xEvento = xEvento;
	}

	public String getnSeqEvento() {
		return nSeqEvento;
	}

	public void setnSeqEvento(String nSeqEvento) {
		this.nSeqEvento = nSeqEvento;
	}

	public String getcOrgaoAutor() {
		return cOrgaoAutor;
	}

	public void setcOrgaoAutor(String cOrgaoAutor) {
		this.cOrgaoAutor = cOrgaoAutor;
	}

	public String getCNPJDest() {
		return CNPJDest;
	}

	public void setCNPJDest(String cNPJDest) {
		CNPJDest = cNPJDest;
	}

	public String getCPFDest() {
		return CPFDest;
	}

	public void setCPFDest(String cPFDest) {
		CPFDest = cPFDest;
	}

	public String getEmailDest() {
		return emailDest;
	}

	public void setEmailDest(String emailDest) {
		this.emailDest = emailDest;
	}

	public String getDhRegEvento() {
		return dhRegEvento;
	}

	public void setDhRegEvento(String dhRegEvento) {
		this.dhRegEvento = dhRegEvento;
	}

	public String getnProt() {
		return nProt;
	}

	public void setnProt(String nProt) {
		this.nProt = nProt;
	}

}
