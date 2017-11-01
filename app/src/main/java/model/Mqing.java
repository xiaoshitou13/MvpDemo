package model;

import android.text.TextUtils;

import Utils.IDatas;
import Utils.Okhttps;
import okhttp3.Request;

/**
 * Created by 白玉春 on 2017/11/1.
 */

public class Mqing implements Imodel {


    @Override
    public void Qinqiu(String url, Class c, final IDatas iDatas) {
        if(!TextUtils.isEmpty(url)){
             Okhttps.getOkhttps().GetDatas(url, c, new IDatas() {
                 @Override
                 public void Success(Object s) {
                     iDatas.Success(s);
                 }

                 @Override
                 public void Error(Request request, Exception e) {
                    iDatas.Error(request,e);
                 }
             });
        }
    }
}
