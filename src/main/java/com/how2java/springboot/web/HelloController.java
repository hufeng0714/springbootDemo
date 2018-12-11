package com.how2java.springboot.web;
import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
		/**
		修改HelloController，把本来的@RestController 改为@Controller。
		这时返回"hello"就不再是字符串，而是根据application.properties 中的视图重定向，到/WEB-INF/jsp目录下去寻找hello.jsp文件
		 */

//http://127.0.0.1:8080/hello

@Controller
public class HelloController {
  
    @RequestMapping("/hello1")
    public String hello(Model m) {
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }
}