package com.coderfaysal.aboutbarisal;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    RecyclerView it_recycle;
    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        it_recycle = findViewById(R.id.it_recycle);

        Mymensingh();

        MyAdapter myAdapter = new MyAdapter();
        it_recycle.setAdapter(myAdapter);
        it_recycle.setLayoutManager(new LinearLayoutManager(MainActivity.this));


    }



    public void Mymensingh(){

        hashMap = new HashMap<>();
        hashMap.put("title", "Barisal");
        hashMap.put("desc", "Barishal, is a major city that lies on the banks of the Kirtankhola river in south-central Bangladesh. It is the largest city and the administrative headquarter of both Barisal District[b] and Barisal Division. It is one of the oldest municipalities and river ports of the country. The city was once called the Venice of the East or the Venice of Bengal.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "History");
        hashMap.put("desc", "Barisal was conquered by Muhammad bin Bakhtiyar Khalji and was later a significant territory of the Delhi Sultanate and Bengal Sultanate. After the decline of the Suri Empire, the territory became a semi-independent area in the Mughal period because of heavy fighting between the Muslims and Hindu chiefs, although most parts of the city were totally under the control of the governors of the proto-industrialised Bengal Subah. In course of time, it fell under the Bengal Nawabs. Raja Ramranjan Chakravarty was put as a de jure king during the Bengal Presidency of the British, later passed to East Pakistan at independence and finally Bangladesh.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Population");
        hashMap.put("desc", "According to provisional results of the 2011 national census, the population of Barisal (areas under the jurisdiction of the Barisal city corporation) stands at 328,278.[3] By gender, the population was 51.63% male and 48.37% female.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Geography");
        hashMap.put("desc", "Barisal District, with an area of 2790.51 km2, is bounded by Madaripur, Shariatpur, Chandpur and Lakshmipur districts on the north, Patuakhali, Barguna and Jhalokati District on the south, Bhola and Lakshmipur districts on the east, Jhalokati, Pirojpur and Gopalganj districts on the west. Several rivers flow across Barisal including the Kirtankhola, Arial Khan, Khoyrabad, Kalijira and Sandha.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "Points");
        hashMap.put("desc", "Lakhutia: located approximately 8 km from Barisal’s central business district, the Roy family estate is known as ‘Lakhutia’ (note: there are several variations of the spelling of this word, including ‘Lakutia’ and ‘Lakhotia’). The Lakhutia zamindar estate was founded by Roop Chandra Roy in the late 17th century. Apart from the main mansion itself, the estate has several Shiva temples and large ponds on the vast property. The Lakhutia mansion – including the Roy family’s personal property, was effectively destroyed during the extraordinary violence of the 1950 East Pakistan Riots, and then again later during the 1971 Bangladesh genocide. While most of Lakhutia was destroyed during the 1950 and 1971 riots and genocide, the historical site and sparse remains of the mansion remain one of Barisal’s main tourist attractions.");
        arrayList.add(hashMap);



    }


    private class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater layoutInflater = getLayoutInflater();
            View view = layoutInflater.inflate(R.layout.items, parent, false);

            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

            hashMap = arrayList.get(position);
            String name = hashMap.get("title");
            String dec = hashMap.get("desc");

            holder.it_name.setText(name);

            holder.click_lay.setOnClickListener(view -> {

                Details.TITLE = name;
                Details.DESC = dec;
                startActivity(new Intent(MainActivity.this, Details.class));

            });

        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        private class MyViewHolder extends RecyclerView.ViewHolder{

            LinearLayout click_lay;
            TextView it_name;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);

                click_lay = itemView.findViewById(R.id.click_lay);
                it_name = itemView.findViewById(R.id.it_name);


            }
        }

    }


}