package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Các bạn có thể tìm hiểu thêm  phần này tại blogs: https://levunguyen.com,
 * blogs chuyên về lập trình và các kỹ năng mềm trong nghề lập trình
 */
@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String showGreeting(Model model) {
        model.addAttribute("helloThymeleafViewResolverString", "Hello Thymeleaf View Resolver!");
        return "greeting";
    }
}
