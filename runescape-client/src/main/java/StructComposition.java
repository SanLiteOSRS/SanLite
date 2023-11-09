import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("StructDefinition_archive")
	public static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64); // L: 13
	}

	StructComposition() {
	} // L: 16

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1826362534"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 29

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-141643144"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 33
			if (var2 == 0) { // L: 34
				return; // L: 37
			}

			this.decodeNext(var1, var2); // L: 35
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "-1580441618"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = World.readStringIntParameters(var1, this.params); // L: 40
		}

	} // L: 42

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1093251626"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return ScriptFrame.method1035(this.params, var1, var2); // L: 45
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)Ljava/lang/String;",
		garbageValue = "24965"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class132.method2837(this.params, var1, var2); // L: 49
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lhp;IIII)Z",
		garbageValue = "1712536122"
	)
	static final boolean method3544(Model var0, int var1, int var2, int var3) {
		boolean var4 = ViewportMouse.ViewportMouse_isInViewport; // L: 136
		if (!var4) { // L: 138
			return false;
		} else {
			Tile.method3936(); // L: 139
			int var5 = var0.xMid + var1; // L: 140
			int var6 = var2 + var0.yMid; // L: 141
			int var7 = var3 + var0.zMid; // L: 142
			int var8 = var0.xMidOffset; // L: 143
			int var9 = var0.yMidOffset; // L: 144
			int var10 = var0.zMidOffset; // L: 145
			int var11 = class141.field1634 - var5; // L: 146
			int var12 = ViewportMouse.field2593 - var6; // L: 147
			int var13 = class143.field1639 - var7; // L: 148
			if (Math.abs(var11) > var8 + UrlRequest.field1355) { // L: 149
				return false; // L: 150
			} else if (Math.abs(var12) > var9 + class123.field1517) { // L: 152
				return false; // L: 153
			} else if (Math.abs(var13) > var10 + class150.field1677) { // L: 155
				return false; // L: 156
			} else if (Math.abs(var13 * WorldMapCacheName.field2870 - var12 * ViewportMouse.field2599) > var10 * class123.field1517 + var9 * class150.field1677) { // L: 158
				return false; // L: 159
			} else if (Math.abs(var11 * ViewportMouse.field2599 - var13 * SoundCache.field322) > var10 * UrlRequest.field1355 + var8 * class150.field1677) { // L: 161
				return false; // L: 162
			} else {
				return Math.abs(var12 * SoundCache.field322 - var11 * WorldMapCacheName.field2870) <= var8 * class123.field1517 + var9 * UrlRequest.field1355; // L: 164
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IB)Ldk;",
		garbageValue = "1"
	)
	public static class122 method3543(int var0) {
		class122 var1 = (class122)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 388
		if (var1 != null) { // L: 389
			return var1;
		} else {
			var1 = class271.method5169(SequenceDefinition.SequenceDefinition_animationsArchive, GZipDecompressor.SequenceDefinition_skeletonsArchive, var0, false); // L: 390
			if (var1 != null) { // L: 391
				SequenceDefinition.SequenceDefinition_cachedModel.put(var1, (long)var0);
			}

			return var1; // L: 392
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "116"
	)
	static final int method3531(int var0, int var1) {
		if (var0 == -1) { // L: 1029
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1030
			if (var1 < 2) { // L: 1031
				var1 = 2;
			} else if (var1 > 126) { // L: 1032
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1033
		}
	}
}
