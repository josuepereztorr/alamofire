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

    @GetMapping("/get")
    public String getGETMethodsPage() {
        return "pages/methods/get";
    }

    @GetMapping("/get/create-project")
    public String getGETPage() {
        return "pages/methods/get/create-project";
    }

    @GetMapping("/post")
    public String getPOSTPage() {
        return "pages/methods/post";
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

    @RequestMapping("/http-mozilla")
    public String getMozilla() {
        return "redirect:https://developer.mozilla.org/en-US/docs/Web/HTTP";
    }

    @RequestMapping("/alamofire")
    public String getAlamofire() {
        return "redirect:https://www.kodeco.com/6587213-alamofire-5-tutorial-for-ios-getting-started";
    }

    @RequestMapping("/alamofire-repo")
    public String getAlamofireRepo() {
        return "redirect:https://github.com/Alamofire/Alamofire";
    }

}
