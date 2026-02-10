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

@JsonRootName("refecf")
@XmlRootElement(name = "refECF")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeIdeNFrefRefECF extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("mod")
    @XmlElement(name = "mod")
    private String mod;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("necf")
    @XmlElement(name = "nECF")
    private String nECF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ncoo")
    @XmlElement(name = "nCOO")
    private String nCOO;

    public NFeInfNFeIdeNFrefRefECF() {}

    public NFeInfNFeIdeNFrefRefECF(String mod, String nECF, String nCOO) {
        this.mod = mod;
        this.nECF = nECF;
        this.nCOO = nCOO;
    }

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public String getnECF() {
		return nECF;
	}

	public void setnECF(String nECF) {
		this.nECF = nECF;
	}

	public String getnCOO() {
		return nCOO;
	}

	public void setnCOO(String nCOO) {
		this.nCOO = nCOO;
	}

}
