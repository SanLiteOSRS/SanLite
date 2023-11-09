import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
public class class183 {
	@ObfuscatedName("ef")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("jw")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("ao")
	public short[] field1918;
	@ObfuscatedName("at")
	public short[] field1919;

	public class183(int var1) {
		ItemComposition var2 = InvDefinition.ItemComposition_get(var1); // L: 12
		if (var2.method4002()) { // L: 13
			this.field1918 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1918, 0, this.field1918.length); // L: 15
		}

		if (var2.method3955()) { // L: 17
			this.field1919 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1919, 0, this.field1919.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lhx;",
		garbageValue = "1562515394"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamComposition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0); // L: 27
			var1 = new ParamComposition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 30
			ParamComposition.ParamComposition_cached.put(var1, (long)var0); // L: 31
			return var1; // L: 32
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-1153015817"
	)
	static int method3546(int var0, Script var1, boolean var2) {
		if (var0 == 6809) { // L: 5085
			int var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 5086
			ObjectComposition var4 = WorldMapElement.getObjectDefinition(var3); // L: 5087
			Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 5088
			return 1; // L: 5089
		} else {
			return 2; // L: 5091
		}
	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1860309613"
	)
	static String method3545(String var0) {
		PlayerType[] var1 = MidiPcmStream.PlayerType_values(); // L: 12863

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12864
			PlayerType var3 = var1[var2]; // L: 12865
			if (var3.modIcon != -1 && var0.startsWith(Tile.method4373(var3.modIcon))) { // L: 12867 12868
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 12869
				break;
			}
		}

		return var0; // L: 12876
	}
}
