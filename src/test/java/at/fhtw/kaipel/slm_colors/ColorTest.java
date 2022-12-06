package at.fhtw.kaipel.slm_colors;

import at.fhtw.kaipel.slm_colors.controller.ColorsController;
import at.fhtw.kaipel.slm_colors.service.ColorsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ColorTest {

    @Autowired
    ColorsController colorsController;

    @Autowired
    ColorsService colorsService;

    @Test
    void testColorRedWithController() {
        Assertions.assertEquals("green", colorsController.getComplementary("red"));
    }

    @Test
    void testColorOrangeWithService() {
        Assertions.assertEquals("blue", colorsService.getComplementary("orange"));
    }
}