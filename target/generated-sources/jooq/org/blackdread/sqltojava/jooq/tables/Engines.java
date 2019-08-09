/*
 * This file is generated by jOOQ.
 */
package org.blackdread.sqltojava.jooq.tables;


import javax.annotation.Generated;

import org.blackdread.sqltojava.jooq.InformationSchema;
import org.blackdread.sqltojava.jooq.tables.records.EnginesRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Engines extends TableImpl<EnginesRecord> {

    private static final long serialVersionUID = -77718323;

    /**
     * The reference instance of <code>information_schema.ENGINES</code>
     */
    public static final Engines ENGINES = new Engines();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EnginesRecord> getRecordType() {
        return EnginesRecord.class;
    }

    /**
     * The column <code>information_schema.ENGINES.ENGINE</code>.
     */
    public final TableField<EnginesRecord, String> ENGINE = createField("ENGINE", org.jooq.impl.SQLDataType.VARCHAR(21).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ENGINES.SUPPORT</code>.
     */
    public final TableField<EnginesRecord, String> SUPPORT = createField("SUPPORT", org.jooq.impl.SQLDataType.VARCHAR(2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ENGINES.COMMENT</code>.
     */
    public final TableField<EnginesRecord, String> COMMENT = createField("COMMENT", org.jooq.impl.SQLDataType.VARCHAR(26).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ENGINES.TRANSACTIONS</code>.
     */
    public final TableField<EnginesRecord, String> TRANSACTIONS = createField("TRANSACTIONS", org.jooq.impl.SQLDataType.VARCHAR(1).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ENGINES.XA</code>.
     */
    public final TableField<EnginesRecord, String> XA = createField("XA", org.jooq.impl.SQLDataType.VARCHAR(1).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ENGINES.SAVEPOINTS</code>.
     */
    public final TableField<EnginesRecord, String> SAVEPOINTS = createField("SAVEPOINTS", org.jooq.impl.SQLDataType.VARCHAR(1).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.ENGINES</code> table reference
     */
    public Engines() {
        this(DSL.name("ENGINES"), null);
    }

    /**
     * Create an aliased <code>information_schema.ENGINES</code> table reference
     */
    public Engines(String alias) {
        this(DSL.name(alias), ENGINES);
    }

    /**
     * Create an aliased <code>information_schema.ENGINES</code> table reference
     */
    public Engines(Name alias) {
        this(alias, ENGINES);
    }

    private Engines(Name alias, Table<EnginesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Engines(Name alias, Table<EnginesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Engines(Table<O> child, ForeignKey<O, EnginesRecord> key) {
        super(child, key, ENGINES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Engines as(String alias) {
        return new Engines(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Engines as(Name alias) {
        return new Engines(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Engines rename(String name) {
        return new Engines(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Engines rename(Name name) {
        return new Engines(name, null);
    }
}
