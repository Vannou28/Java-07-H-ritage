public abstract class Vehicule {
    // attributs  
    private String brand;  
    private int kilometers;  

    // constructeurs  
    public Vehicule(String brand, int kilometers) {  
        this.brand = brand;  
        this.kilometers = kilometers;  
    }  

    // accesseurs et mutateurs  
    public String getBrand() {  
        return this.brand;  
    }  

    public void setBrand(String brand) {  
        this.brand = brand;  
    }  

    public int getKilometers() {  
        return this.kilometers;  
    }  

    public void setKilometers(int age) {
        this.kilometers = kilometers;
    }

    // methods
    public abstract String doStuff();

}