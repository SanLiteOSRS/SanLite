import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 564473995
	)
	static int field474;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = 1244134597
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 501950891
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("av")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("as")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;ZI)V",
		garbageValue = "-1693429746"
	)
	public static void method1148(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		ObjectComposition.ObjectDefinition_archive = var0; // L: 73
		ObjectComposition.ObjectDefinition_modelsArchive = var1; // L: 74
		ObjectComposition.ObjectDefinition_isLowDetail = var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-722096780"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 63
		int[] var3 = new int[4]; // L: 64
		var2[0] = var0; // L: 65
		var3[0] = var1; // L: 66
		int var4 = 1; // L: 67

		for (int var5 = 0; var5 < 4; ++var5) { // L: 68
			if (World.World_sortOption1[var5] != var0) { // L: 69
				var2[var4] = World.World_sortOption1[var5]; // L: 70
				var3[var4] = World.World_sortOption2[var5]; // L: 71
				++var4; // L: 72
			}
		}

		World.World_sortOption1 = var2; // L: 75
		World.World_sortOption2 = var3; // L: 76
		ClanChannel.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 77
	} // L: 78
}
