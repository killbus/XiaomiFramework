package com.miui.powercenter.batteryhistory;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.miui.powercenter.utils.t;
import com.miui.securitycenter.R;
import com.miui.superpower.b.k;

class la implements ViewSwitcher.ViewFactory {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ oa f6905a;

    la(oa oaVar) {
        this.f6905a = oaVar;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.content.Context, com.miui.powercenter.batteryhistory.BatteryHistoryDetailActivity] */
    /* JADX WARNING: type inference failed for: r1v17, types: [android.content.Context, com.miui.powercenter.batteryhistory.BatteryHistoryDetailActivity] */
    public View makeView() {
        TextView textView = new TextView(this.f6905a.o);
        textView.setSingleLine();
        textView.setGravity(8388691);
        textView.setTextColor(this.f6905a.o.getResources().getColor(R.color.pc_battery_statics_tile_value_color));
        textView.setTextSize(0, (float) this.f6905a.o.getResources().getDimensionPixelSize(R.dimen.view_dimen_100));
        textView.setTypeface(k.a() > 8 ? t.a() : t.a(this.f6905a.o), 1);
        textView.setTextAlignment(5);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return textView;
    }
}