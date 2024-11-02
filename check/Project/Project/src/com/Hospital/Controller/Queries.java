package com.Hospital.Controller;
public enum Queries {
	ADD_EMPLOYEE("insert into employee(name,mobile,location,email,password,job,salary,specialist) values (?,?,?,?,?,?,?,?)"),
    EMPLOYEE_LOGIN("select * from employee where email = ? and password = ? "),
	ADD_PATIENT("insert into patient(name,mobile,location,email,password,bloodgroup) values (?,?,?,?,?,?)"),
	PATIENT_LOGIN("select * from patient where email = ? and password = ? "),
	VIEW_EMPLOYEES("select * from employee where status = 'true' "),
	VIEW_EMPLOYEE ("select * from employee where id = ? "),
	VIEW_PATIENTS("select * from patient where status = 'true' "),
	VIEW_PATIENT("select * from patient where id = ?"),
	UPDATE_EMPLOYEE("update employee set name = ?,email = ?,mobile = ?,salary = ?,specialist = ? where id = ?"),
	UPDATE_PATIENT("update patient set name = ?,email = ?,mobile = ?,bloodgroup = ? where id = ?"),
	DELETE_EMPLOYEE("update employee set status = 'false' where id = ?"),
	DELETE_PATIENT("update patient set status = 'false' where id = ?"),
	ADD_TREATMENT("insert into treatment(doctor_id,patient_id,paid,disease) values(?,?,?,?)"),
	ADD_REPORT("insert into report(doctor_id,patient_id,disease,treatment,paid) values(?,?,?,?,?)"),
	VIEW_PATIENT_TREATMENTS("select treatment.id,employee.name,patient.name,treatment.date,treatment.disease,treatment.paid  from treatment join employee on employee.id = treatment.doctor_id join patient on patient.id=treatment.patient_id where patient_id = ? "),
	VIEW_DOCTOR_TREATMENTS("select treatment.id,employee.name,patient.name,treatment.date,treatment.disease,treatment.paid  from treatment join employee on employee.id = treatment.doctor_id join patient on patient.id=treatment.patient_id where patient_id = ? and doctor_id = ? "),
	VIEW_DOCTOR_REPORTS("select report.id,employee.name,patient.name,report.date,report.disease,report.treatment,report.paid  from report join employee on employee.id = report.doctor_id join patient on patient.id=report.patient_id where patient_id = ? and doctor_id = ? "),
	ADD_RECEIPT("insert into receipt(doctor_id,patient_id,treatment_id,amount) values(?,?,?,?)"),
	VIEW_PATIENT_REPORTS("select report.id,employee.name,patient.name,report.date,report.disease,report.treatment,report.paid  from report join employee on employee.id = report.doctor_id join patient on patient.id=report.patient_id where patient_id = ? "),
	VIEW_RECEIPT("select receipt.id,employee.name,patient.name,receipt.treatment_id,receipt.amount from receipt join employee on employee.id = receipt.cashier_id join patient on patient.id=receipt.patient_id "),
	VIEW_CASHIER_RECEIPT("select receipt.id,employee.name,patient.name,receipt.treatment_id,receipt.amount from receipt join employee on employee.id = receipt.cashier_id join patient on patient.id=receipt.patient_id where cashier_id = ? "),
	VIEW_PATIENT_RECEIPT("select receipt.id,employee.name,patient.name,receipt.treatment_id,receipt.amount from receipt join employee on employee.id = receipt.cashier_id join patient on patient.id=receipt.patient_id where patient_id = ? ");


	private final String query ;

    Queries(String query) {
        this.query=query;
    }
    public String getQuery(){
        return query;
    }
}
