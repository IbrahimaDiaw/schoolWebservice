package com.idb.controller;

import com.idb.model.Classes;
import com.idb.model.Etudiants;
import com.idb.model.Evaluations;
import com.idb.model.Matieres;
import com.idb.model.Users;
import com.idb.service.AppService;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@WebService(serviceName="AppServiceImp", endpointInterface="com.idb.model.AppController")
public class AppController {

    @Autowired
    AppService appService;
    
    @RequestMapping(value = "/adminHome", method = RequestMethod.GET)
    public ModelAndView showadminHome(Users users, HttpSession session) {
       
        ModelAndView model = new ModelAndView();
//        List<Users> users = appService.getAllUsers();
       
        return model;
    }
    
    @RequestMapping(value = "/liste_matiere", method = RequestMethod.GET)
    public ModelAndView getAllMatieres() {
        ModelAndView model = new ModelAndView();
        List<Etudiants> etudiants = appService.getAllStudents();
        List<Matieres> matieres = appService.getAllMatieres();
        model.getModelMap().put("matieres", matieres);
        model.getModel().put("etudiants", etudiants);
        return model;
    }
     @RequestMapping(value = "/update_student", method = RequestMethod.GET)
    public ModelAndView updateStudentDetail(@RequestParam(value = "s_id", required = true) Integer s_id) {
        Integer sId = s_id;
        ModelAndView model = new ModelAndView();
        model.getModelMap().put("sId", sId);
        
        List<Etudiants> student = new ArrayList();
        try {
           // student = appService.getStudentByID(s_id);
        } catch (Exception e) {
        }
        model.getModelMap().put("student", student);
        return model;
    }
    
     @RequestMapping(value = "/student_details", method = RequestMethod.GET)
    public ModelAndView getStudentDetails(@RequestParam(value = "s_id", required = true) String s_id) {
        String sId = s_id;
     
        ModelAndView model = new ModelAndView();
        model.getModelMap().put("sId", sId);
       
      
        List<Etudiants> student = new ArrayList();
        List<Evaluations> evaluation = new ArrayList();
        try {
          student = appService.getEtudiantByID(s_id);
          evaluation = appService.getEvaluationsByID(s_id);
          
          
          
        } catch (Exception e) {
        }
        model.getModelMap().put("student", student);
        model.getModelMap().put("evaluation", evaluation);
        return model;
    }
    @RequestMapping(value = "/student_information", method = RequestMethod.GET)
    public ModelAndView getAllEtudiantInformation() {
        ModelAndView model = new ModelAndView();
        List<Etudiants> students = appService.getAllStudents();
        List<Classes> classes = appService.getAllClasses();
        model.getModelMap().put("classes", classes);
        model.getModel().put("students", students);
        return model;
    }
    
     @RequestMapping(value = "/students_information", method = RequestMethod.GET)
    public ModelAndView getEtudiantsInformation() {
        ModelAndView model = new ModelAndView();
        List<Etudiants> students = appService.getAllStudents();
        List<Classes> classes = appService.getAllClasses();
        model.getModelMap().put("classes", classes);
        model.getModel().put("students", students);
        return model;
    }

    @RequestMapping(value = "/classes", method = RequestMethod.GET)
    public ModelAndView createclass() {
        ModelAndView model = new ModelAndView();
        List<Classes> cls = appService.getAllClasses();

        Classes classes = new Classes();
        model.getModelMap().put("classes", classes);
        model.getModel().put("cls", cls);
      
        return model;
    }

    @RequestMapping(value = "/evaluation", method = RequestMethod.GET)
    public ModelAndView getAllEvalutions() {
        ModelAndView model = new ModelAndView();
        List<Evaluations> eval = appService.getAllEvaluations();
        Evaluations evaluations = new Evaluations();
        model.getModelMap().put("evaluations", evaluations);
        model.getModel().put("eval", eval);
        return model;
    }

    @RequestMapping(value = "/evaluation", method = RequestMethod.POST)
    public String addsubject(ModelAndView model, Evaluations evaluation) {
        appService.addEvaluations(evaluation);
        model.getModelMap().put("evaluation", evaluation);
        return "redirect:evaluation.htm";
    }
    
     @RequestMapping(value = "/studentHome", method = RequestMethod.GET)
    public ModelAndView getResultEtudiant(@RequestParam(value = "s_id", required = false) String s_id) {
        String sId = s_id;
       
        ModelAndView model = new ModelAndView();
        model.getModelMap().put("sId", sId);

        List<Evaluations> semester = appService.getAllEvaluations();
        model.getModelMap().put("semester", semester);
      
        List<Evaluations> smtr = new ArrayList<>();
        List<Etudiants> std = new ArrayList<>();

        try {
            smtr = appService.getEvaluationsByID(sId);
            std = appService.getEtudiantByID(sId);
          
        } catch (Exception e) {
            System.out.println(e);
        }
        model.getModelMap().put("smtr", smtr);
        model.getModelMap().put("std", std);

        return model;
    }
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView showHome() {
        ModelAndView model = new ModelAndView();
        Users users = new Users();
        
        model.getModelMap().put("indes", users);
        return model;
    }
 

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView showloginForm() {
        ModelAndView model = new ModelAndView();
        Users users = new Users();
        model.getModelMap().put("login", users);
        return model;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String processForm(ModelAndView model, Users users, HttpSession session) {
        List<Users> user = appService.checkUser(users.getEmail(), users.getPassword());

        if (user.size() > 0 ) {

            return "redirect:adminHome.htm";
        }else{
            return "redirect:login.htm";
        }
    
    }
    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public ModelAndView showError() {
        ModelAndView model = new ModelAndView();
        Users users = new Users();
        model.getModelMap().put("error", users);
        return model;
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:index.htm";
    }
  
}
