package co.com.pets.restApi;

/**
 * Created by xander on 27/02/2017.
 */

public final class ConstantesRestApi {

    //https://api.instagram.com/v1/
    public static final String VERSION = "/v1/";
    public static final String ROOT_URL = "https://api.instagram.com"+ VERSION;
    public static final String ACCESS_TOKEN = "4765269386.7f7c9e1.6ae212374a78417f92a54c2dedb2072c";
    public static final String KEY_ACCESS_TOKEN = "?access_token=";
//    public static final String KEY_GET_RECENT_MEDIA_USER = "users/self/media/recent/";
    public static final String KEY_GET_RECENT_MEDIA_USER = "users/4765269386/media/recent/";
    public static final String URL_GET_RECENT_MEDIA_USER = KEY_GET_RECENT_MEDIA_USER + KEY_ACCESS_TOKEN + ACCESS_TOKEN;

    public static final String KEY_GET_RECENT_MEDIA_USER_SECUNDARIO = "users/4768556731/media/recent/";
    public static final String URL_GET_RECENT_MEDIA_USER_SECUNDARIO = KEY_GET_RECENT_MEDIA_USER_SECUNDARIO + KEY_ACCESS_TOKEN + ACCESS_TOKEN;


    //ppal acount: favoritepets1    -> id: 4765269386
    //secundary acount: monkeypets1 -> id: 4768556731
    //Search user:
        // https://api.instagram.com/v1/users/search?q=favoritepets1&access_token=4765269386.7f7c9e1.6ae212374a78417f92a54c2dedb2072c


}
