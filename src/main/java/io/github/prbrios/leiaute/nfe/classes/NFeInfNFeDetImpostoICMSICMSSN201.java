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

@JsonRootName("icmssn201")
@XmlRootElement(name = "ICMSSN201")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetImpostoICMSICMSSN201 extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("orig")
    @XmlElement(name = "orig")
    private String orig;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("csosn")
    @XmlElement(name = "CSOSN")
    private String CSOSN;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("modbcst")
    @XmlElement(name = "modBCST")
    private String modBCST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pmvast")
    @XmlElement(name = "pMVAST")
    private String pMVAST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("predbcst")
    @XmlElement(name = "pRedBCST")
    private String pRedBCST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcst")
    @XmlElement(name = "vBCST")
    private String vBCST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("picmsst")
    @XmlElement(name = "pICMSST")
    private String pICMSST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsst")
    @XmlElement(name = "vICMSST")
    private String vICMSST;


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcfcpst")
    @XmlElement(name = "vBCFCPST")
    private String vBCFCPST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pfcpst")
    @XmlElement(name = "pFCPST")
    private String pFCPST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcpst")
    @XmlElement(name = "vFCPST")
    private String vFCPST;


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pcredsn")
    @XmlElement(name = "pCredSN")
    private String pCredSN;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vcredicmssn")
    @XmlElement(name = "vCredICMSSN")
    private String vCredICMSSN;

    public NFeInfNFeDetImpostoICMSICMSSN201() {}

    public NFeInfNFeDetImpostoICMSICMSSN201(String orig, String CSOSN, String modBCST, String pMVAST, String pRedBCST, String vBCST, String pICMSST, String vICMSST, String vBCFCPST, String pFCPST, String vFCPST, String pCredSN, String vCredICMSSN) {
        this.orig = orig;
        this.CSOSN = CSOSN;
        this.modBCST = modBCST;
        this.pMVAST = pMVAST;
        this.pRedBCST = pRedBCST;
        this.vBCST = vBCST;
        this.pICMSST = pICMSST;
        this.vICMSST = vICMSST;
        this.vBCFCPST = vBCFCPST;
        this.pFCPST = pFCPST;
        this.vFCPST = vFCPST;
        this.pCredSN = pCredSN;
        this.vCredICMSSN = vCredICMSSN;
    }

	public String getOrig() {
		return orig;
	}

	public void setOrig(String orig) {
		this.orig = orig;
	}

	public String getCSOSN() {
		return CSOSN;
	}

	public void setCSOSN(String cSOSN) {
		CSOSN = cSOSN;
	}

	public String getModBCST() {
		return modBCST;
	}

	public void setModBCST(String modBCST) {
		this.modBCST = modBCST;
	}

	public String getpMVAST() {
		return pMVAST;
	}

	public void setpMVAST(String pMVAST) {
		this.pMVAST = pMVAST;
	}

	public String getpRedBCST() {
		return pRedBCST;
	}

	public void setpRedBCST(String pRedBCST) {
		this.pRedBCST = pRedBCST;
	}

	public String getvBCST() {
		return vBCST;
	}

	public void setvBCST(String vBCST) {
		this.vBCST = vBCST;
	}

	public String getpICMSST() {
		return pICMSST;
	}

	public void setpICMSST(String pICMSST) {
		this.pICMSST = pICMSST;
	}

	public String getvICMSST() {
		return vICMSST;
	}

	public void setvICMSST(String vICMSST) {
		this.vICMSST = vICMSST;
	}

	public String getvBCFCPST() {
		return vBCFCPST;
	}

	public void setvBCFCPST(String vBCFCPST) {
		this.vBCFCPST = vBCFCPST;
	}

	public String getpFCPST() {
		return pFCPST;
	}

	public void setpFCPST(String pFCPST) {
		this.pFCPST = pFCPST;
	}

	public String getvFCPST() {
		return vFCPST;
	}

	public void setvFCPST(String vFCPST) {
		this.vFCPST = vFCPST;
	}

	public String getpCredSN() {
		return pCredSN;
	}

	public void setpCredSN(String pCredSN) {
		this.pCredSN = pCredSN;
	}

	public String getvCredICMSSN() {
		return vCredICMSSN;
	}

	public void setvCredICMSSN(String vCredICMSSN) {
		this.vCredICMSSN = vCredICMSSN;
	}

}
