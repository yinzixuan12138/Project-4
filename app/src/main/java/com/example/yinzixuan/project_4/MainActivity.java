package com.example.yinzixuan.project_4;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends Activity {
    private final static String NAME="Name";
    private final static String CLASS="Class";
    private final static String NUMBER="Number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] Names={"甲","乙","丙","丁"};
        String[] Classes={"Class_One","Class_two","Class_three","Class_four"};
        String[] Numbers={"2014011001","2014011002","2014011003","2014011004"};
        List<Map<String,Object>>items=new ArrayList<Map<String,Object>>();
        for(int i=0;i<Names.length;i++){
            Map<String,Object>item=new HashMap<String,Object>();
            item.put(NAME,Names[i]);
            item.put(CLASS,Classes[i]);
            item.put(NUMBER,Numbers[i]);
            items.add(item);
        }
        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,new String[]
                {NAME,CLASS,NUMBER},new int[]{R.id.txtName,R.id.txtNumber,R.id.txtClass});
        ListView list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
