package myseekbar.seekbarsample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarActivity extends Activity implements SeekBar.OnSeekBarChangeListener{

    TextView mTextValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);

        final SeekBar seekBar = (SeekBar)findViewById(R.id.seek_bar);
        seekBar.setOnSeekBarChangeListener(this);

        mTextValue = (TextView) findViewById(R.id.text_value);
        mTextValue.setText("0");
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        mTextValue.setText(String.valueOf(seekBar.getProgress()));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
