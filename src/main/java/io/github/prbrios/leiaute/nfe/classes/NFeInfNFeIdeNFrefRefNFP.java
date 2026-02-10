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

@JsonRootName("refnfp")
@XmlRootElement(name = "refNFP")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeIdeNFrefRefNFP extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cuf")
    @XmlElement(name = "cUF")
    private String cUF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("aamm")
    @XmlElement(name = "AAMM")
    private String AAMM;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnp")
    @XmlElement(name = "CNPJ")
    private String CNPJ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cpf")
    @XmlElement(name = "CPF")
    private String CPF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ie")
    @XmlElement(name = "IE")
    private String IE;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("mod")
    @XmlElement(name = "mod")
    private String mod;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("serie")
    @XmlElement(name = "serie")
    private String serie;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nnf")
    @XmlElement(name = "nNF")
    private String nNF;

    public NFeInfNFeIdeNFrefRefNFP() {}

    public NFeInfNFeIdeNFrefRefNFP(String cUF, String AAMM, String CNPJ, String CPF, String IE, String mod, String serie, String nNF) {
        this.cUF = cUF;
        this.AAMM = AAMM;
        this.CNPJ = CNPJ;
        this.CPF = CPF;
        this.IE = IE;
        this.mod = mod;
        this.serie = serie;
        this.nNF = nNF;
    }

	public String getcUF() {
		return cUF;
	}

	public void setcUF(String cUF) {
		this.cUF = cUF;
	}

	public String getAAMM() {
		return AAMM;
	}

	public void setAAMM(String aAMM) {
		AAMM = aAMM;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getIE() {
		return IE;
	}

	public void setIE(String iE) {
		IE = iE;
	}

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getnNF() {
		return nNF;
	}

	public void setnNF(String nNF) {
		this.nNF = nNF;
	}

}
