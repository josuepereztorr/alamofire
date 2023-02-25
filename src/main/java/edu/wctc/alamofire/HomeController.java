package edu.wctc.alamofire;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
public class HomeController {

    @GetMapping("/")
    public String getHomePage() {
        return "index";
    }

    @GetMapping("/request-methods")
    public String getRequestMethodsPage() {
        return "pages/methods/request-methods";
    }

    @GetMapping("/learn-more")
    public String getLearnMorePage() {
        return "pages/learn-more";
    }

    @RequestMapping("/swift-programming-language")
    public String getSwiftOrg() {
        return "redirect:https://www.swift.org";
    }

    @RequestMapping("/apple-documentation")
    public String getSwiftDev() {
        return "redirect:https://developer.apple.com/swift/";
    }

}
