package mypackage;

public final class TabAlgosUtils {

    /**
     * Constructeur protected avec exception pour empecher l'instantiation de la
     * classe.
     *
     * @throws java.lang.Exception
     */
    private TabAlgosUtils() throws Exception {
        throw new Exception("cette classe ne peut pas être instanciée");
    }

    /**
     * @return valeur la plus grande d'un tableau.
     * @param tab
     */
    public static int plusGrand(final int[] tab) {
        int x = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > x) {
                x = tab[i];
            }
        }
        return x;
    }

    /**
     * @return moyenne des valeurs du tableau.
     * @throw IllegalArgumentException si tab et null ou vide.
     * @param tab
     */
    public static double moyenne(final int[] tab) {
        int total = 0;
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("le tableau doit "
                    + "contenir des valeurs");
        }

        for (int i : tab) {
            total += i;
        }
        return total / (double) tab.length;
    }

    /**
     * Compare le contenu de 2 tableaux en tenant compte de l'ordre.
     *
     * @return true si les 2 tableaux contiennent les mêmes éléments avec les
     * mêmes nombres d'occurences (avec les elements dans le meme ordre).
     * @param tab1
     * @param tab2
     */
    public static boolean egaux(final int[] tab1, final int[] tab2) {
        if (tab1.length != tab2.length) {
            return false;
        }

        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] != tab2[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Compare le contenu de 2 tableaux sans tenir compte de l'ordre.
     *
     * @return true si les 2 tableaux contiennent les mÃªmes Ã©lÃ©ments avec les
     * mêmes nombres d'occurrence (pas forcÃ©ment dans le meme ordre).
     * @param tab1
     * @param tab2
     */
    public static boolean similaires(final int[] tab1, final int[] tab2) {
        if (tab1.length != tab2.length) {
            return false;
        }

        int tabLength = tab1.length;
        boolean flag;
        for (int i = 0; i < tabLength; i++) {
            int x = tab1[i];
            flag = false;
            for (int j = 0; j < tabLength; j++) {
                if (x == tab2[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                return false;
            }
        }
        return true;
    }
}
