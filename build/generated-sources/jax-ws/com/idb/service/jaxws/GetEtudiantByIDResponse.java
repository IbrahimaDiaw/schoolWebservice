
package com.idb.service.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.idb.model.Etudiants;

@XmlRootElement(name = "getEtudiantByIDResponse", namespace = "http://service.idb.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEtudiantByIDResponse", namespace = "http://service.idb.com/")
public class GetEtudiantByIDResponse {

    @XmlElement(name = "return", namespace = "")
    private List<Etudiants> _return;

    /**
     * 
     * @return
     *     returns List<Etudiants>
     */
    public List<Etudiants> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<Etudiants> _return) {
        this._return = _return;
    }

}
