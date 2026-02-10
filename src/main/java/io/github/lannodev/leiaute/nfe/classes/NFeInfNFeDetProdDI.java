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
package io.github.lannodev.leiaute.nfe.classes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import io.github.lannodev.leiaute.nfe.Base;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@JsonRootName("di")
@XmlRootElement(name = "DI")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetProdDI extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ndi")
    @XmlElement(name = "nDI")
    private String nDI;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ddi")
    @XmlElement(name = "dDI")
    private String dDI;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xlocdesemb")
    @XmlElement(name = "xLocDesemb")
    private String xLocDesemb;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ufdesemb")
    @XmlElement(name = "UFDesemb")
    private String UFDesemb;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ddesemb")
    @XmlElement(name = "dDesemb")
    private String dDesemb;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpviatransp")
    @XmlElement(name = "tpViaTransp")
    private String tpViaTransp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vafrmm")
    @XmlElement(name = "vAFRMM")
    private String vAFRMM;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpintermedio")
    @XmlElement(name = "tpIntermedio")
    private String tpIntermedio;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpj")
    @XmlElement(name = "CNPJ")
    private String CNPJ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ufterceiro")
    @XmlElement(name = "UFTerceiro")
    private String UFTerceiro;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cexportador")
    @XmlElement(name = "cExportador")
    private String cExportador;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("adi")
    @XmlElement(name = "adi")
    private List<NFeInfNFeDetProdDIAdi> adi = new ArrayList<NFeInfNFeDetProdDIAdi>();

    public NFeInfNFeDetProdDI() {}

    public NFeInfNFeDetProdDI(String nDI, String dDI, String xLocDesemb, String UFDesemb, String dDesemb, String tpViaTransp, String vAFRMM, String tpIntermedio, String CNPJ, String UFTerceiro, String cExportador, List<NFeInfNFeDetProdDIAdi> adi) {
        this.nDI = nDI;
        this.dDI = dDI;
        this.xLocDesemb = xLocDesemb;
        this.UFDesemb = UFDesemb;
        this.dDesemb = dDesemb;
        this.tpViaTransp = tpViaTransp;
        this.vAFRMM = vAFRMM;
        this.tpIntermedio = tpIntermedio;
        this.CNPJ = CNPJ;
        this.UFTerceiro = UFTerceiro;
        this.cExportador = cExportador;
        this.adi = adi;
    }

	public String getnDI() {
		return nDI;
	}

	public void setnDI(String nDI) {
		this.nDI = nDI;
	}

	public String getdDI() {
		return dDI;
	}

	public void setdDI(String dDI) {
		this.dDI = dDI;
	}

	public String getxLocDesemb() {
		return xLocDesemb;
	}

	public void setxLocDesemb(String xLocDesemb) {
		this.xLocDesemb = xLocDesemb;
	}

	public String getUFDesemb() {
		return UFDesemb;
	}

	public void setUFDesemb(String uFDesemb) {
		UFDesemb = uFDesemb;
	}

	public String getdDesemb() {
		return dDesemb;
	}

	public void setdDesemb(String dDesemb) {
		this.dDesemb = dDesemb;
	}

	public String getTpViaTransp() {
		return tpViaTransp;
	}

	public void setTpViaTransp(String tpViaTransp) {
		this.tpViaTransp = tpViaTransp;
	}

	public String getvAFRMM() {
		return vAFRMM;
	}

	public void setvAFRMM(String vAFRMM) {
		this.vAFRMM = vAFRMM;
	}

	public String getTpIntermedio() {
		return tpIntermedio;
	}

	public void setTpIntermedio(String tpIntermedio) {
		this.tpIntermedio = tpIntermedio;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getUFTerceiro() {
		return UFTerceiro;
	}

	public void setUFTerceiro(String uFTerceiro) {
		UFTerceiro = uFTerceiro;
	}

	public String getcExportador() {
		return cExportador;
	}

	public void setcExportador(String cExportador) {
		this.cExportador = cExportador;
	}

	public List<NFeInfNFeDetProdDIAdi> getAdi() {
		return adi;
	}

	public void setAdi(List<NFeInfNFeDetProdDIAdi> adi) {
		this.adi = adi;
	}

}
