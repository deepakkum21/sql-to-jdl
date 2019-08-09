/*
 * This file is generated by jOOQ.
 */
package org.blackdread.sqltojava.jooq.enums;


import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


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
public enum ReferentialConstraintsDeleteRule implements EnumType {

    NO_ACTION("NO ACTION"),

    RESTRICT("RESTRICT"),

    CASCADE("CASCADE"),

    SET_NULL("SET NULL"),

    SET_DEFAULT("SET DEFAULT");

    private final String literal;

    private ReferentialConstraintsDeleteRule(String literal) {
        this.literal = literal;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "REFERENTIAL_CONSTRAINTS_DELETE_RULE";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
