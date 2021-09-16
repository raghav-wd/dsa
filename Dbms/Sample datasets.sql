insert into employees(employeename, salary, deptno) value('KAYLING', 6000, 1001);
insert into employees(employeename, salary, deptno) value('BLAZE', 2750, 3001);
insert into employees(employeename, salary, deptno) value('CLARE', 2550, 1001);
insert into employees(employeename, salary, deptno) value('JONAS', 2957, 2001);
insert into employees(employeename, salary, deptno) value('SCARLET', 3100, 2001);
insert into employees(employeename, salary, deptno) value('FRANK', 3100, 2001);
insert into employees(employeename, salary, deptno) value('SANDRINE', 900, 2001);
insert into employees(employeename, salary, deptno) value('ADELYN', 1700, 3001);
insert into employees(employeename, salary, deptno) value('WADE', 1350, 3001);
insert into employees(employeename, salary, deptno) value('MADDEN', 1350, 3001);
insert into employees(employeename, salary, deptno) value('TUCKER', 1600, 3001);
insert into employees(employeename, salary, deptno) value('ADNRES', 1200, 2001);
insert into employees(employeename, salary, deptno) value('JULIUS', 1050, 3001);
insert into employees(employeename, salary, deptno) value('MARKER', 1400, 1001);

CREATE TABLE if not exists department (deptno int, deptname varchar(255));
insert into department (deptno, deptname) VALUES(1001, 'Software Engineer');
insert into department (deptno, deptname) VALUES(2001, 'R&D Engineer');
insert into department (deptno, deptname) VALUES(3001, 'ML Engineer');

-- SELECT deptname from department where deptno in (SELECT deptno from employees group by deptno having count(*) > 3);
