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

@JsonRootName("ipi")
@XmlRootElement(name = "IPI")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetImpostoIPI extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpjprod")
    @XmlElement(name = "CNPJProd")
    private String CNPJProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cselo")
    @XmlElement(name = "cSelo")
    private String cSelo;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qselo")
    @XmlElement(name = "qSelo")
    private String qSelo;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cenq")
    @XmlElement(name = "cEnq")
    private String cEnq;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ipitrib")
    @XmlElement(name = "IPITrib")
    private NFeInfNFeDetImpostoIPIIPITrib IPITrib;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ipint")
    @XmlElement(name = "IPINT")
    private NFeInfNFeDetImpostoIPIIPINT IPINT;

    public NFeInfNFeDetImpostoIPI() {}

    public NFeInfNFeDetImpostoIPI(String CNPJProd, String cSelo, String qSelo, String cEnq, NFeInfNFeDetImpostoIPIIPITrib IPITrib, NFeInfNFeDetImpostoIPIIPINT IPINT) {
        this.CNPJProd = CNPJProd;
        this.cSelo = cSelo;
        this.qSelo = qSelo;
        this.cEnq = cEnq;
        this.IPITrib = IPITrib;
        this.IPINT = IPINT;
    }

	public String getCNPJProd() {
		return CNPJProd;
	}

	public void setCNPJProd(String cNPJProd) {
		CNPJProd = cNPJProd;
	}

	public String getcSelo() {
		return cSelo;
	}

	public void setcSelo(String cSelo) {
		this.cSelo = cSelo;
	}

	public String getqSelo() {
		return qSelo;
	}

	public void setqSelo(String qSelo) {
		this.qSelo = qSelo;
	}

	public String getcEnq() {
		return cEnq;
	}

	public void setcEnq(String cEnq) {
		this.cEnq = cEnq;
	}

	public NFeInfNFeDetImpostoIPIIPITrib getIPITrib() {
		return IPITrib;
	}

	public void setIPITrib(NFeInfNFeDetImpostoIPIIPITrib iPITrib) {
		IPITrib = iPITrib;
	}

	public NFeInfNFeDetImpostoIPIIPINT getIPINT() {
		return IPINT;
	}

	public void setIPINT(NFeInfNFeDetImpostoIPIIPINT iPINT) {
		IPINT = iPINT;
	}

}
