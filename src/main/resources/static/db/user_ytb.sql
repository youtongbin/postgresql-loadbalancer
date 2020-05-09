/*
 Navicat Premium Data Transfer

 Source Server         : 39.98.128.62_30752
 Source Server Type    : PostgreSQL
 Source Server Version : 120002
 Source Host           : 39.98.128.62:30752
 Source Catalog        : user
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 120002
 File Encoding         : 65001

 Date: 09/05/2020 14:03:20
*/

CREATE SEQUENCE user_ytb_id_seq START 10;

-- ----------------------------
-- Table structure for user_ytb
-- ----------------------------
DROP TABLE IF EXISTS "public"."user_ytb";
CREATE TABLE "public"."user_ytb" (
  "id" int4 NOT NULL DEFAULT nextval('user_ytb_id_seq'::regclass),
  "name" varchar(255) COLLATE "pg_catalog"."default",
  "sex" varchar(255) COLLATE "pg_catalog"."default",
  "age" int4,
  "address" varchar(255) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Records of user_ytb
-- ----------------------------
INSERT INTO "public"."user_ytb" VALUES (1, 'ytb', '男', 24, '济南');
INSERT INTO "public"."user_ytb" VALUES (2, 'mlm', '男', 24, '济南');

-- ----------------------------
-- Primary Key structure for table user_ytb
-- ----------------------------
ALTER TABLE "public"."user_ytb" ADD CONSTRAINT "user_pkey" PRIMARY KEY ("id");
