package com.fwa.thefoodtree.ui;


import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.fwa.thefoodtree.R;

public class FTAlphabetButton extends RelativeLayout
{
	private TextView alphabetButtonText;

	public FTAlphabetButton(Context context)
	{
		this(context, null);
	}

	public FTAlphabetButton(Context context, AttributeSet attrs) 
	{
		this(context, attrs, 0);
	}

	public FTAlphabetButton(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);



		LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		layoutInflater.inflate(R.layout.ui_alphabet_button, this);
		this.alphabetButtonText = (TextView) findViewById(R.id.alphabetButtonText);



		TypedArray styledAttributes = context.obtainStyledAttributes(attrs, R.styleable.FTAlphabetButton);
		final int styledAttributesCount = styledAttributes.getIndexCount();
		for (int index = 0; index < styledAttributesCount; ++index)
		{
			int attribute = styledAttributes.getIndex(index);
			switch (attribute)
			{
				case R.styleable.FTAlphabetButton_alphabetButtonText:
					if (this.alphabetButtonText != null) 
					{
						this.alphabetButtonText.setText(styledAttributes.getString(attribute)); 
						if (!this.isInEditMode())
						{
//							Typeface fontVodafoneRegularBold = Typeface.createFromAsset(((Activity)getContext()).getAssets(), "fonts/VodafoneRg/VodafoneRgBd.ttf"); 
//							this.alphabetButtonText.setTypeface(fontVodafoneRegularBold); 
						}
					}
					break;
				
			}
		}
		styledAttributes.recycle();



		this.setFocusable(true);
		this.setClickable(true);

		final float scale = getResources().getDisplayMetrics().density;
		int padding = (int) (10 * scale + 0.5f);
		this.setPadding(padding, padding, padding, padding);
		//this.setBackgroundResource(R.drawable.button_dashboard);
	}
}

