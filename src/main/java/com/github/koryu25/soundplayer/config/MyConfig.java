package com.github.koryu25.soundplayer.config;

import com.github.koryu25.soundplayer.SoundPlayer;

public class MyConfig extends CustomConfig {

    private float defaultVolume;
    private float defaultPitch;

    private float volumeDifferent;
    private float pitchDifferent;

    public MyConfig(SoundPlayer main) {
        super(main, "config.yml");
        load();
    }

    public void load() {
        defaultVolume = (float) getConfig().getDouble("default.volume");
        defaultPitch = (float) getConfig().getDouble("default.pitch");
        volumeDifferent = (float) getConfig().getDouble("different.volume");
        pitchDifferent = (float) getConfig().getDouble("different.pitch");
    }

    // Getter
    public float getDefaultVolume() {
        return defaultVolume;
    }
    public float getDefaultPitch() {
        return defaultPitch;
    }
    public float getVolumeDifferent() {
        return volumeDifferent;
    }
    public float getPitchDifferent() {
        return pitchDifferent;
    }
}