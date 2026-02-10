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

@JsonRootName("rettrib")
@XmlRootElement(name = "retTrib")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeTotalRetTrib extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vretpis")
    @XmlElement(name = "vRetPIS")
    private String vRetPIS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vretcofins")
    @XmlElement(name = "vRetCOFINS")
    private String vRetCOFINS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vretcsll")
    @XmlElement(name = "vRetCSLL")
    private String vRetCSLL;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcirrf")
    @XmlElement(name = "vBCIRRF")
    private String vBCIRRF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("virrf")
    @XmlElement(name = "vIRRF")
    private String vIRRF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcretprev")
    @XmlElement(name = "vBCRetPrev")
    private String vBCRetPrev;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vretprev")
    @XmlElement(name = "vRetPrev")
    private String vRetPrev;

    public NFeInfNFeTotalRetTrib() {}

    public NFeInfNFeTotalRetTrib(String vRetPIS, String vRetCOFINS, String vRetCSLL, String vBCIRRF, String vIRRF, String vBCRetPrev, String vRetPrev) {
        this.vRetPIS = vRetPIS;
        this.vRetCOFINS = vRetCOFINS;
        this.vRetCSLL = vRetCSLL;
        this.vBCIRRF = vBCIRRF;
        this.vIRRF = vIRRF;
        this.vBCRetPrev = vBCRetPrev;
        this.vRetPrev = vRetPrev;
    }

	public String getvRetPIS() {
		return vRetPIS;
	}

	public void setvRetPIS(String vRetPIS) {
		this.vRetPIS = vRetPIS;
	}

	public String getvRetCOFINS() {
		return vRetCOFINS;
	}

	public void setvRetCOFINS(String vRetCOFINS) {
		this.vRetCOFINS = vRetCOFINS;
	}

	public String getvRetCSLL() {
		return vRetCSLL;
	}

	public void setvRetCSLL(String vRetCSLL) {
		this.vRetCSLL = vRetCSLL;
	}

	public String getvBCIRRF() {
		return vBCIRRF;
	}

	public void setvBCIRRF(String vBCIRRF) {
		this.vBCIRRF = vBCIRRF;
	}

	public String getvIRRF() {
		return vIRRF;
	}

	public void setvIRRF(String vIRRF) {
		this.vIRRF = vIRRF;
	}

	public String getvBCRetPrev() {
		return vBCRetPrev;
	}

	public void setvBCRetPrev(String vBCRetPrev) {
		this.vBCRetPrev = vBCRetPrev;
	}

	public String getvRetPrev() {
		return vRetPrev;
	}

	public void setvRetPrev(String vRetPrev) {
		this.vRetPrev = vRetPrev;
	}

}
