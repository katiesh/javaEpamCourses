package epam.java.services.comporator;

import epam.java.model.entity.Cookies;

import java.util.Comparator;

public class CookiesCategorieComparator implements Comparator<Cookies> {
    @Override
    public int compare(Cookies cookies1, Cookies cookies2){
        return cookies1.getCategorie().compareTo(cookies2.getCategorie());
    }
}
