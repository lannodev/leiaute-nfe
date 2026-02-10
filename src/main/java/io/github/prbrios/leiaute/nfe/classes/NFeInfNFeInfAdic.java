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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlElement;

import java.util.ArrayList;
import java.util.List;

@JsonRootName("infadic")
@XmlRootElement(name = "infAdic")
@XmlAccessorType(XmlAccessType.FIELD)
public class NFeInfNFeInfAdic extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("infadfisco")
    @XmlElement(name = "infAdFisco")
    private String infAdFisco;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("infcpl")
    @XmlElement(name = "infCpl")
    private String infCpl;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("obscont")
    @XmlElement(name = "obsCont")
    private List<NFeInfNFeInfAdicObsCont> obsCont = new ArrayList<NFeInfNFeInfAdicObsCont>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("obsfisco")
    @XmlElement(name = "obsFisco")
    private List<NFeInfNFeInfAdicObsFisco> obsFisco = new ArrayList<NFeInfNFeInfAdicObsFisco>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("procref")
    @XmlElement(name = "procRef")
    private List<NFeInfNFeInfAdicProcRef> procRef = new ArrayList<NFeInfNFeInfAdicProcRef>();

    public NFeInfNFeInfAdic() {}

    public NFeInfNFeInfAdic(String infAdFisco, String infCpl, List<NFeInfNFeInfAdicObsCont> obsCont, List<NFeInfNFeInfAdicObsFisco> obsFisco, List<NFeInfNFeInfAdicProcRef> procRef) {
        this.infAdFisco = infAdFisco;
        this.infCpl = infCpl;
        this.obsCont = obsCont;
        this.obsFisco = obsFisco;
        this.procRef = procRef;
    }

	public String getInfAdFisco() {
		return infAdFisco;
	}

	public void setInfAdFisco(String infAdFisco) {
		this.infAdFisco = infAdFisco;
	}

	public String getInfCpl() {
		return infCpl;
	}

	public void setInfCpl(String infCpl) {
		this.infCpl = infCpl;
	}

	public List<NFeInfNFeInfAdicObsCont> getObsCont() {
		return obsCont;
	}

	public void setObsCont(List<NFeInfNFeInfAdicObsCont> obsCont) {
		this.obsCont = obsCont;
	}

	public List<NFeInfNFeInfAdicObsFisco> getObsFisco() {
		return obsFisco;
	}

	public void setObsFisco(List<NFeInfNFeInfAdicObsFisco> obsFisco) {
		this.obsFisco = obsFisco;
	}

	public List<NFeInfNFeInfAdicProcRef> getProcRef() {
		return procRef;
	}

	public void setProcRef(List<NFeInfNFeInfAdicProcRef> procRef) {
		this.procRef = procRef;
	}

}
