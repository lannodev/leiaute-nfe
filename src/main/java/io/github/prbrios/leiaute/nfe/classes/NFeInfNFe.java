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
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@JsonRootName("infnfe")
@XmlRootElement(name = "infNFe")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFe extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("versao")
    @XmlAttribute(name="versao")
    private String versao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("id")
    @XmlAttribute(name = "Id")
    private String id;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ide")
    @XmlElement(name = "ide")
    private NFeInfNFeIde ide;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("emit")
    @XmlElement(name = "emit")
    private NFeInfNFeEmit emit;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("avulsa")
    @XmlElement(name = "avulsa")
    private NFeInfNFeAvulsa avulsa;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dest")
    @XmlElement(name = "dest")
    private NFeInfNFeDest dest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("retirada")
    @XmlElement(name = "retirada")
    private NFeInfNFeRetirada retirada;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("entrega")
    @XmlElement(name = "entrega")
    private NFeInfNFeEntrega entrega;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("autxml")
	@XmlElement(name = "autXML")
    private List<NFeInfNFeAutXML> autXML = new ArrayList<NFeInfNFeAutXML>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("det")
    @XmlElement(name = "det")
    private List<NFeInfNFeDet> det = new ArrayList<NFeInfNFeDet>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("total")
    @XmlElement(name = "total")
    private NFeInfNFeTotal total;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("transp")
    @XmlElement(name = "transp")
    private NFeInfNFeTransp transp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cobr")
    @XmlElement(name = "cobr")
    private NFeInfNFeCobr cobr;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pag")
    @XmlElement(name = "pag")
    private NFeInfNFePag pag;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("infintermed")
    @XmlElement(name = "infIntermed")
    private NFeInfNFeInfIntermed infIntermed;
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("infadic")
    @XmlElement(name = "infAdic")
    private NFeInfNFeInfAdic infAdic;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("exporta")
    @XmlElement(name = "exporta")
    private NFeInfNFeExporta exporta;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("compra")
    @XmlElement(name = "compra")
    private NFeInfNFeCompra compra;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cana")
    @XmlElement(name = "cana")
    private NFeInfNFeCana cana;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("infresptec")
    @XmlElement(name = "infRespTec")
    private NFeInfNFeInfRespTec infRespTec;

    public NFeInfNFe() {}

    public NFeInfNFe(String versao, String id, NFeInfNFeIde ide, NFeInfNFeEmit emit, NFeInfNFeAvulsa avulsa, NFeInfNFeDest dest, NFeInfNFeRetirada retirada, NFeInfNFeEntrega entrega, List<NFeInfNFeAutXML> autXML, List<NFeInfNFeDet> det, NFeInfNFeTotal total, NFeInfNFeTransp transp, NFeInfNFeCobr cobr, NFeInfNFePag pag, NFeInfNFeInfIntermed infIntermed, NFeInfNFeInfAdic infAdic, NFeInfNFeExporta exporta, NFeInfNFeCompra compra, NFeInfNFeCana cana, NFeInfNFeInfRespTec infRespTec) {
        this.versao = versao;
        this.id = id;
        this.ide = ide;
        this.emit = emit;
        this.avulsa = avulsa;
        this.dest = dest;
        this.retirada = retirada;
        this.entrega = entrega;
        this.autXML = autXML;
        this.det = det;
        this.total = total;
        this.transp = transp;
        this.cobr = cobr;
        this.pag = pag;
        this.infIntermed = infIntermed;
        this.infAdic = infAdic;
        this.exporta = exporta;
        this.compra = compra;
        this.cana = cana;
        this.infRespTec = infRespTec;
    }

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public NFeInfNFeIde getIde() {
		return ide;
	}

	public void setIde(NFeInfNFeIde ide) {
		this.ide = ide;
	}

	public NFeInfNFeEmit getEmit() {
		return emit;
	}

	public void setEmit(NFeInfNFeEmit emit) {
		this.emit = emit;
	}

	public NFeInfNFeAvulsa getAvulsa() {
		return avulsa;
	}

	public void setAvulsa(NFeInfNFeAvulsa avulsa) {
		this.avulsa = avulsa;
	}

	public NFeInfNFeDest getDest() {
		return dest;
	}

	public void setDest(NFeInfNFeDest dest) {
		this.dest = dest;
	}

	public NFeInfNFeRetirada getRetirada() {
		return retirada;
	}

	public void setRetirada(NFeInfNFeRetirada retirada) {
		this.retirada = retirada;
	}

	public NFeInfNFeEntrega getEntrega() {
		return entrega;
	}

	public void setEntrega(NFeInfNFeEntrega entrega) {
		this.entrega = entrega;
	}

	public List<NFeInfNFeAutXML> getAutXML() {
		return autXML;
	}

	public void setAutXML(List<NFeInfNFeAutXML> autXML) {
		this.autXML = autXML;
	}

	public List<NFeInfNFeDet> getDet() {
		return det;
	}

	public void setDet(List<NFeInfNFeDet> det) {
		this.det = det;
	}

	public NFeInfNFeTotal getTotal() {
		return total;
	}

	public void setTotal(NFeInfNFeTotal total) {
		this.total = total;
	}

	public NFeInfNFeTransp getTransp() {
		return transp;
	}

	public void setTransp(NFeInfNFeTransp transp) {
		this.transp = transp;
	}

	public NFeInfNFeCobr getCobr() {
		return cobr;
	}

	public void setCobr(NFeInfNFeCobr cobr) {
		this.cobr = cobr;
	}

	public NFeInfNFePag getPag() {
		return pag;
	}

	public void setPag(NFeInfNFePag pag) {
		this.pag = pag;
	}

	public NFeInfNFeInfIntermed getInfIntermed() {
		return infIntermed;
	}

	public void setInfIntermed(NFeInfNFeInfIntermed infIntermed) {
		this.infIntermed = infIntermed;
	}

	public NFeInfNFeInfAdic getInfAdic() {
		return infAdic;
	}

	public void setInfAdic(NFeInfNFeInfAdic infAdic) {
		this.infAdic = infAdic;
	}

	public NFeInfNFeExporta getExporta() {
		return exporta;
	}

	public void setExporta(NFeInfNFeExporta exporta) {
		this.exporta = exporta;
	}

	public NFeInfNFeCompra getCompra() {
		return compra;
	}

	public void setCompra(NFeInfNFeCompra compra) {
		this.compra = compra;
	}

	public NFeInfNFeCana getCana() {
		return cana;
	}

	public void setCana(NFeInfNFeCana cana) {
		this.cana = cana;
	}

	public NFeInfNFeInfRespTec getInfRespTec() {
		return infRespTec;
	}

	public void setInfRespTec(NFeInfNFeInfRespTec infRespTec) {
		this.infRespTec = infRespTec;
	}

}
