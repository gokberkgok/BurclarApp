package com.example.burclarlistesiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        ArrayList<String> burclar = new ArrayList<>();
        burclar.add("Koç");
        burclar.add("Boğa");
        burclar.add("İkizler");
        burclar.add("Yengeç");
        burclar.add("Aslan");
        burclar.add("Başak");
        burclar.add("Terazi");
        burclar.add("Akrep");
        burclar.add("Yay");
        burclar.add("Oğlak");
        burclar.add("Kova");
        burclar.add("Balık");

        ArrayList<String> burcOzellik = new ArrayList<>();
        burcOzellik.add("Aktif, dinamik, insiyatif sahibi, hızlı, lider, yönetici");
        burcOzellik.add("Güvenilir, rahatına, konforuna, yemeğe düşkün, gurme, harekete geçmekte zorlanan");
        burcOzellik.add("Esnek, uyumlu, çevik, konuşkan, meraklı, arkadaş canlısı");
        burcOzellik.add("Evine, annesine, ailesine, yurduna düşkün, duyarlı, hassas, yemeğe, sofraya meraklı");
        burcOzellik.add("Özgüvenli, gururlu, mağrur, koruyan, kollayan, gösterişli, sanata, estetiğe düşkü");
        burcOzellik.add("Titiz, çalışkan, mükemmeliyetçi, eleştirel, detaycı, emektar, hizmet odaklı");
        burcOzellik.add("Adil, eşitlikçi, dengeli, uyumlu, sakin, sabırlı, akıllı, kibar");
        burcOzellik.add("Mücadeleci, güçlü, yılmaz, hırslı kişilerdir. Pes ettiğini düşündüğünüz anda küllerinden yeniden doğabilir.");
        burcOzellik.add("Bağımsız, özgür, hareketli, dinamik, sportif, keşif ve macera ruhuna sahip");
        burcOzellik.add("ciddi, soğukkanlı, gereğinde mesafeli, planlı, organize, disiplinli, iş ve kariyer odaklı");
        burcOzellik.add("Arkadaş ve dost canlısı, sosyal, yenilikçi, sıradışı, marjinal");
        burcOzellik.add("Hassas, duyarlı, empatik, vicdanlı, duyarlı, sanatsal, hayırsever, yardımsever,kolay etkilenen");


        Bitmap koc = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.koc);
        Bitmap boga = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.boga);
        Bitmap ikizler = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.ikizler);
        Bitmap yengec = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.yengec);
        Bitmap aslan = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.aslan);
        Bitmap basak = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.basak);
        Bitmap terazi = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.terazi);
        Bitmap akrep = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.akrep);
        Bitmap yay = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.yay);
        Bitmap oglak = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.oglak);
        Bitmap kova = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.kova);
        Bitmap balik = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.balik);

        ArrayList<Bitmap> burcResim = new ArrayList<>();
        burcResim.add(koc);
        burcResim.add(boga);
        burcResim.add(ikizler);
        burcResim.add(yengec);
        burcResim.add(aslan);
        burcResim.add(basak);
        burcResim.add(terazi);
        burcResim.add(akrep);
        burcResim.add(yay);
        burcResim.add(oglak);
        burcResim.add(kova);
        burcResim.add(balik);



        ArrayAdapter arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, burclar);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,DetayActivity.class);
                intent.putExtra("isim",burclar.get(position));
                intent.putExtra("ozellik",burcOzellik.get(position));

                Singleton singleton = Singleton.getInstance();
                singleton.setChosenImage(burcResim.get(position));
                startActivity(intent);
            }
        });

    }
}