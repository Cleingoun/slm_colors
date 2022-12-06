package at.fhtw.kaipel.slm_colors.service;

import org.springframework.stereotype.Service;

@Service
public class ColorsService {
    public String getComplementary(String color) {
        color = color.toLowerCase();

        switch (color) {
            case "red" -> {
                return "green";
            }
            case "green" -> {
                return "red";
            }
            case "orange" -> {
                return "blue";
            }
            case "blue" -> {
                return "orange";
            }
            case "yellow" -> {
                return "purple";
            }
            case "purple" -> {
                return "yellow";
            }
            default -> {
                return null;
            }
        }
    }
}
