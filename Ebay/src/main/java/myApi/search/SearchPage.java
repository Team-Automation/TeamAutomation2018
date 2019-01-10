package myApi.search;

import base.CommonApi;
import myApi.EbayApi;

public class SearchPage extends CommonApi {
    public void SearchOption(){
        typeByCssThenEnter("#gh-ac", "motoralla phone");
        navigateBack();

        typeByCssThenEnter("#gh-ac", "books");
        navigateBack();
        typeByCssThenEnter("#gh-ac", "toys");
    }
}
