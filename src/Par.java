public class Par {
    private int nume;

    public Par (int nume) {
        this.nume=nume;
    }

    public void parImpar(){
        if (nume % 2 ==0) {
            System.out.println("EL numero es PAR");
        }else{
            System.out.println("El Numero es Impar");
        }
    }
}
