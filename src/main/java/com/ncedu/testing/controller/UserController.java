package com.ncedu.testing.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * Created by dreikaa on 3/12/17.
 */
@Controller
public class UserController {
    private static final Logger log = Logger.getLogger(RequestController.class);
    private RequestService requestService;

    @Autowired
    public RequestController(RequestService requestService){
        this.requestService = requestService;
    }

    @RequestMapping(path = "/user", method = RequestMethod.POST)
    @ResponseBody
    public void saveRequest(@Valid @RequestBody Request request){
        try{
            requestService.createRequest(request.getProblem(), request.getCost());
            log.info("Request created");
        }catch(Exception e){
            System.out.println(e.toString());
            log.info("Error while creating | " + e.toString());
        }
    }

    @RequestMapping(path = "/deleteR", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteRequest(Long id){
        try{
            requestService.removeRequest(id);
            log.info("Request deleted");
        }catch(Exception e){
            System.out.println(e.toString());
            log.info("Error while deleting");
        }
    }

    @RequestMapping(path = "update-owner", method = RequestMethod.PUT)
    @ResponseBody
    public void updateRequest(@Valid @RequestBody Request request){
        try{
            requestService.updateRequest(request.getId(), request.getProblem(), request.getCost());
            log.info("Request updated");
        }catch(Exception e){
            System.out.println(e.toString());
            log.info("Error while updating");
        }
    }
}
