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

@JsonRootName("retirada")
@XmlRootElement(name = "retirada")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeRetirada extends Base {

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
    @JsonProperty("xlgr")
    @XmlElement(name = "xLgr")
    private String xLgr;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nro")
    @XmlElement(name = "nro")
    private String nro;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xcpl")
    @XmlElement(name = "xCpl")
    private String xCpl;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xbairro")
    @XmlElement(name = "xBairro")
    private String xBairro;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cmun")
    @XmlElement(name = "cMun")
    private String cMun;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xmun")
    @XmlElement(name = "xMun")
    private String xMun;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("uf")
    @XmlElement(name = "UF")
    private String UF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cep")
    @XmlElement(name = "CEP")
    private String CEP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cpais")
    @XmlElement(name = "cPais")
    private String cPais;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xpais")
    @XmlElement(name = "xPais")
    private String xPais;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("fone")
    @XmlElement(name = "fone")
    private String fone;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("email")
    @XmlElement(name = "email")
    private String email;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ie")
    @XmlElement(name = "IE")
    private String IE;

    public NFeInfNFeRetirada() {}

    public NFeInfNFeRetirada(String CNPJ, String CPF, String xNome, String xLgr, String nro, String xCpl, String xBairro, String cMun, String xMun, String UF, String CEP, String cPais, String xPais, String fone, String email, String IE) {
        this.CNPJ = CNPJ;
        this.CPF = CPF;
        this.xNome = xNome;
        this.xLgr = xLgr;
        this.nro = nro;
        this.xCpl = xCpl;
        this.xBairro = xBairro;
        this.cMun = cMun;
        this.xMun = xMun;
        this.UF = UF;
        this.CEP = CEP;
        this.cPais = cPais;
        this.xPais = xPais;
        this.fone = fone;
        this.email = email;
        this.IE = IE;
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

	public String getxLgr() {
		return xLgr;
	}

	public void setxLgr(String xLgr) {
		this.xLgr = xLgr;
	}

	public String getNro() {
		return nro;
	}

	public void setNro(String nro) {
		this.nro = nro;
	}

	public String getxCpl() {
		return xCpl;
	}

	public void setxCpl(String xCpl) {
		this.xCpl = xCpl;
	}

	public String getxBairro() {
		return xBairro;
	}

	public void setxBairro(String xBairro) {
		this.xBairro = xBairro;
	}

	public String getcMun() {
		return cMun;
	}

	public void setcMun(String cMun) {
		this.cMun = cMun;
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

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getcPais() {
		return cPais;
	}

	public void setcPais(String cPais) {
		this.cPais = cPais;
	}

	public String getxPais() {
		return xPais;
	}

	public void setxPais(String xPais) {
		this.xPais = xPais;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIE() {
		return IE;
	}

	public void setIE(String iE) {
		IE = iE;
	}

}
