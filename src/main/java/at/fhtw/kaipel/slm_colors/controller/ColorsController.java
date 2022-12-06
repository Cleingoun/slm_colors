package at.fhtw.kaipel.slm_colors.controller;

import at.fhtw.kaipel.slm_colors.service.ColorsService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorsController {

    private final ColorsService colorsService;

    public ColorsController(ColorsService colorsService) {
        this.colorsService = colorsService;
    }


}
