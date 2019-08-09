/*
 * This file is generated by jOOQ.
 */
package org.blackdread.sqltojava.jooq.tables.records;


import javax.annotation.Generated;

import org.blackdread.sqltojava.jooq.tables.ViewRoutineUsage;
import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


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
public class ViewRoutineUsageRecord extends TableRecordImpl<ViewRoutineUsageRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = -1060139171;

    /**
     * Setter for <code>information_schema.VIEW_ROUTINE_USAGE.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.VIEW_ROUTINE_USAGE.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.VIEW_ROUTINE_USAGE.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.VIEW_ROUTINE_USAGE.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.VIEW_ROUTINE_USAGE.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.VIEW_ROUTINE_USAGE.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.VIEW_ROUTINE_USAGE.SPECIFIC_CATALOG</code>.
     */
    public void setSpecificCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.VIEW_ROUTINE_USAGE.SPECIFIC_CATALOG</code>.
     */
    public String getSpecificCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.VIEW_ROUTINE_USAGE.SPECIFIC_SCHEMA</code>.
     */
    public void setSpecificSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.VIEW_ROUTINE_USAGE.SPECIFIC_SCHEMA</code>.
     */
    public String getSpecificSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.VIEW_ROUTINE_USAGE.SPECIFIC_NAME</code>.
     */
    public void setSpecificName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.VIEW_ROUTINE_USAGE.SPECIFIC_NAME</code>.
     */
    public String getSpecificName() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ViewRoutineUsage.VIEW_ROUTINE_USAGE.TABLE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewRoutineUsage.VIEW_ROUTINE_USAGE.TABLE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewRoutineUsage.VIEW_ROUTINE_USAGE.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ViewRoutineUsage.VIEW_ROUTINE_USAGE.SPECIFIC_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ViewRoutineUsage.VIEW_ROUTINE_USAGE.SPECIFIC_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ViewRoutineUsage.VIEW_ROUTINE_USAGE.SPECIFIC_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSpecificCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSpecificSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getSpecificName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSpecificCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSpecificSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSpecificName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewRoutineUsageRecord value1(String value) {
        setTableCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewRoutineUsageRecord value2(String value) {
        setTableSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewRoutineUsageRecord value3(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewRoutineUsageRecord value4(String value) {
        setSpecificCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewRoutineUsageRecord value5(String value) {
        setSpecificSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewRoutineUsageRecord value6(String value) {
        setSpecificName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewRoutineUsageRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewRoutineUsageRecord
     */
    public ViewRoutineUsageRecord() {
        super(ViewRoutineUsage.VIEW_ROUTINE_USAGE);
    }

    /**
     * Create a detached, initialised ViewRoutineUsageRecord
     */
    public ViewRoutineUsageRecord(String tableCatalog, String tableSchema, String tableName, String specificCatalog, String specificSchema, String specificName) {
        super(ViewRoutineUsage.VIEW_ROUTINE_USAGE);

        set(0, tableCatalog);
        set(1, tableSchema);
        set(2, tableName);
        set(3, specificCatalog);
        set(4, specificSchema);
        set(5, specificName);
    }
}
