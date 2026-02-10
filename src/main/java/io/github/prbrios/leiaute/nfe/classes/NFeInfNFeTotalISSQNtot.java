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

@JsonRootName("issqntot")
@XmlRootElement(name = "ISSQNtot")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeTotalISSQNtot extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vserv")
    @XmlElement(name = "vServ")
    private String vServ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @XmlElement(name = "vBC")
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("viss")
    @XmlElement(name = "vISS")
    private String vISS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vpis")
    @XmlElement(name = "vPIS")
    private String vPIS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vcofins")
    @XmlElement(name = "vCOFINS")
    private String vCOFINS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dcompet")
    @XmlElement(name = "dCompet")
    private String dCompet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdeducao")
    @XmlElement(name = "vDeducao")
    private String vDeducao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("voutro")
    @XmlElement(name = "vOutro")
    private String vOutro;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdescincond")
    @XmlElement(name = "vDescIncond")
    private String vDescIncond;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdesccond")
    @XmlElement(name = "vDescCond")
    private String vDescCond;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vissret")
    @XmlElement(name = "vISSRet")
    private String vISSRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cregtrib")
    @XmlElement(name = "cRegTrib")
    private String cRegTrib;

    public NFeInfNFeTotalISSQNtot() {}

    public NFeInfNFeTotalISSQNtot(String vServ, String vBC, String vISS, String vPIS, String vCOFINS, String dCompet, String vDeducao, String vOutro, String vDescIncond, String vDescCond, String vISSRet, String cRegTrib) {
        this.vServ = vServ;
        this.vBC = vBC;
        this.vISS = vISS;
        this.vPIS = vPIS;
        this.vCOFINS = vCOFINS;
        this.dCompet = dCompet;
        this.vDeducao = vDeducao;
        this.vOutro = vOutro;
        this.vDescIncond = vDescIncond;
        this.vDescCond = vDescCond;
        this.vISSRet = vISSRet;
        this.cRegTrib = cRegTrib;
    }

	public String getvServ() {
		return vServ;
	}

	public void setvServ(String vServ) {
		this.vServ = vServ;
	}

	public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
	}

	public String getvISS() {
		return vISS;
	}

	public void setvISS(String vISS) {
		this.vISS = vISS;
	}

	public String getvPIS() {
		return vPIS;
	}

	public void setvPIS(String vPIS) {
		this.vPIS = vPIS;
	}

	public String getvCOFINS() {
		return vCOFINS;
	}

	public void setvCOFINS(String vCOFINS) {
		this.vCOFINS = vCOFINS;
	}

	public String getdCompet() {
		return dCompet;
	}

	public void setdCompet(String dCompet) {
		this.dCompet = dCompet;
	}

	public String getvDeducao() {
		return vDeducao;
	}

	public void setvDeducao(String vDeducao) {
		this.vDeducao = vDeducao;
	}

	public String getvOutro() {
		return vOutro;
	}

	public void setvOutro(String vOutro) {
		this.vOutro = vOutro;
	}

	public String getvDescIncond() {
		return vDescIncond;
	}

	public void setvDescIncond(String vDescIncond) {
		this.vDescIncond = vDescIncond;
	}

	public String getvDescCond() {
		return vDescCond;
	}

	public void setvDescCond(String vDescCond) {
		this.vDescCond = vDescCond;
	}

	public String getvISSRet() {
		return vISSRet;
	}

	public void setvISSRet(String vISSRet) {
		this.vISSRet = vISSRet;
	}

	public String getcRegTrib() {
		return cRegTrib;
	}

	public void setcRegTrib(String cRegTrib) {
		this.cRegTrib = cRegTrib;
	}

}
