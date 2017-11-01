package com.zzb.retrofitrxdemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.zzb.retrofitrxdemo.R;
import com.zzb.retrofitrxdemo.action.HttpNetAction;
import com.zzb.retrofitrxdemo.bean.UserLoginBean;
import com.zzb.retrofitrxdemo.utils.RxBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Observable;
import rx.functions.Action1;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @BindView(R.id.tv_content)
    TextView tvContent;
    Observable<UserLoginBean.RetDataBean> obUserLogin ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        //创建被观察者
        obUserLogin = RxBus.getInstance().register( "userLogin" , UserLoginBean.RetDataBean.class ) ;
        //订阅观察事件
        obUserLogin.subscribe(new Action1<UserLoginBean.RetDataBean>() {
            @Override
            public void call(UserLoginBean.RetDataBean bean) {
                tvContent.setText(bean.getRealName());
            }
        });
        HttpNetAction.getInstance().postUserLogin("LoginServer", "student222", "123456", "userLogin");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //取消订阅
        RxBus.getInstance().unregister( "userLogin" , obUserLogin );
    }




}
