package devs.mulham.horizontalcalendar.adapter;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import devs.mulham.horizontalcalendar.R;

/**
 * @author Mulham-Raee
 * @since v1.0.0
 */
class DateViewHolder extends RecyclerView.ViewHolder {

    TextView textTop;
    TextView textMiddle;
    TextView textBottom;
    //    View selectionView;
//    View layoutContent;
    View layout;
    GradientDrawable circle;
    GradientDrawable bar;
    int selectedColor;
    int textColor;
//    RecyclerView eventsRecyclerView;

    DateViewHolder(View rootView) {
        super(rootView);
        textTop = rootView.findViewById(R.id.hc_text_top);
        textMiddle = rootView.findViewById(R.id.hc_text_number);
        textBottom = rootView.findViewById(R.id.hc_text_day);
//        layoutContent = rootView.findViewById(R.id.hc_layoutContent);
//        selectionView = rootView.findViewById(R.id.hc_selector);
        circle = (GradientDrawable) textMiddle.getBackground();
        bar = (GradientDrawable) rootView.findViewById(R.id.bar).getBackground();
        layout = rootView.findViewById(R.id.layout);
        textColor = textMiddle.getCurrentTextColor();
//        eventsRecyclerView = rootView.findViewById(R.id.hc_events_recyclerView);
    }

    public void setDayColor(int color) {
        circle.setColor(color);
    }

    public void setBarColor(int color) {
        selectedColor = color;
        bar.setColor(selectedColor);
    }

    public void clickDate(boolean select) {
        if (select) {
            circle.setColor(selectedColor);
            bar.setColor(Color.TRANSPARENT);
            textMiddle.getPaint().setColor(Color.WHITE);
            textMiddle.invalidate();
        } else {
            circle.setColor(Color.TRANSPARENT);
            bar.setColor(selectedColor);
            textMiddle.getPaint().setColor(textColor);
            textMiddle.invalidate();
        }
    }
}
