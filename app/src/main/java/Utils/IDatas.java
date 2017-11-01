package Utils;

import okhttp3.Request;

/**
 * Created by 白玉春 on 2017/11/1.
 */

public interface IDatas<T> {
    void Success(T s);
    void Error(Request request,Exception e);
}
