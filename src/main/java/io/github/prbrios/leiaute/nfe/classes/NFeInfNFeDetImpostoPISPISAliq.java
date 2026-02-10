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

@JsonRootName("pisaliq")
@XmlRootElement(name = "PISAliq")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetImpostoPISPISAliq extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @XmlElement(name = "CST")
    private String CST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @XmlElement(name = "vBC")
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ppis")
    @XmlElement(name = "pPIS")
    private String pPIS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vpis")
    @XmlElement(name = "vPIS")
    private String vPIS;

    public NFeInfNFeDetImpostoPISPISAliq() {}

    public NFeInfNFeDetImpostoPISPISAliq(String CST, String vBC, String pPIS, String vPIS) {
        this.CST = CST;
        this.vBC = vBC;
        this.pPIS = pPIS;
        this.vPIS = vPIS;
    }

	public String getCST() {
		return CST;
	}

	public void setCST(String cST) {
		CST = cST;
	}

	public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
	}

	public String getpPIS() {
		return pPIS;
	}

	public void setpPIS(String pPIS) {
		this.pPIS = pPIS;
	}

	public String getvPIS() {
		return vPIS;
	}

	public void setvPIS(String vPIS) {
		this.vPIS = vPIS;
	}

}
