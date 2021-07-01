package raynjire.com.objectanimations;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener
{
    String selectedAnimation;
    Animation animation;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Spinner listAnimation = findViewById(R.id.AnimationList);
        String[] items = new String[] {"Blinking Animation", "Bounce Animation", "Fade In Animation", "Fade Out Animation", "Object Move Animation", "Rotate Animation", "Sequential Animation", "Slide Up Animation", "Slide Down Animation", "Together Animation", "Zoom In Animation", "Zoom Out Animation"};
        
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        listAnimation.setAdapter(adapter);
        listAnimation.setOnItemSelectedListener(this);
        
    }
    
    @Override
    public void onClick(View objClicked)
    {
        try
        {
            ImageView imgLogo = (ImageView) findViewById(R.id.IMGLogo);
            
            switch(objClicked.getId())
            {
                case R.id.BTNAnimate:
                    switch(selectedAnimation)
                    {
                        case "Blinking Animation":
                            animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blinking_animation);
                            imgLogo.startAnimation(animation);
                            
                            break;
                        
                        case "Bounce Animation":
                            animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce_animation);
                            imgLogo.startAnimation(animation);
                            
                            break;
                        
                        case "Fade In Animation":
                            animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in_animation);
                            imgLogo.startAnimation(animation);
                            
                            break;
                        
                        case "Fade Out Animation":
                            animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out_animation);
                            imgLogo.startAnimation(animation);
                            
                            break;
                        
                        case "Object Move Animation":
                            animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.object_move_animation);
                            imgLogo.startAnimation(animation);
                            
                            break;
                        
                        case "Rotate Animation":
                            animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate_animation);
                            imgLogo.startAnimation(animation);
                            
                            break;
                        
                        case "Sequential Animation":
                            animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.sequential_animation);
                            imgLogo.startAnimation(animation);
                            
                            break;
                        
                        case "Slide Up Animation":
                            animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_up_animation);
                            imgLogo.startAnimation(animation);
                            
                            break;
                        
                        case "Slide Down Animation":
                            animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_down_animation);
                            imgLogo.startAnimation(animation);
                            
                            break;
                        
                        case "Together Animation":
                            animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.together_animation);
                            imgLogo.startAnimation(animation);
                            
                            break;
                        
                        case "Zoom In Animation":
                            animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_in_animation);
                            imgLogo.startAnimation(animation);
                            
                            break;
                        
                        case "Zoom Out Animation":
                            animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_out_animation);
                            imgLogo.startAnimation(animation);
                            
                            break;
                        
                    }
                    
                    break;
            }
        }
        
        catch(Exception e)
        {
            new AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("On Create Method Error\n" + e.getMessage())
                    .setIcon(android.R.drawable.ic_dialog_alert);
            
        }
    }
    
    @Override
    public void onItemSelected(AdapterView<?> parent, View objClicked, int position, long id)
    {
        try
        {
            selectedAnimation = parent.getItemAtPosition(position).toString();
            System.out.println(selectedAnimation);
            
        }
        
        catch(Exception e)
        {
            new AlertDialog.Builder(this)
                    .setTitle("Selected Item Error")
                    .setMessage(objClicked.getId() + " Selected Item Error\n" + e.getMessage())
                    .setIcon(android.R.drawable.ic_dialog_alert);
            
        }
    }
    
    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {
        //Do Nothing
    }
}