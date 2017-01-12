class Item{
    String name;
    String cname;
    float price;

    public void Setname(String z){
        name = z;
    }
    public void Setcname(String da){
        cname = da;
    }
    public void Setprice(float f){
        price = f;
    }
    public String Getname(){
        return name;
    }
    public String Getcname(){
        return cname;
    }
    public float Getprice(){
        return price;
    }
    public Item(String z, String da, float f){
        name = z;
        cname = da;
        price = f;
    }
}