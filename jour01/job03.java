class job03 {
    public static void main(String[]args) {
        int[] chiffres = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("T[0] vaut : " + chiffres[0]);
        System.out.println("T[1] vaut : " + chiffres[1]);
        System.out.println("T[5] vaut : " + chiffres[5]);
        System.out.println("T[9] vaut : " + chiffres[9]);
        System.out.println("T[10] N'existe pas. Certes, il y a 10 chiffres, mais la liste commence à 0, attention ! ");
        System.out.println("T[10] vaut : " + chiffres[10]);
    }
}