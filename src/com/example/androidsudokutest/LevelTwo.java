package com.example.androidsudokutest;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LevelTwo extends Activity {


		private int tblahblah = -1;
	
	
	
	
		boolean taa = false;
		boolean tab = false;
		boolean tac = false;
		boolean tad = false;
	
		boolean tba = false;
		boolean tbb = false;
		boolean tbc = false;
		boolean tbd = false;
	
		boolean tca = false;
		boolean tcb = false;
		boolean tcc = false;
		boolean tcd = false;
	
		boolean tda = false;
		boolean tdb = false;
		boolean tdc = false;
		boolean tdd = false;
		
		
		
		
		
		boolean zaa = false;
		boolean zab = false;
		boolean zac = false;
		boolean zad = false;
	
		boolean zba = false;
		boolean zbb = false;
		boolean zbc = false;
		boolean zbd = false;
	
		boolean zca = false;
		boolean zcb = false;
		boolean zcc = false;
		boolean zcd = false;
	
		boolean zda = false;
		boolean zdb = false;
		boolean zdc = false;
		boolean zdd = false;
	



	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.leveltwo);
		 Button d=(Button)this.findViewById(R.id.L2back);
		    d.setOnClickListener(new Button.OnClickListener() {
		    	
		    	public void onClick(View v) {
		    		
		    		finish();
		    	}
		    });	    	    
	
	
	
	EditText zdummy = (EditText) findViewById(R.id.zdummyEditTextFocus);
	zdummy.requestFocus();
	
	
	
	
	
	
	
	
	final EditText tinput00 = (EditText) findViewById(R.id.L2editText00);
	tinput00.setInputType(InputType.TYPE_NULL);
	tinput00.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   tblahblah = 0;
			   taa = true;
		        }
		        });
		        
		
		
	final EditText tinput01 = (EditText) findViewById(R.id.L2editText01);
	tinput01.setInputType(InputType.TYPE_NULL);
	tinput01.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   tblahblah = 1;
			   tab = true;		     
		        }
		        });
	
	final EditText tinput02 = (EditText) findViewById(R.id.L2editText02);
	tinput02.setInputType(InputType.TYPE_NULL);
	tinput02.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   tblahblah = 2;
			   tac = true;		     
		        }
		        });
	
	final EditText tinput03 = (EditText) findViewById(R.id.L2editText03);
	tinput03.setInputType(InputType.TYPE_NULL);
	tinput03.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   tblahblah = 3;
			   tad = true;		     
		        }
		        });
	
	
	
	
	final EditText tinput10 = (EditText) findViewById(R.id.L2editText10);
	tinput10.setInputType(InputType.TYPE_NULL);
	tinput10.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   tblahblah = 4;
			   tba = true;		     
		        }
		        });
	
	final EditText tinput11 = (EditText) findViewById(R.id.L2editText11);
	tinput11.setInputType(InputType.TYPE_NULL);
	tinput11.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   tblahblah = 5;
			   tbb = true;		     
		        }
		        });
	
	final EditText tinput12 = (EditText) findViewById(R.id.L2editText12);
	tinput12.setInputType(InputType.TYPE_NULL);
	tinput12.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   tblahblah = 6;
			   tbc = true; 		     
		        }
		        });
	
	final EditText tinput13 = (EditText) findViewById(R.id.L2editText13);
	tinput13.setInputType(InputType.TYPE_NULL);
	tinput13.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   tblahblah = 7;
			   tbd = true; 		     
		        }
		        });
	
	
	
	
	final EditText tinput20 = (EditText) findViewById(R.id.L2editText20);
	tinput20.setInputType(InputType.TYPE_NULL);
	tinput20.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   tblahblah = 8;
			   tca = true; 		     
		        }
		        });
	
	final EditText tinput21 = (EditText) findViewById(R.id.L2editText21);
	tinput21.setInputType(InputType.TYPE_NULL);
	tinput21.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   tblahblah = 9;
			   tcb = true; 		     
		        }
		        });
	
	final EditText tinput22 = (EditText) findViewById(R.id.L2editText22);
	tinput22.setInputType(InputType.TYPE_NULL);
	tinput22.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   tblahblah = 10;
			   tcc = true; 		     
		        }
		        });
	
	final EditText tinput23 = (EditText) findViewById(R.id.L2editText23);
	tinput23.setInputType(InputType.TYPE_NULL);
	tinput23.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   tblahblah = 11;
			   tcd = true; 		     
		        }
		        });
	
	
	
	final EditText tinput30 = (EditText) findViewById(R.id.L2editText30);
	tinput30.setInputType(InputType.TYPE_NULL);
	tinput30.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   tblahblah = 12;
			   tda = true;		     
		        }
		        });
	
	final EditText tinput31 = (EditText) findViewById(R.id.L2editText31);
	tinput31.setInputType(InputType.TYPE_NULL);
	tinput31.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   tblahblah = 13;
			   tdb = true; 		     
		        }
		        });
	
	final EditText tinput32 = (EditText) findViewById(R.id.L2editText32);
	tinput32.setInputType(InputType.TYPE_NULL);
	tinput32.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   tblahblah = 14;
			   tdc = true; 		     
		        }
		        });
	
	final EditText tinput33 = (EditText) findViewById(R.id.L2editText33);
	tinput33.setInputType(InputType.TYPE_NULL);
	tinput33.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   tblahblah = 15;
			   tdd = true; 		     
		        }
		        });
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	Button teb1=(Button)this.findViewById(R.id.L2enterButton1);
	 	teb1.setOnClickListener(new OnClickListener() {
		    public void onClick(View v)
		    {
		    	 
		    	
		    
		   	String cake = "1";
		    switch (tblahblah){
		    case -1:
		    	break;
		    case 0:
		    	tinput00.setText(cake);
		    	break;
		    	
		    case 1:
		    	tinput01.setText(cake);
		    	break;
		    	
		    case 2:
		    	tinput02.setText(cake);
		    	break;
		    	
		    case 3:
		    	tinput03.setText(cake);
		    	break;
		    	
		    case 4:
		    	tinput10.setText(cake);
		    	break;
		    	
		    case 5:
		    	tinput11.setText(cake);
		    	break;
		    	
		    case 6:
		    	tinput12.setText(cake);
		    	break;
		    	
		    case 7:
		    	tinput13.setText(cake);
		    	break;
		    	
		    case 8:
		    	tinput20.setText(cake);
		    	break;
		    	
		    case 9:
		    	tinput21.setText(cake);
		    	break;
		    	
		    case 10:
		    	tinput22.setText(cake);
		    	break;
		    	
		    case 11:
		    	tinput23.setText(cake);
		    	break;
		    	
		    case 12:
		    	tinput30.setText(cake);
		    	break;
		    	
		    case 13:
		    	tinput31.setText(cake);
		    	break;
		    	
		    case 14:
		    	tinput32.setText(cake);
		    	break;
		    	
		    default:
		    	tinput33.setText(cake);
		    	break;
		    
		    }
		    	
		    	
		    	  
		    }
		});
		
		
		
		
		
		Button teb2=(Button)this.findViewById(R.id.L2enterButton2);
	 	teb2.setOnClickListener(new OnClickListener() {
		    public void onClick(View v)
		    {
		    	
		    	
		    	
		    	
		    String cake = "2";
		    switch (tblahblah){
		    case -1:
		    	break;
		    case 0:
		    	tinput00.setText(cake);
		    	break;
		    	
		    case 1:
		    	tinput01.setText(cake);
		    	break;
		    	
		    case 2:
		    	tinput02.setText(cake);
		    	break;
		    	
		    case 3:
		    	tinput03.setText(cake);
		    	break;
		    	
		    case 4:
		    	tinput10.setText(cake);
		    	break;
		    	
		    case 5:
		    	tinput11.setText(cake);
		    	break;
		    	
		    case 6:
		    	tinput12.setText(cake);
		    	break;
		    	
		    case 7:
		    	tinput13.setText(cake);
		    	break;
		    	
		    case 8:
		    	tinput20.setText(cake);
		    	break;
		    	
		    case 9:
		    	tinput21.setText(cake);
		    	break;
		    	
		    case 10:
		    	tinput22.setText(cake);
		    	break;
		    	
		    case 11:
		    	tinput23.setText(cake);
		    	break;
		    	
		    case 12:
		    	tinput30.setText(cake);
		    	break;
		    	
		    case 13:
		    	tinput31.setText(cake);
		    	break;
		    	
		    case 14:
		    	tinput32.setText(cake);
		    	break;
		    	
		    default:
		    	tinput33.setText(cake);
		    	break;
		    
		    }
		    	  
		    	  
		    	  
		    }
		});
		
		
		
		
		Button teb3=(Button)this.findViewById(R.id.L2enterButton3);
	 	teb3.setOnClickListener(new OnClickListener() {
		    public void onClick(View v)
		    {
		    	 
		    	
		    	
		    	
		    String cake = "3";
		    switch (tblahblah){
		    case -1:
		    	break;
		    case 0:
		    	tinput00.setText(cake);
		    	break;
		    	
		    case 1:
		    	tinput01.setText(cake);
		    	break;
		    	
		    case 2:
		    	tinput02.setText(cake);
		    	break;
		    	
		    case 3:
		    	tinput03.setText(cake);
		    	break;
		    	
		    case 4:
		    	tinput10.setText(cake);
		    	break;
		    	
		    case 5:
		    	tinput11.setText(cake);
		    	break;
		    	
		    case 6:
		    	tinput12.setText(cake);
		    	break;
		    	
		    case 7:
		    	tinput13.setText(cake);
		    	break;
		    	
		    case 8:
		    	tinput20.setText(cake);
		    	break;
		    	
		    case 9:
		    	tinput21.setText(cake);
		    	break;
		    	
		    case 10:
		    	tinput22.setText(cake);
		    	break;
		    	
		    case 11:
		    	tinput23.setText(cake);
		    	break;
		    	
		    case 12:
		    	tinput30.setText(cake);
		    	break;
		    	
		    case 13:
		    	tinput31.setText(cake);
		    	break;
		    	
		    case 14:
		    	tinput32.setText(cake);
		    	break;
		    	
		    default:
		    	tinput33.setText(cake);
		    	break;
		    
		    }
		    	
		    	
		    	  
		    }
		});
		
		Button teb4=(Button)this.findViewById(R.id.L2enterButton4);
	 	teb4.setOnClickListener(new OnClickListener() {
		    public void onClick(View v)
		    {
		    	 
		    	
		    	
		    	
		    String cake = "4";
		    switch (tblahblah){
		    case -1:
		    	break;
		    case 0:
		    	tinput00.setText(cake);
		    	break;
		    	
		    case 1:
		    	tinput01.setText(cake);
		    	break;
		    	
		    case 2:
		    	tinput02.setText(cake);
		    	break;
		    	
		    case 3:
		    	tinput03.setText(cake);
		    	break;
		    	
		    case 4:
		    	tinput10.setText(cake);
		    	break;
		    	
		    case 5:
		    	tinput11.setText(cake);
		    	break;
		    	
		    case 6:
		    	tinput12.setText(cake);
		    	break;
		    	
		    case 7:
		    	tinput13.setText(cake);
		    	break;
		    	
		    case 8:
		    	tinput20.setText(cake);
		    	break;
		    	
		    case 9:
		    	tinput21.setText(cake);
		    	break;
		    	
		    case 10:
		    	tinput22.setText(cake);
		    	break;
		    	
		    case 11:
		    	tinput23.setText(cake);
		    	break;
		    	
		    case 12:
		    	tinput30.setText(cake);
		    	break;
		    	
		    case 13:
		    	tinput31.setText(cake);
		    	break;
		    	
		    case 14:
		    	tinput32.setText(cake);
		    	break;
		    	
		    default:
		    	tinput33.setText(cake);
		    	break;
		    
		    }
		    
		    	  
		    	  
		    }
		});
	
	
	
	
	
	
	
	
	
	Random randomGenerator = new Random();

  	int rand = randomGenerator.nextInt(12);


	
	
	
	
	
	if(rand==0)
	{
	tinput00.setText("4", TextView.BufferType.EDITABLE);
	tinput01.setText("3", TextView.BufferType.EDITABLE);
	tinput02.setText("2", TextView.BufferType.EDITABLE);
	tinput03.setText("1", TextView.BufferType.EDITABLE);
	tinput10.setText("1", TextView.BufferType.EDITABLE);
	tinput11.setText("2", TextView.BufferType.EDITABLE);
	tinput12.setText("3", TextView.BufferType.EDITABLE);
	tinput13.setText("4", TextView.BufferType.EDITABLE);
	
	
	tinput00.setEnabled(false);
	tinput01.setEnabled(false);
	tinput02.setEnabled(false);
	tinput03.setEnabled(false);
	tinput10.setEnabled(false);
	tinput11.setEnabled(false);
	tinput12.setEnabled(false);
	tinput13.setEnabled(false);
	
	zaa = true;
	zab = true;
	zac = true;
	zad = true;
	zba = true;
	zbb = true;
	zbc = true;
	zbd = true; 
	
	}
	if(rand==1)
	{
	tinput00.setText("1", TextView.BufferType.EDITABLE);
	tinput01.setText("2", TextView.BufferType.EDITABLE);
	tinput02.setText("3", TextView.BufferType.EDITABLE);
	tinput03.setText("4", TextView.BufferType.EDITABLE);
	tinput10.setText("4", TextView.BufferType.EDITABLE);
	tinput11.setText("3", TextView.BufferType.EDITABLE);
	tinput12.setText("2", TextView.BufferType.EDITABLE);
	tinput13.setText("1", TextView.BufferType.EDITABLE);
	
	
	tinput00.setEnabled(false);
	tinput01.setEnabled(false);
	tinput02.setEnabled(false);
	tinput03.setEnabled(false);
	tinput10.setEnabled(false);
	tinput11.setEnabled(false);
	tinput12.setEnabled(false);
	tinput13.setEnabled(false);
	
	zaa = true;
	zab = true;
	zac = true;
	zad = true;
	zba = true;
	zbb = true;
	zbc = true;
	zbd = true; 
	
	}
	if(rand==2)
	{
	tinput00.setText("4", TextView.BufferType.EDITABLE);
	tinput10.setText("3", TextView.BufferType.EDITABLE);
	tinput20.setText("2", TextView.BufferType.EDITABLE);
	tinput30.setText("1", TextView.BufferType.EDITABLE);
	tinput03.setText("1", TextView.BufferType.EDITABLE);
	tinput13.setText("2", TextView.BufferType.EDITABLE);
	tinput23.setText("3", TextView.BufferType.EDITABLE);
	tinput33.setText("4", TextView.BufferType.EDITABLE);
	
	
	tinput00.setEnabled(false);
	tinput10.setEnabled(false);
	tinput20.setEnabled(false);
	tinput30.setEnabled(false);
	tinput03.setEnabled(false);
	tinput13.setEnabled(false);
	tinput23.setEnabled(false);
	tinput33.setEnabled(false);
	
	zaa = true;
	zba = true;
	zca = true;
	zda = true;
	zad = true;
	zbd = true;
	zcd = true;
	zdd = true; 
	
	
	}
	if(rand==3)
	{
	tinput00.setText("3", TextView.BufferType.EDITABLE);
	tinput10.setText("1", TextView.BufferType.EDITABLE);
	tinput20.setText("4", TextView.BufferType.EDITABLE);
	tinput30.setText("2", TextView.BufferType.EDITABLE);
	tinput03.setText("2", TextView.BufferType.EDITABLE);
	tinput13.setText("4", TextView.BufferType.EDITABLE);
	tinput23.setText("1", TextView.BufferType.EDITABLE);
	tinput33.setText("3", TextView.BufferType.EDITABLE);
	
	
	
	
	
	tinput00.setEnabled(false);
	tinput10.setEnabled(false);
	tinput20.setEnabled(false);
	tinput30.setEnabled(false);
	tinput03.setEnabled(false);
	tinput13.setEnabled(false);
	tinput23.setEnabled(false);
	tinput33.setEnabled(false);
	
	zaa = true;
	zba = true;
	zca = true;
	zda = true;
	zad = true;
	zbd = true;
	zcd = true;
	zdd = true; 
	
	
	
	}
	if(rand==4)
	{
	tinput01.setText("4", TextView.BufferType.EDITABLE);
	tinput11.setText("3", TextView.BufferType.EDITABLE);
	tinput21.setText("2", TextView.BufferType.EDITABLE);
	tinput31.setText("1", TextView.BufferType.EDITABLE);
	tinput02.setText("1", TextView.BufferType.EDITABLE);
	tinput12.setText("2", TextView.BufferType.EDITABLE);
	tinput22.setText("3", TextView.BufferType.EDITABLE);
	tinput32.setText("4", TextView.BufferType.EDITABLE);
	
	tinput01.setEnabled(false);
	tinput11.setEnabled(false);
	tinput21.setEnabled(false);
	tinput31.setEnabled(false);
	tinput02.setEnabled(false);
	tinput12.setEnabled(false);
	tinput22.setEnabled(false);
	tinput32.setEnabled(false);
	
	zab = true;
	zbb = true;
	zcb = true;
	zdb = true;
	zac = true;
	zbc = true;
	zcc = true;
	zdc = true; 
	
	
	
	}
	if(rand==5)
	{
	tinput20.setText("4", TextView.BufferType.EDITABLE);
	tinput21.setText("3", TextView.BufferType.EDITABLE);
	tinput22.setText("2", TextView.BufferType.EDITABLE);
	tinput23.setText("1", TextView.BufferType.EDITABLE);
	tinput30.setText("1", TextView.BufferType.EDITABLE);
	tinput31.setText("2", TextView.BufferType.EDITABLE);
	tinput32.setText("3", TextView.BufferType.EDITABLE);
	tinput33.setText("4", TextView.BufferType.EDITABLE);
	
	tinput20.setEnabled(false);
	tinput21.setEnabled(false);
	tinput22.setEnabled(false);
	tinput23.setEnabled(false);
	tinput30.setEnabled(false);
	tinput31.setEnabled(false);
	tinput32.setEnabled(false);
	tinput33.setEnabled(false);
	
	zca = true;
	zcb = true;
	zcc = true;
	zcd = true;
	zda = true;
	zdb = true;
	zdc = true;
	zdd = true; 
	
	
	}
	if(rand==6)
	{
	tinput00.setText("2", TextView.BufferType.EDITABLE);
	tinput02.setText("3", TextView.BufferType.EDITABLE);
	tinput11.setText("1", TextView.BufferType.EDITABLE);
	tinput13.setText("4", TextView.BufferType.EDITABLE);
	tinput20.setText("4", TextView.BufferType.EDITABLE);
	tinput22.setText("1", TextView.BufferType.EDITABLE);
	tinput31.setText("3", TextView.BufferType.EDITABLE);
	tinput33.setText("2", TextView.BufferType.EDITABLE);
	
	tinput00.setEnabled(false);
	tinput02.setEnabled(false);
	tinput11.setEnabled(false);
	tinput13.setEnabled(false);
	tinput20.setEnabled(false);
	tinput22.setEnabled(false);
	tinput31.setEnabled(false);
	tinput33.setEnabled(false);
	
	zaa = true;
	zac = true;
	zbb = true;
	zbd = true;
	zca = true;
	zcc = true;
	zdb = true;
	zdd = true; 
	
	
	
	}
	
	if(rand==7)
	{
	tinput01.setText("2", TextView.BufferType.EDITABLE);
	tinput10.setText("1", TextView.BufferType.EDITABLE);
	tinput03.setText("3", TextView.BufferType.EDITABLE);
	tinput12.setText("4", TextView.BufferType.EDITABLE);
	tinput21.setText("4", TextView.BufferType.EDITABLE);
	tinput30.setText("3", TextView.BufferType.EDITABLE);
	tinput23.setText("1", TextView.BufferType.EDITABLE);
	tinput32.setText("2", TextView.BufferType.EDITABLE);
	
	tinput01.setEnabled(false);
	tinput10.setEnabled(false);
	tinput03.setEnabled(false);
	tinput12.setEnabled(false);
	tinput21.setEnabled(false);
	tinput30.setEnabled(false);
	tinput23.setEnabled(false);
	tinput32.setEnabled(false);
	
	zab = true;
	zba = true;
	zad = true;
	zbc = true;
	zcb = true;
	zda = true;
	zcd = true;
	zdc = true; 
	
	
	
	}
	if(rand==8)
	{
	tinput01.setText("4", TextView.BufferType.EDITABLE);
	tinput02.setText("1", TextView.BufferType.EDITABLE);
	tinput10.setText("3", TextView.BufferType.EDITABLE);
	tinput20.setText("2", TextView.BufferType.EDITABLE);
	tinput13.setText("2", TextView.BufferType.EDITABLE);
	tinput23.setText("3", TextView.BufferType.EDITABLE);
	tinput31.setText("1", TextView.BufferType.EDITABLE);
	tinput32.setText("4", TextView.BufferType.EDITABLE);
	
	tinput01.setEnabled(false);
	tinput02.setEnabled(false);
	tinput10.setEnabled(false);
	tinput20.setEnabled(false);
	tinput13.setEnabled(false);
	tinput23.setEnabled(false);
	tinput31.setEnabled(false);
	tinput32.setEnabled(false);
	
	zab = true;
	zac = true;
	zba = true;
	zca = true;
	zbd = true;
	zcd = true;
	zdb = true;
	zdc = true; 
	
	
	}
	if(rand==9)
	{
	tinput00.setText("2", TextView.BufferType.EDITABLE);
	tinput11.setText("4", TextView.BufferType.EDITABLE);
	tinput22.setText("4", TextView.BufferType.EDITABLE);
	tinput33.setText("2", TextView.BufferType.EDITABLE);
	tinput03.setText("3", TextView.BufferType.EDITABLE);
	tinput12.setText("1", TextView.BufferType.EDITABLE);
	tinput21.setText("1", TextView.BufferType.EDITABLE);
	tinput30.setText("3", TextView.BufferType.EDITABLE);
	
	
	tinput00.setEnabled(false);
	tinput11.setEnabled(false);
	tinput22.setEnabled(false);
	tinput33.setEnabled(false);
	tinput03.setEnabled(false);
	tinput12.setEnabled(false);
	tinput21.setEnabled(false);
	tinput30.setEnabled(false);
	
	zaa = true;
	zbb = true;
	zcc = true;
	zdd = true;
	zad = true;
	zbc = true;
	zcb = true;
	zda = true; 
	
	
	}
	if(rand==10)
	{
	tinput00.setText("4", TextView.BufferType.EDITABLE);
	tinput01.setText("3", TextView.BufferType.EDITABLE);
	tinput02.setText("2", TextView.BufferType.EDITABLE);
	tinput10.setText("1", TextView.BufferType.EDITABLE);
	tinput23.setText("2", TextView.BufferType.EDITABLE);
	tinput33.setText("3", TextView.BufferType.EDITABLE);
	tinput32.setText("4", TextView.BufferType.EDITABLE);
	tinput31.setText("1", TextView.BufferType.EDITABLE);
	
	
	tinput00.setEnabled(false);
	tinput01.setEnabled(false);
	tinput02.setEnabled(false);
	tinput10.setEnabled(false);
	tinput23.setEnabled(false);
	tinput33.setEnabled(false);
	tinput32.setEnabled(false);
	tinput31.setEnabled(false);
	
	zaa = true;
	zab = true;
	zac = true;
	zba = true;
	zcd = true;
	zdd = true;
	zdc = true;
	zdb = true; 
	
	
	}
	if(rand==11)
	{
	tinput03.setText("1", TextView.BufferType.EDITABLE);
	tinput13.setText("4", TextView.BufferType.EDITABLE);
	tinput12.setText("3", TextView.BufferType.EDITABLE);
	tinput11.setText("2", TextView.BufferType.EDITABLE);
	tinput22.setText("1", TextView.BufferType.EDITABLE);
	tinput21.setText("4", TextView.BufferType.EDITABLE);
	tinput20.setText("3", TextView.BufferType.EDITABLE);
	tinput30.setText("2", TextView.BufferType.EDITABLE);
	
	
	tinput03.setEnabled(false);
	tinput13.setEnabled(false);
	tinput12.setEnabled(false);
	tinput11.setEnabled(false);
	tinput22.setEnabled(false);
	tinput21.setEnabled(false);
	tinput20.setEnabled(false);
	tinput30.setEnabled(false);
	
	zad = true;
	zbd = true;
	zbc = true;
	zbb = true;
	zcc = true;
	zcb = true;
	zca = true;
	zda = true; 
	
	}
	if(rand==12)
	{
	tinput00.setText("4", TextView.BufferType.EDITABLE);
	tinput30.setText("1", TextView.BufferType.EDITABLE);
	tinput11.setText("1", TextView.BufferType.EDITABLE);
	tinput21.setText("2", TextView.BufferType.EDITABLE);
	tinput12.setText("3", TextView.BufferType.EDITABLE);
	tinput22.setText("4", TextView.BufferType.EDITABLE);
	tinput03.setText("2", TextView.BufferType.EDITABLE);
	tinput33.setText("3", TextView.BufferType.EDITABLE);
	
	
	tinput00.setEnabled(false);
	tinput30.setEnabled(false);
	tinput11.setEnabled(false);
	tinput21.setEnabled(false);
	tinput12.setEnabled(false);
	tinput22.setEnabled(false);
	tinput03.setEnabled(false);
	tinput33.setEnabled(false);
	
	zaa = true;
	zda = true;
	zbb = true;
	zcb = true;
	zbc = true;
	zcc = true;
	zad = true;
	zdd = true; 
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	Button ss=(Button)this.findViewById(R.id.L2submit);
	    ss.setOnClickListener(new Button.OnClickListener() {
	    	
	    	public void onClick(View v) {
	    		
	    		boolean pool = true;
	    		
	    		int[][] pzechArray = new int[4][4];
	    		
	    		
	    		
	    		
	    		if (taa == false)
	    		{
	    			if (zaa == false)
	    			{
	    				tinput00.setText("0");
	    			}
	    		}
	    		if (tab == false)
	    		{
	    			if (zab == false)
	    			{
	    				tinput01.setText("0");
	    			}
	    		}
	    		if (tac == false)
	    		{
	    			if (zac == false)
	    			{
	    				tinput02.setText("0");
	    			}
	    		}
	    		if (tad == false)
	    		{
	    			if(zad == false)
	    			{
	    				tinput03.setText("0");
	    			}
	    		}
	    		
	    		
	    		if (tba == false)
	    		{
	    			if(zba == false)
	    			{
	    				tinput10.setText("0");
	    			}
	    		}
	    		if (tbb == false)
	    		{
	    			if(zbb == false)
	    			{
	    				tinput11.setText("0");
	    			}
	    		}
	    		if (tbc == false)
	    		{
	    			if(zbc == false)
	    			{
	    			tinput12.setText("0");
	    			}
	    		}
	    		if (tbd == false)
	    		{
	    			if(zbd == false)
	    			{
	    			tinput13.setText("0");
	    			}
	    		}
	    		
	    		
	    		if (tca == false)
	    		{
	    			if(zca == false)
	    			{
	    			tinput20.setText("0");
	    			}
	    		}
	    		if (tcb == false)
	    		{
	    			if(zcb == false)
	    			{
	    			tinput21.setText("0");
	    			}
	    		}
	    		if (tcc == false)
	    		{
	    			if(zcc == false)
	    			{
	    			tinput22.setText("0");
	    			}
	    		}
	    		if (tcd == false)
	    		{
	    			if(zcd == false)
	    			{
	    			tinput23.setText("0");
	    			}
	    		}
	    		
	    		
	    		if (tda == false)
	    		{
	    			if(zda == false)
	    			{
	    			tinput30.setText("0");
	    			}
	    		}
	    		if (tdb == false)
	    		{
	    			if (zdb == false)
	    			{
	    			tinput31.setText("0");
	    			}
	    		}
	    		if (tdc == false)
	    		{
	    			if (zdc == false)
	    			{
	    			tinput32.setText("0");
	    			}
	    		}
	    		if (tdd == false)
	    		{
	    			if (zdd == false)
	    			{
	    			tinput33.setText("0");
	    			}
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		pzechArray[0][0] = Integer.parseInt(tinput00.getText().toString());
	    		pzechArray[0][1] = Integer.parseInt(tinput01.getText().toString());
	    		pzechArray[0][2] = Integer.parseInt(tinput02.getText().toString());
	    		pzechArray[0][3] = Integer.parseInt(tinput03.getText().toString());
	    		
	    		pzechArray[1][0] = Integer.parseInt(tinput10.getText().toString());
	    		pzechArray[1][1] = Integer.parseInt(tinput11.getText().toString());
	    		pzechArray[1][2] = Integer.parseInt(tinput12.getText().toString());
	    		pzechArray[1][3] = Integer.parseInt(tinput13.getText().toString());
	    		
	    		pzechArray[2][0] = Integer.parseInt(tinput20.getText().toString());
	    		pzechArray[2][1] = Integer.parseInt(tinput21.getText().toString());
	    		pzechArray[2][2] = Integer.parseInt(tinput22.getText().toString());
	    		pzechArray[2][3] = Integer.parseInt(tinput23.getText().toString());
	    		
	    		pzechArray[3][0] = Integer.parseInt(tinput30.getText().toString());
	    		pzechArray[3][1] = Integer.parseInt(tinput31.getText().toString());
	    		pzechArray[3][2] = Integer.parseInt(tinput32.getText().toString());
	    		pzechArray[3][3] = Integer.parseInt(tinput33.getText().toString());
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    	
	    
	    		int polumn1Sum;
	    		int polumn2Sum;
	    		int polumn3Sum;
	    		int polumn4Sum;
	    		
	    		polumn1Sum = pzechArray[0][0] + 
	    				     pzechArray[1][0] +
	    				     pzechArray[2][0] +
	    				     pzechArray[3][0];
	    		if (polumn1Sum == 10)
	    		{
	    			 
	    		}
	    		else
	    		{
	    			pool = false;
	    		}
	    		
	    		polumn2Sum = pzechArray[0][1] + 
    				         pzechArray[1][1] +
    				         pzechArray[2][1] +
    				         pzechArray[3][1];
    		    if (polumn2Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			pool = false;
	    		}
	    		
    		
    		    polumn3Sum = pzechArray[0][2] + 
				             pzechArray[1][2] +
				             pzechArray[2][2] +
				             pzechArray[3][2];
    		    if (polumn3Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			pool = false;
	    		}
	    		
		
    		    polumn4Sum = pzechArray[0][3] + 
    		    			 pzechArray[1][3] +
    		    			 pzechArray[2][3] +
    		    			 pzechArray[3][3];
    		    if (polumn4Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			pool = false;
	    		}
	    		
    		    
    		    
    		    
    		    
    		    
	    		int pow1Sum;
	    		int pow2Sum;
	    		int pow3Sum;
	    		int pow4Sum;
	    		
	    		pow1Sum =    pzechArray[0][0] + 
	    					 pzechArray[0][1] +
	    					 pzechArray[0][2] +
   				     		 pzechArray[0][3];
	    		if (pow1Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			pool = false;
	    		}
   		
   		
	    		pow2Sum =    pzechArray[1][0] + 
   					 		 pzechArray[1][1] +
   					 		 pzechArray[1][2] +
				     		 pzechArray[1][3];
	    		if (pow2Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			pool = false;
	    		}
		
		
	    		pow3Sum =    pzechArray[2][0] + 
					 		 pzechArray[2][1] +
					 		 pzechArray[2][2] +
					 		 pzechArray[2][3];
	    		if (pow3Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			pool = false;
	    		}
	    					 
	    					 
	    					 
	
	    		pow4Sum =    pzechArray[3][0] + 
					 		 pzechArray[3][1] +
					 		 pzechArray[3][2] +
					 		 pzechArray[3][3];
	    		if (pow4Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			pool = false;
	    		}
   		
	    		
	    		
	    		
	    		
	    		int pox1Sum;
	    		int pox2Sum;
	    		int pox3Sum;
	    		int pox4Sum;
	    		
	    		pox1Sum =   pzechArray[0][0] + 
   					 		pzechArray[0][1] +
   					 		pzechArray[1][0] +
				     		pzechArray[1][1];
	    		if (pox1Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			pool = false;
	    		}
   					 
   					 
	    		
	    		pox2Sum =   pzechArray[0][2] + 
					 		pzechArray[0][3] +
					 		pzechArray[1][2] +
					 		pzechArray[1][3];
	    		if (pox2Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			pool = false;
	    		}
	    		
	    		
	    		
	    		pox3Sum =   pzechArray[2][0] + 
				 			pzechArray[3][0] +
				 			pzechArray[2][1] +
				 			pzechArray[3][1];
	    		if (pox3Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			pool = false;
	    		}
	    		
    		
	    		pox4Sum =   pzechArray[2][2] + 
		 					pzechArray[2][3] +
		 					pzechArray[3][2] +
		 					pzechArray[3][3];
	    		if (pox4Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			pool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		if((pzechArray[0][0]) == (pzechArray[1][0])){
	    			pool = false;
	    		}
	    		if ((pzechArray[0][0]) == (pzechArray[2][0])){
	    			pool = false;
	    		}
	    		if ((pzechArray[0][0]) == (pzechArray[3][0])){
	    			pool = false;
	    		}
	    		if ((pzechArray[0][0]) == (pzechArray[0][1])){
	    			pool = false;
	    		}
	    		if ((pzechArray[0][0]) == (pzechArray[0][2])){
	    			pool = false;
	    		}
	    		if ((pzechArray[0][0]) == (pzechArray[0][3])){
	    			pool = false;
	    		}
	    		if ((pzechArray[0][0]) == (pzechArray[1][1])){
	    			pool = false;
	    		}
	    		
	    		
	    
	    		
	    		
	    		if(pzechArray[0][1] == pzechArray[0][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[0][1] == pzechArray[1][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[0][1] == pzechArray[2][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[0][1] == pzechArray[3][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[0][1] == pzechArray[0][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[0][1] == pzechArray[0][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[0][1] == pzechArray[1][0]){
	    			pool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		if(pzechArray[0][2] == pzechArray[0][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[0][2] == pzechArray[0][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[0][2] == pzechArray[0][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[0][2] == pzechArray[1][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[0][2] == pzechArray[2][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[0][2] == pzechArray[3][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[0][2] == pzechArray[1][3]){
	    			pool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		if(pzechArray[0][3] == pzechArray[1][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[0][3] == pzechArray[2][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[0][3] == pzechArray[3][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[0][3] == pzechArray[0][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[0][3] == pzechArray[0][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[0][3] == pzechArray[0][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[0][3] == pzechArray[1][2]){
	    			pool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		if(pzechArray[1][0] == pzechArray[0][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][0] == pzechArray[2][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][0] == pzechArray[3][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][0] == pzechArray[1][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][0] == pzechArray[1][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][0] == pzechArray[1][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][0] == pzechArray[0][1]){
	    			pool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		if(pzechArray[1][1] == pzechArray[0][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][1] == pzechArray[2][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][1] == pzechArray[3][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][1] == pzechArray[1][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][1] == pzechArray[1][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][1] == pzechArray[1][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][1] == pzechArray[0][0]){
	    			pool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		if(pzechArray[1][2] == pzechArray[0][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][2] == pzechArray[2][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][2] == pzechArray[3][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][2] == pzechArray[1][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][2] == pzechArray[1][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][2] == pzechArray[1][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][2] == pzechArray[0][3]){
	    			pool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		if(pzechArray[1][3] == pzechArray[0][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][3] == pzechArray[2][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][3] == pzechArray[3][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][3] == pzechArray[1][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][3] == pzechArray[1][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][3] == pzechArray[1][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[1][3] == pzechArray[0][2]){
	    			pool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		if(pzechArray[2][0] == pzechArray[0][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][0] == pzechArray[1][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][0] == pzechArray[3][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][0] == pzechArray[2][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][0] == pzechArray[2][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][0] == pzechArray[2][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][0] == pzechArray[3][1]){
	    			pool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		if(pzechArray[2][1] == pzechArray[2][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][1] == pzechArray[2][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][1] == pzechArray[2][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][1] == pzechArray[0][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][1] == pzechArray[1][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][1] == pzechArray[3][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][1] == pzechArray[3][0]){
	    			pool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		if(pzechArray[2][2] == pzechArray[0][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][2] == pzechArray[1][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][2] == pzechArray[3][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][2] == pzechArray[2][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][2] == pzechArray[2][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][2] == pzechArray[2][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][2] == pzechArray[3][3]){
	    			pool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		if(pzechArray[2][3] == pzechArray[3][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][3] == pzechArray[1][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][3] == pzechArray[0][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][3] == pzechArray[2][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][3] == pzechArray[2][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][3] == pzechArray[2][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[2][3] == pzechArray[3][2]){
	    			pool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		if(pzechArray[3][0] == pzechArray[0][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][0] == pzechArray[1][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][0] == pzechArray[2][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][0] == pzechArray[3][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][0] == pzechArray[3][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][0] == pzechArray[3][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][0] == pzechArray[2][1]){
	    			pool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		if(pzechArray[3][1] == pzechArray[0][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][1] == pzechArray[1][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][1] == pzechArray[2][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][1] == pzechArray[3][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][1] == pzechArray[3][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][1] == pzechArray[3][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][1] == pzechArray[2][0]){
	    			pool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		if(pzechArray[3][2] == pzechArray[0][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][2] == pzechArray[1][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][2] == pzechArray[2][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][2] == pzechArray[3][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][2] == pzechArray[3][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][2] == pzechArray[3][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][2] == pzechArray[2][3]){
	    			pool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		if(pzechArray[3][3] == pzechArray[3][0]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][3] == pzechArray[3][1]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][3] == pzechArray[3][2]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][3] == pzechArray[0][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][3] == pzechArray[1][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][3] == pzechArray[2][3]){
	    			pool = false;
	    		}
	    		else if (pzechArray[3][3] == pzechArray[2][2]){
	    			pool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    	TextView pt=(TextView)findViewById(R.id.L2textView);
	    	
	    		if(pool == true)
	    		{
		    		pt.setText("Your answer is correct!");
		    	}
	    		else
		    	{
		    		pt.setText("Sorry, your answer is wrong!");
		    	}
	    		
	    		
	    	
	    		
	    		
	    		
	    	}
		        
		        
	    });
	        
    
	
	
	
}
}

