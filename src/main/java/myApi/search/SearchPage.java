package myApi.search;

import myApi.EbayApi;

public class SearchPage extends EbayApi {
    public void SearchOption(){
        typeOnElementEntry("gh-tb", "motoralla phone");
        //nagivateto();
        clearField("gh-tb");
        typeOnElementEntry("gh-tb", "books");
        //nagivateto();
        clearField("gh-tb");
        typeOnElementEntry("gh-tb", "toys");
    }
}
