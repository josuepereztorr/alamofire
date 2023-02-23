package edu.wctc.alamofire;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHomePage() {
        return "/index";
    }

    @GetMapping("/tutorials")
    public String getTutorialsPage() {
        return "/pages/tutorials";
    }

    @GetMapping("/resources")
    public String getResourcesPage() {
        return "/pages/resources";
    }

}
