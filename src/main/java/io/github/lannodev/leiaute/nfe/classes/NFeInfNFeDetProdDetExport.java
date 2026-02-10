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

@JsonRootName("detexport")
@XmlRootElement(name = "detExport")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeDetProdDetExport extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ndraw")
    @XmlElement(name = "nDraw")
    private String nDraw;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("exportind")
    @XmlElement(name = "exportInd")
    private NFeInfNFeDetProdDetExportExportInd exportInd;

    public NFeInfNFeDetProdDetExport() {}

    public NFeInfNFeDetProdDetExport(String nDraw, NFeInfNFeDetProdDetExportExportInd exportInd) {
        this.nDraw = nDraw;
        this.exportInd = exportInd;
    }

	public String getnDraw() {
		return nDraw;
	}

	public void setnDraw(String nDraw) {
		this.nDraw = nDraw;
	}

	public NFeInfNFeDetProdDetExportExportInd getExportInd() {
		return exportInd;
	}

	public void setExportInd(NFeInfNFeDetProdDetExportExportInd exportInd) {
		this.exportInd = exportInd;
	}

}
