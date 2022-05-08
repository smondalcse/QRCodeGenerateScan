package com.sanatmondal.qrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {
    private Button btnQRCodeGenerate, btnQRCodeScan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnQRCodeGenerate = findViewById(R.id.btnQRCodeGenerate);
        btnQRCodeGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, QRCodeGenerateActivity.class);
                startActivity(intent);
            }
        });

        btnQRCodeScan = findViewById(R.id.btnQRCodeScan);
        btnQRCodeScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, QRCodeScanActivity.class);
                startActivity(intent);
            }
        });
    }
}