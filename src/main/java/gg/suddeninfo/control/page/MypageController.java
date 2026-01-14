package gg.suddeninfo.control.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/mypage")
public class MypageController {
    @GetMapping(value = "/")
    public String mypage() {
        return "mypage/me";
    }
}
