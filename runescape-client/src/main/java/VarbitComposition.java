import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("ao")
	static final int[] field2078;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1552333755
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -227639777
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -476919085
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
		field2078 = new int[32]; // L: 15
		int var0 = 2; // L: 18

		for (int var1 = 0; var1 < 32; ++var1) { // L: 19
			field2078[var1] = var0 - 1; // L: 20
			var0 += var0; // L: 21
		}

	} // L: 23

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsy;B)V",
		garbageValue = "1"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return; // L: 35
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsy;II)V",
		garbageValue = "1007737801"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "20"
	)
	static final boolean method3770(char var0) {
		if (Character.isISOControl(var0)) { // L: 28
			return false;
		} else if (PlayerComposition.isAlphaNumeric(var0)) { // L: 29
			return true;
		} else {
			char[] var1 = class458.field4828; // L: 31

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) { // L: 32
				var3 = var1[var2]; // L: 33
				if (var0 == var3) { // L: 34
					return true;
				}
			}

			var1 = class458.field4831; // L: 38

			for (var2 = 0; var2 < var1.length; ++var2) { // L: 39
				var3 = var1[var2]; // L: 40
				if (var0 == var3) {
					return true; // L: 41
				}
			}

			return false; // L: 44
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Liw;",
		garbageValue = "1738184089"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 339
		if (var1 != null) { // L: 340
			return var1;
		} else {
			var1 = class125.method2956(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false); // L: 341
			if (var1 != null) { // L: 342
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1; // L: 343
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lcz;I)V",
		garbageValue = "833776818"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 2181
			Client.isMembersWorld = var0.isMembersOnly(); // L: 2182
			boolean var1 = var0.isMembersOnly(); // L: 2183
			if (var1 != VarcInt.ItemComposition_inMembersWorld) { // L: 2185
				ItemComposition.ItemComposition_cached.clear(); // L: 2187
				ItemComposition.ItemComposition_cachedModels.clear(); // L: 2188
				ItemComposition.ItemComposition_cachedSprites.clear(); // L: 2189
				VarcInt.ItemComposition_inMembersWorld = var1; // L: 2191
			}
		}

		if (var0.properties != Client.worldProperties) { // L: 2195
			class269.method5378(class143.archive8, var0.properties); // L: 2196
		}

		class188.worldHost = var0.host; // L: 2198
		Client.worldId = var0.id; // L: 2199
		Client.worldProperties = var0.properties; // L: 2200
		class290.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 2201
		Calendar.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 2202
		ClanSettings.currentPort = class290.worldPort; // L: 2203
	} // L: 2204

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1339711381"
	)
	static final void method3766(String var0, int var1) {
		PacketBufferNode var2 = UserComparator9.getPacketBufferNode(ClientPacket.field3108, Client.packetWriter.isaacCipher); // L: 228
		var2.packetBuffer.writeByte(WorldMapLabel.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 229
		var2.packetBuffer.method8782(var1); // L: 230
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 231
		Client.packetWriter.addNode(var2); // L: 232
	} // L: 233

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "93"
	)
	static final void method3769(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 8714
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 8715
				Client.field697[var4] = true;
			}
		}

	} // L: 8717
}
