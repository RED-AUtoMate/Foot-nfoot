
package foot.soap.endpoints.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.18
 * Tue Apr 20 02:52:26 CEST 2021
 * Generated source version: 2.7.18
 */

@XmlRootElement(name = "createTeamResponse", namespace = "http://endpoints.soap.foot/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createTeamResponse", namespace = "http://endpoints.soap.foot/")

public class CreateTeamResponse {

    @XmlElement(name = "return")
    private foot.soap.models.Team _return;

    public foot.soap.models.Team getReturn() {
        return this._return;
    }

    public void setReturn(foot.soap.models.Team new_return)  {
        this._return = new_return;
    }

}

