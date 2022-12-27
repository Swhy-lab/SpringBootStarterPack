package com.example.springbootstarterpack.controller;

import com.example.springbootstarterpack.domains.TmpVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;


@Controller
public class HomeController {
    @RequestMapping(value="/hello")
    public String home() throws Exception{

        return "index.html";
    }
    @RequestMapping(value="/hello8")
    public String home8(HttpServletResponse response)throws Exception{
        TmpVO tmp = new TmpVO();
        tmp.setVal(-15620);
        tmp.getVal();
        response.setStatus(403);
        return "index.html";
    }


}
