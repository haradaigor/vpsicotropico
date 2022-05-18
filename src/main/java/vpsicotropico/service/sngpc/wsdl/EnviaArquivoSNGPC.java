
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
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Arq" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="HashIdentificacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "email",
    "senha",
    "arq",
    "hashIdentificacao"
})
@XmlRootElement(name = "EnviaArquivoSNGPC")
public class EnviaArquivoSNGPC {

    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Senha")
    protected String senha;
    @XmlElement(name = "Arq")
    protected byte[] arq;
    @XmlElement(name = "HashIdentificacao")
    protected String hashIdentificacao;

    /**
     * Obtém o valor da propriedade email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtém o valor da propriedade senha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

    /**
     * Obtém o valor da propriedade arq.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getArq() {
        return arq;
    }

    /**
     * Define o valor da propriedade arq.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setArq(byte[] value) {
        this.arq = value;
    }

    /**
     * Obtém o valor da propriedade hashIdentificacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashIdentificacao() {
        return hashIdentificacao;
    }

    /**
     * Define o valor da propriedade hashIdentificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashIdentificacao(String value) {
        this.hashIdentificacao = value;
    }

}
