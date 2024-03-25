package first;

import java.util.Locale;

public class Builder {
    public Window createWoodWindow() {
        return new WoodWindow();
    }

    public Window createPlasticWindow() {
        return new PlasticWindow();
    }

    public House createHouse() {
        if (Locale.getDefault().getCountry().equals("SU")) {
            return new House(createWoodWindow());
        } else return new House(createPlasticWindow());
    }
}
