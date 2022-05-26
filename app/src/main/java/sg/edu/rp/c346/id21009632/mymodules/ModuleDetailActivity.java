package sg.edu.rp.c346.id21009632.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView moduleName;
    TextView moduleCode;
    TextView venue;
    TextView yearAndSem;
    Button backButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        moduleName = findViewById(R.id.moduleName);
        moduleCode = findViewById(R.id.moduleCode);
        venue = findViewById(R.id.venue);
        yearAndSem = findViewById(R.id.yearAndSem);
        backButton = findViewById(R.id.backToMyModules);


        Intent intentReceived = getIntent();
        int value = intentReceived.getIntExtra("moduleNo", 0);

        if (value == 1) {
            moduleName.setText("ANDROID PROGRAMMING");
            moduleCode.setText("Module Code\nC346");
            venue.setText("Venue\nW66M");
            yearAndSem.setText("Academic Year: 2020\nSemester: 1\nModule Credit: 4");
        } else if (value == 2) {
            moduleName.setText("IPAD PROGRAMMING");
            moduleCode.setText("Module Code\nC349");
            venue.setText("Venue\nE55K");
            yearAndSem.setText("Academic Year: 2020\nSemester: 1\nModule Credit: 4");
        }

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}