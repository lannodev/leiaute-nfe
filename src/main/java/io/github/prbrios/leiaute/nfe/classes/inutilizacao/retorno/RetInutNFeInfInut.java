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
package io.github.prbrios.leiaute.nfe.classes.inutilizacao.retorno;


import io.github.prbrios.leiaute.nfe.Base;
import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "infInut")
@XmlAccessorType(XmlAccessType.FIELD)
public class RetInutNFeInfInut extends Base {

    @XmlAttribute(name = "Id")
    private String id;

    @XmlElement(name = "tpAmb")
    private String tpAmb;

    @XmlElement(name = "verAplic")
    private String verAplic;

    @XmlElement(name = "cStat")
    private String cStat;

    @XmlElement(name = "xMotivo")
    private String xMotivo;

    @XmlElement(name = "cUF")
    private String cUF;

    @XmlElement(name = "ano")
    private String ano;

    @XmlElement(name = "CNPJ")
    private String CNPJ;

    @XmlElement(name = "mod")
    private String mod;

    @XmlElement(name = "serie")
    private String serie;

    @XmlElement(name = "nNFIni")
    private String nNFIni;

    @XmlElement(name = "nNFFin")
    private String nNFFin;

    @XmlElement(name = "dhRecbto")
    private String dhRecbto;

    @XmlElement(name = "nProt")
    private String nProt;

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

	public String getcUF() {
		return cUF;
	}

	public void setcUF(String cUF) {
		this.cUF = cUF;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getnNFIni() {
		return nNFIni;
	}

	public void setnNFIni(String nNFIni) {
		this.nNFIni = nNFIni;
	}

	public String getnNFFin() {
		return nNFFin;
	}

	public void setnNFFin(String nNFFin) {
		this.nNFFin = nNFFin;
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

}
