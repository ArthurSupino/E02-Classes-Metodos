public class Cliente {

    public static void main(String[] args) {
        Cliente objA = new Cliente();
        Cliente objB = objA;
        

        if(objA == objB) {
            System.out.println("Iguais");
            } else {
            System.out.println("Diferentes");
            }
    }
    
}