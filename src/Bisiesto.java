public class Bisiesto {
    private int año;

    public Bisiesto (int año){
        this.año= año;
    }
    public boolean verBisiesto(){
        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
