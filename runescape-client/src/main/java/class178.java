import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class178 {
	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("aw")
	public String field1866;
	@ObfuscatedName("ay")
	public float[] field1867;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1275780849
	)
	public int field1863;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1774555443
	)
	public int field1870;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 111512691
	)
	public int field1869;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	final class171 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgq;)V"
	)
	class178(class171 var1) {
		this.this$0 = var1;
		this.field1867 = new float[4]; // L: 340
		this.field1863 = 1; // L: 341
		this.field1870 = 1; // L: 342
		this.field1869 = 0; // L: 343
	} // L: 345

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "238"
	)
	static void method3612() {
		if (Client.field596 && class27.localPlayer != null) { // L: 12797
			int var0 = class27.localPlayer.pathX[0]; // L: 12798
			int var1 = class27.localPlayer.pathY[0]; // L: 12799
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) { // L: 12800
				return;
			}

			class151.oculusOrbFocalPointX = class27.localPlayer.x; // L: 12801
			int var2 = class291.getTileHeight(class27.localPlayer.x, class27.localPlayer.y, BuddyRankComparator.Client_plane) - Client.camFollowHeight; // L: 12802
			if (var2 < SecureRandomFuture.field981) { // L: 12803
				SecureRandomFuture.field981 = var2;
			}

			class154.oculusOrbFocalPointY = class27.localPlayer.y; // L: 12804
			Client.field596 = false; // L: 12805
		}

	} // L: 12807
}
