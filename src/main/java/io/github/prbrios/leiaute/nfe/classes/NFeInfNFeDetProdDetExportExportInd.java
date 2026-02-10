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

@JsonRootName("exportind")
@XmlRootElement(name = "exportInd")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetProdDetExportExportInd extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nre")
    @XmlElement(name = "nRE")
    private String nRE;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("chnfe")
    @XmlElement(name = "chNFe")
    private String chNFe;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qexport")
    @XmlElement(name = "qExport")
    private String qExport;

    public NFeInfNFeDetProdDetExportExportInd() {}

    public NFeInfNFeDetProdDetExportExportInd(String nRE, String chNFe, String qExport) {
        this.nRE = nRE;
        this.chNFe = chNFe;
        this.qExport = qExport;
    }

	public String getnRE() {
		return nRE;
	}

	public void setnRE(String nRE) {
		this.nRE = nRE;
	}

	public String getChNFe() {
		return chNFe;
	}

	public void setChNFe(String chNFe) {
		this.chNFe = chNFe;
	}

	public String getqExport() {
		return qExport;
	}

	public void setqExport(String qExport) {
		this.qExport = qExport;
	}

}
