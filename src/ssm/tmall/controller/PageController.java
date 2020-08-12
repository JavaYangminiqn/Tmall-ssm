package ssm.tmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 杨敏钦
 */
@Controller
public class PageController {
    @RequestMapping(value = "/{page}")
    public String getPage(@PathVariable String page){
        return page;
    }

}
