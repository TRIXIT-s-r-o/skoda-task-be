create table reward
(
    id          bigint primary key generated always as identity,
    title       varchar(1000),
    description varchar(1000),
    image_url   varchar(1000),
    state       varchar(100)
);

create table challenge
(
    id                bigint primary key generated always as identity,
    title             varchar(1000),
    description       varchar(1000),
    experience_points int,
    image_url         varchar(1000),
    progress          float,
    state             varchar(100),
    reward_id         bigint not null
);

alter table challenge
    add constraint fk_challenge_reward_id foreign key (reward_id) references reward (id) on delete cascade;

create index if not exists idx_challenge_reward_id on challenge (reward_id);