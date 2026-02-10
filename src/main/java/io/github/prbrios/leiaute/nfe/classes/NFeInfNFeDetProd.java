/*
 * Copyright 2022 prbrios.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.prbrios.leiaute.nfe.classes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import io.github.prbrios.leiaute.nfe.Base;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@JsonRootName("prod")
@XmlRootElement(name = "prod")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetProd extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cprod")
    @XmlElement(name = "cProd")
    private String cProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cean")
    @XmlElement(name = "cEAN")
    private String cEAN;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cbarra")
    @XmlElement(name = "cBarra")
    private String cBarra;
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xprod")
    @XmlElement(name = "xProd")
    private String xProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ncm")
    @XmlElement(name = "NCM")
    private String NCM;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nve")
    @XmlElement(name = "NVE")
    private List<NFeInfNFeDetProdNVE> NVE = new ArrayList<NFeInfNFeDetProdNVE>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cest")
    @XmlElement(name = "CEST")
    private String CEST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indescala")
    @XmlElement(name = "indEscala")
    private String indEscala;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpjfab")
    @XmlElement(name = "CNPJFab")
    private String CNPJFab;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cbenef")
    @XmlElement(name = "cBenef")
    private String cBenef;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("extipi")
    @XmlElement(name = "EXTIPI")
    private String EXTIPI;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cfop")
    @XmlElement(name = "CFOP")
    private String CFOP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ucom")
    @XmlElement(name = "uCom")
    private String uCom;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qcom")
    @XmlElement(name = "qCom")
    private String qCom;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vuncom")
    @XmlElement(name = "vUnCom")
    private String vUnCom;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vprod")
    @XmlElement(name = "vProd")
    private String vProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ceantrib")
    @XmlElement(name = "cEANTrib")
    private String cEANTrib;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cbarratrib")
    @XmlElement(name = "cBarraTrib")
    private String cBarraTrib;
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("utrib")
    @XmlElement(name = "uTrib")
    private String uTrib;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qtrib")
    @XmlElement(name = "qTrib")
    private String qTrib;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vuntrib")
    @XmlElement(name = "vUnTrib")
    private String vUnTrib;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfrete")
    @XmlElement(name = "vFrete")
    private String vFrete;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vseg")
    @XmlElement(name = "vSeg")
    private String vSeg;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdesc")
    @XmlElement(name = "vDesc")
    private String vDesc;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("voutro")
    @XmlElement(name = "vOutro")
    private String vOutro;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indtot")
    @XmlElement(name = "indTot")
    private String indTot;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("di")
    @XmlElement(name = "DI")
    private List<NFeInfNFeDetProdDI> DI = new ArrayList<NFeInfNFeDetProdDI>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("detexport")
    @XmlElement(name = "detExport")
    private List<NFeInfNFeDetProdDetExport> detExport = new ArrayList<NFeInfNFeDetProdDetExport>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xped")
    @XmlElement(name = "xPed")
    private String xPed;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nitemped")
    @XmlElement(name = "nItemPed")
    private String nItemPed;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nfci")
    @XmlElement(name = "nFCI")
    private String nFCI;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("rastro")
    @XmlElement(name = "rastro")
    private List<NFeInfNFeDetProdRastro> rastro = new ArrayList<NFeInfNFeDetProdRastro>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("veicprod")
    @XmlElement(name = "veicProd")
    private NFeInfNFeDetProdVeicProd veicProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("med")
    @XmlElement(name = "med")
    private NFeInfNFeDetProdMed med;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("arma")
    @XmlElement(name = "arma")
    private List<NFeInfNFeDetProdArma> arma = new ArrayList<NFeInfNFeDetProdArma>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("comb")
    @XmlElement(name = "comb")
    private NFeInfNFeDetProdComb comb;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nrecopi")
    @XmlElement(name = "nRECOPI")
    private String nRECOPI;

    public NFeInfNFeDetProd() {}

    @Deprecated
    public NFeInfNFeDetProd(String cProd, String cEAN, String xProd, String NCM, List<NFeInfNFeDetProdNVE> NVE, String CEST, String indEscala, String CNPJFab, String cBenef, String EXTIPI, String CFOP, String uCom, String qCom, String vUnCom, String vProd, String cEANTrib, String uTrib, String qTrib, String vUnTrib, String vFrete, String vSeg, String vDesc, String vOutro, String indTot, List<NFeInfNFeDetProdDI> DI, List<NFeInfNFeDetProdDetExport> detExport, String xPed, String nItemPed, String nFCI, List<NFeInfNFeDetProdRastro> rastro, NFeInfNFeDetProdVeicProd veicProd, NFeInfNFeDetProdMed med, List<NFeInfNFeDetProdArma> arma, NFeInfNFeDetProdComb comb, String nRECOPI) {
        this.cProd = cProd;
        this.cEAN = cEAN;
        this.xProd = xProd;
        this.NCM = NCM;
        this.NVE = NVE;
        this.CEST = CEST;
        this.indEscala = indEscala;
        this.CNPJFab = CNPJFab;
        this.cBenef = cBenef;
        this.EXTIPI = EXTIPI;
        this.CFOP = CFOP;
        this.uCom = uCom;
        this.qCom = qCom;
        this.vUnCom = vUnCom;
        this.vProd = vProd;
        this.cEANTrib = cEANTrib;
        this.uTrib = uTrib;
        this.qTrib = qTrib;
        this.vUnTrib = vUnTrib;
        this.vFrete = vFrete;
        this.vSeg = vSeg;
        this.vDesc = vDesc;
        this.vOutro = vOutro;
        this.indTot = indTot;
        this.DI = DI;
        this.detExport = detExport;
        this.xPed = xPed;
        this.nItemPed = nItemPed;
        this.nFCI = nFCI;
        this.rastro = rastro;
        this.veicProd = veicProd;
        this.med = med;
        this.arma = arma;
        this.comb = comb;
        this.nRECOPI = nRECOPI;
    }

	public NFeInfNFeDetProd(String cProd, String cEAN, String cBarra, String xProd, String nCM, List<NFeInfNFeDetProdNVE> nVE, String cEST, String indEscala, String cNPJFab, String cBenef, String eXTIPI, String cFOP, String uCom, String qCom, String vUnCom, String vProd, String cEANTrib, String cBarraTrib, String uTrib, String qTrib, String vUnTrib, String vFrete, String vSeg, String vDesc, String vOutro, String indTot, List<NFeInfNFeDetProdDI> dI, List<NFeInfNFeDetProdDetExport> detExport, String xPed, String nItemPed, String nFCI, List<NFeInfNFeDetProdRastro> rastro, NFeInfNFeDetProdVeicProd veicProd, NFeInfNFeDetProdMed med, List<NFeInfNFeDetProdArma> arma, NFeInfNFeDetProdComb comb, String nRECOPI) {
		this.cProd = cProd;
		this.cEAN = cEAN;
		this.cBarra = cBarra;
		this.xProd = xProd;
		this.NCM = nCM;
		this.NVE = nVE;
		this.CEST = cEST;
		this.indEscala = indEscala;
		this.CNPJFab = cNPJFab;
		this.cBenef = cBenef;
		this.EXTIPI = eXTIPI;
		this.CFOP = cFOP;
		this.uCom = uCom;
		this.qCom = qCom;
		this.vUnCom = vUnCom;
		this.vProd = vProd;
		this.cEANTrib = cEANTrib;
		this.cBarraTrib = cBarraTrib;
		this.uTrib = uTrib;
		this.qTrib = qTrib;
		this.vUnTrib = vUnTrib;
		this.vFrete = vFrete;
		this.vSeg = vSeg;
		this.vDesc = vDesc;
		this.vOutro = vOutro;
		this.indTot = indTot;
		this.DI = dI;
		this.detExport = detExport;
		this.xPed = xPed;
		this.nItemPed = nItemPed;
		this.nFCI = nFCI;
		this.rastro = rastro;
		this.veicProd = veicProd;
		this.med = med;
		this.arma = arma;
		this.comb = comb;
		this.nRECOPI = nRECOPI;
	}

	public String getcProd() {
		return cProd;
	}

	public void setcProd(String cProd) {
		this.cProd = cProd;
	}

	public String getcEAN() {
		return cEAN;
	}

	public void setcEAN(String cEAN) {
		this.cEAN = cEAN;
	}

	public String getcBarra() {
		return cBarra;
	}

	public void setcBarra(String cBarra) {
		this.cBarra = cBarra;
	}

	public String getxProd() {
		return xProd;
	}

	public void setxProd(String xProd) {
		this.xProd = xProd;
	}

	public String getNCM() {
		return NCM;
	}

	public void setNCM(String nCM) {
		NCM = nCM;
	}

	public List<NFeInfNFeDetProdNVE> getNVE() {
		return NVE;
	}

	public void setNVE(List<NFeInfNFeDetProdNVE> nVE) {
		NVE = nVE;
	}

	public String getCEST() {
		return CEST;
	}

	public void setCEST(String cEST) {
		CEST = cEST;
	}

	public String getIndEscala() {
		return indEscala;
	}

	public void setIndEscala(String indEscala) {
		this.indEscala = indEscala;
	}

	public String getCNPJFab() {
		return CNPJFab;
	}

	public void setCNPJFab(String cNPJFab) {
		CNPJFab = cNPJFab;
	}

	public String getcBenef() {
		return cBenef;
	}

	public void setcBenef(String cBenef) {
		this.cBenef = cBenef;
	}

	public String getEXTIPI() {
		return EXTIPI;
	}

	public void setEXTIPI(String eXTIPI) {
		EXTIPI = eXTIPI;
	}

	public String getCFOP() {
		return CFOP;
	}

	public void setCFOP(String cFOP) {
		CFOP = cFOP;
	}

	public String getuCom() {
		return uCom;
	}

	public void setuCom(String uCom) {
		this.uCom = uCom;
	}

	public String getqCom() {
		return qCom;
	}

	public void setqCom(String qCom) {
		this.qCom = qCom;
	}

	public String getvUnCom() {
		return vUnCom;
	}

	public void setvUnCom(String vUnCom) {
		this.vUnCom = vUnCom;
	}

	public String getvProd() {
		return vProd;
	}

	public void setvProd(String vProd) {
		this.vProd = vProd;
	}

	public String getcEANTrib() {
		return cEANTrib;
	}

	public void setcEANTrib(String cEANTrib) {
		this.cEANTrib = cEANTrib;
	}

	public String getcBarraTrib() {
		return cBarraTrib;
	}

	public void setcBarraTrib(String cBarraTrib) {
		this.cBarraTrib = cBarraTrib;
	}

	public String getuTrib() {
		return uTrib;
	}

	public void setuTrib(String uTrib) {
		this.uTrib = uTrib;
	}

	public String getqTrib() {
		return qTrib;
	}

	public void setqTrib(String qTrib) {
		this.qTrib = qTrib;
	}

	public String getvUnTrib() {
		return vUnTrib;
	}

	public void setvUnTrib(String vUnTrib) {
		this.vUnTrib = vUnTrib;
	}

	public String getvFrete() {
		return vFrete;
	}

	public void setvFrete(String vFrete) {
		this.vFrete = vFrete;
	}

	public String getvSeg() {
		return vSeg;
	}

	public void setvSeg(String vSeg) {
		this.vSeg = vSeg;
	}

	public String getvDesc() {
		return vDesc;
	}

	public void setvDesc(String vDesc) {
		this.vDesc = vDesc;
	}

	public String getvOutro() {
		return vOutro;
	}

	public void setvOutro(String vOutro) {
		this.vOutro = vOutro;
	}

	public String getIndTot() {
		return indTot;
	}

	public void setIndTot(String indTot) {
		this.indTot = indTot;
	}

	public List<NFeInfNFeDetProdDI> getDI() {
		return DI;
	}

	public void setDI(List<NFeInfNFeDetProdDI> dI) {
		DI = dI;
	}

	public List<NFeInfNFeDetProdDetExport> getDetExport() {
		return detExport;
	}

	public void setDetExport(List<NFeInfNFeDetProdDetExport> detExport) {
		this.detExport = detExport;
	}

	public String getxPed() {
		return xPed;
	}

	public void setxPed(String xPed) {
		this.xPed = xPed;
	}

	public String getnItemPed() {
		return nItemPed;
	}

	public void setnItemPed(String nItemPed) {
		this.nItemPed = nItemPed;
	}

	public String getnFCI() {
		return nFCI;
	}

	public void setnFCI(String nFCI) {
		this.nFCI = nFCI;
	}

	public List<NFeInfNFeDetProdRastro> getRastro() {
		return rastro;
	}

	public void setRastro(List<NFeInfNFeDetProdRastro> rastro) {
		this.rastro = rastro;
	}

	public NFeInfNFeDetProdVeicProd getVeicProd() {
		return veicProd;
	}

	public void setVeicProd(NFeInfNFeDetProdVeicProd veicProd) {
		this.veicProd = veicProd;
	}

	public NFeInfNFeDetProdMed getMed() {
		return med;
	}

	public void setMed(NFeInfNFeDetProdMed med) {
		this.med = med;
	}

	public List<NFeInfNFeDetProdArma> getArma() {
		return arma;
	}

	public void setArma(List<NFeInfNFeDetProdArma> arma) {
		this.arma = arma;
	}

	public NFeInfNFeDetProdComb getComb() {
		return comb;
	}

	public void setComb(NFeInfNFeDetProdComb comb) {
		this.comb = comb;
	}

	public String getnRECOPI() {
		return nRECOPI;
	}

	public void setnRECOPI(String nRECOPI) {
		this.nRECOPI = nRECOPI;
	}

}
