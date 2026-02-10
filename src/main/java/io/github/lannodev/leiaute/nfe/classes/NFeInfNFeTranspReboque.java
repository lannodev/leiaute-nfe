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

@JsonRootName("reboque")
@XmlRootElement(name = "reboque")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeTranspReboque extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("placa")
    @XmlElement(name = "placa")
    private String placa;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("uf")
    @XmlElement(name = "UF")
    private String UF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("rntc")
    @XmlElement(name = "RNTC")
    private String RNTC;

    public NFeInfNFeTranspReboque() {}

    public NFeInfNFeTranspReboque(String placa, String UF, String RNTC) {
        this.placa = placa;
        this.UF = UF;
        this.RNTC = RNTC;
    }

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public String getRNTC() {
		return RNTC;
	}

	public void setRNTC(String rNTC) {
		RNTC = rNTC;
	}

}
