package edu.wctc.alamofire;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("request-methods")
public class RequestMethodsController {

    @GetMapping("/get")
    public String getGETPage() {
        return "pages/methods/get";
    }

    @GetMapping("/post")
    public String getPOSTPage() {
        return "pages/methods/post";
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
