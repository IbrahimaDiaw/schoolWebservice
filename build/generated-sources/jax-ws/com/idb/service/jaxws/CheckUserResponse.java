
package com.idb.service.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.idb.model.Users;

@XmlRootElement(name = "checkUserResponse", namespace = "http://service.idb.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkUserResponse", namespace = "http://service.idb.com/")
public class CheckUserResponse {

    @XmlElement(name = "return", namespace = "")
    private List<Users> _return;

    /**
     * 
     * @return
     *     returns List<Users>
     */
    public List<Users> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<Users> _return) {
        this._return = _return;
    }

}
