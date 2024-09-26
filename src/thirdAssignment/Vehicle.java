package thirdAssignment;

abstract class Vehicle {
    protected Manufacture manufacture;
    protected Engine engine;

    public Vehicle(Manufacture manufacture, Engine engine) {
        this.manufacture = manufacture;
        this.engine = engine;
    }

    public abstract void ShowCharacteristics();
}

class ICEV extends Vehicle {
    public ICEV(Manufacture manufacture, CombustionEngine engine) {
        super(manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: ICEV, Engine: " + engine.getType() + ", Manufacture: " + manufacture.toString());
    }
}

class BEV extends Vehicle {
    public BEV(Manufacture manufacture, ElectricEngine engine) {
        super(manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: BEV, Engine: " + engine.getType() + ", Manufacture: " + manufacture.toString());
    }
}

class HybridV extends Vehicle {
    public HybridV(Manufacture manufacture, HybridEngine engine) {
        super(manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: HybridV, Engine: " + engine.getType() + ", Manufacture: " + manufacture.toString());
    }
}
