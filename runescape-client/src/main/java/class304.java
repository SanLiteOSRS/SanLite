import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
public class class304 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("musicPatchesArchive")
	public static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("musicSamplesArchive")
	public static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1623558825
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("ah")
	static AtomicBoolean field3389;
	@ObfuscatedName("ap")
	static ThreadPoolExecutor field3390;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1468220863
	)
	public static int field3391;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 539438335
	)
	public static int field3394;
	@ObfuscatedName("ao")
	static final List field3393;
	@ObfuscatedName("ja")
	@Export("regions")
	static int[] regions;

	static {
		musicPlayerStatus = 0; // L: 20
		field3389 = null; // L: 29
		field3390 = null; // L: 30
		field3391 = -1; // L: 31
		field3394 = -1; // L: 32
		field3393 = new ArrayList(); // L: 33
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-710467978"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		Decimator.scrollBarSprites[0].drawAt(var0, var1); // L: 10915
		Decimator.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 10916
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field727); // L: 10917
		int var5 = var3 * (var3 - 32) / var4; // L: 10918
		if (var5 < 8) { // L: 10919
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 10920
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field640); // L: 10921
		Rasterizer2D.method9302(var0, var6 + var1 + 16, var5, Client.field562); // L: 10922
		Rasterizer2D.method9302(var0 + 1, var6 + var1 + 16, var5, Client.field562); // L: 10923
		Rasterizer2D.method9300(var0, var6 + var1 + 16, 16, Client.field562); // L: 10924
		Rasterizer2D.method9300(var0, var6 + var1 + 17, 16, Client.field562); // L: 10925
		Rasterizer2D.method9302(var0 + 15, var6 + var1 + 16, var5, Client.field561); // L: 10926
		Rasterizer2D.method9302(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field561); // L: 10927
		Rasterizer2D.method9300(var0, var5 + var6 + var1 + 15, 16, Client.field561); // L: 10928
		Rasterizer2D.method9300(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field561); // L: 10929
	} // L: 10930
}
