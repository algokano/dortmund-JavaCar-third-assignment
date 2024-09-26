package thirdAssignment;

public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class CombustionEngine extends Engine {
    public CombustionEngine() {
        super("Combustion Engine");
    }
}

class ElectricEngine extends Engine {
    public ElectricEngine() {
        super("Electric Engine");
    }
}

class HybridEngine extends Engine {
    public HybridEngine() {
        super("Hybrid Engine");
    }
}