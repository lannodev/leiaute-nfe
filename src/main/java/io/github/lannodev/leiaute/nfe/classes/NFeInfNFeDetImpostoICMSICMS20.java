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

@JsonRootName("icms20")
@XmlRootElement(name = "ICMS20")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetImpostoICMSICMS20 extends Base {

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
    @JsonProperty("predbc")
    @XmlElement(name = "pRedBC")
    private String pRedBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @XmlElement(name = "vBC")
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("picms")
    @XmlElement(name = "pICMS")
    private String pICMS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicms")
    @XmlElement(name = "vICMS")
    private String vICMS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcfcp")
    @XmlElement(name = "vBCFCP")
    private String vBCFCP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pfcp")
    @XmlElement(name = "pFCP")
    private String pFCP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcp")
    @XmlElement(name = "vFCP")
    private String vFCP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsdeson")
    @XmlElement(name = "vICMSDeson")
    private String vICMSDeson;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("motdesicms")
    @XmlElement(name = "motDesICMS")
    private String motDesICMS;

    public NFeInfNFeDetImpostoICMSICMS20() {}

    public NFeInfNFeDetImpostoICMSICMS20(String orig, String CST, String modBC, String pRedBC, String vBC, String pICMS, String vICMS, String vBCFCP, String pFCP, String vFCP, String vICMSDeson, String motDesICMS) {
        this.orig = orig;
        this.CST = CST;
        this.modBC = modBC;
        this.pRedBC = pRedBC;
        this.vBC = vBC;
        this.pICMS = pICMS;
        this.vICMS = vICMS;
        this.vBCFCP = vBCFCP;
        this.pFCP = pFCP;
        this.vFCP = vFCP;
        this.vICMSDeson = vICMSDeson;
        this.motDesICMS = motDesICMS;
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

	public String getpRedBC() {
		return pRedBC;
	}

	public void setpRedBC(String pRedBC) {
		this.pRedBC = pRedBC;
	}

	public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
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

	public String getvBCFCP() {
		return vBCFCP;
	}

	public void setvBCFCP(String vBCFCP) {
		this.vBCFCP = vBCFCP;
	}

	public String getpFCP() {
		return pFCP;
	}

	public void setpFCP(String pFCP) {
		this.pFCP = pFCP;
	}

	public String getvFCP() {
		return vFCP;
	}

	public void setvFCP(String vFCP) {
		this.vFCP = vFCP;
	}

	public String getvICMSDeson() {
		return vICMSDeson;
	}

	public void setvICMSDeson(String vICMSDeson) {
		this.vICMSDeson = vICMSDeson;
	}

	public String getMotDesICMS() {
		return motDesICMS;
	}

	public void setMotDesICMS(String motDesICMS) {
		this.motDesICMS = motDesICMS;
	}

}
