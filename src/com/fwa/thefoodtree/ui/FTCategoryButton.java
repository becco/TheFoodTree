package com.fwa.thefoodtree.ui;


import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.fwa.thefoodtree.R;

public class FTCategoryButton extends RelativeLayout
{
	private TextView buttonText;
	private ImageView buttonIcon;



	public FTCategoryButton(Context context)
	{
		this(context, null);
	}

	public FTCategoryButton(Context context, AttributeSet attrs) 
	{
		this(context, attrs, 0);
	}

	public FTCategoryButton(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);



		LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		layoutInflater.inflate(R.layout.ui_category_button, this);
		this.buttonText = (TextView) findViewById(R.id.buttonText);
		this.buttonIcon = (ImageView) findViewById(R.id.buttonIcon);



//		TypedArray styledAttributes = context.obtainStyledAttributes(attrs, R.styleable.VFDashboardButton);
//		final int styledAttributesCount = styledAttributes.getIndexCount();
//		for (int index = 0; index < styledAttributesCount; ++index)
//		{
//			int attribute = styledAttributes.getIndex(index);
//			switch (attribute)
//			{
//				case R.styleable.VFDashboardButton_buttonText:
//					if (this.buttonText != null) 
//					{
//						this.buttonText.setText(styledAttributes.getString(attribute)); 
//						if (!this.isInEditMode())
//						{
//							Typeface fontVodafoneRegularBold = Typeface.createFromAsset(((Activity)getContext()).getAssets(), "fonts/VodafoneRg/VodafoneRgBd.ttf"); 
//							this.buttonText.setTypeface(fontVodafoneRegularBold); 
//						}
//					}
//					break;
//				case R.styleable.VFDashboardButton_buttonIcon:
//					if (this.buttonIcon != null) { this.buttonIcon.setImageDrawable(styledAttributes.getDrawable(attribute)); }
//					break;
//			}
//		}
//		styledAttributes.recycle();



		this.setFocusable(true);
		this.setClickable(true);

		final float scale = getResources().getDisplayMetrics().density;
		int padding = (int) (10 * scale + 0.5f);
		this.setPadding(padding, padding, padding, padding);
		//this.setBackgroundResource(R.drawable.button_dashboard);
	}
}

