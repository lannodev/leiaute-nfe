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

@JsonRootName("icms")
@XmlRootElement(name = "ICMS")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetImpostoICMS extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icms00")
    @XmlElement(name = "ICMS00")
    private NFeInfNFeDetImpostoICMSICMS00 ICMS00;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icms10")
    @XmlElement(name = "ICMS10")
    private NFeInfNFeDetImpostoICMSICMS10 ICMS10;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icms20")
    @XmlElement(name = "ICMS20")
    private NFeInfNFeDetImpostoICMSICMS20 ICMS20;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icms30")
    @XmlElement(name = "ICMS30")
    private NFeInfNFeDetImpostoICMSICMS30 ICMS30;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icms40")
    @XmlElement(name = "ICMS40")
    private NFeInfNFeDetImpostoICMSICMS40 ICMS40;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icms51")
    @XmlElement(name = "ICMS51")
    private NFeInfNFeDetImpostoICMSICMS51 ICMS51;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icms60")
    @XmlElement(name = "ICMS60")
    private NFeInfNFeDetImpostoICMSICMS60 ICMS60;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icms70")
    @XmlElement(name = "ICMS70")
    private NFeInfNFeDetImpostoICMSICMS70 ICMS70;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icms90")
    @XmlElement(name = "ICMS90")
    private NFeInfNFeDetImpostoICMSICMS90 ICMS90;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icmspart")
    @XmlElement(name = "ICMSPart")
    private NFeInfNFeDetImpostoICMSICMSPart ICMSPart;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icmsst")
    @XmlElement(name = "ICMSST")
    private NFeInfNFeDetImpostoICMSICMSST ICMSST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icmssn101")
    @XmlElement(name = "ICMSSN101")
    private NFeInfNFeDetImpostoICMSICMSSN101 ICMSSN101;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icmssn102")
    @XmlElement(name = "ICMSSN102")
    private NFeInfNFeDetImpostoICMSICMSSN102 ICMSSN102;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icmssn201")
    @XmlElement(name = "ICMSSN201")
    private NFeInfNFeDetImpostoICMSICMSSN201 ICMSSN201;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icmssn202")
    @XmlElement(name = "ICMSSN202")
    private NFeInfNFeDetImpostoICMSICMSSN202 ICMSSN202;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icmssn500")
    @XmlElement(name = "ICMSSN500")
    private NFeInfNFeDetImpostoICMSICMSSN500 ICMSSN500;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icmssn900")
    @XmlElement(name = "ICMSSN900")
    private NFeInfNFeDetImpostoICMSICMSSN900 ICMSSN900;

    public NFeInfNFeDetImpostoICMS() {}

    public NFeInfNFeDetImpostoICMS(NFeInfNFeDetImpostoICMSICMS00 ICMS00, NFeInfNFeDetImpostoICMSICMS10 ICMS10, NFeInfNFeDetImpostoICMSICMS20 ICMS20, NFeInfNFeDetImpostoICMSICMS30 ICMS30, NFeInfNFeDetImpostoICMSICMS40 ICMS40, NFeInfNFeDetImpostoICMSICMS51 ICMS51, NFeInfNFeDetImpostoICMSICMS60 ICMS60, NFeInfNFeDetImpostoICMSICMS70 ICMS70, NFeInfNFeDetImpostoICMSICMS90 ICMS90, NFeInfNFeDetImpostoICMSICMSPart ICMSPart, NFeInfNFeDetImpostoICMSICMSST ICMSST, NFeInfNFeDetImpostoICMSICMSSN101 ICMSSN101, NFeInfNFeDetImpostoICMSICMSSN102 ICMSSN102, NFeInfNFeDetImpostoICMSICMSSN201 ICMSSN201, NFeInfNFeDetImpostoICMSICMSSN202 ICMSSN202, NFeInfNFeDetImpostoICMSICMSSN500 ICMSSN500, NFeInfNFeDetImpostoICMSICMSSN900 ICMSSN900) {
        this.ICMS00 = ICMS00;
        this.ICMS10 = ICMS10;
        this.ICMS20 = ICMS20;
        this.ICMS30 = ICMS30;
        this.ICMS40 = ICMS40;
        this.ICMS51 = ICMS51;
        this.ICMS60 = ICMS60;
        this.ICMS70 = ICMS70;
        this.ICMS90 = ICMS90;
        this.ICMSPart = ICMSPart;
        this.ICMSST = ICMSST;
        this.ICMSSN101 = ICMSSN101;
        this.ICMSSN102 = ICMSSN102;
        this.ICMSSN201 = ICMSSN201;
        this.ICMSSN202 = ICMSSN202;
        this.ICMSSN500 = ICMSSN500;
        this.ICMSSN900 = ICMSSN900;
    }

	public NFeInfNFeDetImpostoICMSICMS00 getICMS00() {
		return ICMS00;
	}

	public void setICMS00(NFeInfNFeDetImpostoICMSICMS00 iCMS00) {
		ICMS00 = iCMS00;
	}

	public NFeInfNFeDetImpostoICMSICMS10 getICMS10() {
		return ICMS10;
	}

	public void setICMS10(NFeInfNFeDetImpostoICMSICMS10 iCMS10) {
		ICMS10 = iCMS10;
	}

	public NFeInfNFeDetImpostoICMSICMS20 getICMS20() {
		return ICMS20;
	}

	public void setICMS20(NFeInfNFeDetImpostoICMSICMS20 iCMS20) {
		ICMS20 = iCMS20;
	}

	public NFeInfNFeDetImpostoICMSICMS30 getICMS30() {
		return ICMS30;
	}

	public void setICMS30(NFeInfNFeDetImpostoICMSICMS30 iCMS30) {
		ICMS30 = iCMS30;
	}

	public NFeInfNFeDetImpostoICMSICMS40 getICMS40() {
		return ICMS40;
	}

	public void setICMS40(NFeInfNFeDetImpostoICMSICMS40 iCMS40) {
		ICMS40 = iCMS40;
	}

	public NFeInfNFeDetImpostoICMSICMS51 getICMS51() {
		return ICMS51;
	}

	public void setICMS51(NFeInfNFeDetImpostoICMSICMS51 iCMS51) {
		ICMS51 = iCMS51;
	}

	public NFeInfNFeDetImpostoICMSICMS60 getICMS60() {
		return ICMS60;
	}

	public void setICMS60(NFeInfNFeDetImpostoICMSICMS60 iCMS60) {
		ICMS60 = iCMS60;
	}

	public NFeInfNFeDetImpostoICMSICMS70 getICMS70() {
		return ICMS70;
	}

	public void setICMS70(NFeInfNFeDetImpostoICMSICMS70 iCMS70) {
		ICMS70 = iCMS70;
	}

	public NFeInfNFeDetImpostoICMSICMS90 getICMS90() {
		return ICMS90;
	}

	public void setICMS90(NFeInfNFeDetImpostoICMSICMS90 iCMS90) {
		ICMS90 = iCMS90;
	}

	public NFeInfNFeDetImpostoICMSICMSPart getICMSPart() {
		return ICMSPart;
	}

	public void setICMSPart(NFeInfNFeDetImpostoICMSICMSPart iCMSPart) {
		ICMSPart = iCMSPart;
	}

	public NFeInfNFeDetImpostoICMSICMSST getICMSST() {
		return ICMSST;
	}

	public void setICMSST(NFeInfNFeDetImpostoICMSICMSST iCMSST) {
		ICMSST = iCMSST;
	}

	public NFeInfNFeDetImpostoICMSICMSSN101 getICMSSN101() {
		return ICMSSN101;
	}

	public void setICMSSN101(NFeInfNFeDetImpostoICMSICMSSN101 iCMSSN101) {
		ICMSSN101 = iCMSSN101;
	}

	public NFeInfNFeDetImpostoICMSICMSSN102 getICMSSN102() {
		return ICMSSN102;
	}

	public void setICMSSN102(NFeInfNFeDetImpostoICMSICMSSN102 iCMSSN102) {
		ICMSSN102 = iCMSSN102;
	}

	public NFeInfNFeDetImpostoICMSICMSSN201 getICMSSN201() {
		return ICMSSN201;
	}

	public void setICMSSN201(NFeInfNFeDetImpostoICMSICMSSN201 iCMSSN201) {
		ICMSSN201 = iCMSSN201;
	}

	public NFeInfNFeDetImpostoICMSICMSSN202 getICMSSN202() {
		return ICMSSN202;
	}

	public void setICMSSN202(NFeInfNFeDetImpostoICMSICMSSN202 iCMSSN202) {
		ICMSSN202 = iCMSSN202;
	}

	public NFeInfNFeDetImpostoICMSICMSSN500 getICMSSN500() {
		return ICMSSN500;
	}

	public void setICMSSN500(NFeInfNFeDetImpostoICMSICMSSN500 iCMSSN500) {
		ICMSSN500 = iCMSSN500;
	}

	public NFeInfNFeDetImpostoICMSICMSSN900 getICMSSN900() {
		return ICMSSN900;
	}

	public void setICMSSN900(NFeInfNFeDetImpostoICMSICMSSN900 iCMSSN900) {
		ICMSSN900 = iCMSSN900;
	}

}
