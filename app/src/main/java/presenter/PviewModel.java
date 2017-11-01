package presenter;

import android.content.Context;

import Utils.IDatas;
import model.Mqing;
import okhttp3.Request;
import view.Iview;

/**
 * Created by 白玉春 on 2017/11/1.
 */

public class PviewModel {

    Context context;
    Iview iview;
    Mqing mqing;

    public PviewModel(Context context, Iview iview) {
        this.context = context;
        this.iview = iview;
        this.mqing = new Mqing();
    }

    public void GetDatas(Class c){
        mqing.Qinqiu(iview.s(), c, new IDatas() {
            @Override
            public void Success(Object s) {
                iview.Get(s);
            }

            @Override
            public void Error(Request request, Exception e) {
                 iview.Get(e);
            }
        });
    }
}
