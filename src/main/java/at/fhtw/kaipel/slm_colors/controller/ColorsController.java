package at.fhtw.kaipel.slm_colors.controller;

import at.fhtw.kaipel.slm_colors.service.ColorsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/complementary")
public class ColorsController {

    private final ColorsService colorsService;

    public ColorsController(ColorsService colorsService) {
        this.colorsService = colorsService;
    }


    @GetMapping
    public String getComplementary(
            @RequestParam(defaultValue = "red", required = false) String color) {
        return colorsService.getComplementary(color);
    }
}
