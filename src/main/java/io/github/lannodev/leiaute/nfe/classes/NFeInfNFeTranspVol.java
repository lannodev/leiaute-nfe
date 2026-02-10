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

@JsonRootName("vol")
@XmlRootElement(name = "vol")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeTranspVol extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qvol")
    @XmlElement(name = "qVol")
    private String qVol;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("esp")
    @XmlElement(name = "esp")
    private String esp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("marca")
    @XmlElement(name = "marca")
    private String marca;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nvol")
    @XmlElement(name = "nVol")
    private String nVol;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pesol")
    @XmlElement(name = "pesoL")
    private String pesoL;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pesob")
    @XmlElement(name = "pesoB")
    private String pesoB;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("lacres")
	@XmlElement(name = "lacres")
    private List<NFeInfNFeTranspVolLacres> lacres = new ArrayList<NFeInfNFeTranspVolLacres>();

    public NFeInfNFeTranspVol() {}

    public NFeInfNFeTranspVol(String qVol, String esp, String marca, String nVol, String pesoL, String pesoB, List<NFeInfNFeTranspVolLacres> lacres) {
        this.qVol = qVol;
        this.esp = esp;
        this.marca = marca;
        this.nVol = nVol;
        this.pesoL = pesoL;
        this.pesoB = pesoB;
        this.lacres = lacres;
    }

	public String getqVol() {
		return qVol;
	}

	public void setqVol(String qVol) {
		this.qVol = qVol;
	}

	public String getEsp() {
		return esp;
	}

	public void setEsp(String esp) {
		this.esp = esp;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getnVol() {
		return nVol;
	}

	public void setnVol(String nVol) {
		this.nVol = nVol;
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

	public List<NFeInfNFeTranspVolLacres> getLacres() {
		return lacres;
	}

	public void setLacres(List<NFeInfNFeTranspVolLacres> lacres) {
		this.lacres = lacres;
	}

}
