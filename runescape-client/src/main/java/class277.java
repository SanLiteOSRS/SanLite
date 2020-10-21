import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
public class class277 {
	@ObfuscatedName("m")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1799040781"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field879 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (UrlRequester.getWindowedMode() == 1) {
			ByteArrayPool.client.setMaxCanvasSize(765, 503);
		} else {
			ByteArrayPool.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25) {
			Actor.method1855();
		}

	}
}
