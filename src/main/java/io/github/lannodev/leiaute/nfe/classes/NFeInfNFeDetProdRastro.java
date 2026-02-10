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

@JsonRootName("rastro")
@XmlRootElement(name = "rastro")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetProdRastro extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nlote")
    @XmlElement(name = "nLote")
    private String nLote;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qlote")
    @XmlElement(name = "qLote")
    private String qLote;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dfab")
    @XmlElement(name = "dFab")
    private String dFab;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dval")
    @XmlElement(name = "dVal")
    private String dVal;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cagreg")
    @XmlElement(name = "cAgreg")
    private String cAgreg;

    public NFeInfNFeDetProdRastro() {}

    public NFeInfNFeDetProdRastro(String nLote, String qLote, String dFab, String dVal, String cAgreg) {
        this.nLote = nLote;
        this.qLote = qLote;
        this.dFab = dFab;
        this.dVal = dVal;
        this.cAgreg = cAgreg;
    }

	public String getnLote() {
		return nLote;
	}

	public void setnLote(String nLote) {
		this.nLote = nLote;
	}

	public String getqLote() {
		return qLote;
	}

	public void setqLote(String qLote) {
		this.qLote = qLote;
	}

	public String getdFab() {
		return dFab;
	}

	public void setdFab(String dFab) {
		this.dFab = dFab;
	}

	public String getdVal() {
		return dVal;
	}

	public void setdVal(String dVal) {
		this.dVal = dVal;
	}

	public String getcAgreg() {
		return cAgreg;
	}

	public void setcAgreg(String cAgreg) {
		this.cAgreg = cAgreg;
	}

}
