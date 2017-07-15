package com.jobsnaps.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.R.* ;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yydcdut.sdlv.Menu;
import com.yydcdut.sdlv.MenuItem ;
import com.yydcdut.sdlv.SlideAndDragListView;

public class MainActivity extends AppCompatActivity {
   private SlideAndDragListView slideAndDragListView ;
   private HomeAdapter adaper  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         slideAndDragListView = (SlideAndDragListView) findViewById(R.id.listView);
        adaper = new HomeAdapter(this,null) ;

        Menu menu = new Menu(true, 0);//the first parameter is whether can slide over
        menu.addItem(new MenuItem.Builder().setWidth(150)//set Width
                .setBackground(new ColorDrawable(Color.RED))// set background
                .setText("One")//set text string
                .setTextColor(Color.GRAY)//set text color
                .setTextSize(20)//set text size
          //     .setIcon(getResources().getDrawable(R.drawable.ic_launcher_background))// set icon
                .build());
        menu.addItem(new MenuItem.Builder().setWidth(130)//set Width
                .setBackground(new ColorDrawable(Color.GREEN))// set background
                .setText("two")//set text string
                .setTextColor(Color.GRAY)//set text color
                .setTextSize(20)//set text size
                //     .setIcon(getResources().getDrawable(R.drawable.ic_launcher_background))// set icon
                .build());

        menu.addItem(new MenuItem.Builder().setWidth(120)
                .setBackground(new ColorDrawable(Color.BLACK))
                .setDirection(MenuItem.DIRECTION_RIGHT)//set direction (default DIRECTION_LEFT)
         //      .setIcon(getResources().getDrawable(R.drawable.ic_launcher_background))// set icon
                .build());
//set in sdlv
        slideAndDragListView.setMenu(menu);
        slideAndDragListView.setAdapter(adaper);
        Intent it = new Intent(MainActivity.this,MainInterFaceActivity.class) ;
        startActivity(it);

    }



    class HomeAdapter extends BaseAdapter{

         Context context = null ;
         String [] args = {"aaa","bbb","ccc"} ;

        public HomeAdapter(Context context , String[] args)
        {
                this.context = context ;
        }

         @Override
         public int getCount() {
             return args.length;
         }

         @Override
         public Object getItem(int i) {
             return args[i];
         }

         @Override
         public long getItemId(int i) {
             return i;
         }

         @Override
         public View getView(int i, View view, ViewGroup viewGroup) {
/*             LayoutInflater inflater = LayoutInflater.from(context);
             inflater.inflate(R.layout.)*/
             TextView tv = new TextView(context) ;
             tv.setText(args[i]);
             tv.setTextSize(50) ;
             return (View)tv;
         }
     }
}
