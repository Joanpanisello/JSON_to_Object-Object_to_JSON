package com.example.gson_client_servidor;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

public class MainActivity extends Activity {
	
	private Button refrescar;
	private TextView id;
	private TextView nom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        Person person =new Person(1,"Joan","Panisello","Monteso","joanpm01@gmail.com");
        
        id=(TextView)findViewById(R.id.textId);
        nom=(TextView)findViewById(R.id.textNom);

        Gson gson = new Gson();
        
        String json = gson.toJson(person);
        
        Log.i("JSON::::", json);
        
        refrescar=(Button)findViewById(R.id.button1);
       
        
        refrescar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				MiCustomAsyncTask async =(MiCustomAsyncTask) new MiCustomAsyncTask().execute("http://192.168.1.69/json/json");
				
			    Person fromJson= new Person();
		    	fromJson=async.getPerson();
		    	
		    	Integer ID = fromJson.getPerson_id();
				String ID2= ID.toString();
				String NOM = fromJson.getPerson_givenName();
				
		    	id.setText(ID2);
				nom.setText(NOM);
				
				
			}
		});
        
    
        
    }

    private class MiCustomAsyncTask extends AsyncTask<String, Integer, String> {
    	
    	private Person persona;
    	private String JSON;
    	
        @Override         
        protected String doInBackground(String... urls) {
       
        	JSON =  HttpRequest.get(urls[0]).body();

            return JSON;
        }
     
        @Override 
        protected void onPreExecute() {
   
        }
     
        @Override   
        protected void onPostExecute(String result) {
        
        	Gson parser = new Gson();
        	persona=parser.fromJson(JSON, Person.class);
        	
        }
        
        public Person getPerson(){
        	return this.persona;
        	
        }
       
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
