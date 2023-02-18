package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

import java.util.Objects;


@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarServiceImp carServiceImp;
    public CarController( CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }
    @GetMapping()
    public String index(@RequestParam(value = "count", required = false) Integer count, Model model) {
        model.addAttribute("cars", carServiceImp.index(Objects.requireNonNullElse(count, 5)));
        return null;
    }
}
