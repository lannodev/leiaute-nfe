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

@JsonRootName("detpag")
@XmlRootElement(name = "detPag")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFePagDetPag extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indpag")
    @XmlElement(name = "indPag")
    private String indPag;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpag")
    @XmlElement(name = "tPag")
    private String tPag;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xpag")
    @XmlElement(name = "xPag")
    private String xPag;
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vpag")
    @XmlElement(name = "vPag")
    private String vPag;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("card")
    @XmlElement(name = "card")
    private NFeInfNFePagDetPagCard card;

    public NFeInfNFePagDetPag() {}

    public NFeInfNFePagDetPag(String indPag, String tPag, String vPag, NFeInfNFePagDetPagCard card) {
        this.indPag = indPag;
        this.tPag = tPag;
        this.vPag = vPag;
        this.card = card;
    }

	public String getIndPag() {
		return indPag;
	}

	public void setIndPag(String indPag) {
		this.indPag = indPag;
	}

	public String gettPag() {
		return tPag;
	}

	public void settPag(String tPag) {
		this.tPag = tPag;
	}

	public String getxPag() {
		return xPag;
	}

	public void setxPag(String xPag) {
		this.xPag = xPag;
	}

	public String getvPag() {
		return vPag;
	}

	public void setvPag(String vPag) {
		this.vPag = vPag;
	}

	public NFeInfNFePagDetPagCard getCard() {
		return card;
	}

	public void setCard(NFeInfNFePagDetPagCard card) {
		this.card = card;
	}

}
