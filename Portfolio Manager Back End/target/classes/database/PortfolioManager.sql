/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017-08-05 11:27:15                          */
/*==============================================================*/


drop table if exists bond;

drop index activity_collection_FK on etf;

drop index user_collection_FK on etf;

drop table if exists etf;

drop index activity_collection_FK on equity;

drop index user_collection_FK on equity;

drop table if exists equity;

drop index activity_collection_FK on fra;

drop table if exists fra;

drop table if exists fund_manager;

drop index activity_collection_FK on future;

drop index user_collection_FK on future;

drop table if exists future;

drop table if exists portfolio;

drop table if exists position;

drop table if exists price;

drop table if exists security;

/*==============================================================*/
/* Table: bond                                                  */
/*==============================================================*/
create table bond
(
   id                   int not null,
   issure               varchar(20) not null,
   coupon               varchar(20) not null,
   maturity_date        date,
   primary key (id)
);

/*==============================================================*/
/* Table: etf                                                   */
/*==============================================================*/
create table etf
(
   id                   int not null,
   symbol               varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Index: user_collection_FK                                    */
/*==============================================================*/
create index user_collection_FK on etf
(
   symbol
);

/*==============================================================*/
/* Index: activity_collection_FK                                */
/*==============================================================*/
create index activity_collection_FK on etf
(
   
);

/*==============================================================*/
/* Table: equity                                                */
/*==============================================================*/
create table equity
(
   id                   int not null,
   symbol               varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Index: user_collection_FK                                    */
/*==============================================================*/
create index user_collection_FK on equity
(
   symbol
);

/*==============================================================*/
/* Index: activity_collection_FK                                */
/*==============================================================*/
create index activity_collection_FK on equity
(
   
);

/*==============================================================*/
/* Table: fra                                                   */
/*==============================================================*/
create table fra
(
   id                   int not null,
   start                date,
   end             		date,
   rate                 double,
   primary key (id)
);

/*==============================================================*/
/* Index: activity_collection_FK                                */
/*==============================================================*/
create index activity_collection_FK on fra
(
   
);

/*==============================================================*/
/* Table: fund_manager                                           */
/*==============================================================*/
create table fund_manager
(
   id                   int not null,
   first_name           varchar(20) not null,
   last_name            varchar(20) not null,
   email                varchar(20) not null,
   telephone            varchar(10) not null,
   portfolio            int,
   primary key (id)
);

/*==============================================================*/
/* Table: future                                                */
/*==============================================================*/
create table future
(
   id                   int not null,
   symbol               varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Index: user_collection_FK                                    */
/*==============================================================*/
create index user_collection_FK on future
(
   symbol
);

/*==============================================================*/
/* Index: activity_collection_FK                                */
/*==============================================================*/
create index activity_collection_FK on future
(
   
);

/*==============================================================*/
/* Table: portfolio                                             */
/*==============================================================*/
create table portfolio
(
   id                   int not null,
   position             int,
   name                 varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: position                                              */
/*==============================================================*/
create table position
(
   id                   int not null,
   security             int,
   quantity             int,
   primary key (id)
);

/*==============================================================*/
/* Table: price                                                 */
/*==============================================================*/
create table price
(
   id                   int not null,
   bid_price            double not null,
   offer_price          double,
   date                 date,
   currency             varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: security                                              */
/*==============================================================*/
create table security
(
   id                   int not null,
   issn                 varchar(20),
   price                double,
   primary key (id)
);

alter table bond add constraint FK_bond_security foreign key (id)
      references security (id) on delete restrict on update restrict;

alter table etf add constraint FK_etf_security foreign key (id)
      references security (id) on delete restrict on update restrict;

alter table equity add constraint FK_equity_security foreign key (id)
      references security (id) on delete restrict on update restrict;

alter table fra add constraint FK_fra_security foreign key (id)
      references security (id) on delete restrict on update restrict;

alter table fund_manager add constraint FK_fundmanager_portfolio foreign key (portfolio)
      references portfolio (id) on delete restrict on update restrict;

alter table future add constraint FK_future_security foreign key (id)
      references security (id) on delete restrict on update restrict;

alter table portfolio add constraint FK_portfoliot_position foreign key (position)
      references position (id) on delete restrict on update restrict;

alter table position add constraint FK_position_secutity foreign key (security)
      references security (id) on delete restrict on update restrict;

alter table security add constraint FK_security_price foreign key (price)
      references price (id) on delete restrict on update restrict;

