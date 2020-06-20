package com.example.videojuegos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.videojuegos.Adapters.StringAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LinearLayoutManager mLayoutManager;
    private static RecyclerView mRecyclerView;
    private StringAdapter mStringAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView=  findViewById(R.id.ListaString);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager= new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mStringAdapter = new StringAdapter(GetAnimes());//liststring
        mRecyclerView.setAdapter(mStringAdapter);


    }

    public List<Anime> GetAnimes(){
        List<Anime> lista= new ArrayList<Anime>();
        lista.add(new Anime("https://i.nes/2020/02/13/noticias/1581576624_508899_1581576871_noticia_normal.jpg","Pokemon","una franquicia de medios que originalmente comenzó como un videojuego RPG,"));
        lista.add(new Anime("https://vignette.wikia.nocookie.net/series/images/9/9e/Padrinos-magicos.jpg/revision/latest/scale-to-width-down/340?cb=20121211024502&path-prefix=es","Los Padrinos Magicos","Los padrinos mágicos de Timmy le conceden deseos."));
        lista.add(new Anime("https://i.blogs.es/73affd/phineas-ferb/1366_2000.jpg","Pineas y Ferb","dos hermanastros que quieren disfrutar de las vacaciones de verano haciendo cosas creativas cada día."));
        lista.add(new Anime("https://www.tonica.la/__export/1585071045558/sites/debate/img/2020/03/24/nanatsu_no_taizai_pelicula.jpg_423682103.jpg","Nanatzu No Taizai","es un serie de manga y anime escrita e ilustrada por Nakaba Suzuki"));
        lista.add(new Anime("https://www.tonica.la/__export/1587424009240/sites/debate/img/2020/04/20/one_piece.jpg_423682103.jpg","One Piece","Shonen es un manga escrito e ilustrado por Eiichirō Oda."));
        lista.add(new Anime("https://vignette.wikia.nocookie.net/oficialnaruto/images/7/7b/Naruto-imagen.jpg/revision/latest/scale-to-width-down/340?cb=20090820181553&path-prefix=es","Naruto","es una serie de manga escrita e ilustrada por Masashi Kishimoto"));
        lista.add(new Anime("https://files.lafm.com.co/assets/public/2019-04/supercampeones_0.jpg","Los Supercampeones","es una serie de manga escrita e ilustrada por Yōichi Takahashi"));
        lista.add(new Anime("https://www.tonica.la/__export/1584554959112/sites/debate/img/2020/03/18/bleach_portada.jpg_554688468.jpg","Bleach","Ichigo dedica su vida a proteger inocentes y ayuda a los espíritus a encontrar la paz."));
        lista.add(new Anime("https://as.com/meristation/imagenes/2020/03/16/noticias/1584374967_863408_1584375019_noticia_normal.jpg","Los Caballeros del zodiaco","es una serie de manga escrita e ilustrada por Masami Kurumada"));
        lista.add(new Anime("https://as.com/meristation/image.php","dragon ball z", "serie basada en el manga de dragon ball"));
        return lista;
    }
}