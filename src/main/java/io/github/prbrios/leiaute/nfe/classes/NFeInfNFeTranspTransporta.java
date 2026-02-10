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

@JsonRootName("transporta")
@XmlRootElement(name = "transporta")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeTranspTransporta extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpj")
    @XmlElement(name = "CNPJ")
    private String CNPJ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cpf")
    @XmlElement(name = "CPF")
    private String CPF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xnome")
    @XmlElement(name = "xNome")
    private String xNome;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ie")
    @XmlElement(name = "IE")
    private String IE;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xender")
    @XmlElement(name = "xEnder")
    private String xEnder;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xmun")
    @XmlElement(name = "xMun")
    private String xMun;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("uf")
    @XmlElement(name = "UF")
    private String UF;

    public NFeInfNFeTranspTransporta() {}

    public NFeInfNFeTranspTransporta(String CNPJ, String CPF, String xNome, String IE, String xEnder, String xMun, String UF) {
        this.CNPJ = CNPJ;
        this.CPF = CPF;
        this.xNome = xNome;
        this.IE = IE;
        this.xEnder = xEnder;
        this.xMun = xMun;
        this.UF = UF;
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

	public String getxNome() {
		return xNome;
	}

	public void setxNome(String xNome) {
		this.xNome = xNome;
	}

	public String getIE() {
		return IE;
	}

	public void setIE(String iE) {
		IE = iE;
	}

	public String getxEnder() {
		return xEnder;
	}

	public void setxEnder(String xEnder) {
		this.xEnder = xEnder;
	}

	public String getxMun() {
		return xMun;
	}

	public void setxMun(String xMun) {
		this.xMun = xMun;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

}
