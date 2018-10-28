package epam.java.services.comporator;

import epam.java.model.entity.Cookies;

import java.util.Comparator;

public class CookiesQuantityComparator implements Comparator<Cookies> {
    @Override
    public int compare(Cookies cookies1, Cookies cokies2){
        return cookies1.getQuintity()-cokies2.getQuintity();
    }
}
