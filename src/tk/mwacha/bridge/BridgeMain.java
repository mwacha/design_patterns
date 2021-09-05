package tk.mwacha.bridge;

import tk.mwacha.bridge.platforms.Facebook;
import tk.mwacha.bridge.platforms.IPlatform;
import tk.mwacha.bridge.platforms.TwitchTV;
import tk.mwacha.bridge.platforms.YouTube;
import tk.mwacha.bridge.transmissions.AdvancedLive;
import tk.mwacha.bridge.transmissions.Live;

public class BridgeMain {
    public static void main(String[] args) {
        startLive(new YouTube());
        startLive(new TwitchTV());
        startLive(new Facebook());
    }

    public static void startLive(IPlatform platform) {
//        System.out.println("...aguarde");
//        Live live = new Live(platform);
//        live.broadcasting();
//        live.result();
        System.out.println("Transmissão avançada...aguarde");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();
    }
}
