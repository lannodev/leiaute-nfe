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
package io.github.lannodev.leiaute.nfe.classes.retorno;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import io.github.lannodev.leiaute.nfe.Base;
import jakarta.xml.bind.annotation.*;

@JsonRootName("infprot")
@XmlRootElement(name = "infProt")
@XmlAccessorType(XmlAccessType.FIELD)
public class RetEnviNFeProtNFeInfProt extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("id")
    @XmlAttribute(name = "Id")
    private String id;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpamb")
    @XmlElement(name = "tpAmb")
    private String tpAmb;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("veraplic")
    @XmlElement(name = "verAplic")
    private String verAplic;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("chnfe")
    @XmlElement(name = "chNFe")
    private String chNFe;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dhrecbto")
    @XmlElement(name = "dhRecbto")
    private String dhRecbto;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nprot")
    @XmlElement(name = "nProt")
    private String nProt;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("digval")
    @XmlElement(name = "digVal")
    private String digVal;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cstat")
    @XmlElement(name = "cStat")
    private String cStat;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xmotivo")
    @XmlElement(name = "xMotivo")
    private String xMotivo;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cmsg")
    @XmlElement(name = "cMsg")
    private String cMsg;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xmsg")
    @XmlElement(name = "xMsg")
    private String xMsg;

    public RetEnviNFeProtNFeInfProt() {}

    public RetEnviNFeProtNFeInfProt(String id, String tpAmb, String verAplic, String chNFe, String dhRecbto, String nProt, String digVal, String cStat, String xMotivo, String cMsg, String xMsg) {
        this.id = id;
        this.tpAmb = tpAmb;
        this.verAplic = verAplic;
        this.chNFe = chNFe;
        this.dhRecbto = dhRecbto;
        this.nProt = nProt;
        this.digVal = digVal;
        this.cStat = cStat;
        this.xMotivo = xMotivo;
        this.cMsg = cMsg;
        this.xMsg = xMsg;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTpAmb() {
		return tpAmb;
	}

	public void setTpAmb(String tpAmb) {
		this.tpAmb = tpAmb;
	}

	public String getVerAplic() {
		return verAplic;
	}

	public void setVerAplic(String verAplic) {
		this.verAplic = verAplic;
	}

	public String getChNFe() {
		return chNFe;
	}

	public void setChNFe(String chNFe) {
		this.chNFe = chNFe;
	}

	public String getDhRecbto() {
		return dhRecbto;
	}

	public void setDhRecbto(String dhRecbto) {
		this.dhRecbto = dhRecbto;
	}

	public String getnProt() {
		return nProt;
	}

	public void setnProt(String nProt) {
		this.nProt = nProt;
	}

	public String getDigVal() {
		return digVal;
	}

	public void setDigVal(String digVal) {
		this.digVal = digVal;
	}

	public String getcStat() {
		return cStat;
	}

	public void setcStat(String cStat) {
		this.cStat = cStat;
	}

	public String getxMotivo() {
		return xMotivo;
	}

	public void setxMotivo(String xMotivo) {
		this.xMotivo = xMotivo;
	}

	public String getcMsg() {
		return cMsg;
	}

	public void setcMsg(String cMsg) {
		this.cMsg = cMsg;
	}

	public String getxMsg() {
		return xMsg;
	}

	public void setxMsg(String xMsg) {
		this.xMsg = xMsg;
	}

}
