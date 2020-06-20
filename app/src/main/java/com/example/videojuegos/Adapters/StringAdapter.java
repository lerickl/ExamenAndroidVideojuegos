package com.example.videojuegos.Adapters;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.videojuegos.Anime;
import com.example.videojuegos.R;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.List;


public class StringAdapter extends RecyclerView.Adapter<StringAdapter.StringViewHolder> {

    private List<Anime> mData;

    public StringAdapter(List<Anime> getAnime) {
        mData=getAnime;

    }

    public class StringViewHolder extends RecyclerView.ViewHolder {
        private View mview;
        public StringViewHolder(@NonNull View itemView) {
            super(itemView);
            mview=itemView;
        }
    }

    @NonNull
    @Override
    public StringViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //permite manipular el xml
        LayoutInflater mLayoutInflater=LayoutInflater.from(parent.getContext());
        View view= mLayoutInflater.inflate(R.layout.item_string, parent , false);
        return new StringViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull StringViewHolder holder, int position) {
        //lleno los datos

        TextView mTextViewNombre = holder.mview.findViewById(R.id.tvNombre);
        ImageView mTextViewImagen = holder.mview.findViewById(R.id.tvimageView);
        TextView mTextViewDescripcion = holder.mview.findViewById(R.id.tvDescription);
        Anime text=mData.get(position);

        mTextViewNombre.setText(text.nombre);
        //mTextViewImagen.setImageURI(Uri.parse(text.avatar));
        mTextViewDescripcion.setText(text.Descripcion);

        Picasso.get().load(Uri.parse(text.avatar)).into(mTextViewImagen);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


}
