package systemDesign.CreationalPatterns.AbstractFactory.Creator;

import systemDesign.CreationalPatterns.AbstractFactory.Product.font.Font;
import systemDesign.CreationalPatterns.AbstractFactory.Product.font.LightFont;
import systemDesign.CreationalPatterns.AbstractFactory.Product.theme.DarkTheme;
import systemDesign.CreationalPatterns.AbstractFactory.Product.theme.Theme;

public class DarkModeFactory implements AbstractFactory{
    @Override
    public Font createFont() {
        return new LightFont();
    }

    @Override
    public Theme createTheme() {
        return new DarkTheme();
    }
}
