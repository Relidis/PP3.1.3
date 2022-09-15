package com.example.pp.control;

import com.example.pp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class IndexController {
        private UserService userService;

        @GetMapping("/{id}")
        public String indexPage(@PathVariable("id") Long id, ModelMap modelMap) {
            modelMap.addAttribute("user", userService.getUserById(id));
            return "index";
        }
    }

