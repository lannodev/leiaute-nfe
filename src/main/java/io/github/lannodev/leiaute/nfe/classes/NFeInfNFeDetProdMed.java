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

@JsonRootName("med")
@XmlRootElement(name = "med")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetProdMed extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cprodanvisa")
    @XmlElement(name = "cProdANVISA")
    private String cProdANVISA;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xmotivoisencao")
    @XmlElement(name = "xMotivoIsencao")
    private String xMotivoIsencao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vpmc")
    @XmlElement(name = "vPMC")
    private String vPMC;

    public NFeInfNFeDetProdMed() {}

    public NFeInfNFeDetProdMed(String cProdANVISA, String xMotivoIsencao, String vPMC) {
        this.cProdANVISA = cProdANVISA;
        this.xMotivoIsencao = xMotivoIsencao;
        this.vPMC = vPMC;
    }

	public String getcProdANVISA() {
		return cProdANVISA;
	}

	public void setcProdANVISA(String cProdANVISA) {
		this.cProdANVISA = cProdANVISA;
	}

	public String getxMotivoIsencao() {
		return xMotivoIsencao;
	}

	public void setxMotivoIsencao(String xMotivoIsencao) {
		this.xMotivoIsencao = xMotivoIsencao;
	}

	public String getvPMC() {
		return vPMC;
	}

	public void setvPMC(String vPMC) {
		this.vPMC = vPMC;
	}

}
