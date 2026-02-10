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

@JsonRootName("card")
@XmlRootElement(name = "card")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFePagDetPagCard extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpintegra")
    @XmlElement(name = "tpIntegra")
    private String tpIntegra;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpj")
    @XmlElement(name = "CNPJ")
    private String CNPJ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tbanc")
    @XmlElement(name = "tBand")
    private String tBand;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("caut")
    @XmlElement(name = "cAut")
    private String cAut;

    public NFeInfNFePagDetPagCard() {}

    public NFeInfNFePagDetPagCard(String tpIntegra, String CNPJ, String tBand, String cAut) {
        this.tpIntegra = tpIntegra;
        this.CNPJ = CNPJ;
        this.tBand = tBand;
        this.cAut = cAut;
    }

	public String getTpIntegra() {
		return tpIntegra;
	}

	public void setTpIntegra(String tpIntegra) {
		this.tpIntegra = tpIntegra;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String gettBand() {
		return tBand;
	}

	public void settBand(String tBand) {
		this.tBand = tBand;
	}

	public String getcAut() {
		return cAut;
	}

	public void setcAut(String cAut) {
		this.cAut = cAut;
	}

}
