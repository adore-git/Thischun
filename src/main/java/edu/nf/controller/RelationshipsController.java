package edu.nf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Administrator on 2017/4/20.
 */
@Controller
public class RelationshipsController {
    @GetMapping(value = "guanzhu")
    public String guanzhu(){

        return "guanzhu";
    }



}
