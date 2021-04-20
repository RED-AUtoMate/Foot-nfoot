
package foot.soap.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for team complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="team">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="classment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="last_result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="league" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="team_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "team", propOrder = {
    "bc",
    "bp",
    "classment",
    "id",
    "lastResult",
    "league",
    "pts",
    "teamName"
})
public class Team {

    protected int bc;
    protected int bp;
    protected int classment;
    protected int id;
    @XmlElement(name = "last_result")
    protected String lastResult;
    protected int league;
    protected int pts;
    @XmlElement(name = "team_name")
    protected String teamName;

    /**
     * Gets the value of the bc property.
     * 
     */
    public int getBc() {
        return bc;
    }

    /**
     * Sets the value of the bc property.
     * 
     */
    public void setBc(int value) {
        this.bc = value;
    }

    /**
     * Gets the value of the bp property.
     * 
     */
    public int getBp() {
        return bp;
    }

    /**
     * Sets the value of the bp property.
     * 
     */
    public void setBp(int value) {
        this.bp = value;
    }

    /**
     * Gets the value of the classment property.
     * 
     */
    public int getClassment() {
        return classment;
    }

    /**
     * Sets the value of the classment property.
     * 
     */
    public void setClassment(int value) {
        this.classment = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the lastResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastResult() {
        return lastResult;
    }

    /**
     * Sets the value of the lastResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastResult(String value) {
        this.lastResult = value;
    }

    /**
     * Gets the value of the league property.
     * 
     */
    public int getLeague() {
        return league;
    }

    /**
     * Sets the value of the league property.
     * 
     */
    public void setLeague(int value) {
        this.league = value;
    }

    /**
     * Gets the value of the pts property.
     * 
     */
    public int getPts() {
        return pts;
    }

    /**
     * Sets the value of the pts property.
     * 
     */
    public void setPts(int value) {
        this.pts = value;
    }

    /**
     * Gets the value of the teamName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Sets the value of the teamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamName(String value) {
        this.teamName = value;
    }

}
