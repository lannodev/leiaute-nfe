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

@JsonRootName("cofinsqtde")
@XmlRootElement(name = "COFINSQtde")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetImpostoCOFINSCOFINSQtde extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @XmlElement(name = "CST")
    private String CST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qbcprod")
    @XmlElement(name = "qBCProd")
    private String qBCProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("valiqprod")
    @XmlElement(name = "vAliqProd")
    private String vAliqProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vcofins")
    @XmlElement(name = "vCOFINS")
    private String vCOFINS;

    public NFeInfNFeDetImpostoCOFINSCOFINSQtde() {}

    public NFeInfNFeDetImpostoCOFINSCOFINSQtde(String CST, String qBCProd, String vAliqProd, String vCOFINS) {
        this.CST = CST;
        this.qBCProd = qBCProd;
        this.vAliqProd = vAliqProd;
        this.vCOFINS = vCOFINS;
    }

	public String getCST() {
		return CST;
	}

	public void setCST(String cST) {
		CST = cST;
	}

	public String getqBCProd() {
		return qBCProd;
	}

	public void setqBCProd(String qBCProd) {
		this.qBCProd = qBCProd;
	}

	public String getvAliqProd() {
		return vAliqProd;
	}

	public void setvAliqProd(String vAliqProd) {
		this.vAliqProd = vAliqProd;
	}

	public String getvCOFINS() {
		return vCOFINS;
	}

	public void setvCOFINS(String vCOFINS) {
		this.vCOFINS = vCOFINS;
	}

}
