package com.monotonic.collections._2_what_are_collections.before;

import com.monotonic.collections.common.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionConcepts
{
    public static void main(String[] args)
    {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        /*Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext())
        {
            final Product product = iterator.next();
            if (product.getWeight() > 20)
            {
                iterator.remove();
            }
        }
        System.out.println(products);*/


        System.out.println(products.size());
        System.out.println(products.isEmpty());
        System.out.println(products.contains(floorPanel));
        products.remove(floorPanel);
        System.out.println(products.contains(floorPanel));


        List<Product> toRemove = new ArrayList<>();
        toRemove.add(door);
        toRemove.add(floorPanel);

        products.removeAll(toRemove);
        System.out.println(products);


    }
}
