package polinema.ac.id.dtschapter03_starter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class IntroViewPagerAdapter extends PagerAdapter {
    Context mContext ;
    List<WelcomeSlide>  WelSlide;

    public IntroViewPagerAdapter(Context mContext, List<WelcomeSlide>  WelSlide) {
        this.mContext = mContext;
        this. WelSlide = WelSlide;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutScreen = inflater.inflate(R.layout.activity_welcome_slide,null);

        ImageView imgSlide = layoutScreen.findViewById(R.id.intro_img);
        TextView title = layoutScreen.findViewById(R.id.intro_title);
        TextView description = layoutScreen.findViewById(R.id.intro_description);

        title.setText( WelSlide.get(position).getTitle());
        description.setText( WelSlide.get(position).getDescription());
        imgSlide.setImageResource( WelSlide.get(position).getScreenImg());

        container.addView(layoutScreen);

        return layoutScreen;


    }

    @Override
    public int getCount() {
        return  WelSlide.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View)object);

    }

}
