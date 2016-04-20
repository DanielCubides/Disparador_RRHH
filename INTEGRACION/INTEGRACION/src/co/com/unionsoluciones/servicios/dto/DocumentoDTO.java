package co.com.unionsoluciones.servicios.dto;

import java.io.Serializable;

public class DocumentoDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3476541216036840364L;
	private String documentoSoa;
	private String documentoSara;
	
	public String getDocumentoSoa() {
		return documentoSoa;
	}
	public void setDocumentoSoa(String documentoSoa) {
		this.documentoSoa = documentoSoa;
	}
	public String getDocumentoSara() {
		return documentoSara;
	}
	public void setDocumentoSara(String documentoSara) {
		this.documentoSara = documentoSara;
	}
	
}	