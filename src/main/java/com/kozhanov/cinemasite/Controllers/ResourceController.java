package com.kozhanov.cinemasite.Controllers;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Controller
public class ResourceController {
    @GetMapping("/styles/css/{code}.css")
    @ResponseBody
    public ResponseEntity<String> styles(@PathVariable("code") String code) throws IOException {
        InputStream is = getClass().getClassLoader().getResourceAsStream("static/css/" +code +".css" );
        BufferedReader bf = new BufferedReader(new InputStreamReader(is));
        StringBuffer sb = new StringBuffer();
        String line = null;
        while((line=bf.readLine())!=null){
            sb.append(line+"\n");
        }
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type","text/css; charset=utf-8");
        return new ResponseEntity<>(sb.toString(),httpHeaders, HttpStatus.OK);
    }

    @GetMapping("/scripts/js/{code}.js")
    @ResponseBody
    public ResponseEntity<String> scripts(@PathVariable("code") String code) throws IOException {
        System.out.println("Произвел подключение");
        InputStream is = getClass().getClassLoader().getResourceAsStream("static/js/" +code +".js" );
        BufferedReader bf = new BufferedReader(new InputStreamReader(is));
        StringBuffer sb = new StringBuffer();
        String line = null;
        while((line=bf.readLine())!=null){
            sb.append(line+"\n");
        }
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type","application/javascript; charset=utf-8");
        return new ResponseEntity<>(sb.toString(),httpHeaders, HttpStatus.OK);
    }

}
