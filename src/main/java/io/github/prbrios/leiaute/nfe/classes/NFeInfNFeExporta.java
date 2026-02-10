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

@JsonRootName("exporta")
@XmlRootElement(name = "exporta")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeExporta extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ufsaidapais")
    @XmlElement(name = "UFSaidaPais")
    private String UFSaidaPais;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xlocexporta")
    @XmlElement(name = "xLocExporta")
    private String xLocExporta;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xlocdespacho")
    @XmlElement(name = "xLocDespacho")
    private String xLocDespacho;

    public NFeInfNFeExporta() {}

    public NFeInfNFeExporta(String UFSaidaPais, String xLocExporta, String xLocDespacho) {
        this.UFSaidaPais = UFSaidaPais;
        this.xLocExporta = xLocExporta;
        this.xLocDespacho = xLocDespacho;
    }

	public String getUFSaidaPais() {
		return UFSaidaPais;
	}

	public void setUFSaidaPais(String uFSaidaPais) {
		UFSaidaPais = uFSaidaPais;
	}

	public String getxLocExporta() {
		return xLocExporta;
	}

	public void setxLocExporta(String xLocExporta) {
		this.xLocExporta = xLocExporta;
	}

	public String getxLocDespacho() {
		return xLocDespacho;
	}

	public void setxLocDespacho(String xLocDespacho) {
		this.xLocDespacho = xLocDespacho;
	}

}
