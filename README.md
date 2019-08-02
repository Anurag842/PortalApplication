# PortalApplication
A dynamic web portal with separate admin and non admin capabilities made using JAVA,HTML,CSS.

create sequence empseq start with 1;

create table EmployeeTab (Empid int primary key,ename varchar2(20),gender varchar2(20),qualification varchar2(20),contactno number(10),email varchar2(20));

create table LoginTab(Empid int references EmployeeTab(Empid),password varchar2(20),role varchar2(20));

create table AddressTab(empid int references Employeetab(empid),hNo number(10) ,locality varchar2(20),city varchar2(20),state varchar2(20), pin number(10));


insert into employeetab values(empseq.nextval,'Anurag','male','Jedi master',7908472940,'luke@millenium.com');
insert into logintab values (empseq.currval,'pass1','Admin');
insert into addresstab values(1,248,'Swamp','Tatooine','Galaxy1024',8455);


