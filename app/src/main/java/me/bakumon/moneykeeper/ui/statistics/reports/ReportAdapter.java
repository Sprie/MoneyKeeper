package me.bakumon.moneykeeper.ui.statistics.reports;

import android.databinding.ViewDataBinding;
import android.support.annotation.Nullable;

import java.util.List;

import me.bakumon.moneykeeper.BR;
import me.bakumon.moneykeeper.R;
import me.bakumon.moneykeeper.base.BaseDataBindingAdapter;
import me.bakumon.moneykeeper.database.entity.TypeSumMoneyBean;

/**
 * ReportAdapter
 *
 * @author bakumon https://bakumon.me
 * @date 2018/5/25
 */

public class ReportAdapter extends BaseDataBindingAdapter<TypeSumMoneyBean> {

    public ReportAdapter(@Nullable List<TypeSumMoneyBean> data) {
        super(R.layout.item_report, data);
    }

    @Override
    protected void convert(DataBindingViewHolder helper, TypeSumMoneyBean item) {
        ViewDataBinding binding = helper.getBinding();
        binding.setVariable(BR.typeSumMoney, item);
        binding.executePendingBindings();
    }
}
