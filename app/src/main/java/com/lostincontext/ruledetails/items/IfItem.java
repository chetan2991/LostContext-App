package com.lostincontext.ruledetails.items;


import com.lostincontext.R;
import com.lostincontext.ruledetails.RuleDetailsItem;

public class IfItem implements RuleDetailsItem {


    @Override public int getItemViewType() {
        return R.id.view_type_if;
    }
}
