package systemDesign.CreationalPatterns.AbstractFactory.Creator;

import systemDesign.CreationalPatterns.AbstractFactory.Product.font.Font;
import systemDesign.CreationalPatterns.AbstractFactory.Product.theme.Theme;

public interface AbstractFactory {
    Font createFont();
    Theme createTheme();
}
