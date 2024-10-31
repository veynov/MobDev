package ru.mirea.marininvp.mireaproject;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class PlayerWorker extends Worker {
    private static final String TAG = "PlayerWorker";
    private MediaPlayer mediaPlayer;

    public PlayerWorker(@NonNull Context context, @NonNull WorkerParameters params) {
        super(context, params);
    }

    @NonNull
    @Override
    public Result doWork() {
        try {
            Log.d(TAG, "doWork: start");
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bell_ringing);
            mediaPlayer.setLooping(false);
            mediaPlayer.start();
            while (mediaPlayer.isPlaying()) {
                Thread.sleep(1000);
            }

            mediaPlayer.release();
            Log.d(TAG, "doWork: end");
            return Result.success();
        } catch (Exception e) {
            Log.e(TAG, "Error during audio playback", e);
            return Result.failure();
        }
    }
}