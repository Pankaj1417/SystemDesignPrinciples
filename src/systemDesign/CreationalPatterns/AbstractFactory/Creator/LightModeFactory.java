package systemDesign.CreationalPatterns.AbstractFactory.Creator;

import systemDesign.CreationalPatterns.AbstractFactory.Product.font.DarkFont;
import systemDesign.CreationalPatterns.AbstractFactory.Product.font.Font;
import systemDesign.CreationalPatterns.AbstractFactory.Product.theme.LightTheme;
import systemDesign.CreationalPatterns.AbstractFactory.Product.theme.Theme;

public class LightModeFactory implements AbstractFactory{
    @Override
    public Font createFont() {
        return new DarkFont();
    }

    @Override
    public Theme createTheme() {
        return new LightTheme();
    }
}
