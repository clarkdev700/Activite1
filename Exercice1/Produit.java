package mypackage;

import java.util.Objects;
/**
 * Classe Produit représentant un produit avec un prix et une référence .
 */
public class Produit {
    /** Défini la référence du produit . */
    private final String reference;
    /** Défini le prix du produit . */
    private double prix;

    /**
     * Crée un produit avec la référence fourni.
     * @param lreference
     */
    public Produit(final String lreference) {
        this.reference = lreference;
    }

    /**
     * Retourne le prix d'un produit.
     * @return le prix
     */
    public double getPrix() {
        return this.prix;
    }

    /**
     * modifie le prix.
     * @param lprix
     */
    public final void setPrix(final Double lprix) {
        this.prix = lprix;
    }

    /**
     * @return la reference si le prix est positif, null sinon
     */
    public final String getReference() {
        if (prix > 0) {
            return reference;
        }
        return null;
    }

    /**
     * Compare deux instance de produit.
     * @param o type Object
     * @return vrai si l'objet à la même réference et faux si non
     */
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Produit)) {
            return false;
        }
        return reference == ((Produit) o).reference;
    }

    /**
     * Redefinir la methode hashCode.
     * @return le hascode de la reference
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(reference);
    }
}
