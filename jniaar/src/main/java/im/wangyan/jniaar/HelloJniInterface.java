package im.wangyan.jniaar;

/**
 * <p>文件描述：<p>
 * <p>作者：wangyan<p>
 * <p>创建时间：2019-06-04<p>
 * <p>更改时间：2019-06-04<p>
 * <p>版本号：1<p>
 */
public class HelloJniInterface {

    /*
    static {
        try {
            System.loadLibrary("wangyan-lib");
        } catch (UnsatisfiedLinkError var1) {
            System.out.print(var1.toString());
        }

    }
    */
    public HelloJniInterface() {
        System.loadLibrary("wangyan-lib");
    }

    public native String getContentFromJNI();
}
