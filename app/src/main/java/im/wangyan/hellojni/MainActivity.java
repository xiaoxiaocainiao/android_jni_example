package im.wangyan.hellojni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import im.wangyan.jniaar.HelloJniInterface;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
        System.loadLibrary("xiaoxiao-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);
        tv.setMovementMethod(ScrollingMovementMethod.getInstance());

        tv.append("开始吧");
        tv.append("\n");
        tv.append("开始吧");
        tv.append("\n");
        tv.append("开始吧");
        tv.append("\n");
        tv.append("开始吧");
        tv.append("\n");
        tv.append("开始吧");
        tv.append("\n");
        tv.append("开始吧");
        tv.append("\n");

        tv.append(stringFromJNI());
        tv.append("\n");
        tv.append(getContentFromJNI());
        tv.append("\n");
        tv.append("动动我试试.23333");
        tv.append("\n");


        HelloJniInterface hjInterface = new HelloJniInterface();
        tv.append(hjInterface.getContentFromJNI());
        tv.append("\n");
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
    public native String getContentFromJNI();
}
