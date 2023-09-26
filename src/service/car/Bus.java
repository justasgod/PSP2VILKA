package service.car;

public class Bus extends Car{
    private int seating;
    private int standing;
    public Bus(String model, String color, int maxSpeed, int seat, int stand) {
        super(model, color, maxSpeed);
        this.seating = seat;
        this.standing = stand;
    }

    @Override
    public String toDo() {
        return "Перевозка большого количества пассажиров";
    }
}
