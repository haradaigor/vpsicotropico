
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
 *         &lt;element name="EnviaArquivoSNGPCResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "enviaArquivoSNGPCResult"
})
@XmlRootElement(name = "EnviaArquivoSNGPCResponse")
public class EnviaArquivoSNGPCResponse {

    @XmlElement(name = "EnviaArquivoSNGPCResult")
    protected String enviaArquivoSNGPCResult;

    /**
     * Obtém o valor da propriedade enviaArquivoSNGPCResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnviaArquivoSNGPCResult() {
        return enviaArquivoSNGPCResult;
    }

    /**
     * Define o valor da propriedade enviaArquivoSNGPCResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnviaArquivoSNGPCResult(String value) {
        this.enviaArquivoSNGPCResult = value;
    }

}
