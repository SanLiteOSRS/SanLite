import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
public class class70 {
	@ObfuscatedName("an")
	static final BigInteger field863;
	@ObfuscatedName("ao")
	static final BigInteger field867;

	static {
		field863 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"); // L: 20
		field867 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"); // L: 21
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lne;IIB)[Lsn;",
		garbageValue = "58"
	)
	public static SpritePixels[] method2046(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 55
		boolean var3;
		if (var4 == null) { // L: 56
			var3 = false; // L: 57
		} else {
			class212.SpriteBuffer_decode(var4); // L: 60
			var3 = true; // L: 61
		}

		return !var3 ? null : ViewportMouse.method4752(); // L: 63 64
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lsy;II)V",
		garbageValue = "1835049871"
	)
	public static void method2049(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) { // L: 310
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 312
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 313
			} catch (Exception var3) { // L: 315
			}
		}

	} // L: 317

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1051942220"
	)
	static final void method2047(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 11641
		if (var0 != WorldMapSectionType.clientPreferences.method2440()) { // L: 11642
			if (WorldMapSectionType.clientPreferences.method2440() == 0 && Client.currentTrackGroupId != -1) { // L: 11643
				class163.method3352(class308.archive6, Client.currentTrackGroupId, 0, var0, false); // L: 11644
				Client.playingJingle = false; // L: 11645
			} else if (var0 == 0) { // L: 11647
				class258.method5232(); // L: 11648
				Client.playingJingle = false; // L: 11649
			} else if (class293.musicPlayerStatus != 0) { // L: 11652
				class368.musicTrackVolume = var0;
			} else {
				class293.midiPcmStream.setPcmStreamVolume(var0); // L: 11653
			}

			WorldMapSectionType.clientPreferences.method2428(var0); // L: 11655
		}

	} // L: 11657

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(II)Lst;",
		garbageValue = "745575289"
	)
	static class471 method2050(int var0) {
		class471 var1 = (class471)Client.Widget_cachedFonts.get((long)var0); // L: 12263
		if (var1 == null) { // L: 12264
			var1 = new class471(class320.field3708, var0); // L: 12265
		}

		return var1; // L: 12267
	}
}
