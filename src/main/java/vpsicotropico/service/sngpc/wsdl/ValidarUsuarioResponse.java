
package vpsicotropico.service.sngpc.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidarUsuarioResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "validarUsuarioResult"
})
@XmlRootElement(name = "ValidarUsuarioResponse")
public class ValidarUsuarioResponse {

    @XmlElement(name = "ValidarUsuarioResult")
    protected String validarUsuarioResult;

    /**
     * Obtém o valor da propriedade validarUsuarioResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidarUsuarioResult() {
        return validarUsuarioResult;
    }

    /**
     * Define o valor da propriedade validarUsuarioResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidarUsuarioResult(String value) {
        this.validarUsuarioResult = value;
    }

}
