package runtrack_java.job3;

public class job3 {
    public static void main(String[] args) {
        int[] T = new int[10];

        // Remplissage du tableau avec les valeurs de 0 à 9
        for (int i = 0; i < 10; i++) {
            T[i] = i;
        }

        // Affichage du contenu du tableau
        System.out.println("Contenu du tableau :");
        for (int i = 0; i < T.length; i++) {
            System.out.println("T[" + i + "] = " + T[i]);
        }

        // Test des valeurs demandées
        System.out.println("\nValeurs spécifiques :");
        System.out.println("T[0] = " + T[0]);
        System.out.println("T[1] = " + T[1]);
        System.out.println("T[5] = " + T[5]);
        System.out.println("T[9] = " + T[9]);
        System.out.println("T[10] = " + T[10]);
    }
}