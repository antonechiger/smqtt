/*
 * This file is generated by jOOQ.
 */
package io.github.quickmsg.persistent.tables;


import io.github.quickmsg.persistent.tables.tables.Databasechangelog;
import io.github.quickmsg.persistent.tables.tables.Databasechangeloglock;
import io.github.quickmsg.persistent.tables.tables.SmqttRetain;
import io.github.quickmsg.persistent.tables.tables.SmqttSession;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Smqtt extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>smqtt</code>
     */
    public static final Smqtt SMQTT = new Smqtt();

    /**
     * The table <code>smqtt.databasechangelog</code>.
     */
    public final Databasechangelog DATABASECHANGELOG = Databasechangelog.DATABASECHANGELOG;

    /**
     * The table <code>smqtt.databasechangeloglock</code>.
     */
    public final Databasechangeloglock DATABASECHANGELOGLOCK = Databasechangeloglock.DATABASECHANGELOGLOCK;

    /**
     * The table <code>smqtt.smqtt_retain</code>.
     */
    public final SmqttRetain SMQTT_RETAIN = SmqttRetain.SMQTT_RETAIN;

    /**
     * The table <code>smqtt.smqtt_session</code>.
     */
    public final SmqttSession SMQTT_SESSION = SmqttSession.SMQTT_SESSION;

    /**
     * No further instances allowed
     */
    private Smqtt() {
        super("smqtt", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Databasechangelog.DATABASECHANGELOG,
            Databasechangeloglock.DATABASECHANGELOGLOCK,
            SmqttRetain.SMQTT_RETAIN,
            SmqttSession.SMQTT_SESSION);
    }
}
