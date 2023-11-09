import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
public class class297 {
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	UrlRequest field3407;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	SpritePixels field3406;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ldk;)V"
	)
	class297(String var1, UrlRequester var2) {
		try {
			this.field3407 = var2.request(new URL(var1)); // L: 16
		} catch (MalformedURLException var4) { // L: 18
			this.field3407 = null; // L: 19
		}

	} // L: 21

	@ObfuscatedSignature(
		descriptor = "(Lde;)V"
	)
	class297(UrlRequest var1) {
		this.field3407 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Lri;",
		garbageValue = "-100"
	)
	SpritePixels method5722() {
		if (this.field3406 == null && this.field3407 != null && this.field3407.isDone()) { // L: 28
			if (this.field3407.getResponse() != null) { // L: 29
				this.field3406 = class26.method394(this.field3407.getResponse()); // L: 30
			}

			this.field3407 = null; // L: 32
		}

		return this.field3406; // L: 34
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1821514643"
	)
	public static int method5726(int var0) {
		if (var0 > 0) { // L: 228
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 229 230
		}
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "501827180"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12665
		short[] var2 = new short[16]; // L: 12666
		int var3 = 0; // L: 12667

		for (int var4 = 0; var4 < WorldMapArchiveLoader.ItemComposition_fileCount; ++var4) { // L: 12668
			ItemComposition var9 = MidiPcmStream.ItemComposition_get(var4); // L: 12669
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12670 12671 12672
				if (var3 >= 250) { // L: 12673
					MilliClock.foundItemIdCount = -1; // L: 12674
					Players.foundItemIds = null; // L: 12675
					return; // L: 12676
				}

				if (var3 >= var2.length) { // L: 12678
					short[] var6 = new short[var2.length * 2]; // L: 12679

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12680
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12681
				}

				var2[var3++] = (short)var4; // L: 12683
			}
		}

		Players.foundItemIds = var2; // L: 12685
		FriendLoginUpdate.foundItemIndex = 0; // L: 12686
		MilliClock.foundItemIdCount = var3; // L: 12687
		String[] var8 = new String[MilliClock.foundItemIdCount]; // L: 12688

		for (int var5 = 0; var5 < MilliClock.foundItemIdCount; ++var5) { // L: 12689
			var8[var5] = MidiPcmStream.ItemComposition_get(var2[var5]).name;
		}

		NameableContainer.method7442(var8, Players.foundItemIds); // L: 12690
	} // L: 12691
}
