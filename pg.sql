-----------------------------------------------------------------------
-- article
-----------------------------------------------------------------------

DROP TABLE IF EXISTS "article" CASCADE;

CREATE TABLE "article"
(
    "id" serial NOT NULL,
    "title" VARCHAR,
    "content" VARCHAR
);

-----------------------------------------------------------------------
-- category
-----------------------------------------------------------------------

DROP TABLE IF EXISTS "category" CASCADE;

CREATE TABLE "category"
(
    "id" serial NOT NULL,
    "name" VARCHAR(20),
    PRIMARY KEY ("id")
);

-----------------------------------------------------------------------
-- tag
-----------------------------------------------------------------------

DROP TABLE IF EXISTS "tag" CASCADE;

CREATE TABLE "tag"
(
    "id" serial NOT NULL,
    "name" VARCHAR,
    PRIMARY KEY ("id")
);

-----------------------------------------------------------------------
-- user
-----------------------------------------------------------------------

DROP TABLE IF EXISTS "user" CASCADE;

CREATE TABLE "user"
(
    "id" serial NOT NULL,
    "name" VARCHAR NOT NULL,
    "pwd" VARCHAR,
    PRIMARY KEY ("id","name")
);
