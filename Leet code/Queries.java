public enum Queries {
	ADD_SUPER_ADMIN("insert into employee(name,mobile,location,email,password,job,salary,specialist) values ('Balaji','7540086115','SRIVILLIPUTHUR','balaji@gmail.com','Balaji@123',2,'1000000','')"),
	CREATE_TREATMENT("CREATE TABLE IF NOT EXISTS treatment(id BIGSERIAL NOT NULL PRIMARY KEY,doctor_id BIGSERIAL NOT NULL,patient_id BIGSERIAL NOT NULL, date DATE DEFAULT(CURRENT_DATE),disease VARCHAR(20) NOT NULL,paid BOOLEAN DEFAULT TRUE,FOREIGN KEY (patient_id) REFERENCES patient(id),FOREIGN KEY (doctor_id) REFERENCES employee(id))"),
	CREATE_REPORT("CREATE TABLE IF NOT EXISTS report(id BIGSERIAL NOT NULL PRIMARY KEY,doctor_id BIGSERIAL NOT NULL,patient_id BIGSERIAL NOT NULL, date DATE DEFAULT(CURRENT_DATE),disease VARCHAR(20) NOT NULL,treatment VARCHAR(20) NOT NULL,paid BOOLEAN DEFAULT TRUE,FOREIGN KEY (patient_id) REFERENCES patient(id),FOREIGN KEY (doctor_id) REFERENCES employee(id))"),
	CREATE_RECEIPT("CREATE TABLE IF NOT EXISTS receipt(id BIGSERIAL NOT NULL PRIMARY KEY,cashier_id BIGSERIAL NOT NULL, patient_id BIGSERIAL NOT NULL,treatment_id BIGSERIAL NOT NULL,amount BIGSERIAL NOT NULL,FOREIGN KEY (patient_id) REFERENCES patient(id),FOREIGN KEY (cashier_id) REFERENCES employee(id),FOREIGN KEY (treatment_id) REFERENCES treatment(id))"),
	CREATE_APPOINTMENT("CREATE TABLE IF NOT EXISTS appointment(id BIGSERIAL NOT NULL PRIMARY KEY,patient_id BIGSERIAL NOT NULL, doctor_id BIGSERIAL NOT NULL,date DATE DEFAULT(CURRENT_DATE),status BOOLEAN DEFAULT TRUE,FOREIGN KEY (patient_id) REFERENCES patient(id),FOREIGN KEY (doctor_id) REFERENCES employee(id))"),
	CREATE_PATIENT("CREATE TABLE IF NOT EXISTS patient(id BIGSERIAL NOT NULL PRIMARY KEY,name VARCHAR(15) NOT NULL,mobile VARCHAR(10) NOT NULL UNIQUE,location VARCHAR(20) NOT NULL, email VARCHAR(50) NOT NULL UNIQUE,password VARCHAR(11) NOT NULL,bloodgroup VARCHAR(5) NOT NULL,status BOOLEAN DEFAULT TRUE)"),
	CREATE_EMPLOYEE("CREATE TABLE IF NOT EXISTS employee(id BIGSERIAL NOT NULL PRIMARY KEY,name VARCHAR(15) NOT NULL,mobile VARCHAR(10) NOT NULL UNIQUE,location VARCHAR(20) NOT NULL, email VARCHAR(50) NOT NULL UNIQUE,password VARCHAR(11) NOT NULL,job SMALLINT NOT NULL,salary BIGSERIAL NOT NULL,specialist VARCHAR(20) NOT NULL,status BOOLEAN DEFAULT TRUE)"),
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
	VIEW_PATIENT_RECEIPT("select receipt.id,employee.name,patient.name,receipt.treatment_id,receipt.amount from receipt join employee on employee.id = receipt.cashier_id join patient on patient.id=receipt.patient_id where patient_id = ? "),
	VIEW_DOCTORS("select * from employee where job = 0 "),
	GET_DOCTOR_AVAILABLE("select count(*) from appointment where doctor_id = ? and status = true and date = (SELECT CURRENT_DATE)"),
	DELETE_APPOINTMENT("update appointment set status = false where date = (SELECT CURRENT_DATE) and status = true and patient_id = ? "),
	VIEW_ALL_APPOINTMENT("select appointment.id,patient.name,employee.name,date,appointment.status from appointment join patient on patient.id=appointment.patient_id join employee on employee.id=appointment.doctor_id where date = (SELECT CURRENT_DATE) and appointment.status = true and patient_id = ? "),
	VIEW_APPOINTMENT("select appointment.id,patient.name,employee.name,date,appointment.status from appointment join patient on patient.id=appointment.patient_id join employee on employee.id=appointment.doctor_id where date = (SELECT CURRENT_DATE) and appointment.status = true "),
	ADD_APPOINTMENT("insert into appointment(patient_id,doctor_id) values(?,?)");

	private final String query ;

    Queries(String query) {
        this.query=query;
    }
    public String getQuery(){
        return query;
    }
}
