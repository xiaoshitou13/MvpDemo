package Utils;

import android.os.Handler;
import android.os.Message;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by 白玉春 on 2017/11/1.
 */

public class Okhttps  {

    private static Okhttps okhttps;
    private static OkHttpClient client;
    private final Gson gson;
    private Handler handler = new Handler();
    public static Okhttps getOkhttps(){
        if(okhttps == null){
            synchronized (Okhttps.class){
                if(okhttps == null){
                    okhttps  = new Okhttps();
                }
            }
        }
        return okhttps;
    }

    public Okhttps() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(10, TimeUnit.SECONDS);
        client = builder.build();
        gson = new Gson();
    }

    public <T> void GetDatas(String url, final Class<T> tClass, final IDatas iDatas){
        final Request request = new Request.Builder().url(url).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                iDatas.Error(request,e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
               if(response.isSuccessful()){
                   T aClass =  gson.fromJson(response.body().string(),tClass);
                   final Message message = Message.obtain();
                   message.obj = aClass;
                   message.what=0;

                   handler.post(new Runnable() {
                       @Override
                       public void run() {
                           iDatas.Success(message.obj);
                       }
                   });
               }else{
                   iDatas.Success("请求失败");
               }
            }
        });
    }
}
