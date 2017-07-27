/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laveolu.webwork.controller;

import com.laveolu.webwork.VideoRepository;
import com.laveolu.webwork.model.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author mfm-studio2
 */
@Controller
@RequestMapping(path="/videos")
//@RequestMapping(method=GET, path="/videos")
public class MainController {
    @Autowired//This means to get the bean called videRepository
    private VideoRepository videoRepository;
    
    @GetMapping(path="/add")//Map ONLY GET requests
    public @ResponseBody String addNewVideo(@RequestParam String title, 
            @RequestParam String show,
            @RequestParam String duration,
            @RequestParam String instruction,
            @RequestParam String description ){
        Video video = new Video();
        video.setTitle(title);
        video.setDuration(duration);
        video.setStartFrom("00:00");
        video.setInstruction(instruction);
        video.setDescription(description);
        return "Saved "+ title;
    }
    
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Video> getAllVideoa(){
        //This returns a JSON or XML with the users
        return videoRepository.findAll();
    }
}
