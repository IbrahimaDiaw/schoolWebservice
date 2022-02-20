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
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Student
 */
@WebService(name ="AppService")
public interface AppService {
     @WebMethod()
     public void addEvaluations(Evaluations evaluations);
     public List<Evaluations>getSemestre(String codeMat,String codEtudiant);
      
      
       @WebMethod()
      public List<Users> checkUser(String email, String password);
      public List<Users> getAllUsers();     
      public List<Evaluations> getAllEvaluations();
      public List<Classes> getAllClasses();
      public List<Etudiants> getAllStudents();
      public List<Matieres> getAllMatieres();
      public List<Etudiants> getEtudiantByID(String codEtudiant);
      public List<Evaluations> getEvaluationsByID(String codEtudiant);
      public List<Matieres> getMatieresByID(String codEtudiant);
      

    
      
}
