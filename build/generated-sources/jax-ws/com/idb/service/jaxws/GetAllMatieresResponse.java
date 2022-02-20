
package com.idb.service.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.idb.model.Matieres;

@XmlRootElement(name = "getAllMatieresResponse", namespace = "http://service.idb.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllMatieresResponse", namespace = "http://service.idb.com/")
public class GetAllMatieresResponse {

    @XmlElement(name = "return", namespace = "")
    private List<Matieres> _return;

    /**
     * 
     * @return
     *     returns List<Matieres>
     */
    public List<Matieres> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<Matieres> _return) {
        this._return = _return;
    }

}
