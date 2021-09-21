package com.gnt.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SearchController {

    @GetMapping("/search/{summonerName}")
    public String search() {
        return "summoner";
    }

}