
package com.idb.service.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.idb.model.Classes;

@XmlRootElement(name = "getAllClassesResponse", namespace = "http://service.idb.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllClassesResponse", namespace = "http://service.idb.com/")
public class GetAllClassesResponse {

    @XmlElement(name = "return", namespace = "")
    private List<Classes> _return;

    /**
     * 
     * @return
     *     returns List<Classes>
     */
    public List<Classes> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<Classes> _return) {
        this._return = _return;
    }

}
