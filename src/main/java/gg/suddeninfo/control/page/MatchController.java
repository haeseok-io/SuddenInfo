package gg.suddeninfo.control.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/match")
public class MatchController {
    @GetMapping(value = "/")
    public String match() {
        return "match/details";
    }
}
