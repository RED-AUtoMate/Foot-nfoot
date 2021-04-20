
package foot.soap.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for league complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="league">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="league_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="league_country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="league_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "league", propOrder = {
    "id",
    "leagueCode",
    "leagueCountry",
    "leagueName"
})
public class League {

    protected int id;
    @XmlElement(name = "league_code")
    protected String leagueCode;
    @XmlElement(name = "league_country")
    protected String leagueCountry;
    @XmlElement(name = "league_name")
    protected String leagueName;

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
     * Gets the value of the leagueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeagueCode() {
        return leagueCode;
    }

    /**
     * Sets the value of the leagueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeagueCode(String value) {
        this.leagueCode = value;
    }

    /**
     * Gets the value of the leagueCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeagueCountry() {
        return leagueCountry;
    }

    /**
     * Sets the value of the leagueCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeagueCountry(String value) {
        this.leagueCountry = value;
    }

    /**
     * Gets the value of the leagueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeagueName() {
        return leagueName;
    }

    /**
     * Sets the value of the leagueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeagueName(String value) {
        this.leagueName = value;
    }

}
