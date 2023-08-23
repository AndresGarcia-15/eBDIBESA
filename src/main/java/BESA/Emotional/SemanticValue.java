package BESA.Emotional;

import BESA.Emotional.Utils.Utils;

public class SemanticValue {
    private final String name;
    private final float value;
    
    public SemanticValue(String name, float value) {
        this.name = name;
        this.value = Utils.checkNegativeOneToOneLimits(value);
    }

    public String getName() {
        return name;
    }

    public float getValue() {
        return value;
    }
    
    @Override
    public String toString() {
        return name + ": " + value;
    }
}
