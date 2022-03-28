package com.example.membuatlist;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import  android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    //deklarasi variabel dengan jenis data context
    Context mContext;

    //deklarasi variabel dengan jenis data layout inflater
    LayoutInflater inflater;

    //deklarasi variabel dengan jenis data arraylist
    private ArrayList<ClassNama> arrayList;

    //membuat konstruktur Listviewadapter
    public ListViewAdapter(Context context) {
        //memberi nilai mContext dengan context
        mContext = context;

        //megatur layoutInflater dari context yang diberikan
        inflater = LayoutInflater.from(mContext);

        //memberikan nilai arraylist dari class ClassNama
        this.arrayList = new ArrayList<ClassNama>();

        //menambahkan semua elemen ke arraylist
        this.arrayList.addAll(HomeActivity.classNamaArrayList);
    }
    //membuat class untuk mendeklarasikan tempat untuk meletakkan isi ke dalam Listview
    public class ViewHolder{
        //mendeklarasikan variabel dengan jenis TextView
        TextView name;
    }

    //fungsi getCount() mengembalikan jumlah item yang akan ditampilkan dalam list
    @Override
    public int getCount(){
        //mengembalikan nilai berupa objek dari array data
        return HomeActivity.classNamaArrayList.size();
    }

    //fungsi ini digunakan untuk mendapatkan
    @Override
    public Object getItem(int i){
        return HomeActivity.classNamaArrayList.get(i);
    }

    @Override
    public long getItemId(int i){
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        final ViewHolder holder;
        if(view == null){
            holder=new ViewHolder();
            view=inflater.inflate(R.layout.item_listview,null);
            holder.name = (TextView) view.findViewById(R.id.tvnama_item);
            view.setTag(holder);
        }else{
            holder=(ViewHolder) view.getTag();
        }
        holder.name.setText(HomeActivity.classNamaArrayList.get(i).getName());
        return view;
    }
}
