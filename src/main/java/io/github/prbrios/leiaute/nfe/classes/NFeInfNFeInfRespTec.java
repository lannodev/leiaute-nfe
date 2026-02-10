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

@JsonRootName("infresptec")
@XmlRootElement(name = "infRespTec")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeInfRespTec extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpj")
    @XmlElement(name = "CNPJ")
    private String CNPJ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xcontato")
    @XmlElement(name = "xContato")
    private String xContato;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("email")
    @XmlElement(name = "email")
    private String email;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("fone")
    @XmlElement(name = "fone")
    private String fone;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("idcsrt")
    @XmlElement(name = "idCSRT")
    private String idCSRT;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("hashcsrt")
    @XmlElement(name = "hashCSRT")
    private String hashCSRT;

    public NFeInfNFeInfRespTec() {}

    public NFeInfNFeInfRespTec(String CNPJ, String xContato, String email, String fone, String idCSRT, String hashCSRT) {
        this.CNPJ = CNPJ;
        this.xContato = xContato;
        this.email = email;
        this.fone = fone;
        this.idCSRT = idCSRT;
        this.hashCSRT = hashCSRT;
    }

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getxContato() {
		return xContato;
	}

	public void setxContato(String xContato) {
		this.xContato = xContato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getIdCSRT() {
		return idCSRT;
	}

	public void setIdCSRT(String idCSRT) {
		this.idCSRT = idCSRT;
	}

	public String getHashCSRT() {
		return hashCSRT;
	}

	public void setHashCSRT(String hashCSRT) {
		this.hashCSRT = hashCSRT;
	}

}
