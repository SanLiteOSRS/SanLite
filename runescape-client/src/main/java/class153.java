import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public class class153 extends class143 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1888822411
	)
	int field1724;
	@ObfuscatedName("ae")
	String field1722;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class153(class146 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "209179459"
	)
	void vmethod3337(Buffer var1) {
		this.field1724 = var1.readInt(); // L: 326
		this.field1722 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "73"
	)
	void vmethod3339(ClanSettings var1) {
		var1.method3196(this.field1724, this.field1722); // L: 331
	} // L: 332

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1017445786"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 64
		int[] var3 = new int[4]; // L: 65
		var2[0] = var0; // L: 66
		var3[0] = var1; // L: 67
		int var4 = 1; // L: 68

		for (int var5 = 0; var5 < 4; ++var5) { // L: 69
			if (World.World_sortOption1[var5] != var0) { // L: 70
				var2[var4] = World.World_sortOption1[var5]; // L: 71
				var3[var4] = World.World_sortOption2[var5]; // L: 72
				++var4; // L: 73
			}
		}

		World.World_sortOption1 = var2; // L: 76
		World.World_sortOption2 = var3; // L: 77
		GameEngine.sortWorlds(class176.World_worlds, 0, class176.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 78
	} // L: 79

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "17"
	)
	public static void method3175() {
		KitDefinition.KitDefinition_cached.clear(); // L: 132
	} // L: 133

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1977866275"
	)
	static final void method3173(int var0, int var1, int var2, int var3) {
		Client.field651 = 0; // L: 5669
		int var4 = UrlRequester.baseX * 64 + (VarbitComposition.localPlayer.x >> 7); // L: 5670
		int var5 = class47.baseY * 64 + (VarbitComposition.localPlayer.y >> 7); // L: 5671
		if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) { // L: 5672
			Client.field651 = 1;
		}

		if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
			Client.field651 = 1; // L: 5673
		}

		if (Client.field651 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) { // L: 5674
			Client.field651 = 0;
		}

	} // L: 5676
}
