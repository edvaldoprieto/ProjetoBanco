create table users (
    id BIGINT not null primary key 
    Generated always as identity (start with 1, increment by 1),
    role varchar(200) not null, 
    name varchar(200) not null, 
    login varchar(20) not null, 
    passwordHash BIGINT not null
);

insert into users values (default, 'admin', 'admin', 'admin', 102030);
insert into users values (default, 'operador', 'Zezao', 'operador', 102030);

create table alunos (
    matricula int not null primary key, 
    nomeAluno varchar(200) not null,
    cpfAluno int not null, 
    responsavelAluno int not null
    
);

select * from users
