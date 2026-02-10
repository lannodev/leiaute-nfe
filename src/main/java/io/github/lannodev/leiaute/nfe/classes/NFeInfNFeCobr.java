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

@JsonRootName("cobr")
@XmlRootElement(name = "cobr")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeCobr extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("fat")
    @XmlElement(name = "fat")
    private NFeInfNFeCobrFat fat;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dup")
    @XmlElement(name = "dup")
    private List<NFeInfNFeCobrDup> dup = new ArrayList<NFeInfNFeCobrDup>();

    public NFeInfNFeCobr() {}

    public NFeInfNFeCobr(NFeInfNFeCobrFat fat, List<NFeInfNFeCobrDup> dup) {
        this.fat = fat;
        this.dup = dup;
    }

	public NFeInfNFeCobrFat getFat() {
		return fat;
	}

	public void setFat(NFeInfNFeCobrFat fat) {
		this.fat = fat;
	}

	public List<NFeInfNFeCobrDup> getDup() {
		return dup;
	}

	public void setDup(List<NFeInfNFeCobrDup> dup) {
		this.dup = dup;
	}

}
