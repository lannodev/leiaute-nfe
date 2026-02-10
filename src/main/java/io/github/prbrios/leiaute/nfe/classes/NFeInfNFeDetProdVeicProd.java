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

@JsonRootName("veicprod")
@XmlRootElement(name = "veicProd")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetProdVeicProd extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpop")
    @XmlElement(name = "tpOp")
    private String tpOp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("chassi")
    @XmlElement(name = "chassi")
    private String chassi;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ccor")
    @XmlElement(name = "cCor")
    private String cCor;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xcor")
    @XmlElement(name = "xCor")
    private String xCor;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pot")
    @XmlElement(name = "pot")
    private String pot;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cilin")
    @XmlElement(name = "cilin")
    private String cilin;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pesol")
    @XmlElement(name = "pesoL")
    private String pesoL;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pesob")
    @XmlElement(name = "pesoB")
    private String pesoB;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nserie")
    @XmlElement(name = "nSerie")
    private String nSerie;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpcomb")
    @XmlElement(name = "tpComb")
    private String tpComb;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nmotor")
    @XmlElement(name = "nMotor")
    private String nMotor;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cmt")
    @XmlElement(name = "CMT")
    private String CMT;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dist")
    @XmlElement(name = "dist")
    private String dist;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("anomod")
    @XmlElement(name = "anoMod")
    private String anoMod;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("anofab")
    @XmlElement(name = "anoFab")
    private String anoFab;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tppint")
    @XmlElement(name = "tpPint")
    private String tpPint;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpveic")
    @XmlElement(name = "tpVeic")
    private String tpVeic;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("espveic")
    @XmlElement(name = "espVeic")
    private String espVeic;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vin")
    @XmlElement(name = "VIN")
    private String VIN;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("condveic")
    @XmlElement(name = "condVeic")
    private String condVeic;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cmod")
    @XmlElement(name = "cMod")
    private String cMod;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ccordenatran")
    @XmlElement(name = "cCorDENATRAN")
    private String cCorDENATRAN;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("lota")
    @XmlElement(name = "lota")
    private String lota;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tprest")
    @XmlElement(name = "tpRest")
    private String tpRest;

    public NFeInfNFeDetProdVeicProd() {}

    public NFeInfNFeDetProdVeicProd(String tpOp, String chassi, String cCor, String xCor, String pot, String cilin, String pesoL, String pesoB, String nSerie, String tpComb, String nMotor, String CMT, String dist, String anoMod, String anoFab, String tpPint, String tpVeic, String espVeic, String VIN, String condVeic, String cMod, String cCorDENATRAN, String lota, String tpRest) {
        this.tpOp = tpOp;
        this.chassi = chassi;
        this.cCor = cCor;
        this.xCor = xCor;
        this.pot = pot;
        this.cilin = cilin;
        this.pesoL = pesoL;
        this.pesoB = pesoB;
        this.nSerie = nSerie;
        this.tpComb = tpComb;
        this.nMotor = nMotor;
        this.CMT = CMT;
        this.dist = dist;
        this.anoMod = anoMod;
        this.anoFab = anoFab;
        this.tpPint = tpPint;
        this.tpVeic = tpVeic;
        this.espVeic = espVeic;
        this.VIN = VIN;
        this.condVeic = condVeic;
        this.cMod = cMod;
        this.cCorDENATRAN = cCorDENATRAN;
        this.lota = lota;
        this.tpRest = tpRest;
    }

	public String getTpOp() {
		return tpOp;
	}

	public void setTpOp(String tpOp) {
		this.tpOp = tpOp;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getcCor() {
		return cCor;
	}

	public void setcCor(String cCor) {
		this.cCor = cCor;
	}

	public String getxCor() {
		return xCor;
	}

	public void setxCor(String xCor) {
		this.xCor = xCor;
	}

	public String getPot() {
		return pot;
	}

	public void setPot(String pot) {
		this.pot = pot;
	}

	public String getCilin() {
		return cilin;
	}

	public void setCilin(String cilin) {
		this.cilin = cilin;
	}

	public String getPesoL() {
		return pesoL;
	}

	public void setPesoL(String pesoL) {
		this.pesoL = pesoL;
	}

	public String getPesoB() {
		return pesoB;
	}

	public void setPesoB(String pesoB) {
		this.pesoB = pesoB;
	}

	public String getnSerie() {
		return nSerie;
	}

	public void setnSerie(String nSerie) {
		this.nSerie = nSerie;
	}

	public String getTpComb() {
		return tpComb;
	}

	public void setTpComb(String tpComb) {
		this.tpComb = tpComb;
	}

	public String getnMotor() {
		return nMotor;
	}

	public void setnMotor(String nMotor) {
		this.nMotor = nMotor;
	}

	public String getCMT() {
		return CMT;
	}

	public void setCMT(String cMT) {
		CMT = cMT;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getAnoMod() {
		return anoMod;
	}

	public void setAnoMod(String anoMod) {
		this.anoMod = anoMod;
	}

	public String getAnoFab() {
		return anoFab;
	}

	public void setAnoFab(String anoFab) {
		this.anoFab = anoFab;
	}

	public String getTpPint() {
		return tpPint;
	}

	public void setTpPint(String tpPint) {
		this.tpPint = tpPint;
	}

	public String getTpVeic() {
		return tpVeic;
	}

	public void setTpVeic(String tpVeic) {
		this.tpVeic = tpVeic;
	}

	public String getEspVeic() {
		return espVeic;
	}

	public void setEspVeic(String espVeic) {
		this.espVeic = espVeic;
	}

	public String getVIN() {
		return VIN;
	}

	public void setVIN(String vIN) {
		VIN = vIN;
	}

	public String getCondVeic() {
		return condVeic;
	}

	public void setCondVeic(String condVeic) {
		this.condVeic = condVeic;
	}

	public String getcMod() {
		return cMod;
	}

	public void setcMod(String cMod) {
		this.cMod = cMod;
	}

	public String getcCorDENATRAN() {
		return cCorDENATRAN;
	}

	public void setcCorDENATRAN(String cCorDENATRAN) {
		this.cCorDENATRAN = cCorDENATRAN;
	}

	public String getLota() {
		return lota;
	}

	public void setLota(String lota) {
		this.lota = lota;
	}

	public String getTpRest() {
		return tpRest;
	}

	public void setTpRest(String tpRest) {
		this.tpRest = tpRest;
	}

}
