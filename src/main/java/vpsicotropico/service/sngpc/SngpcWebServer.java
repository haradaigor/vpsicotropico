package vpsicotropico.service.sngpc;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.UUID;

import javax.xml.namespace.QName;

//import org.tempuri.SngpcSoap;

import jakarta.xml.ws.Service;
import vpsicotropico.service.sngpc.wsdl.SngpcSoap;

public class SngpcWebServer {
	
	private static final String TARGET_NAMESPACE = "http://tempuri.org/";
	private static final String SERVICE_NAME = "sngpc";
	private URL url;
	private QName qname;
	
	public SngpcWebServer() {
		
		qname = new QName(TARGET_NAMESPACE, SERVICE_NAME);
		try {
			url = new URL("http://sngpc.anvisa.gov.br/webservice/sngpc.asmx?WSDL");
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
	}
	
	public String sendFileSngpc() {
		return null;
	}
	
	public String userValidate(String email, String password) {

		Service service = Service.create(url, qname);
		SngpcSoap sngpcSoap = service.getPort(SngpcSoap.class);
		return sngpcSoap.validarUsuario(email, password);
	}
	
	public String consultData(String email, String password, String cnpj) {

		Service service = Service.create(url, qname);
		String uuid = UUID.randomUUID().toString().replace("-", "").toUpperCase();		
		SngpcSoap sngpcSoap = service.getPort(SngpcSoap.class);
		return sngpcSoap.consultaDadosArquivoSNGPC(email, password, cnpj, uuid);
	}
}
