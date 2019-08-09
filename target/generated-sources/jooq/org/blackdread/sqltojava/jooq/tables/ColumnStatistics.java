/*
 * This file is generated by jOOQ.
 */
package org.blackdread.sqltojava.jooq.tables;


import javax.annotation.Generated;

import org.blackdread.sqltojava.jooq.InformationSchema;
import org.blackdread.sqltojava.jooq.tables.records.ColumnStatisticsRecord;
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
public class ColumnStatistics extends TableImpl<ColumnStatisticsRecord> {

    private static final long serialVersionUID = -1787668222;

    /**
     * The reference instance of <code>information_schema.COLUMN_STATISTICS</code>
     */
    public static final ColumnStatistics COLUMN_STATISTICS = new ColumnStatistics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ColumnStatisticsRecord> getRecordType() {
        return ColumnStatisticsRecord.class;
    }

    /**
     * The column <code>information_schema.COLUMN_STATISTICS.SCHEMA_NAME</code>.
     */
    public final TableField<ColumnStatisticsRecord, String> SCHEMA_NAME = createField("SCHEMA_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.COLUMN_STATISTICS.TABLE_NAME</code>.
     */
    public final TableField<ColumnStatisticsRecord, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.COLUMN_STATISTICS.COLUMN_NAME</code>.
     */
    public final TableField<ColumnStatisticsRecord, String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<ColumnStatisticsRecord, Object> HISTOGRAM = createField("HISTOGRAM", org.jooq.impl.DefaultDataType.getDefaultDataType("\"information_schema\".\"COLUMN_STATISTICS_HISTOGRAM\"").nullable(false), this, "");

    /**
     * Create a <code>information_schema.COLUMN_STATISTICS</code> table reference
     */
    public ColumnStatistics() {
        this(DSL.name("COLUMN_STATISTICS"), null);
    }

    /**
     * Create an aliased <code>information_schema.COLUMN_STATISTICS</code> table reference
     */
    public ColumnStatistics(String alias) {
        this(DSL.name(alias), COLUMN_STATISTICS);
    }

    /**
     * Create an aliased <code>information_schema.COLUMN_STATISTICS</code> table reference
     */
    public ColumnStatistics(Name alias) {
        this(alias, COLUMN_STATISTICS);
    }

    private ColumnStatistics(Name alias, Table<ColumnStatisticsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ColumnStatistics(Name alias, Table<ColumnStatisticsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ColumnStatistics(Table<O> child, ForeignKey<O, ColumnStatisticsRecord> key) {
        super(child, key, COLUMN_STATISTICS);
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
    public ColumnStatistics as(String alias) {
        return new ColumnStatistics(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ColumnStatistics as(Name alias) {
        return new ColumnStatistics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnStatistics rename(String name) {
        return new ColumnStatistics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnStatistics rename(Name name) {
        return new ColumnStatistics(name, null);
    }
}
