package com.liang.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("index")
    public String index(ModelMap modelMap){
        logger.info("the first jsp pages");
        modelMap.put("name","333");
        return "index";
    }
}