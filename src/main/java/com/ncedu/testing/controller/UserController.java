//package com.ncedu.testing.controller;
//
//import com.ncedu.testing.entity.User;
//import com.ncedu.testing.service.UserService;
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.validation.Valid;
//
///**
// * Created by dreikaa on 3/12/17.
// */
//@Controller
//public class UserController {
//    private static final Logger log = Logger.getLogger(RequestController.class);
//    private UserService requestService;
//
//    @Autowired
//    public UserController(UserService requestService){
//        this.requestService = requestService;
//    }
//
//    @RequestMapping(path = "/user", method = UserMethod.POST)
//    @ResponseBody
//    public void saveUser(@Valid @RequestBody User user){
//        try{
//            requestService.createUser(request.getProblem(), user.getCost());
//            log.info("Request created");
//        }catch(Exception e){
//            System.out.println(e.toString());
//            log.info("Error while creating | " + e.toString());
//        }
//    }
//
//    @RequestMapping(path = "/deleteR", method = RequestMethod.DELETE)
//    @ResponseBody
//    public void deleteRequest(Long id){
//        try{
//            requestService.removeRequest(id);
//            log.info("Request deleted");
//        }catch(Exception e){
//            System.out.println(e.toString());
//            log.info("Error while deleting");
//        }
//    }
//
//    @RequestMapping(path = "update-owner", method = RequestMethod.PUT)
//    @ResponseBody
//    public void updateRequest(@Valid @RequestBody Request request){
//        try{
//            requestService.updateRequest(request.getId(), request.getProblem(), request.getCost());
//            log.info("Request updated");
//        }catch(Exception e){
//            System.out.println(e.toString());
//            log.info("Error while updating");
//        }
//    }
//}
