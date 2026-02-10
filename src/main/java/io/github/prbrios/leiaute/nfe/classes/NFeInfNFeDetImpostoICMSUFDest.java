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

@JsonRootName("icmsufdest")
@XmlRootElement(name = "ICMSUFDest")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetImpostoICMSUFDest extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcufdest")
    @XmlElement(name = "vBCUFDest")
    private String vBCUFDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcfcpufdest")
    @XmlElement(name = "vBCFCPUFDest")
    private String vBCFCPUFDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pfcpufdest")
    @XmlElement(name = "pFCPUFDest")
    private String pFCPUFDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("picmsufdest")
    @XmlElement(name = "pICMSUFDest")
    private String pICMSUFDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("picmsinter")
    @XmlElement(name = "pICMSInter")
    private String pICMSInter;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("picmsinterpart")
    @XmlElement(name = "pICMSInterPart")
    private String pICMSInterPart;

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

    public NFeInfNFeDetImpostoICMSUFDest() {}

    public NFeInfNFeDetImpostoICMSUFDest(String vBCUFDest, String vBCFCPUFDest, String pFCPUFDest, String pICMSUFDest, String pICMSInter, String pICMSInterPart, String vFCPUFDest, String vICMSUFDest, String vICMSUFRemet) {
        this.vBCUFDest = vBCUFDest;
        this.vBCFCPUFDest = vBCFCPUFDest;
        this.pFCPUFDest = pFCPUFDest;
        this.pICMSUFDest = pICMSUFDest;
        this.pICMSInter = pICMSInter;
        this.pICMSInterPart = pICMSInterPart;
        this.vFCPUFDest = vFCPUFDest;
        this.vICMSUFDest = vICMSUFDest;
        this.vICMSUFRemet = vICMSUFRemet;
    }

	public String getvBCUFDest() {
		return vBCUFDest;
	}

	public void setvBCUFDest(String vBCUFDest) {
		this.vBCUFDest = vBCUFDest;
	}

	public String getvBCFCPUFDest() {
		return vBCFCPUFDest;
	}

	public void setvBCFCPUFDest(String vBCFCPUFDest) {
		this.vBCFCPUFDest = vBCFCPUFDest;
	}

	public String getpFCPUFDest() {
		return pFCPUFDest;
	}

	public void setpFCPUFDest(String pFCPUFDest) {
		this.pFCPUFDest = pFCPUFDest;
	}

	public String getpICMSUFDest() {
		return pICMSUFDest;
	}

	public void setpICMSUFDest(String pICMSUFDest) {
		this.pICMSUFDest = pICMSUFDest;
	}

	public String getpICMSInter() {
		return pICMSInter;
	}

	public void setpICMSInter(String pICMSInter) {
		this.pICMSInter = pICMSInter;
	}

	public String getpICMSInterPart() {
		return pICMSInterPart;
	}

	public void setpICMSInterPart(String pICMSInterPart) {
		this.pICMSInterPart = pICMSInterPart;
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

}
