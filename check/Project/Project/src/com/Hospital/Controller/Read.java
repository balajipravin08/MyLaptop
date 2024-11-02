package com.Hospital.Controller;
import com.Hospital.Model.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Read {

    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
    private static Read read = null;
    private Read(){}
    public static Read getInstance(){
        if(read == null) read = new Read();
        return read;
    }
    private ArrayList<Employee> employees ;
    private ArrayList<Patient> patients ;
    private ArrayList<Treatment> treatments;
    private ArrayList<Report> reports;
    private ArrayList<Receipt> receipts;

    public ArrayList<Employee> getEmployees(){
        employees = new ArrayList<>();
        try{
            ResultSet rs = dbo.executeQuery(Queries.VIEW_EMPLOYEES.getQuery(),new Object[]{});
            while(rs.next()){
                Employee e = null;
                String specialist = "";
                int job = rs.getInt(7);
                if(job==0) specialist = rs.getString("specialist");
                switch(job){
                    case 0 : e = new Doctor(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"),specialist);
                        break;
                    case 1 : e = new Cashier(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"));
                        break;
                    case 2 : e = new Receptionist(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"));
                        break;
                    default:break;

                }
                employees.add(e);
            }

        }catch(SQLException e){
            System.out.println("READING EMPLOYEE FAILED"+e.getMessage());
        }

        return employees;
    }

    public Employee getEmployees(int id){

        Employee employee = null;

        try{
            ResultSet rs = dbo.executeQuery(Queries.VIEW_EMPLOYEE.getQuery(),new Object[]{});
            if(rs.next()){
                String specialist = "";
                int job = rs.getInt(7);
                if(job==0) specialist = rs.getString("specialist");

                switch(job){
                    case 0 : employee = new Doctor(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"),specialist);
                        break;
                    case 1 : employee = new Cashier(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"));
                        break;
                    case 2 : employee = new Receptionist(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"));
                        break;
                    default:break;

                }
            }

        }catch(SQLException er){
            System.out.println("READING EMPLOYEE FAILED"+er.getMessage());
        }

        return employee;
    }
    public ArrayList<Patient> getPatients(){

        patients = new ArrayList<>();

        try{
            ResultSet rs = dbo.executeQuery(Queries.VIEW_PATIENTS.getQuery(),new Object[]{});
            while(rs.next()){
                Patient patient = new Patient(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getString("bloodgroup"));
                patients.add(patient);
            }
        }catch(SQLException e){
            System.out.println("READING PATIENTS FAILED"+e.getMessage());
        }

        return patients;
    }
    public Patient getPatients(int id){
        Patient patient = null;
        try{
            ResultSet rs = dbo.executeQuery(Queries.VIEW_PATIENT.getQuery(),new Object[]{id});
            if(rs.next()){
                patient = new Patient(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getString("bloodgroup"));
            }
        }catch(SQLException e){
            System.out.println("READING PATIENTS FAILED"+e.getMessage());
        }
        return patient;
    }

    public ArrayList<Treatment> getTreatments(int id){
        treatments = new ArrayList<>();
        try{
            ResultSet rs = dbo.executeQuery(Queries.VIEW_PATIENT_TREATMENTS.getQuery(),new Object[]{id});
            while(rs.next()){
                Treatment treatment = new Treatment(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getDate(4).toLocalDate(),rs.getString(5),rs.getBoolean(6));
                treatments.add(treatment);
            }
        }catch(SQLException e){
            System.out.println("READING PATIENTS TREATMENTS FAILED "+e.getMessage());
        }

        return treatments;
    }
    public ArrayList<Treatment> getTreatments(int patientId , int doctorId){
        treatments = new ArrayList<>();
        try{
            ResultSet rs = dbo.executeQuery(Queries.VIEW_DOCTOR_TREATMENTS.getQuery(),new Object[]{patientId,doctorId});
            while(rs.next()){
                Treatment treatment = new Treatment(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getDate(4).toLocalDate(),rs.getString(5),rs.getBoolean(6));
                treatments.add(treatment);
            }
        }catch(SQLException e){
            System.out.println("READING DOCTOR TREATMENTS FAILED "+e.getMessage());
        }

        return treatments;
    }

    public ArrayList<Report> getReports(int id) {
        reports = new ArrayList<>();

        try{
            ResultSet rs = dbo.executeQuery(Queries.VIEW_PATIENT_REPORTS.getQuery(),new Object[]{id});
            if (rs!=null){
                while(rs.next()){
                    Report report = new Report(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getDate(4).toLocalDate(),rs.getString(5),rs.getString(6),rs.getBoolean(7));
                    reports.add(report);
                }
            }

        }catch(SQLException e){
            System.out.println("READING PATIENTS REPORTS FAILED "+e.getMessage());
        }
        return reports;
    }
    public ArrayList<Report> getReports(int patientId , int doctorId) {
        reports = new ArrayList<>();

        try{
            ResultSet rs = dbo.executeQuery(Queries.VIEW_DOCTOR_REPORTS.getQuery(),new Object[]{patientId,doctorId});
            if(rs!=null){
                while(rs.next()){
                    Report report = new Report(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getDate(4).toLocalDate(),rs.getString(5),rs.getString(6),rs.getBoolean(7));
                    reports.add(report);
                }
            }

        }catch(SQLException e){
            System.out.println("READING PATIENTS REPORTS FAILED "+e.getMessage());
        }
        return reports;
    }

    public ArrayList<Receipt> getReceipts() {
        receipts = new ArrayList<>();

        try{
            ResultSet rs = dbo.executeQuery(Queries.VIEW_RECEIPT.getQuery(),new Object[]{});
            if (rs!=null){
                while(rs.next()){
                    Receipt receipt = new Receipt(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getLong(5));
                    receipts.add(receipt);
                }
            }
        }catch(SQLException e){
            System.out.println("READING RECEIPTS FAILED "+e.getMessage());
        }
        return receipts;
    }

    public ArrayList<Receipt> getReceipts(int id, int person) {
        receipts = new ArrayList<>();
        String query = "";
        if (person==0){
            query = Queries.VIEW_CASHIER_RECEIPT.getQuery();
        }else{
            query = Queries.VIEW_PATIENT_RECEIPT.getQuery();
        }
        try{
            ResultSet rs = dbo.executeQuery(query,new Object[]{id});
            if (rs!=null){
                while(rs.next()){
                    Receipt receipt = new Receipt(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getLong(5));
                    receipts.add(receipt);
                }
            }
        }catch(SQLException e){
            System.out.println("READING RECEIPTS FAILED "+e.getMessage());
        }
        return receipts;

    }
}
//select treatment.id,employee.name,patient.name,treatment.date,treatment.disease,treatment.paid  from treatment
//join employee on employee.id = treatment.doctor_id join patient on patient.id=treatment.patient_id where patient_id = 1