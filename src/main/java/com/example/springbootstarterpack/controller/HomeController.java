package com.example.springbootstarterpack.controller;

import com.example.springbootstarterpack.mapper.TestServiceMapper;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
public class HomeController {

    @Autowired
    TestServiceMapper testServiceMapper;

    @GetMapping(value = "/test")
    @ResponseBody
    public String home(HttpServletResponse response, HttpServletRequest request)throws Exception{
        try{
            log.info(testServiceMapper.select1());
            log.info(testServiceMapper.getTimestamp());
            log.debug(testServiceMapper.select1());
            log.debug(testServiceMapper.getTimestamp());
            log.error(testServiceMapper.select1());
            log.error(testServiceMapper.getTimestamp());
        }catch (Exception e){
            e.printStackTrace();
        }
        return "{}";
    }
}
