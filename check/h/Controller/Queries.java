package com.Hospital.Controller;
public enum Queries {
	ADD_EMPLOYEE("insert into employee(name,mobile,location,email,password,job,salary,specialist) values (?,?,?,?,?,?,?,?)"),
    EMPLOYEE_LOGIN("select id,job from employee where email = ? and password = ? "),
	ADD_PATIENT("insert into patient(name,mobile,location,email,password,bloodgroup) values (?,?,?,?,?,?)"),
	PATIENT_LOGIN("select id from patient where email = ? and password = ? "),
	VIEW_EMPLOYEES("select * from employee "),
	VIEW_EMPLOYEE ("select * from employee where id = ? "),
	VIEW_PATIENTS("select * from patient "),
	VIEW_PATIENT("select * from patient where id = ?"),
	UPDATE_EMPLOYEE("update employee set name = ?,email = ?,mobile = ?,salary = ?,specialist = ? where id = ?"),
	UPDATE_PATIENT("update patient set name = ?,email = ?,mobile = ?,bloodgroup = ? where id = ?"),
	DELETE_EMPLOYEE("delete from employee where id = ?"),
	DELETE_PATIENT("delete from patient where id = ?");


	private final String query ;

    Queries(String query) {
        this.query=query;
    }
    public String getQuery(){
        return query;
    }
}
