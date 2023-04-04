public class Sedan extends Vehicle {

    private String name;
    private String make;

    private String model;

    private String color;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getMake(){
        return this.make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }


    public Sedan(){
        this.name = "Sedan";
    }

    public Sedan(String name){
        this.name = name;
    }



    public void start(){
        System.out.println("Starting the " + this.name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

