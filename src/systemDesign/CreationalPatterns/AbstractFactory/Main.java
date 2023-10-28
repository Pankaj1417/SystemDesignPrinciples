package systemDesign.CreationalPatterns.AbstractFactory;

import systemDesign.CreationalPatterns.AbstractFactory.Creator.AbstractFactory;
import systemDesign.CreationalPatterns.AbstractFactory.Creator.DarkModeFactory;
import systemDesign.CreationalPatterns.AbstractFactory.Product.font.Font;
import systemDesign.CreationalPatterns.AbstractFactory.Product.theme.Theme;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new DarkModeFactory();
        Font lightFont = factory.createFont();
        Theme darkTheme = factory.createTheme();
        System.out.println(lightFont.getClass() + " "+darkTheme.getClass());
    }
}
