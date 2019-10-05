package com.example.ieeegbpec.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import com.example.ieeegbpec.R;

import java.util.zip.Inflater;

public class CustomSwipe extends PagerAdapter {

    private int[] image_resources = {R.drawable.technology, R.drawable.background,
            R.drawable.teambackground2, R.drawable.teambackground};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public CustomSwipe(Context ctx){
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.custom_swipe, container, false);
        ImageView imageView = item_view.findViewById(R.id.swipe_image);
        imageView.setImageResource(image_resources[position]);
        container.addView(imageView);

        return item_view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}
