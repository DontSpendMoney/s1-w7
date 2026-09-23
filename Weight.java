public class Weight {
    private int pounds;
    private int ounces;

    public Weight(int ounces){
        if (ounces>= 0){
            if (ounces < 16){
                this.ounces = ounces;
            }
        }
    }

    public Weight(int pounds){
        if (ounces >= 0){
            if (ounces < 16){
                this.ounces = ounces
            }
        }
    }
    if(pounds > 0);
        this.pounds = pounds;

    public int totalOunces{
        return this.ounces + 16 * this.pounds;
    }
    

    public boolean isHeavier(Weight other){
        int totalW = totalOunces();
        int otherW = other.totalOunces();
        return totalW < otherW;
    }
    public Weight multiple(int scale){
        int n = this.totalOunces() * scale;
        int newW = n%16;
        int new1W = n - (new1*16);
        return (newW,new1W)
    }
    public void print(){
        System.out.println(this.pounds + " pounds" + this.ounces + "ounces")
    }


}
