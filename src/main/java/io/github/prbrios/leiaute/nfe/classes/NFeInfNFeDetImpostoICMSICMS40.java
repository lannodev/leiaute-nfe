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

@JsonRootName("icms40")
@XmlRootElement(name = "ICMS40")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetImpostoICMSICMS40 extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("orig")
    @XmlElement(name = "orig")
    private String orig;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @XmlElement(name = "CST")
    private String CST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsdeson")
    @XmlElement(name = "vICMSDeson")
    private String vICMSDeson;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("motdesicms")
    @XmlElement(name = "motDesICMS")
    private String motDesICMS;

    public NFeInfNFeDetImpostoICMSICMS40() {}

    public NFeInfNFeDetImpostoICMSICMS40(String orig, String CST, String vICMSDeson, String motDesICMS) {
        this.orig = orig;
        this.CST = CST;
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
