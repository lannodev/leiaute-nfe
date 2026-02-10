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

@JsonRootName("cofins")
@XmlRootElement(name = "COFINS")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetImpostoCOFINS extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cofinsaliq")
    @XmlElement(name = "COFINSAliq")
    private NFeInfNFeDetImpostoCOFINSCOFINSAliq COFINSAliq;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cofinsqtde")
    @XmlElement(name = "COFINSQtde")
    private NFeInfNFeDetImpostoCOFINSCOFINSQtde COFINSQtde;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cofinsnt")
    @XmlElement(name = "COFINSNT")
    private NFeInfNFeDetImpostoCOFINSCOFINSNT COFINSNT;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cofinsoutr")
    @XmlElement(name = "COFINSOutr")
    private NFeInfNFeDetImpostoCOFINSCOFINSOutr COFINSOutr;

    public NFeInfNFeDetImpostoCOFINS() {}

    public NFeInfNFeDetImpostoCOFINS(NFeInfNFeDetImpostoCOFINSCOFINSAliq COFINSAliq, NFeInfNFeDetImpostoCOFINSCOFINSQtde COFINSQtde, NFeInfNFeDetImpostoCOFINSCOFINSNT COFINSNT, NFeInfNFeDetImpostoCOFINSCOFINSOutr COFINSOutr) {
        this.COFINSAliq = COFINSAliq;
        this.COFINSQtde = COFINSQtde;
        this.COFINSNT = COFINSNT;
        this.COFINSOutr = COFINSOutr;
    }

	public NFeInfNFeDetImpostoCOFINSCOFINSAliq getCOFINSAliq() {
		return COFINSAliq;
	}

	public void setCOFINSAliq(NFeInfNFeDetImpostoCOFINSCOFINSAliq cOFINSAliq) {
		COFINSAliq = cOFINSAliq;
	}

	public NFeInfNFeDetImpostoCOFINSCOFINSQtde getCOFINSQtde() {
		return COFINSQtde;
	}

	public void setCOFINSQtde(NFeInfNFeDetImpostoCOFINSCOFINSQtde cOFINSQtde) {
		COFINSQtde = cOFINSQtde;
	}

	public NFeInfNFeDetImpostoCOFINSCOFINSNT getCOFINSNT() {
		return COFINSNT;
	}

	public void setCOFINSNT(NFeInfNFeDetImpostoCOFINSCOFINSNT cOFINSNT) {
		COFINSNT = cOFINSNT;
	}

	public NFeInfNFeDetImpostoCOFINSCOFINSOutr getCOFINSOutr() {
		return COFINSOutr;
	}

	public void setCOFINSOutr(NFeInfNFeDetImpostoCOFINSCOFINSOutr cOFINSOutr) {
		COFINSOutr = cOFINSOutr;
	}

}
