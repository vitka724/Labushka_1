package org.ilyushenko.Labuska_1_vitka724;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping
    public String home()
    {
        return "home";
    }
}
