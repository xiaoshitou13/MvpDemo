package test.bwie.com.mvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import Utils.IDatas;
import Utils.Okhttps;
import bean.Mydatas;
import okhttp3.Request;
import presenter.PviewModel;
import view.Iview;

public class MainActivity extends AppCompatActivity implements Iview{

    String url = "http://news-at.zhihu.com/api/4/news/latest";
    /**
     * Hello World!
     */
    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mTv = (TextView) findViewById(R.id.tv);

        PviewModel pviewModel = new PviewModel(this,this);
        pviewModel.GetDatas(Mydatas.class);

    }

    @Override
    public String s() {
        return url;
    }

    @Override
    public void Get(Object ss) {
        Mydatas mydatas = (Mydatas) ss;
         mTv.setText(mydatas.getDate());
    }
}
