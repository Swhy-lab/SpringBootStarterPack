package com.example.springbootstarterpack.controller;

import com.example.springbootstarterpack.dao.TestRepository;
import com.example.springbootstarterpack.domains.Tmp;
import com.example.springbootstarterpack.mapper.TestServiceMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.gson.Gson;
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
import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Controller
public class HomeController {

    @Autowired
    TestServiceMapper testServiceMapper;

    @Autowired
    TestRepository testRepository;

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
            log.error(testRepository.findAll().toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        return "{}";
    }

    @GetMapping(value = "/test2")
    @ResponseBody
    public String home2(HttpServletResponse response, HttpServletRequest request)throws Exception{
        try{
            Tmp tmp = new Tmp();
            tmp.setTest(123.456);
            tmp.setMsg(UUID.randomUUID().toString());
            testRepository.save(tmp);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "{}";
    }

    @GetMapping(value = "/test3")
    @ResponseBody
    public String home3(HttpServletResponse response, HttpServletRequest request)throws Exception{

        return "{}";
    }
}
