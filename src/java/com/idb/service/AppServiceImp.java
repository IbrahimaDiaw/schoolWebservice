/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.idb.service;


import com.idb.model.Classes;
import com.idb.model.Etudiants;
import com.idb.model.Evaluations;
import com.idb.model.Matieres;
import com.idb.model.Users;
import java.util.List;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Ibrahima Ibnu Omar
 */
@WebService(serviceName="AppService", endpointInterface="com.idb.service.AppService")
public class AppServiceImp implements AppService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }




    @Override
    public List<Users> checkUser(String email, String password) {
        Users users = new Users();
        String sql = "select email, password from admin where email='" + email + "' and password = '" + password + "'";
        List user = jdbcTemplate.queryForList(sql);
        return user;
    }
   
    @Override
    public List<Classes> getAllClasses() {
        String sql = "select DISTINCT * from classe";
        List classes = jdbcTemplate.queryForList(sql);
        return classes;
    }
   
    @Override
    public List<Etudiants> getAllStudents() {
        String sql = "select * from etudiant";
        List students = jdbcTemplate.queryForList(sql);
        return students;
    }

 
    @Override
    public void addEvaluations(Evaluations evaluation) {
        String sql = "insert into evaluation (type) value(?)";
        jdbcTemplate.update(sql, new Object[]{evaluation.getType()});
    }
 
    @Override
    public List<Evaluations> getAllEvaluations() {
        String sql = "select * from evaluation";
        List evaluations = jdbcTemplate.queryForList(sql);
        return evaluations;
    }


    @Override
    public List<Users> getAllUsers() {
        String sql = "select * from users";
        List users = jdbcTemplate.queryForList(sql);
        return users;
    }
  
    @Override
    public List<Matieres> getAllMatieres() {
        String sql = "SELECT * FROM matiere ";
        List matieres = jdbcTemplate.queryForList(sql);
        return matieres;
    }
  
    @Override
    public List<Etudiants> getEtudiantByID(String codEtudiant) {
        String sql = "select * from etudiant where codEtudiant= " + codEtudiant;
        List student = jdbcTemplate.queryForList(sql);
        return student;
    }
   
     @Override
    public List<Evaluations> getEvaluationsByID(String codEtudiant) {
        String sql = "select * from evaluation where Etudiant_CodEtudiant= " + codEtudiant;
        List student = jdbcTemplate.queryForList(sql);
        return student;
    }

 
    @Override
    public List<Matieres> getMatieresByID(String codEtudiant) {
        String sql = "select * from matiere where Etudiant_CodEtudiant= " + codEtudiant;
        List student = jdbcTemplate.queryForList(sql);
        return student;
    }
    @Override
    public List<Evaluations> getSemestre(String codeMat,String codEtudiant) {
        String sql = "select * "
                + "from evaluation, matiere"
                + "where Etudiant_CodEtudiant= " + codEtudiant +"and Matiere_CodeMat= "+codeMat+"";
        List semestre = jdbcTemplate.queryForList(sql);
        return semestre;
    }

   
   
  
}