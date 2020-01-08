package com.dream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
//@RestController
public class FreeMarkeController {

    @RequestMapping("/freeMarker")
    public String freeMarker(Map<String,Object> map){
        //Map<String,Object> map = new HashMap<String, Object>();
        map.put("name","小白");
        map.put("sex","1");
        List<String>list = new ArrayList<String>();
        list.add("吃");
        list.add("喝");
        list.add("睡");
        list.add("玩");
        map.put("object",list);
        return "freemarker";
    }

    @RequestMapping("/freeMarkeer1")
    public String freeMarkeer1(Map<String,Object> map ){
        //map = new HashMap<String, Object>();
        map.put("name","小红");
        map.put("sex","2");
        List<String>list = new ArrayList<String>();
        list.add("11111");
        list.add("22222");
        list.add("33333");
        list.add("44444");
        map.put("object",list);
        return "freemarker1";
    }

    @ResponseBody
    @RequestMapping("/asd")
    public String asd(){

        return "freemarker1";
    }
}
