package br.com.AbenzasCorretora.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
	
	@GetMapping("/")
	public ModelAndView showHome() {
        ModelAndView mv = new ModelAndView("home/index");
        return mv;
    }
}
