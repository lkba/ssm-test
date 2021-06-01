package com.lkb.test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.Map;

//@Controller
//@RequestMapping("/product")
public class AjaxController {

    @RequestMapping("/ajaxa.do")
    public ModelAndView ajaxa() {
        ModelAndView mv = new ModelAndView();
//        System.out.println(ajaxtets);
//        Object ps=ajaxtets.get("userName");
        mv.addObject("ajaxtest-username", "");
//        System.out.println(ps);
        mv.setViewName("ajaxtest");
        return mv;
    }

    @PostMapping("/listUsers.do")
    @ResponseBody
    public Map listUsers(@RequestBody Map listUser){
//        System.out.println("username:"+listUser.get(0).getUsername());
//        System.out.println(listUser);
        return listUser;
    }

}
