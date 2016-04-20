/**
 * TipoDetalleContrato.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package co.edu.unal.interoperabilidad.ws.schemas.terceros;

/**
 * TipoDetalleContrato bean class
 */
@SuppressWarnings({ "unchecked", "unused" })
public class TipoDetalleContrato implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name =
	 * tipoDetalleContrato Namespace URI =
	 * http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros Namespace Prefix
	 * = ns1
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 854627352115346346L;
	/**
	 * field for AsignacionBasica
	 */

	protected co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoMontoMonetario localAsignacionBasica;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoMontoMonetario
	 */
	public co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoMontoMonetario getAsignacionBasica() {
		return localAsignacionBasica;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            AsignacionBasica
	 */
	public void setAsignacionBasica(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoMontoMonetario param) {

		this.localAsignacionBasica = param;

	}

	/**
	 * field for CargoEmpleado
	 */

	protected co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoCargoEmpleado localCargoEmpleado;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoCargoEmpleado
	 */
	public co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoCargoEmpleado getCargoEmpleado() {
		return localCargoEmpleado;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            CargoEmpleado
	 */
	public void setCargoEmpleado(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoCargoEmpleado param) {

		this.localCargoEmpleado = param;

	}

	/**
	 * field for FechaInicio
	 */

	protected co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoFecha localFechaInicio;

	/**
	 * Auto generated getter method
	 * 
	 * @return co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoFecha
	 */
	public co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoFecha getFechaInicio() {
		return localFechaInicio;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            FechaInicio
	 */
	public void setFechaInicio(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoFecha param) {

		this.localFechaInicio = param;

	}

	/**
	 * field for FechaFin
	 */

	protected co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoFechaVacio localFechaFin;

	/**
	 * Auto generated getter method
	 * 
	 * @return co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoFechaVacio
	 */
	public co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoFechaVacio getFechaFin() {
		return localFechaFin;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            FechaFin
	 */
	public void setFechaFin(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoFechaVacio param) {

		this.localFechaFin = param;

	}

	/**
	 * field for Dedicacion
	 */

	protected co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoDedicacion localDedicacion;

	/**
	 * Auto generated getter method
	 * 
	 * @return co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoDedicacion
	 */
	public co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoDedicacion getDedicacion() {
		return localDedicacion;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Dedicacion
	 */
	public void setDedicacion(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoDedicacion param) {

		this.localDedicacion = param;

	}

	/**
	 * 
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

		org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
		return factory.createOMElement(dataSource, parentQName);

	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType) throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {

		java.lang.String prefix = null;
		java.lang.String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

		if (serializeType) {

			java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":tipoDetalleContrato", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "tipoDetalleContrato", xmlWriter);
			}

		}

		if (localAsignacionBasica == null) {
			throw new org.apache.axis2.databinding.ADBException("asignacionBasica cannot be null!!");
		}
		localAsignacionBasica.serialize(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "asignacionBasica"), xmlWriter);

		if (localCargoEmpleado == null) {
			throw new org.apache.axis2.databinding.ADBException("cargoEmpleado cannot be null!!");
		}
		localCargoEmpleado.serialize(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "cargoEmpleado"), xmlWriter);

		if (localFechaInicio == null) {
			throw new org.apache.axis2.databinding.ADBException("fechaInicio cannot be null!!");
		}
		localFechaInicio.serialize(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "fechaInicio"), xmlWriter);

		if (localFechaFin == null) {
			throw new org.apache.axis2.databinding.ADBException("fechaFin cannot be null!!");
		}
		localFechaFin.serialize(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "fechaFin"), xmlWriter);

		if (localDedicacion == null) {
			throw new org.apache.axis2.databinding.ADBException("dedicacion cannot be null!!");
		}
		localDedicacion.serialize(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "dedicacion"), xmlWriter);

		xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros")) {
			return "ns1";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
		if (writerPrefix != null) {
			xmlWriter.writeStartElement(namespace, localPart);
		} else {
			if (namespace.length() == 0) {
				prefix = "";
			} else if (prefix == null) {
				prefix = generatePrefix(namespace);
			}

			xmlWriter.writeStartElement(prefix, localPart, namespace);
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		if (xmlWriter.getPrefix(namespace) == null) {
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		xmlWriter.writeAttribute(namespace, attName, attValue);
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		java.lang.String attributeNamespace = qname.getNamespaceURI();
		java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
		if (attributePrefix == null) {
			attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
		}
		java.lang.String attributeValue;
		if (attributePrefix.trim().length() > 0) {
			attributeValue = attributePrefix + ":" + qname.getLocalPart();
		} else {
			attributeValue = qname.getLocalPart();
		}

		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attributeValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attributeValue);
		}
	}

	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
		java.lang.String namespaceURI = qname.getNamespaceURI();
		if (namespaceURI != null) {
			java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
			if (prefix == null) {
				prefix = generatePrefix(namespaceURI);
				xmlWriter.writeNamespace(prefix, namespaceURI);
				xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
				xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			} else {
				// i.e this is the default namespace
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}

		} else {
			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		}
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

		if (qnames != null) {
			// we have to store this data until last moment since it is not
			// possible to write any
			// namespace data after writing the charactor data
			java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
			java.lang.String namespaceURI = null;
			java.lang.String prefix = null;

			for (int i = 0; i < qnames.length; i++) {
				if (i > 0) {
					stringToWrite.append(" ");
				}
				namespaceURI = qnames[i].getNamespaceURI();
				if (namespaceURI != null) {
					prefix = xmlWriter.getPrefix(namespaceURI);
					if ((prefix == null) || (prefix.length() == 0)) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix, namespaceURI);
					}

					if (prefix.trim().length() > 0) {
						stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				} else {
					stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
				}
			}
			xmlWriter.writeCharacters(stringToWrite.toString());
		}

	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
		java.lang.String prefix = xmlWriter.getPrefix(namespace);
		if (prefix == null) {
			prefix = generatePrefix(namespace);
			javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
			while (true) {
				java.lang.String uri = nsContext.getNamespaceURI(prefix);
				if (uri == null || uri.length() == 0) {
					break;
				}
				prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		return prefix;
	}

	/**
	 * databinding method to get an XML representation of this object
	 * 
	 */
	public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

		java.util.ArrayList elementList = new java.util.ArrayList();
		java.util.ArrayList attribList = new java.util.ArrayList();

		elementList.add(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "asignacionBasica"));

		if (localAsignacionBasica == null) {
			throw new org.apache.axis2.databinding.ADBException("asignacionBasica cannot be null!!");
		}
		elementList.add(localAsignacionBasica);

		elementList.add(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "cargoEmpleado"));

		if (localCargoEmpleado == null) {
			throw new org.apache.axis2.databinding.ADBException("cargoEmpleado cannot be null!!");
		}
		elementList.add(localCargoEmpleado);

		elementList.add(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "fechaInicio"));

		if (localFechaInicio == null) {
			throw new org.apache.axis2.databinding.ADBException("fechaInicio cannot be null!!");
		}
		elementList.add(localFechaInicio);

		elementList.add(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "fechaFin"));

		if (localFechaFin == null) {
			throw new org.apache.axis2.databinding.ADBException("fechaFin cannot be null!!");
		}
		elementList.add(localFechaFin);

		elementList.add(new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "dedicacion"));

		if (localDedicacion == null) {
			throw new org.apache.axis2.databinding.ADBException("dedicacion cannot be null!!");
		}
		elementList.add(localDedicacion);

		return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

		/**
		 * static method to create the object Precondition: If this object is an
		 * element, the current or next start element starts this object and any
		 * intervening reader events are ignorable If this object is not an
		 * element, it is a complex type and the reader is at the event just
		 * after the outer start element Postcondition: If this object is an
		 * element, the reader is positioned at its end element If this object
		 * is a complex type, the reader is positioned at the end element of its
		 * outer element
		 */
		public static TipoDetalleContrato parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
			TipoDetalleContrato object = new TipoDetalleContrato();

			int event;
			java.lang.String nillableValue = null;
			java.lang.String prefix = "";
			java.lang.String namespaceuri = "";
			try {

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
					java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
					if (fullTypeName != null) {
						java.lang.String nsPrefix = null;
						if (fullTypeName.indexOf(":") > -1) {
							nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
						}
						nsPrefix = nsPrefix == null ? "" : nsPrefix;

						java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

						if (!"tipoDetalleContrato".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (TipoDetalleContrato) co.edu.unal.interoperabilidad.ws.gestionempleado.ExtensionMapper.getTypeObject(nsUri, type, reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal
				// attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "asignacionBasica").equals(reader.getName())) {

					object.setAsignacionBasica(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoMontoMonetario.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "cargoEmpleado").equals(reader.getName())) {

					object.setCargoEmpleado(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoCargoEmpleado.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "fechaInicio").equals(reader.getName())) {

					object.setFechaInicio(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoFecha.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "fechaFin").equals(reader.getName())) {

					object.setFechaFin(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoFechaVacio.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://interoperabilidad.unal.edu.co/WS/Schemas/Terceros", "dedicacion").equals(reader.getName())) {

					object.setDedicacion(co.edu.unal.interoperabilidad.ws.schemas.terceros.TipoDedicacion.Factory.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement())
					// A start element we are not expecting indicates a trailing
					// invalid property
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

			} catch (javax.xml.stream.XMLStreamException e) {
				throw new java.lang.Exception(e);
			}

			return object;
		}

	}// end of factory class

}
