package com.jad;

import com.jad.composite.CompositeProduct;
import com.jad.composite.ICompositeProduct;
import com.jad.composite.LeafProduct;
import com.jad.productadapter.CapsulaAdapter;
import com.jad.productadapter.DentifriciumAdapter;
import com.jad.productadapter.SaponemAdapter;

public class Main {

    public static void main(String[] args) {
        ICompositeProduct cart = new CompositeProduct("Panier");
        ICompositeProduct jewelryBox = new CompositeProduct("Coffret");
        cart.addProduct(new LeafProduct("Brosse à dent"));
        cart.addProduct(new LeafProduct("Dentifrice"));
        cart.addProduct(jewelryBox);
        jewelryBox.addProduct(new LeafProduct("Bague"));
        jewelryBox.addProduct(new LeafProduct("Collier"));
        cart.addProduct(new DentifriciumAdapter());
        ICompositeProduct capsula = new CapsulaAdapter();
        LeafProduct earrings = new LeafProduct("Boucles d'oreille");
        capsula.addProduct(earrings);
        capsula.addProduct(new LeafProduct("Anneau"));
        capsula.addProduct(new SaponemAdapter());
        cart.addProduct(capsula);
        System.out.println(cart);
        capsula.removeProduct(earrings);
        System.out.println(cart);
    }
}
