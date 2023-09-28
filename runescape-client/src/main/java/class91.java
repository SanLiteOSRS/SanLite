import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public enum class91 implements class386 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	field1106(0, -1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	field1099(1, 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	field1100(2, 7),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	field1102(3, 8),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	field1107(4, 9);

	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1237270747
	)
	final int field1101;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1410090177
	)
	final int field1104;

	class91(int var3, int var4) {
		this.field1101 = var3; // L: 20
		this.field1104 = var4; // L: 21
	} // L: 22

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1104; // L: 26
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Liz;",
		garbageValue = "1356482974"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 79
		if (var1 != null) { // L: 80
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0); // L: 81
			var1 = new ObjectComposition(); // L: 82
			var1.id = var0; // L: 83
			if (var2 != null) { // L: 84
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 85
			if (var1.isSolid) { // L: 86
				var1.interactType = 0; // L: 87
				var1.boolean1 = false; // L: 88
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 90
			return var1; // L: 91
		}
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "48"
	)
	static void method2349(int var0, int var1, int var2) {
		if (var0 != 0) { // L: 3837
			int var3 = var0 >> 8; // L: 3838
			int var4 = var0 >> 4 & 7; // L: 3839
			int var5 = var0 & 15; // L: 3840
			Client.soundEffectIds[Client.soundEffectCount] = var3; // L: 3841
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4; // L: 3842
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3843
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3844
			int var6 = (var1 - 64) / 128; // L: 3845
			int var7 = (var2 - 64) / 128; // L: 3846
			Client.soundLocations[Client.soundEffectCount] = var5 + (var7 << 8) + (var6 << 16); // L: 3847
			++Client.soundEffectCount; // L: 3848
		}
	} // L: 3849

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "74"
	)
	static void method2347() {
		Client.menuOptionsCount = 0; // L: 9280
		Client.isMenuOpen = false; // L: 9281
	} // L: 9282
}
