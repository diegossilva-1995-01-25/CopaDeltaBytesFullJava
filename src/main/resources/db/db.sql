-- Role: copadeltabytes
-- DROP ROLE copadeltabytes;

CREATE ROLE copadeltabytes WITH
  NOLOGIN
  NOSUPERUSER
  INHERIT
  NOCREATEDB
  NOCREATEROLE
  NOREPLICATION
  ENCRYPTED PASSWORD 'md54dbdb0117cc1e24da9ca375b9e2be78b';
  
  
-- Database: copadeltabytes

-- DROP DATABASE copadeltabytes;

CREATE DATABASE copadeltabytes
    WITH 
    OWNER = copadeltabytes
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
	

-- Table: public.tbusuario

-- DROP TABLE public.tbusuario;

-- DROP SEQUENCE public.tbusuario_idusuario_seq;

CREATE SEQUENCE tbusuario_idusuario_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE tbusuario_idusuario_seq
    OWNER TO postgres;

CREATE TABLE tbusuario
(
    idusuario integer NOT NULL DEFAULT nextval('tbusuario_idusuario_seq'::regclass),
    email character varying(50) NOT NULL,
    senha character varying(50) NOT NULL,
    CONSTRAINT tbusuario_pkey PRIMARY KEY (idusuario)
)

TABLESPACE pg_default;

ALTER TABLE tbusuario
    OWNER to postgres;
	
    
 

 
 
-- Table: public.tbjogador

-- DROP TABLE public.tbjogador;

-- DROP SEQUENCE public.tbjogador_idjogador_seq;

CREATE SEQUENCE tbjogador_idjogador_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE tbjogador_idjogador_seq
    OWNER TO postgres;

CREATE TABLE tbjogador
(
    idjogador integer NOT NULL DEFAULT nextval('tbjogador_idjogador_seq'::regclass),
	idusuario integer NOT NULL, 
    nome character varying(50) NOT NULL,
    CONSTRAINT tbjogador_pkey PRIMARY KEY (idjogador),
	CONSTRAINT fk_usuario FOREIGN KEY (idusuario)
        REFERENCES tbusuario (idusuario) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE tbjogador
    OWNER to postgres;
	
 
 
 
 
-- Table: public.tbcampeonato

-- DROP TABLE public.tbcampeonato;

-- DROP SEQUENCE public.tbcampeonato_idcampeonato_seq;

CREATE SEQUENCE tbcampeonato_idcampeonato_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE tbcampeonato_idcampeonato_seq
    OWNER TO postgres;

CREATE TABLE tbcampeonato
(
    idcampeonato integer NOT NULL DEFAULT nextval('tbcampeonato_idcampeonato_seq'::regclass),
	idusuario integer NOT NULL, 
    nome character varying(50) NOT NULL,
	numeroparticipantes integer NOT NULL,
    CONSTRAINT tbcampeonato_pkey PRIMARY KEY (idcampeonato),
	CONSTRAINT fk_usuario FOREIGN KEY (idusuario)
        REFERENCES tbusuario (idusuario) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE tbcampeonato
    OWNER to postgres;
	
 

 
 
 
 
 
 
 
-- Table: public.tbconfronto

-- DROP TABLE public.tbconfronto;

-- DROP SEQUENCE public.tbconfronto_idconfronto_seq;

CREATE SEQUENCE tbconfronto_idconfronto_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE tbconfronto_idconfronto_seq
    OWNER TO postgres;

CREATE TABLE tbconfronto
(
    idconfronto integer NOT NULL DEFAULT nextval('tbconfronto_idconfronto_seq'::regclass),
	idcampeonato integer NOT NULL, 
    nome character varying(50) NOT NULL,
    CONSTRAINT tbconfronto_pkey PRIMARY KEY (idconfronto),
	CONSTRAINT fk_campeonato FOREIGN KEY (idcampeonato)
        REFERENCES tbcampeonato (idcampeonato) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE tbconfronto
    OWNER to postgres;
	
 

 
 
 
 

-- Table: public.tbconfrontoxjogadorxjogador

-- DROP TABLE public.tbconfrontoxjogador;

-- DROP SEQUENCE public.tbconfrontoxjogador_idconfrontoxjogador_seq;

CREATE SEQUENCE tbconfrontoxjogador_idconfrontoxjogador_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE tbconfrontoxjogador_idconfrontoxjogador_seq
    OWNER TO postgres;

CREATE TABLE tbconfrontoxjogador
(
    idconfrontoxjogador integer NOT NULL DEFAULT nextval('tbconfrontoxjogador_idconfrontoxjogador_seq'::regclass),
	idconfronto integer NOT NULL, 
    idjogador integer NOT NULL,
    CONSTRAINT tbconfrontoxjogador_pkey PRIMARY KEY (idconfrontoxjogador),
	CONSTRAINT fk_confronto FOREIGN KEY (idconfronto)
        REFERENCES tbconfronto (idconfronto) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
	CONSTRAINT fk_jogador FOREIGN KEY (idjogador)
        REFERENCES tbjogador (idjogador) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE tbconfrontoxjogador
    OWNER to postgres;
	
 
