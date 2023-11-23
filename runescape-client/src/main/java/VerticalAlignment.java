import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements class383 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	field1970(2, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	field1972(1, 2);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1916743455
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1795857937
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 20
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnt;",
		garbageValue = "1599103276"
	)
	public static StudioGame[] method3755() {
		return new StudioGame[]{StudioGame.game5, StudioGame.stellardawn, StudioGame.oldscape, StudioGame.game3, StudioGame.runescape, StudioGame.game4}; // L: 17
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IS)Lhw;",
		garbageValue = "4625"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 72
		if (var1 != null) { // L: 73
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 74
			var1 = new NPCComposition(); // L: 75
			var1.id = var0; // L: 76
			if (var2 != null) { // L: 77
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 78
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 79
			return var1; // L: 80
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-2145020206"
	)
	static int method3753(int var0, Script var1, boolean var2) {
		return 2; // L: 5110
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-52"
	)
	static final void method3754(boolean var0) {
		if (var0) { // L: 3015
			Client.field525 = Login.field920 ? class124.field1469 : class124.field1471; // L: 3016
		} else {
			Client.field525 = WorldMapIcon_1.clientPreferences.method2566(Login.Login_username) ? class124.field1474 : class124.field1470; // L: 3019
		}

	} // L: 3021

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-66"
	)
	static void method3756() {
		if (Client.titleLoadingStage == 1) { // L: 12887
			Client.field585 = true; // L: 12888
		}

	} // L: 12890
}
