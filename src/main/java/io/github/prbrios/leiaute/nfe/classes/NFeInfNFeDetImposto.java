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

@JsonRootName("imposto")
@XmlRootElement(name = "imposto")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetImposto extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vtottrib")
    @XmlElement(name = "vTotTrib")
    private String vTotTrib;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icms")
    @XmlElement(name = "ICMS")
    private NFeInfNFeDetImpostoICMS ICMS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ipi")
    @XmlElement(name = "IPI")
    private NFeInfNFeDetImpostoIPI IPI;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ii")
    @XmlElement(name = "II")
    private NFeInfNFeDetImpostoII II;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("issqn")
    @XmlElement(name = "ISSQN")
    private NFeInfNFeDetImpostoISSQN ISSQN;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pis")
    @XmlElement(name = "PIS")
    private NFeInfNFeDetImpostoPIS PIS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pisst")
    @XmlElement(name = "PISST")
    private NFeInfNFeDetImpostoPISST PISST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cofins")
    @XmlElement(name = "COFINS")
    private NFeInfNFeDetImpostoCOFINS COFINS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cofinsst")
    @XmlElement(name = "COFINSST")
    private NFeInfNFeDetImpostoCOFINSST COFINSST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icmsufdest")
    @XmlElement(name = "ICMSUFDest")
    private NFeInfNFeDetImpostoICMSUFDest ICMSUFDest;

    public NFeInfNFeDetImposto() {}

    public NFeInfNFeDetImposto(String vTotTrib, NFeInfNFeDetImpostoICMS ICMS, NFeInfNFeDetImpostoIPI IPI, NFeInfNFeDetImpostoII II, NFeInfNFeDetImpostoISSQN ISSQN, NFeInfNFeDetImpostoPIS PIS, NFeInfNFeDetImpostoPISST PISST, NFeInfNFeDetImpostoCOFINS COFINS, NFeInfNFeDetImpostoCOFINSST COFINSST, NFeInfNFeDetImpostoICMSUFDest ICMSUFDest) {
        this.vTotTrib = vTotTrib;
        this.ICMS = ICMS;
        this.IPI = IPI;
        this.II = II;
        this.ISSQN = ISSQN;
        this.PIS = PIS;
        this.PISST = PISST;
        this.COFINS = COFINS;
        this.COFINSST = COFINSST;
        this.ICMSUFDest = ICMSUFDest;
    }

	public String getvTotTrib() {
		return vTotTrib;
	}

	public void setvTotTrib(String vTotTrib) {
		this.vTotTrib = vTotTrib;
	}

	public NFeInfNFeDetImpostoICMS getICMS() {
		return ICMS;
	}

	public void setICMS(NFeInfNFeDetImpostoICMS iCMS) {
		ICMS = iCMS;
	}

	public NFeInfNFeDetImpostoIPI getIPI() {
		return IPI;
	}

	public void setIPI(NFeInfNFeDetImpostoIPI iPI) {
		IPI = iPI;
	}

	public NFeInfNFeDetImpostoII getII() {
		return II;
	}

	public void setII(NFeInfNFeDetImpostoII iI) {
		II = iI;
	}

	public NFeInfNFeDetImpostoISSQN getISSQN() {
		return ISSQN;
	}

	public void setISSQN(NFeInfNFeDetImpostoISSQN iSSQN) {
		ISSQN = iSSQN;
	}

	public NFeInfNFeDetImpostoPIS getPIS() {
		return PIS;
	}

	public void setPIS(NFeInfNFeDetImpostoPIS pIS) {
		PIS = pIS;
	}

	public NFeInfNFeDetImpostoPISST getPISST() {
		return PISST;
	}

	public void setPISST(NFeInfNFeDetImpostoPISST pISST) {
		PISST = pISST;
	}

	public NFeInfNFeDetImpostoCOFINS getCOFINS() {
		return COFINS;
	}

	public void setCOFINS(NFeInfNFeDetImpostoCOFINS cOFINS) {
		COFINS = cOFINS;
	}

	public NFeInfNFeDetImpostoCOFINSST getCOFINSST() {
		return COFINSST;
	}

	public void setCOFINSST(NFeInfNFeDetImpostoCOFINSST cOFINSST) {
		COFINSST = cOFINSST;
	}

	public NFeInfNFeDetImpostoICMSUFDest getICMSUFDest() {
		return ICMSUFDest;
	}

	public void setICMSUFDest(NFeInfNFeDetImpostoICMSUFDest iCMSUFDest) {
		ICMSUFDest = iCMSUFDest;
	}

}
