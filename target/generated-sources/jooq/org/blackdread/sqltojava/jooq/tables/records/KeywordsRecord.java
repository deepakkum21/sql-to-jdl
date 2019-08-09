/*
 * This file is generated by jOOQ.
 */
package org.blackdread.sqltojava.jooq.tables.records;


import javax.annotation.Generated;

import org.blackdread.sqltojava.jooq.tables.Keywords;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class KeywordsRecord extends TableRecordImpl<KeywordsRecord> implements Record2<String, Integer> {

    private static final long serialVersionUID = -345794253;

    /**
     * Setter for <code>information_schema.KEYWORDS.WORD</code>.
     */
    public void setWord(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.KEYWORDS.WORD</code>.
     */
    public String getWord() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.KEYWORDS.RESERVED</code>.
     */
    public void setReserved(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.KEYWORDS.RESERVED</code>.
     */
    public Integer getReserved() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Keywords.KEYWORDS.WORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Keywords.KEYWORDS.RESERVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getReserved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getWord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getReserved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeywordsRecord value1(String value) {
        setWord(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeywordsRecord value2(Integer value) {
        setReserved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeywordsRecord values(String value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached KeywordsRecord
     */
    public KeywordsRecord() {
        super(Keywords.KEYWORDS);
    }

    /**
     * Create a detached, initialised KeywordsRecord
     */
    public KeywordsRecord(String word, Integer reserved) {
        super(Keywords.KEYWORDS);

        set(0, word);
        set(1, reserved);
    }
}
