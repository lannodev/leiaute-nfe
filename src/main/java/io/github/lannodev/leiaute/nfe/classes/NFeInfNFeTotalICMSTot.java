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

@JsonRootName("icmstot")
@XmlRootElement(name = "ICMSTot")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeTotalICMSTot extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @XmlElement(name = "vBC")
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicms")
    @XmlElement(name = "vICMS")
    private String vICMS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsdeson")
    @XmlElement(name = "vICMSDeson")
    private String vICMSDeson;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcpufdest")
    @XmlElement(name = "vFCPUFDest")
    private String vFCPUFDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsufdest")
    @XmlElement(name = "vICMSUFDest")
    private String vICMSUFDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsufremet")
    @XmlElement(name = "vICMSUFRemet")
    private String vICMSUFRemet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcp")
    @XmlElement(name = "vFCP")
    private String vFCP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcst")
    @XmlElement(name = "vBCST")
    private String vBCST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vst")
    @XmlElement(name = "vST")
    private String vST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcpst")
    @XmlElement(name = "vFCPST")
    private String vFCPST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcpstret")
    @XmlElement(name = "vFCPSTRet")
    private String vFCPSTRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vprod")
    @XmlElement(name = "vProd")
    private String vProd;

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
    @JsonProperty("vii")
    @XmlElement(name = "vII")
    private String vII;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vipi")
    @XmlElement(name = "vIPI")
    private String vIPI;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vipidevol")
    @XmlElement(name = "vIPIDevol")
    private String vIPIDevol;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vpis")
    @XmlElement(name = "vPIS")
    private String vPIS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vcofins")
    @XmlElement(name = "vCOFINS")
    private String vCOFINS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("voutro")
    @XmlElement(name = "vOutro")
    private String vOutro;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vnf")
    @XmlElement(name = "vNF")
    private String vNF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vtottrib")
    @XmlElement(name = "vTotTrib")
    private String vTotTrib;

    public NFeInfNFeTotalICMSTot() {}

    public NFeInfNFeTotalICMSTot(String vBC, String vICMS, String vICMSDeson, String vFCPUFDest, String vICMSUFDest, String vICMSUFRemet, String vFCP, String vBCST, String vST, String vFCPST, String vFCPSTRet, String vProd, String vFrete, String vSeg, String vDesc, String vII, String vIPI, String vIPIDevol, String vPIS, String vCOFINS, String vOutro, String vNF, String vTotTrib) {
        this.vBC = vBC;
        this.vICMS = vICMS;
        this.vICMSDeson = vICMSDeson;
        this.vFCPUFDest = vFCPUFDest;
        this.vICMSUFDest = vICMSUFDest;
        this.vICMSUFRemet = vICMSUFRemet;
        this.vFCP = vFCP;
        this.vBCST = vBCST;
        this.vST = vST;
        this.vFCPST = vFCPST;
        this.vFCPSTRet = vFCPSTRet;
        this.vProd = vProd;
        this.vFrete = vFrete;
        this.vSeg = vSeg;
        this.vDesc = vDesc;
        this.vII = vII;
        this.vIPI = vIPI;
        this.vIPIDevol = vIPIDevol;
        this.vPIS = vPIS;
        this.vCOFINS = vCOFINS;
        this.vOutro = vOutro;
        this.vNF = vNF;
        this.vTotTrib = vTotTrib;
    }

	public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
	}

	public String getvICMS() {
		return vICMS;
	}

	public void setvICMS(String vICMS) {
		this.vICMS = vICMS;
	}

	public String getvICMSDeson() {
		return vICMSDeson;
	}

	public void setvICMSDeson(String vICMSDeson) {
		this.vICMSDeson = vICMSDeson;
	}

	public String getvFCPUFDest() {
		return vFCPUFDest;
	}

	public void setvFCPUFDest(String vFCPUFDest) {
		this.vFCPUFDest = vFCPUFDest;
	}

	public String getvICMSUFDest() {
		return vICMSUFDest;
	}

	public void setvICMSUFDest(String vICMSUFDest) {
		this.vICMSUFDest = vICMSUFDest;
	}

	public String getvICMSUFRemet() {
		return vICMSUFRemet;
	}

	public void setvICMSUFRemet(String vICMSUFRemet) {
		this.vICMSUFRemet = vICMSUFRemet;
	}

	public String getvFCP() {
		return vFCP;
	}

	public void setvFCP(String vFCP) {
		this.vFCP = vFCP;
	}

	public String getvBCST() {
		return vBCST;
	}

	public void setvBCST(String vBCST) {
		this.vBCST = vBCST;
	}

	public String getvST() {
		return vST;
	}

	public void setvST(String vST) {
		this.vST = vST;
	}

	public String getvFCPST() {
		return vFCPST;
	}

	public void setvFCPST(String vFCPST) {
		this.vFCPST = vFCPST;
	}

	public String getvFCPSTRet() {
		return vFCPSTRet;
	}

	public void setvFCPSTRet(String vFCPSTRet) {
		this.vFCPSTRet = vFCPSTRet;
	}

	public String getvProd() {
		return vProd;
	}

	public void setvProd(String vProd) {
		this.vProd = vProd;
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

	public String getvII() {
		return vII;
	}

	public void setvII(String vII) {
		this.vII = vII;
	}

	public String getvIPI() {
		return vIPI;
	}

	public void setvIPI(String vIPI) {
		this.vIPI = vIPI;
	}

	public String getvIPIDevol() {
		return vIPIDevol;
	}

	public void setvIPIDevol(String vIPIDevol) {
		this.vIPIDevol = vIPIDevol;
	}

	public String getvPIS() {
		return vPIS;
	}

	public void setvPIS(String vPIS) {
		this.vPIS = vPIS;
	}

	public String getvCOFINS() {
		return vCOFINS;
	}

	public void setvCOFINS(String vCOFINS) {
		this.vCOFINS = vCOFINS;
	}

	public String getvOutro() {
		return vOutro;
	}

	public void setvOutro(String vOutro) {
		this.vOutro = vOutro;
	}

	public String getvNF() {
		return vNF;
	}

	public void setvNF(String vNF) {
		this.vNF = vNF;
	}

	public String getvTotTrib() {
		return vTotTrib;
	}

	public void setvTotTrib(String vTotTrib) {
		this.vTotTrib = vTotTrib;
	}

}
