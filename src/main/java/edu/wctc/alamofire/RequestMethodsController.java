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

}
