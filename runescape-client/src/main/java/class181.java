import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public abstract class class181 {
	@ObfuscatedName("ab")
	String field1891;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	final class170 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgu;Ljava/lang/String;)V"
	)
	class181(class170 var1, String var2) {
		this.this$0 = var1; // L: 371
		this.field1891 = var2; // L: 372
	} // L: 373

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-3"
	)
	public abstract int vmethod3520();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	public String vmethod3523() {
		return null; // L: 382
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2110261497"
	)
	public int vmethod3513() {
		return -1; // L: 386
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-28075"
	)
	public String method3510() {
		return this.field1891; // L: 376
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1786438112"
	)
	static void method3512() {
		Tiles.field998 = null; // L: 61
		Tiles.field993 = null; // L: 62
		Tiles.field994 = null; // L: 63
		WorldMapRectangle.field3005 = null; // L: 64
		Tiles.field999 = null; // L: 65
		Tiles.field995 = null; // L: 66
		Tiles.field996 = null; // L: 67
		class85.Tiles_hue = null; // L: 68
		Tiles.Tiles_saturation = null; // L: 69
		class209.Tiles_lightness = null; // L: 70
		MusicPatch.Tiles_hueMultiplier = null; // L: 71
		Tiles.field1004 = null; // L: 72
	} // L: 73

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lhi;I)Z",
		garbageValue = "1862791191"
	)
	static boolean method3524(ObjectComposition var0) {
		if (var0.transforms != null) { // L: 629
			int[] var1 = var0.transforms; // L: 631

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 632
				int var3 = var1[var2]; // L: 633
				ObjectComposition var4 = class59.getObjectDefinition(var3); // L: 635
				if (var4.mapIconId != -1) { // L: 636
					return true; // L: 637
				}
			}
		} else if (var0.mapIconId != -1) { // L: 643
			return true; // L: 644
		}

		return false; // L: 646
	}
}
