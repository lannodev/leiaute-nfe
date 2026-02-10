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

@JsonRootName("icmspart")
@XmlRootElement(name = "ICMSPart")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetImpostoICMSICMSPart extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("orig")
    @XmlElement(name = "orig")
    private String orig;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @XmlElement(name = "CST")
    private String CST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("modbc")
    @XmlElement(name = "modBC")
    private String modBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @XmlElement(name = "vBC")
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("predbc")
    @XmlElement(name = "pRedBC")
    private String pRedBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("picms")
    @XmlElement(name = "pICMS")
    private String pICMS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicms")
    @XmlElement(name = "vICMS")
    private String vICMS;

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
    @JsonProperty("pbcop")
    @XmlElement(name = "pBCOp")
    private String pBCOp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ufst")
    @XmlElement(name = "UFST")
    private String UFST;

    public NFeInfNFeDetImpostoICMSICMSPart() {}

    public NFeInfNFeDetImpostoICMSICMSPart(String orig, String CST, String modBC, String vBC, String pRedBC, String pICMS, String vICMS, String modBCST, String pMVAST, String pRedBCST, String vBCST, String pICMSST, String vICMSST, String pBCOp, String UFST) {
        this.orig = orig;
        this.CST = CST;
        this.modBC = modBC;
        this.vBC = vBC;
        this.pRedBC = pRedBC;
        this.pICMS = pICMS;
        this.vICMS = vICMS;
        this.modBCST = modBCST;
        this.pMVAST = pMVAST;
        this.pRedBCST = pRedBCST;
        this.vBCST = vBCST;
        this.pICMSST = pICMSST;
        this.vICMSST = vICMSST;
        this.pBCOp = pBCOp;
        this.UFST = UFST;
    }

    public NFeInfNFeDetImpostoICMSICMSPart(String orig, String CST, String modBC, String vBC, String pRedBC, String pICMS, String vICMS, String modBCST, String pMVAST, String pRedBCST, String vBCST, String pICMSST, String vICMSST, String vBCFCPST, String pFCPST, String vFCPST, String pBCOp, String UFST) {
        this.orig = orig;
        this.CST = CST;
        this.modBC = modBC;
        this.vBC = vBC;
        this.pRedBC = pRedBC;
        this.pICMS = pICMS;
        this.vICMS = vICMS;
        this.modBCST = modBCST;
        this.pMVAST = pMVAST;
        this.pRedBCST = pRedBCST;
        this.vBCST = vBCST;
        this.pICMSST = pICMSST;
        this.vICMSST = vICMSST;
        this.vBCFCPST = vBCFCPST;
        this.pFCPST = pFCPST;
        this.vFCPST = vFCPST;
        this.pBCOp = pBCOp;
        this.UFST = UFST;
    }

	public String getOrig() {
		return orig;
	}

	public void setOrig(String orig) {
		this.orig = orig;
	}

	public String getCST() {
		return CST;
	}

	public void setCST(String cST) {
		CST = cST;
	}

	public String getModBC() {
		return modBC;
	}

	public void setModBC(String modBC) {
		this.modBC = modBC;
	}

	public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
	}

	public String getpRedBC() {
		return pRedBC;
	}

	public void setpRedBC(String pRedBC) {
		this.pRedBC = pRedBC;
	}

	public String getpICMS() {
		return pICMS;
	}

	public void setpICMS(String pICMS) {
		this.pICMS = pICMS;
	}

	public String getvICMS() {
		return vICMS;
	}

	public void setvICMS(String vICMS) {
		this.vICMS = vICMS;
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
		return this.vBCFCPST;
	} 

	public void setvBCFCPST(String vBCFCPST){
		this.vBCFCPST = vBCFCPST;
	}

	public String getpFCPST() {
		return this.pFCPST;
	}

	public void setpFCPST(String pFCPST){
		this.pFCPST = pFCPST;
	}

	public String getvFCPST() {
		return this.vFCPST;
	}

	public void setvFCPST(String vFCPST) {
		this.vFCPST = vFCPST;
	}

	public String getpBCOp() {
		return pBCOp;
	}

	public void setpBCOp(String pBCOp) {
		this.pBCOp = pBCOp;
	}

	public String getUFST() {
		return UFST;
	}

	public void setUFST(String uFST) {
		UFST = uFST;
	}

}
