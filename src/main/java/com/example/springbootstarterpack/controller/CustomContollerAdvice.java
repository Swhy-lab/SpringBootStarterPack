package com.example.springbootstarterpack.controller;

import com.google.gson.JsonObject;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;


@RestControllerAdvice
public class CustomContollerAdvice {

   @ExceptionHandler(value=Exception.class)
   public String sendError(Exception e){
      JsonObject object = new JsonObject();
      object.addProperty("String", "test");
      return object.toString();
   }


}
