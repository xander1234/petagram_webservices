package co.com.pets.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import co.com.pets.pojo.Mascota;
import co.com.pets.R;
import co.com.pets.pojo.MascotaRestApi;

/**
 * Created by xander on 28/01/2017.
 */

public class MascotaPortadaAdaptador extends RecyclerView.Adapter<MascotaPortadaAdaptador.MascotaViewHolder>{

    ArrayList<MascotaRestApi> mascotas;
    Activity activity;

    public MascotaPortadaAdaptador(ArrayList<MascotaRestApi> mascotas,Activity activity ){
        this.mascotas = mascotas;
        this.activity = activity;
    }


    //inflar el layout y lo pasara al viewholder para que obtenga los views
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview_detalle,parent,false);
        return new MascotaViewHolder(v);
    }

    //asocia cada elemento de la lista a cada View
    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, final int position) {

        final MascotaRestApi mascota = mascotas.get(position);
        Picasso.with(activity)
                .load(mascota.getUrlFoto())
                .placeholder(R.drawable.dog_bone_white)
                .into(mascotaViewHolder.imgfoto);

//        mascotaViewHolder.imgfoto.setImageResource(mascota.getFoto());
//        mascotaViewHolder.tvRanking.setText(String.valueOf(mascota.getLikes()));

        mascotaViewHolder.tvRanking.setText(String.valueOf(mascota.getLikes()));

        mascotaViewHolder.imgfoto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(activity, "Press in the image :)", Toast.LENGTH_SHORT).show();
            }
        });


   }

    @Override
    public int getItemCount() { //cantidada de elementos de mi lista
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgfoto;
        private TextView tvRanking;
        private ImageButton btnTotalLikePerfil;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgfoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            tvRanking   = (TextView) itemView.findViewById(R.id.tvRanking);
//            btnTotalLikePerfil   = (ImageButton) itemView.findViewById(R.id.tvRanking);
        }
    }

}