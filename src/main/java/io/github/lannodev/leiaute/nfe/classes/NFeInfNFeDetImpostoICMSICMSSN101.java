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

@JsonRootName("icmssn101")
@XmlRootElement(name = "ICMSSN101")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetImpostoICMSICMSSN101 extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("orig")
    @XmlElement(name = "orig")
    private String orig;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("csosn")
    @XmlElement(name = "CSOSN")
    private String CSOSN;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pcredsn")
    @XmlElement(name = "pCredSN")
    private String pCredSN;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vcredicmssn")
    @XmlElement(name = "vCredICMSSN")
    private String vCredICMSSN;

    public NFeInfNFeDetImpostoICMSICMSSN101() {}

    public NFeInfNFeDetImpostoICMSICMSSN101(String orig, String CSOSN, String pCredSN, String vCredICMSSN) {
        this.orig = orig;
        this.CSOSN = CSOSN;
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
