create sequence HIGH_SCORES_SEQ start 1 increment 50;
create table GAME (title varchar(255) not null, releaseDate timestamp, primary key (title));
create table HIGH_SCORES (id int8 not null, date timestamp, score int8, game_title varchar(255), player_playerName varchar(255), primary key (id));
create table PlayerEntity (playerName varchar(255) not null, startDate timestamp, primary key (playerName));
alter table HIGH_SCORES add constraint FKis54xbuaqm9ipxbpvswdcnxkr foreign key (game_title) references GAME;
alter table HIGH_SCORES add constraint FK3ujw8x6b64wnxqjqyyyldldi5 foreign key (player_playerName) references PlayerEntity;
