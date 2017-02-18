package netodevel.com.br.test_safety;

import android.app.Application;

import com.rogalabs.lib.LoginApplication;

/**
 * @author NetoDevel
 */
public class SocialLoginApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LoginApplication.startSocialLogin(this);
    }
}
