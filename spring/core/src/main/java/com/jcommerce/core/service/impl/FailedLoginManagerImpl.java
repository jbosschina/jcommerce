/**
* Author: Bob Chen
*         Kylin Soong
*/

package com.jcommerce.core.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcommerce.core.dao.FailedLoginDAO;
import com.jcommerce.core.model.FailedLogin;
import com.jcommerce.core.service.Criteria;
import com.jcommerce.core.service.FailedLoginManager;

@Service("FailedLoginManager")
public class FailedLoginManagerImpl extends ManagerImpl implements FailedLoginManager {
    private static Log log = LogFactory.getLog(FailedLoginManagerImpl.class);
    
    @Autowired
    private FailedLoginDAO dao;

    public void setFailedLoginDAO(FailedLoginDAO dao) {
        this.dao = dao;
        super.setDao(dao);
    }

    public FailedLogin initialize(FailedLogin obj) {
        if (obj != null && !Hibernate.isInitialized(obj)) {
            obj = dao.getFailedLogin(obj.getId());
        }
        return obj;
    }

    public List<FailedLogin> getFailedLoginList(int firstRow, int maxRow) {
        List list = getList(firstRow, maxRow);
        return (List<FailedLogin>)list;
    }

    public int getFailedLoginCount(Criteria criteria) {
        return getCount(criteria);
    }

    public List<FailedLogin> getFailedLoginList(Criteria criteria) {
        List list = getList(criteria);
        return (List<FailedLogin>)list;
    }

    public List<FailedLogin> getFailedLoginList(int firstRow, int maxRow, Criteria criteria) {
        List list = getList(firstRow, maxRow, criteria);
        return (List<FailedLogin>)list;
    }

    public List<FailedLogin> getFailedLoginList() {
        return dao.getFailedLoginList();
    }

    public FailedLogin getFailedLogin(Long id) {
        FailedLogin obj = dao.getFailedLogin(id);
        return obj;
    }

    public void saveFailedLogin(FailedLogin obj) {
        dao.saveFailedLogin(obj);
    }

    public void removeFailedLogin(Long id) {
        dao.removeFailedLogin(id);
    }
}
