package com.example.androidsudokutest;



import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class LevelOne extends Activity {

	private int blahblah = -1;

	
	
	boolean aa = false;
	boolean ab = false;
	boolean ac = false;
	boolean ad = false;
	
	boolean ba = false;
	boolean bb = false;
	boolean bc = false;
	boolean bd = false;
	
	boolean ca = false;
	boolean cb = false;
	boolean cc = false;
	boolean cd = false;
	
	boolean da = false;
	boolean db = false;
	boolean dc = false;
	boolean dd = false;
	
	
	

	
	

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.levelone);
		
		 Button c=(Button)this.findViewById(R.id.LEVELONEbackButton);
		    c.setOnClickListener(new Button.OnClickListener() {
		    	
		    	public void onClick(View v) {
		    		
		    		finish();
		    	}
		    });
	
	
	EditText dummy = (EditText) findViewById(R.id.dummyEditTextFocus);
	dummy.requestFocus();
	
	
	
	
	
	
	
		  
	final EditText input00 = (EditText) findViewById(R.id.LEVELONEeditText00);
	input00.setInputType(InputType.TYPE_NULL);
	input00.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   blahblah = 0;
			   aa = true;
			   
		        }
		        });
		        
		
		
	final EditText input01 = (EditText) findViewById(R.id.LEVELONEeditText01);
	input01.setInputType(InputType.TYPE_NULL);
	input01.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   blahblah = 1;
			   ab = true;		     
		        }
		        });
	
	final EditText input02 = (EditText) findViewById(R.id.LEVELONEeditText02);
	input02.setInputType(InputType.TYPE_NULL);
	input02.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   blahblah = 2;
			   ac = true;		     
		        }
		        });
	
	final EditText input03 = (EditText) findViewById(R.id.LEVELONEeditText03);
	input03.setInputType(InputType.TYPE_NULL);
	input03.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   blahblah = 3;
			   ad = true;		     
		        }
		        });
	
	
	
	
	final EditText input10 = (EditText) findViewById(R.id.LEVELONEeditText10);
	input10.setInputType(InputType.TYPE_NULL);
	input10.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   blahblah = 4;
			   ba = true;		     
		        }
		        });
	
	final EditText input11 = (EditText) findViewById(R.id.LEVELONEeditText11);
	input11.setInputType(InputType.TYPE_NULL);
	input11.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   blahblah = 5;
			   bb = true;		     
		        }
		        });
	
	final EditText input12 = (EditText) findViewById(R.id.LEVELONEeditText12);
	input12.setInputType(InputType.TYPE_NULL);
	input12.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   blahblah = 6;
			   bc = true; 		     
		        }
		        });
	
	final EditText input13 = (EditText) findViewById(R.id.LEVELONEeditText13);
	input13.setInputType(InputType.TYPE_NULL);
	input13.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   blahblah = 7;
			   bd = true; 		     
		        }
		        });
	
	
	
	
	final EditText input20 = (EditText) findViewById(R.id.LEVELONEeditText20);
	input20.setInputType(InputType.TYPE_NULL);
	input20.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   blahblah = 8;
			   ca = true; 		     
		        }
		        });
	
	final EditText input21 = (EditText) findViewById(R.id.LEVELONEeditText21);
	input21.setInputType(InputType.TYPE_NULL);
	input21.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   blahblah = 9;
			   cb = true; 		     
		        }
		        });
	
	final EditText input22 = (EditText) findViewById(R.id.LEVELONEeditText22);
	input22.setInputType(InputType.TYPE_NULL);
	input22.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   blahblah = 10;
			   cc = true; 		     
		        }
		        });
	
	final EditText input23 = (EditText) findViewById(R.id.LEVELONEeditText23);
	input23.setInputType(InputType.TYPE_NULL);
	input23.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   blahblah = 11;
			   cd = true; 		     
		        }
		        });
	
	
	
	final EditText input30 = (EditText) findViewById(R.id.LEVELONEeditText30);
	input30.setInputType(InputType.TYPE_NULL);
	input30.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   blahblah = 12;
			   da = true;		     
		        }
		        });
	
	final EditText input31 = (EditText) findViewById(R.id.LEVELONEeditText31);
	input31.setInputType(InputType.TYPE_NULL);
	input31.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   blahblah = 13;
			   db = true; 		     
		        }
		        });
	
	final EditText input32 = (EditText) findViewById(R.id.LEVELONEeditText32);
	input32.setInputType(InputType.TYPE_NULL);
	input32.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   blahblah = 14;
			   dc = true; 		     
		        }
		        });
	
	final EditText input33 = (EditText) findViewById(R.id.LEVELONEeditText33);
	input33.setInputType(InputType.TYPE_NULL);
	input33.setOnClickListener(new OnClickListener() {
		   @Override
		   public void onClick(View v) {
			   blahblah = 15;
			   dd = true; 		     
		        }
		        });
		

	
		
		Button eb1=(Button)this.findViewById(R.id.LEVELONEenterButton1);
	 	eb1.setOnClickListener(new OnClickListener() {
		    public void onClick(View v)
		    {
		    	 
		    	
		    
		   	String cake = "1";
		    switch (blahblah){
		    case -1:
		    	break;
		    case 0:
		    	input00.setText(cake);
		    	break;
		    	
		    case 1:
		    	input01.setText(cake);
		    	break;
		    	
		    case 2:
		    	input02.setText(cake);
		    	break;
		    	
		    case 3:
		    	input03.setText(cake);
		    	break;
		    	
		    case 4:
		    	input10.setText(cake);
		    	break;
		    	
		    case 5:
		    	input11.setText(cake);
		    	break;
		    	
		    case 6:
		    	input12.setText(cake);
		    	break;
		    	
		    case 7:
		    	input13.setText(cake);
		    	break;
		    	
		    case 8:
		    	input20.setText(cake);
		    	break;
		    	
		    case 9:
		    	input21.setText(cake);
		    	break;
		    	
		    case 10:
		    	input22.setText(cake);
		    	break;
		    	
		    case 11:
		    	input23.setText(cake);
		    	break;
		    	
		    case 12:
		    	input30.setText(cake);
		    	break;
		    	
		    case 13:
		    	input31.setText(cake);
		    	break;
		    	
		    case 14:
		    	input32.setText(cake);
		    	break;
		    	
		    default:
		    	input33.setText(cake);
		    	break;
		    
		    }
		    	
		    	
		    	  
		    }
		});
		
		
		
		
		
		Button eb2=(Button)this.findViewById(R.id.LEVELONEenterButton2);
	 	eb2.setOnClickListener(new OnClickListener() {
		    public void onClick(View v)
		    {
		    	
		    	
		    	
		    	
		    String cake = "2";
		    switch (blahblah){
		    case -1:
		    	break;
		    case 0:
		    	input00.setText(cake);
		    	break;
		    	
		    case 1:
		    	input01.setText(cake);
		    	break;
		    	
		    case 2:
		    	input02.setText(cake);
		    	break;
		    	
		    case 3:
		    	input03.setText(cake);
		    	break;
		    	
		    case 4:
		    	input10.setText(cake);
		    	break;
		    	
		    case 5:
		    	input11.setText(cake);
		    	break;
		    	
		    case 6:
		    	input12.setText(cake);
		    	break;
		    	
		    case 7:
		    	input13.setText(cake);
		    	break;
		    	
		    case 8:
		    	input20.setText(cake);
		    	break;
		    	
		    case 9:
		    	input21.setText(cake);
		    	break;
		    	
		    case 10:
		    	input22.setText(cake);
		    	break;
		    	
		    case 11:
		    	input23.setText(cake);
		    	break;
		    	
		    case 12:
		    	input30.setText(cake);
		    	break;
		    	
		    case 13:
		    	input31.setText(cake);
		    	break;
		    	
		    case 14:
		    	input32.setText(cake);
		    	break;
		    	
		    default:
		    	input33.setText(cake);
		    	break;
		    
		    }
		    	  
		    	  
		    	  
		    }
		});
		
		
		
		
		Button eb3=(Button)this.findViewById(R.id.LEVELONEenterButton3);
	 	eb3.setOnClickListener(new OnClickListener() {
		    public void onClick(View v)
		    {
		    	 
		    	
		    	
		    	
		    String cake = "3";
		    switch (blahblah){
		    case -1:
		    	break;
		    case 0:
		    	input00.setText(cake);
		    	break;
		    	
		    case 1:
		    	input01.setText(cake);
		    	break;
		    	
		    case 2:
		    	input02.setText(cake);
		    	break;
		    	
		    case 3:
		    	input03.setText(cake);
		    	break;
		    	
		    case 4:
		    	input10.setText(cake);
		    	break;
		    	
		    case 5:
		    	input11.setText(cake);
		    	break;
		    	
		    case 6:
		    	input12.setText(cake);
		    	break;
		    	
		    case 7:
		    	input13.setText(cake);
		    	break;
		    	
		    case 8:
		    	input20.setText(cake);
		    	break;
		    	
		    case 9:
		    	input21.setText(cake);
		    	break;
		    	
		    case 10:
		    	input22.setText(cake);
		    	break;
		    	
		    case 11:
		    	input23.setText(cake);
		    	break;
		    	
		    case 12:
		    	input30.setText(cake);
		    	break;
		    	
		    case 13:
		    	input31.setText(cake);
		    	break;
		    	
		    case 14:
		    	input32.setText(cake);
		    	break;
		    	
		    default:
		    	input33.setText(cake);
		    	break;
		    
		    }
		    	
		    	
		    	  
		    }
		});
		
		Button eb4=(Button)this.findViewById(R.id.LEVELONEenterButton4);
	 	eb4.setOnClickListener(new OnClickListener() {
		    public void onClick(View v)
		    {
		    	 
		    	
		    	
		    	
		    String cake = "4";
		    switch (blahblah){
		    case -1:
		    	break;
		    case 0:
		    	input00.setText(cake);
		    	break;
		    	
		    case 1:
		    	input01.setText(cake);
		    	break;
		    	
		    case 2:
		    	input02.setText(cake);
		    	break;
		    	
		    case 3:
		    	input03.setText(cake);
		    	break;
		    	
		    case 4:
		    	input10.setText(cake);
		    	break;
		    	
		    case 5:
		    	input11.setText(cake);
		    	break;
		    	
		    case 6:
		    	input12.setText(cake);
		    	break;
		    	
		    case 7:
		    	input13.setText(cake);
		    	break;
		    	
		    case 8:
		    	input20.setText(cake);
		    	break;
		    	
		    case 9:
		    	input21.setText(cake);
		    	break;
		    	
		    case 10:
		    	input22.setText(cake);
		    	break;
		    	
		    case 11:
		    	input23.setText(cake);
		    	break;
		    	
		    case 12:
		    	input30.setText(cake);
		    	break;
		    	
		    case 13:
		    	input31.setText(cake);
		    	break;
		    	
		    case 14:
		    	input32.setText(cake);
		    	break;
		    	
		    default:
		    	input33.setText(cake);
		    	break;
		    
		    }
		    
		    	  
		    	  
		    }
		});
		    
		        
		        
		        
		Button s=(Button)this.findViewById(R.id.LEVELONEsubmitButton);
	    s.setOnClickListener(new Button.OnClickListener() {
	    	
	    	public void onClick(View v) {
	    		
	    		boolean cool = true;
	    		
	    		int[][] czechArray = new int[4][4];
	    		
	    		
	    		
	    		
	    		if (aa == false)
	    		{
	    			input00.setText("0");
	    			
	    		}
	    		if (ab == false)
	    		{
	    			input01.setText("0");
	    			
	    		}
	    		if (ac == false)
	    		{
	    			input02.setText("0");
	    			
	    		}
	    		if (ad == false)
	    		{
	    			input03.setText("0");
	    			
	    		}
	    		
	    		
	    		if (ba == false)
	    		{
	    			input10.setText("0");
	    			
	    		}
	    		if (bb == false)
	    		{
	    			input11.setText("0");
	    			
	    		}
	    		if (bc == false)
	    		{
	    			input12.setText("0");
	    			
	    		}
	    		if (bd == false)
	    		{
	    			input13.setText("0");
	    			
	    		}
	    		
	    		
	    		if (ca == false)
	    		{
	    			input20.setText("0");
	    			
	    		}
	    		if (cb == false)
	    		{
	    			input21.setText("0");
	    			
	    		}
	    		if (cc == false)
	    		{
	    			input22.setText("0");
	    			
	    		}
	    		if (cd == false)
	    		{
	    			input23.setText("0");
	    			
	    		}
	    		
	    		
	    		if (da == false)
	    		{
	    			input30.setText("0");
	    			
	    		}
	    		if (db == false)
	    		{
	    			input31.setText("0");
	    			
	    		}
	    		if (dc == false)
	    		{
	    			input32.setText("0");
	    			
	    		}
	    		if (dd == false)
	    		{
	    			input33.setText("0");
	    			
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		czechArray[0][0] = Integer.parseInt(input00.getText().toString());
	    		czechArray[0][1] = Integer.parseInt(input01.getText().toString());
	    		czechArray[0][2] = Integer.parseInt(input02.getText().toString());
	    		czechArray[0][3] = Integer.parseInt(input03.getText().toString());
	    		
	    		czechArray[1][0] = Integer.parseInt(input10.getText().toString());
	    		czechArray[1][1] = Integer.parseInt(input11.getText().toString());
	    		czechArray[1][2] = Integer.parseInt(input12.getText().toString());
	    		czechArray[1][3] = Integer.parseInt(input13.getText().toString());
	    		
	    		czechArray[2][0] = Integer.parseInt(input20.getText().toString());
	    		czechArray[2][1] = Integer.parseInt(input21.getText().toString());
	    		czechArray[2][2] = Integer.parseInt(input22.getText().toString());
	    		czechArray[2][3] = Integer.parseInt(input23.getText().toString());
	    		
	    		czechArray[3][0] = Integer.parseInt(input30.getText().toString());
	    		czechArray[3][1] = Integer.parseInt(input31.getText().toString());
	    		czechArray[3][2] = Integer.parseInt(input32.getText().toString());
	    		czechArray[3][3] = Integer.parseInt(input33.getText().toString());
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    	
	    
	    		int column1Sum;
	    		int column2Sum;
	    		int column3Sum;
	    		int column4Sum;
	    		
	    		column1Sum = czechArray[0][0] + 
	    				     czechArray[1][0] +
	    				     czechArray[2][0] +
	    				     czechArray[3][0];
	    		if (column1Sum == 10)
	    		{
	    			 
	    		}
	    		else
	    		{
	    			cool = false;
	    		}
	    		
	    		column2Sum = czechArray[0][1] + 
    				         czechArray[1][1] +
    				         czechArray[2][1] +
    				         czechArray[3][1];
    		    if (column2Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			cool = false;
	    		}
	    		
    		
    		    column3Sum = czechArray[0][2] + 
				             czechArray[1][2] +
				             czechArray[2][2] +
				             czechArray[3][2];
    		    if (column3Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			cool = false;
	    		}
	    		
		
    		    column4Sum = czechArray[0][3] + 
    		    			 czechArray[1][3] +
    		    			 czechArray[2][3] +
    		    			 czechArray[3][3];
    		    if (column4Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			cool = false;
	    		}
	    		
    		    
    		    
    		    
    		    
    		    
	    		int row1Sum;
	    		int row2Sum;
	    		int row3Sum;
	    		int row4Sum;
	    		
	    		row1Sum =    czechArray[0][0] + 
	    					 czechArray[0][1] +
	    					 czechArray[0][2] +
   				     		 czechArray[0][3];
	    		if (row1Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			cool = false;
	    		}
   		
   		
	    		row2Sum =    czechArray[1][0] + 
   					 		 czechArray[1][1] +
   					 		 czechArray[1][2] +
				     		 czechArray[1][3];
	    		if (row2Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			cool = false;
	    		}
		
		
	    		row3Sum =    czechArray[2][0] + 
					 		 czechArray[2][1] +
					 		 czechArray[2][2] +
					 		 czechArray[2][3];
	    		if (row3Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			cool = false;
	    		}
	    					 
	    					 
	    					 
	
	    		row4Sum =    czechArray[3][0] + 
					 		 czechArray[3][1] +
					 		 czechArray[3][2] +
					 		 czechArray[3][3];
	    		if (row4Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			cool = false;
	    		}
   		
	    		
	    		
	    		
	    		
	    		int box1Sum;
	    		int box2Sum;
	    		int box3Sum;
	    		int box4Sum;
	    		
	    		box1Sum =   czechArray[0][0] + 
   					 		czechArray[0][1] +
   					 		czechArray[1][0] +
				     		czechArray[1][1];
	    		if (box1Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			cool = false;
	    		}
   					 
   					 
	    		
	    		box2Sum =   czechArray[0][2] + 
					 		czechArray[0][3] +
					 		czechArray[1][2] +
					 		czechArray[1][3];
	    		if (box2Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			cool = false;
	    		}
	    		
	    		
	    		
	    		box3Sum =   czechArray[2][0] + 
				 			czechArray[3][0] +
				 			czechArray[2][1] +
				 			czechArray[3][1];
	    		if (box3Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			cool = false;
	    		}
	    		
    		
	    		box4Sum =   czechArray[2][2] + 
		 					czechArray[2][3] +
		 					czechArray[3][2] +
		 					czechArray[3][3];
	    		if (box4Sum == 10)
	    		{
	    			
	    		}
	    		else
	    		{
	    			cool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		if((czechArray[0][0]) == (czechArray[1][0])){
	    			cool = false;
	    		}
	    		if ((czechArray[0][0]) == (czechArray[2][0])){
	    			cool = false;
	    		}
	    		if ((czechArray[0][0]) == (czechArray[3][0])){
	    			cool = false;
	    		}
	    		if ((czechArray[0][0]) == (czechArray[0][1])){
	    			cool = false;
	    		}
	    		if ((czechArray[0][0]) == (czechArray[0][2])){
	    			cool = false;
	    		}
	    		if ((czechArray[0][0]) == (czechArray[0][3])){
	    			cool = false;
	    		}
	    		if ((czechArray[0][0]) == (czechArray[1][1])){
	    			cool = false;
	    		}
	    		
	    		
	    
	    		
	    		
	    		if(czechArray[0][1] == czechArray[0][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[0][1] == czechArray[1][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[0][1] == czechArray[2][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[0][1] == czechArray[3][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[0][1] == czechArray[0][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[0][1] == czechArray[0][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[0][1] == czechArray[1][0]){
	    			cool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		if(czechArray[0][2] == czechArray[0][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[0][2] == czechArray[0][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[0][2] == czechArray[0][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[0][2] == czechArray[1][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[0][2] == czechArray[2][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[0][2] == czechArray[3][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[0][2] == czechArray[1][3]){
	    			cool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		if(czechArray[0][3] == czechArray[1][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[0][3] == czechArray[2][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[0][3] == czechArray[3][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[0][3] == czechArray[0][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[0][3] == czechArray[0][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[0][3] == czechArray[0][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[0][3] == czechArray[1][2]){
	    			cool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		if(czechArray[1][0] == czechArray[0][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][0] == czechArray[2][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][0] == czechArray[3][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][0] == czechArray[1][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][0] == czechArray[1][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][0] == czechArray[1][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][0] == czechArray[0][1]){
	    			cool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		if(czechArray[1][1] == czechArray[0][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][1] == czechArray[2][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][1] == czechArray[3][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][1] == czechArray[1][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][1] == czechArray[1][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][1] == czechArray[1][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][1] == czechArray[0][0]){
	    			cool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		if(czechArray[1][2] == czechArray[0][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][2] == czechArray[2][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][2] == czechArray[3][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][2] == czechArray[1][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][2] == czechArray[1][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][2] == czechArray[1][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][2] == czechArray[0][3]){
	    			cool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		if(czechArray[1][3] == czechArray[0][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][3] == czechArray[2][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][3] == czechArray[3][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][3] == czechArray[1][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][3] == czechArray[1][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][3] == czechArray[1][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[1][3] == czechArray[0][2]){
	    			cool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		if(czechArray[2][0] == czechArray[0][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][0] == czechArray[1][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][0] == czechArray[3][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][0] == czechArray[2][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][0] == czechArray[2][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][0] == czechArray[2][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][0] == czechArray[3][1]){
	    			cool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		if(czechArray[2][1] == czechArray[2][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][1] == czechArray[2][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][1] == czechArray[2][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][1] == czechArray[0][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][1] == czechArray[1][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][1] == czechArray[3][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][1] == czechArray[3][0]){
	    			cool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		if(czechArray[2][2] == czechArray[0][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][2] == czechArray[1][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][2] == czechArray[3][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][2] == czechArray[2][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][2] == czechArray[2][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][2] == czechArray[2][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][2] == czechArray[3][3]){
	    			cool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		if(czechArray[2][3] == czechArray[3][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][3] == czechArray[1][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][3] == czechArray[0][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][3] == czechArray[2][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][3] == czechArray[2][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][3] == czechArray[2][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[2][3] == czechArray[3][2]){
	    			cool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		if(czechArray[3][0] == czechArray[0][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][0] == czechArray[1][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][0] == czechArray[2][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][0] == czechArray[3][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][0] == czechArray[3][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][0] == czechArray[3][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][0] == czechArray[2][1]){
	    			cool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		if(czechArray[3][1] == czechArray[0][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][1] == czechArray[1][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][1] == czechArray[2][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][1] == czechArray[3][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][1] == czechArray[3][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][1] == czechArray[3][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][1] == czechArray[2][0]){
	    			cool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		if(czechArray[3][2] == czechArray[0][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][2] == czechArray[1][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][2] == czechArray[2][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][2] == czechArray[3][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][2] == czechArray[3][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][2] == czechArray[3][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][2] == czechArray[2][3]){
	    			cool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		if(czechArray[3][3] == czechArray[3][0]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][3] == czechArray[3][1]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][3] == czechArray[3][2]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][3] == czechArray[0][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][3] == czechArray[1][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][3] == czechArray[2][3]){
	    			cool = false;
	    		}
	    		else if (czechArray[3][3] == czechArray[2][2]){
	    			cool = false;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    	TextView t=(TextView)findViewById(R.id.LEVELONEtextView);
	    	
	    		if(cool == true)
	    		{
		    		t.setText("Your answer is correct!");
		    	}
	    		else
		    	{
		    		t.setText("Sorry, your answer is wrong!");
		    	}
	    		
	    		//String.valueOf(czechArray[0][0])
	    		
	    		
	    		
	    		
	    	}
		        
		        
	    });
	        
		        
		        
	}
}