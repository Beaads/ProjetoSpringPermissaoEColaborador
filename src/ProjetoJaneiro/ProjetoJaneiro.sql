CREATE TABLE Colaborador(
                            codigoColaborador int PRIMARY KEY not null,
                            nomeColaborador VARCHAR (80),
                            dataNascimento NUMERIC
);

CREATE TABLE Permissao(
                          codigoPermissao int PRIMARY KEY not null,
                          nomePermissao VARCHAR (80)
);

CREATE TABLE Colaborador_Permissao(
                                      codigoColaborador int not null UNIQUE,
                                      codigoPermissao int not null UNIQUE,
                                      foreign key (codigoColaborador) references  Colaborador(codigoColaborador),
                                      foreign key (codigoPermissao) references Permissao(codigoPermissao),
                                      CONSTRAINT pk_Colaborador_Permissao PRIMARY KEY(codigoColaborador,codigoPermissao)
);
