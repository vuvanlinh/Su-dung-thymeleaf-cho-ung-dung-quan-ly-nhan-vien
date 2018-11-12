package will.controller;

import will.service.NhanvienService;
import will.service.NhanvienServiceImpl;
import will.model.Nhanvien;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class NhanvienController {
    private NhanvienService nhanvienService = new NhanvienServiceImpl();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tatcaNhanvien", nhanvienService.findAll());
        return "index";
    }

}
