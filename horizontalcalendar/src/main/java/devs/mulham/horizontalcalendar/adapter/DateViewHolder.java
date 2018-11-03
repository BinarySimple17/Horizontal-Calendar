package devs.mulham.horizontalcalendar.adapter;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
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
    GradientDrawable circle;
//    RecyclerView eventsRecyclerView;

    DateViewHolder(View rootView) {
        super(rootView);
        textTop = rootView.findViewById(R.id.hc_text_top);
        textMiddle = rootView.findViewById(R.id.hc_text_number);
        textBottom = rootView.findViewById(R.id.hc_text_day);
//        layoutContent = rootView.findViewById(R.id.hc_layoutContent);
//        selectionView = rootView.findViewById(R.id.hc_selector);
        circle = (GradientDrawable) textMiddle.getBackground();
//        eventsRecyclerView = rootView.findViewById(R.id.hc_events_recyclerView);
    }

    public void setDayColor(int color){
        circle.setColor(color);
    }
}
