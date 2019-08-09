/*
 * This file is generated by jOOQ.
 */
package org.blackdread.sqltojava.jooq.tables;


import javax.annotation.Generated;

import org.blackdread.sqltojava.jooq.InformationSchema;
import org.blackdread.sqltojava.jooq.tables.records.InnodbCachedIndexesRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


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
public class InnodbCachedIndexes extends TableImpl<InnodbCachedIndexesRecord> {

    private static final long serialVersionUID = -1253472463;

    /**
     * The reference instance of <code>information_schema.INNODB_CACHED_INDEXES</code>
     */
    public static final InnodbCachedIndexes INNODB_CACHED_INDEXES = new InnodbCachedIndexes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbCachedIndexesRecord> getRecordType() {
        return InnodbCachedIndexesRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_CACHED_INDEXES.SPACE_ID</code>.
     */
    public final TableField<InnodbCachedIndexesRecord, UInteger> SPACE_ID = createField("SPACE_ID", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_CACHED_INDEXES.INDEX_ID</code>.
     */
    public final TableField<InnodbCachedIndexesRecord, ULong> INDEX_ID = createField("INDEX_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_CACHED_INDEXES.N_CACHED_PAGES</code>.
     */
    public final TableField<InnodbCachedIndexesRecord, ULong> N_CACHED_PAGES = createField("N_CACHED_PAGES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>information_schema.INNODB_CACHED_INDEXES</code> table reference
     */
    public InnodbCachedIndexes() {
        this(DSL.name("INNODB_CACHED_INDEXES"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CACHED_INDEXES</code> table reference
     */
    public InnodbCachedIndexes(String alias) {
        this(DSL.name(alias), INNODB_CACHED_INDEXES);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CACHED_INDEXES</code> table reference
     */
    public InnodbCachedIndexes(Name alias) {
        this(alias, INNODB_CACHED_INDEXES);
    }

    private InnodbCachedIndexes(Name alias, Table<InnodbCachedIndexesRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbCachedIndexes(Name alias, Table<InnodbCachedIndexesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InnodbCachedIndexes(Table<O> child, ForeignKey<O, InnodbCachedIndexesRecord> key) {
        super(child, key, INNODB_CACHED_INDEXES);
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
    public InnodbCachedIndexes as(String alias) {
        return new InnodbCachedIndexes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCachedIndexes as(Name alias) {
        return new InnodbCachedIndexes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCachedIndexes rename(String name) {
        return new InnodbCachedIndexes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCachedIndexes rename(Name name) {
        return new InnodbCachedIndexes(name, null);
    }
}
