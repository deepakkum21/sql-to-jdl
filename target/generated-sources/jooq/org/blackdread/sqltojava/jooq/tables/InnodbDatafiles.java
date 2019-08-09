/*
 * This file is generated by jOOQ.
 */
package org.blackdread.sqltojava.jooq.tables;


import javax.annotation.Generated;

import org.blackdread.sqltojava.jooq.InformationSchema;
import org.blackdread.sqltojava.jooq.tables.records.InnodbDatafilesRecord;
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
public class InnodbDatafiles extends TableImpl<InnodbDatafilesRecord> {

    private static final long serialVersionUID = -1488811824;

    /**
     * The reference instance of <code>information_schema.INNODB_DATAFILES</code>
     */
    public static final InnodbDatafiles INNODB_DATAFILES = new InnodbDatafiles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbDatafilesRecord> getRecordType() {
        return InnodbDatafilesRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_DATAFILES.SPACE</code>.
     */
    public final TableField<InnodbDatafilesRecord, byte[]> SPACE = createField("SPACE", org.jooq.impl.SQLDataType.VARBINARY(256), this, "");

    /**
     * The column <code>information_schema.INNODB_DATAFILES.PATH</code>.
     */
    public final TableField<InnodbDatafilesRecord, String> PATH = createField("PATH", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false), this, "");

    /**
     * Create a <code>information_schema.INNODB_DATAFILES</code> table reference
     */
    public InnodbDatafiles() {
        this(DSL.name("INNODB_DATAFILES"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_DATAFILES</code> table reference
     */
    public InnodbDatafiles(String alias) {
        this(DSL.name(alias), INNODB_DATAFILES);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_DATAFILES</code> table reference
     */
    public InnodbDatafiles(Name alias) {
        this(alias, INNODB_DATAFILES);
    }

    private InnodbDatafiles(Name alias, Table<InnodbDatafilesRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbDatafiles(Name alias, Table<InnodbDatafilesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InnodbDatafiles(Table<O> child, ForeignKey<O, InnodbDatafilesRecord> key) {
        super(child, key, INNODB_DATAFILES);
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
    public InnodbDatafiles as(String alias) {
        return new InnodbDatafiles(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbDatafiles as(Name alias) {
        return new InnodbDatafiles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbDatafiles rename(String name) {
        return new InnodbDatafiles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbDatafiles rename(Name name) {
        return new InnodbDatafiles(name, null);
    }
}