package com.anasoft.os.daofusion.test.db2;

import org.springframework.test.annotation.IfProfileValue;
import org.springframework.test.context.ContextConfiguration;

import com.anasoft.os.daofusion.test.AbstractHibernateEntityDaoTest;
import com.anasoft.os.daofusion.test.BaseHibernateIntegrationTest;
import com.anasoft.os.daofusion.test.DatabaseContextLocations;

/**
 * Extension of {@link AbstractHibernateEntityDaoTest}
 * for a remote DB2 database instance.
 * 
 * @see AbstractHibernateEntityDaoTest
 * 
 * @author vojtech.szocs
 */
@ContextConfiguration(locations = { DatabaseContextLocations.DB2 })
@IfProfileValue(name = BaseHibernateIntegrationTest.PROFILE_DBTYPE_NAME, values = { BaseHibernateIntegrationTest.PROFILE_DBTYPE_VALUE_ALL, BaseHibernateIntegrationTest.PROFILE_DBTYPE_VALUE_REMOTE })
public class DB2HibernateEntityDaoTest extends AbstractHibernateEntityDaoTest {

}
