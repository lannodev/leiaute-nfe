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

import java.util.ArrayList;
import java.util.List;

@JsonRootName("cana")
@XmlRootElement(name = "cana")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeCana extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("safra")
    @XmlElement(name = "safra")
    private String safra;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ref")
    @XmlElement(name = "ref")
    private String ref;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("fordia")
	@XmlElement(name = "forDia")
    private List<NFeInfNFeCanaForDia> forDia = new ArrayList<NFeInfNFeCanaForDia>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qtotmes")
    @XmlElement(name = "qTotMes")
    private String qTotMes;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qtotant")
    @XmlElement(name = "qTotAnt")
    private String qTotAnt;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qtotger")
    @XmlElement(name = "qTotGer")
    private String qTotGer;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("deduc")
	@XmlElement(name = "deduc")
    private List<NFeInfNFeCanaDeduc> deduc = new ArrayList<NFeInfNFeCanaDeduc>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfor")
    @XmlElement(name = "vFor")
    private String vFor;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vtotded")
    @XmlElement(name = "vTotDed")
    private String vTotDed;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vliqfor")
    @XmlElement(name = "vLiqFor")
    private String vLiqFor;

    public NFeInfNFeCana() {}

    public NFeInfNFeCana(String safra, String ref, List<NFeInfNFeCanaForDia> forDia, String qTotMes, String qTotAnt, String qTotGer, List<NFeInfNFeCanaDeduc> deduc, String vFor, String vTotDed, String vLiqFor) {
        this.safra = safra;
        this.ref = ref;
        this.forDia = forDia;
        this.qTotMes = qTotMes;
        this.qTotAnt = qTotAnt;
        this.qTotGer = qTotGer;
        this.deduc = deduc;
        this.vFor = vFor;
        this.vTotDed = vTotDed;
        this.vLiqFor = vLiqFor;
    }

	public String getSafra() {
		return safra;
	}

	public void setSafra(String safra) {
		this.safra = safra;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public List<NFeInfNFeCanaForDia> getForDia() {
		return forDia;
	}

	public void setForDia(List<NFeInfNFeCanaForDia> forDia) {
		this.forDia = forDia;
	}

	public String getqTotMes() {
		return qTotMes;
	}

	public void setqTotMes(String qTotMes) {
		this.qTotMes = qTotMes;
	}

	public String getqTotAnt() {
		return qTotAnt;
	}

	public void setqTotAnt(String qTotAnt) {
		this.qTotAnt = qTotAnt;
	}

	public String getqTotGer() {
		return qTotGer;
	}

	public void setqTotGer(String qTotGer) {
		this.qTotGer = qTotGer;
	}

	public List<NFeInfNFeCanaDeduc> getDeduc() {
		return deduc;
	}

	public void setDeduc(List<NFeInfNFeCanaDeduc> deduc) {
		this.deduc = deduc;
	}

	public String getvFor() {
		return vFor;
	}

	public void setvFor(String vFor) {
		this.vFor = vFor;
	}

	public String getvTotDed() {
		return vTotDed;
	}

	public void setvTotDed(String vTotDed) {
		this.vTotDed = vTotDed;
	}

	public String getvLiqFor() {
		return vLiqFor;
	}

	public void setvLiqFor(String vLiqFor) {
		this.vLiqFor = vLiqFor;
	}

}
