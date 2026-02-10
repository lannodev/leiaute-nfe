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

@JsonRootName("icmsst")
@XmlRootElement(name = "ICMSST")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetImpostoICMSICMSST extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("orig")
    @XmlElement(name = "orig")
    private String orig;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @XmlElement(name = "CST")
    private String CST;


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcstret")
    @XmlElement(name = "vBCSTRet")
    private String vBCSTRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pst")
    @XmlElement(name = "pST")
    private String pST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmssubstituto")
    @XmlElement(name = "vICMSSubstituto")
    private String vICMSSubstituto;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsstret")
    @XmlElement(name = "vICMSSTRet")
    private String vICMSSTRet;


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcfcpstret")
    @XmlElement(name = "vBCFCPSTRet")
    private String vBCFCPSTRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pfcpstret")
    @XmlElement(name = "pFCPSTRet")
    private String pFCPSTRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcpstret")
    @XmlElement(name = "vFCPSTRet")
    private String vFCPSTRet;


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcstdest")
    @XmlElement(name = "vBCSTDest")
    private String vBCSTDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsstdest")
    @XmlElement(name = "vICMSSTDest")
    private String vICMSSTDest;


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("predbcefet")
    @XmlElement(name = "pRedBCEfet")
    private String pRedBCEfet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcefet")
    @XmlElement(name = "vBCEfet")
    private String vBCEfet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("picmsefet")
    @XmlElement(name = "pICMSEfet")
    private String pICMSEfet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsefet")
    @XmlElement(name = "vICMSEfet")
    private String vICMSEfet;

    public NFeInfNFeDetImpostoICMSICMSST() {}

    public NFeInfNFeDetImpostoICMSICMSST(String orig, String CST, String vBCSTRet, String pST, String vICMSSubstituto, String vICMSSTRet, String vBCFCPSTRet, String pFCPSTRet, String vFCPSTRet, String vBCSTDest, String vICMSSTDest, String pRedBCEfet, String vBCEfet, String pICMSEfet, String vICMSEfet) {
        this.orig = orig;
        this.CST = CST;
        this.vBCSTRet = vBCSTRet;
        this.pST = pST;
        this.vICMSSubstituto = vICMSSubstituto;
        this.vICMSSTRet = vICMSSTRet;
        this.vBCFCPSTRet = vBCFCPSTRet;
        this.pFCPSTRet = pFCPSTRet;
        this.vFCPSTRet = vFCPSTRet;
        this.vBCSTDest = vBCSTDest;
        this.vICMSSTDest = vICMSSTDest;
        this.pRedBCEfet = pRedBCEfet;
        this.vBCEfet = vBCEfet;
        this.pICMSEfet = pICMSEfet;
        this.vICMSEfet = vICMSEfet;
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

	public String getvBCSTRet() {
		return vBCSTRet;
	}

	public void setvBCSTRet(String vBCSTRet) {
		this.vBCSTRet = vBCSTRet;
	}

	public String getpST() {
		return pST;
	}

	public void setpST(String pST) {
		this.pST = pST;
	}

	public String getvICMSSubstituto() {
		return vICMSSubstituto;
	}

	public void setvICMSSubstituto(String vICMSSubstituto) {
		this.vICMSSubstituto = vICMSSubstituto;
	}

	public String getvICMSSTRet() {
		return vICMSSTRet;
	}

	public void setvICMSSTRet(String vICMSSTRet) {
		this.vICMSSTRet = vICMSSTRet;
	}

	public String getvBCFCPSTRet() {
		return vBCFCPSTRet;
	}

	public void setvBCFCPSTRet(String vBCFCPSTRet) {
		this.vBCFCPSTRet = vBCFCPSTRet;
	}

	public String getpFCPSTRet() {
		return pFCPSTRet;
	}

	public void setpFCPSTRet(String pFCPSTRet) {
		this.pFCPSTRet = pFCPSTRet;
	}

	public String getvFCPSTRet() {
		return vFCPSTRet;
	}

	public void setvFCPSTRet(String vFCPSTRet) {
		this.vFCPSTRet = vFCPSTRet;
	}

	public String getvBCSTDest() {
		return vBCSTDest;
	}

	public void setvBCSTDest(String vBCSTDest) {
		this.vBCSTDest = vBCSTDest;
	}

	public String getvICMSSTDest() {
		return vICMSSTDest;
	}

	public void setvICMSSTDest(String vICMSSTDest) {
		this.vICMSSTDest = vICMSSTDest;
	}

	public String getpRedBCEfet() {
		return pRedBCEfet;
	}

	public void setpRedBCEfet(String pRedBCEfet) {
		this.pRedBCEfet = pRedBCEfet;
	}

	public String getvBCEfet() {
		return vBCEfet;
	}

	public void setvBCEfet(String vBCEfet) {
		this.vBCEfet = vBCEfet;
	}

	public String getpICMSEfet() {
		return pICMSEfet;
	}

	public void setpICMSEfet(String pICMSEfet) {
		this.pICMSEfet = pICMSEfet;
	}

	public String getvICMSEfet() {
		return vICMSEfet;
	}

	public void setvICMSEfet(String vICMSEfet) {
		this.vICMSEfet = vICMSEfet;
	}

}
