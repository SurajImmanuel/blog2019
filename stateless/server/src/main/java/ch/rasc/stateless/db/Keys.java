/*
 * This file is generated by jOOQ.
 */
package ch.rasc.stateless.db;


import ch.rasc.stateless.db.tables.AppSession;
import ch.rasc.stateless.db.tables.AppUser;
import ch.rasc.stateless.db.tables.records.AppSessionRecord;
import ch.rasc.stateless.db.tables.records.AppUserRecord;

import javax.annotation.processing.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code></code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AppUserRecord, Long> IDENTITY_APP_USER = Identities0.IDENTITY_APP_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AppSessionRecord> CONSTRAINT_A = UniqueKeys0.CONSTRAINT_A;
    public static final UniqueKey<AppUserRecord> CONSTRAINT_7 = UniqueKeys0.CONSTRAINT_7;
    public static final UniqueKey<AppUserRecord> CONSTRAINT_76 = UniqueKeys0.CONSTRAINT_76;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AppSessionRecord, AppUserRecord> CONSTRAINT_A8 = ForeignKeys0.CONSTRAINT_A8;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<AppUserRecord, Long> IDENTITY_APP_USER = Internal.createIdentity(AppUser.APP_USER, AppUser.APP_USER.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<AppSessionRecord> CONSTRAINT_A = Internal.createUniqueKey(AppSession.APP_SESSION, "CONSTRAINT_A", AppSession.APP_SESSION.ID);
        public static final UniqueKey<AppUserRecord> CONSTRAINT_7 = Internal.createUniqueKey(AppUser.APP_USER, "CONSTRAINT_7", AppUser.APP_USER.ID);
        public static final UniqueKey<AppUserRecord> CONSTRAINT_76 = Internal.createUniqueKey(AppUser.APP_USER, "CONSTRAINT_76", AppUser.APP_USER.EMAIL);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<AppSessionRecord, AppUserRecord> CONSTRAINT_A8 = Internal.createForeignKey(ch.rasc.stateless.db.Keys.CONSTRAINT_7, AppSession.APP_SESSION, "CONSTRAINT_A8", AppSession.APP_SESSION.APP_USER_ID);
    }
}
