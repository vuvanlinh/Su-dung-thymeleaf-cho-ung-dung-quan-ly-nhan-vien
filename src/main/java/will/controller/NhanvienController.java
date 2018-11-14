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

import java.util.regex.Matcher;

@Controller
public class NhanvienController {
    private NhanvienService nhanvienService = new NhanvienServiceImpl();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tatcaNhanvien", nhanvienService.findAll());
        return "index";
    }

    @GetMapping("/nhanvien/taonhanvienmoi")
    public String create(Model model) {
        model.addAttribute("nhanvien", new Nhanvien());
        return "create";
    }

    @PostMapping("/nhanvien/luu")
    public String luu(Nhanvien nhanvien, RedirectAttributes redirectAttributes) {
        nhanvien.setId((int) (Math.random() * 10000));
        nhanvienService.save(nhanvien);
        redirectAttributes.addFlashAttribute("thanhcong", "Luu nhan vien moi thanh cong");
        return "redirect:/";
    }

    @GetMapping("/nhanvien/{id}/Chinhsua")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("nhanvien", nhanvienService.findById(id));
        return "edit";
    }

    @PostMapping("/nhanvien/capnhat")
    public String capnhat(Nhanvien nhanvien, RedirectAttributes redirectAttributes) {
        nhanvienService.update(nhanvien.getId(), nhanvien);
        redirectAttributes.addFlashAttribute("thanh cong", "Chinh sua thanh cong");
        return "redirect:/";
    }

    @GetMapping("/nhanvien/{id}/Xoa")
    public String xoa(@PathVariable int id, Model model) {
        model.addAttribute("nhanvien", nhanvienService.findById(id));
        return "delete";
    }

    @PostMapping("/nhanvien/Xoa")
    public String xoa(Nhanvien nhanvien) {
        nhanvienService.remove(nhanvien.getId());
        return "redirect:/";
    }

    @GetMapping("/nhanvien/{id}/Xem")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("nhanvien", nhanvienService.findById(id));
        return "view";
    }
}
