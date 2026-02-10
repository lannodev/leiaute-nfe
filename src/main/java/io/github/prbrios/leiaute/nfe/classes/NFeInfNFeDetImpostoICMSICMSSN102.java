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

@JsonRootName("icmssn102")
@XmlRootElement(name = "ICMSSN102")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetImpostoICMSICMSSN102 extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("orig")
    @XmlElement(name = "orig")
    private String orig;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("csosn")
    @XmlElement(name = "CSOSN")
    private String CSOSN;

    public NFeInfNFeDetImpostoICMSICMSSN102() {}

    public NFeInfNFeDetImpostoICMSICMSSN102(String orig, String CSOSN) {
        this.orig = orig;
        this.CSOSN = CSOSN;
    }

	public String getOrig() {
		return orig;
	}

	public void setOrig(String orig) {
		this.orig = orig;
	}

	public String getCSOSN() {
		return CSOSN;
	}

	public void setCSOSN(String cSOSN) {
		CSOSN = cSOSN;
	}

}
