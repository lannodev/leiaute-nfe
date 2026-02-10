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

@JsonRootName("procref")
@XmlRootElement(name = "procRef")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeInfAdicProcRef extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nproc")
    @XmlElement(name = "nProc")
    private String nProc;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indproc")
    @XmlElement(name = "indProc")
    private String indProc;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpato")
    @XmlElement(name = "tpAto")
    private String tpAto;

    public NFeInfNFeInfAdicProcRef() {}

    public NFeInfNFeInfAdicProcRef(String nProc, String indProc) {
        this.nProc = nProc;
        this.indProc = indProc;
    }

    public NFeInfNFeInfAdicProcRef(String nProc, String indProc, String tpAto) {
        this.nProc = nProc;
        this.indProc = indProc;
        this.tpAto = tpAto;
    }

	public String getnProc() {
		return nProc;
	}

	public void setnProc(String nProc) {
		this.nProc = nProc;
	}

	public String getIndProc() {
		return indProc;
	}

	public void setIndProc(String indProc) {
		this.indProc = indProc;
	}

    public String getTpAto() {
        return tpAto;
    }

    public void setTpAto(String tpAto) {
        this.tpAto = tpAto;
    }

}
