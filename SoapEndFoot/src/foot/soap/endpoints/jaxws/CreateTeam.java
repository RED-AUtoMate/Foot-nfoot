
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

@XmlRootElement(name = "createTeam", namespace = "http://endpoints.soap.foot/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createTeam", namespace = "http://endpoints.soap.foot/", propOrder = {"arg0", "arg1"})

public class CreateTeam {

    @XmlElement(name = "arg0")
    private foot.soap.models.Team arg0;
    @XmlElement(name = "arg1")
    private java.lang.String arg1;

    public foot.soap.models.Team getArg0() {
        return this.arg0;
    }

    public void setArg0(foot.soap.models.Team newArg0)  {
        this.arg0 = newArg0;
    }

    public java.lang.String getArg1() {
        return this.arg1;
    }

    public void setArg1(java.lang.String newArg1)  {
        this.arg1 = newArg1;
    }

}
