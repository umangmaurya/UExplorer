package softwaretech.umang.uexplorer;

/**
 * Created by UMANG on 18-02-2018.
 */

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ourViewClient extends WebViewClient {


    // Deprecated means that "Hey we have something else to offer, you might wanna give it a shot
    // Because our minimim api is 15 and the new method is only valid in android N

    @SuppressWarnings("deprecation")
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }


}
