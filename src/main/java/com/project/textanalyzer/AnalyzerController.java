package com.project.textanalyzer;

import org.springframework.web.bind.annotation.*;

@RestController
public class AnalyzerController {

    @RequestMapping(value = "/analyze" , method = RequestMethod.POST)
    public @ResponseBody Analytic analyze(@RequestBody String text) {
        System.out.println(text);
        return new Analytic(text);
    }
}
