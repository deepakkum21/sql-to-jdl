/*
 * This file is generated by jOOQ.
 */
package org.blackdread.sqltojava.jooq.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.blackdread.sqltojava.jooq.enums.EventsIntervalField;
import org.blackdread.sqltojava.jooq.enums.EventsStatus;
import org.blackdread.sqltojava.jooq.tables.Events;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;


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
public class EventsRecord extends TableRecordImpl<EventsRecord> {

    private static final long serialVersionUID = 751694419;

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_CATALOG</code>.
     */
    public void setEventCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_CATALOG</code>.
     */
    public String getEventCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_SCHEMA</code>.
     */
    public void setEventSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_SCHEMA</code>.
     */
    public String getEventSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_NAME</code>.
     */
    public void setEventName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.EVENTS.DEFINER</code>.
     */
    public void setDefiner(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.DEFINER</code>.
     */
    public String getDefiner() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.EVENTS.TIME_ZONE</code>.
     */
    public void setTimeZone(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.TIME_ZONE</code>.
     */
    public String getTimeZone() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_BODY</code>.
     */
    public void setEventBody(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_BODY</code>.
     */
    public String getEventBody() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_DEFINITION</code>.
     */
    public void setEventDefinition(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_DEFINITION</code>.
     */
    public String getEventDefinition() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_TYPE</code>.
     */
    public void setEventType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_TYPE</code>.
     */
    public String getEventType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EXECUTE_AT</code>.
     */
    public void setExecuteAt(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.EXECUTE_AT</code>.
     */
    public Timestamp getExecuteAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>information_schema.EVENTS.INTERVAL_VALUE</code>.
     */
    public void setIntervalValue(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.INTERVAL_VALUE</code>.
     */
    public String getIntervalValue() {
        return (String) get(9);
    }

    /**
     * Setter for <code>information_schema.EVENTS.INTERVAL_FIELD</code>.
     */
    public void setIntervalField(EventsIntervalField value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.INTERVAL_FIELD</code>.
     */
    public EventsIntervalField getIntervalField() {
        return (EventsIntervalField) get(10);
    }

    /**
     * Setter for <code>information_schema.EVENTS.SQL_MODE</code>.
     */
    public void setSqlMode(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.SQL_MODE</code>.
     */
    public String getSqlMode() {
        return (String) get(11);
    }

    /**
     * Setter for <code>information_schema.EVENTS.STARTS</code>.
     */
    public void setStarts(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.STARTS</code>.
     */
    public Timestamp getStarts() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>information_schema.EVENTS.ENDS</code>.
     */
    public void setEnds(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.ENDS</code>.
     */
    public Timestamp getEnds() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>information_schema.EVENTS.STATUS</code>.
     */
    public void setStatus(EventsStatus value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.STATUS</code>.
     */
    public EventsStatus getStatus() {
        return (EventsStatus) get(14);
    }

    /**
     * Setter for <code>information_schema.EVENTS.ON_COMPLETION</code>.
     */
    public void setOnCompletion(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.ON_COMPLETION</code>.
     */
    public String getOnCompletion() {
        return (String) get(15);
    }

    /**
     * Setter for <code>information_schema.EVENTS.CREATED</code>.
     */
    public void setCreated(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.CREATED</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>information_schema.EVENTS.LAST_ALTERED</code>.
     */
    public void setLastAltered(Timestamp value) {
        set(17, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.LAST_ALTERED</code>.
     */
    public Timestamp getLastAltered() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>information_schema.EVENTS.LAST_EXECUTED</code>.
     */
    public void setLastExecuted(Timestamp value) {
        set(18, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.LAST_EXECUTED</code>.
     */
    public Timestamp getLastExecuted() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_COMMENT</code>.
     */
    public void setEventComment(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_COMMENT</code>.
     */
    public String getEventComment() {
        return (String) get(19);
    }

    /**
     * Setter for <code>information_schema.EVENTS.ORIGINATOR</code>.
     */
    public void setOriginator(UInteger value) {
        set(20, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.ORIGINATOR</code>.
     */
    public UInteger getOriginator() {
        return (UInteger) get(20);
    }

    /**
     * Setter for <code>information_schema.EVENTS.CHARACTER_SET_CLIENT</code>.
     */
    public void setCharacterSetClient(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.CHARACTER_SET_CLIENT</code>.
     */
    public String getCharacterSetClient() {
        return (String) get(21);
    }

    /**
     * Setter for <code>information_schema.EVENTS.COLLATION_CONNECTION</code>.
     */
    public void setCollationConnection(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.COLLATION_CONNECTION</code>.
     */
    public String getCollationConnection() {
        return (String) get(22);
    }

    /**
     * Setter for <code>information_schema.EVENTS.DATABASE_COLLATION</code>.
     */
    public void setDatabaseCollation(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.DATABASE_COLLATION</code>.
     */
    public String getDatabaseCollation() {
        return (String) get(23);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsRecord
     */
    public EventsRecord() {
        super(Events.EVENTS);
    }

    /**
     * Create a detached, initialised EventsRecord
     */
    public EventsRecord(String eventCatalog, String eventSchema, String eventName, String definer, String timeZone, String eventBody, String eventDefinition, String eventType, Timestamp executeAt, String intervalValue, EventsIntervalField intervalField, String sqlMode, Timestamp starts, Timestamp ends, EventsStatus status, String onCompletion, Timestamp created, Timestamp lastAltered, Timestamp lastExecuted, String eventComment, UInteger originator, String characterSetClient, String collationConnection, String databaseCollation) {
        super(Events.EVENTS);

        set(0, eventCatalog);
        set(1, eventSchema);
        set(2, eventName);
        set(3, definer);
        set(4, timeZone);
        set(5, eventBody);
        set(6, eventDefinition);
        set(7, eventType);
        set(8, executeAt);
        set(9, intervalValue);
        set(10, intervalField);
        set(11, sqlMode);
        set(12, starts);
        set(13, ends);
        set(14, status);
        set(15, onCompletion);
        set(16, created);
        set(17, lastAltered);
        set(18, lastExecuted);
        set(19, eventComment);
        set(20, originator);
        set(21, characterSetClient);
        set(22, collationConnection);
        set(23, databaseCollation);
    }
}
