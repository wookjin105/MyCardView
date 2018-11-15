package com.wookjin105.mycardview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<CardViewItem01> cardViewItem01s = new ArrayList<>();

    public MyRecyclerViewAdapter(){
        cardViewItem01s.add(new CardViewItem01(R.drawable.img1, "첫번째 이미지", "베트남 여행"));
        cardViewItem01s.add(new CardViewItem01(R.drawable.img2, "두번째 이미지", "하롱베이"));
        cardViewItem01s.add(new CardViewItem01(R.drawable.img3, "세번째 이미지", "하노이 시내"));
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        //XML 파트를 세팅

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_item, viewGroup, false);
        return new RowCell(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewholder, int position) { //position은 인덱스 번호

        //아이템 세팅 + 배열로 접근
        ((RowCell)viewholder).imageView.setImageResource(cardViewItem01s.get(position).Imageview);
        ((RowCell)viewholder).title.setText(cardViewItem01s.get(position).title);
        ((RowCell)viewholder).subtitle.setText(cardViewItem01s.get(position).subtitle);

    }

    @Override
    public int getItemCount() {

        //이미지 카운터(개수를 파악해서 돌려준다.)
        return cardViewItem01s.size();


    }

    /* 배열 데이터를 각각의 공간에 넣어주기 위한 환경설정 */
    private class RowCell extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView title;
        public TextView subtitle;

        public RowCell(View view) {

            super(view);
            imageView = (ImageView) view.findViewById(R.id.cardView_ImageView);
            title = (TextView) view.findViewById(R.id.cardView_title);
            subtitle = (TextView) view.findViewById(R.id.cardView_subTitle);

        }


    }























}
