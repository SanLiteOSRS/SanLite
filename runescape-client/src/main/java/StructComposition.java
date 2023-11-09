import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("StructDefinition_archive")
	static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("StructDefinition_cached")
	public static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsc;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64); // L: 13
	}

	StructComposition() {
	} // L: 16

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1344474255"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V",
		garbageValue = "805584673"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) { // L: 38
				return; // L: 41
			}

			this.decodeNext(var1, var2); // L: 39
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltc;II)V",
		garbageValue = "1732833436"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = WorldMapRegion.readStringIntParameters(var1, this.params); // L: 44
		}

	} // L: 46

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "20384192"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 50
		int var3;
		if (var4 == null) { // L: 52
			var3 = var2; // L: 53
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 56
			if (var5 == null) { // L: 57
				var3 = var2; // L: 58
			} else {
				var3 = var5.integer; // L: 61
			}
		}

		return var3; // L: 63
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "8"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 68
		String var3;
		if (var4 == null) { // L: 70
			var3 = var2; // L: 71
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 74
			if (var5 == null) { // L: 75
				var3 = var2; // L: 76
			} else {
				var3 = (String)var5.obj; // L: 79
			}
		}

		return var3; // L: 81
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lhy;",
		garbageValue = "-1837801278"
	)
	public static FloorOverlayDefinition method3821(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0); // L: 26
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
			var1 = new FloorOverlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0);
			return var1; // L: 33
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILqe;Lnv;B)V",
		garbageValue = "70"
	)
	static void method3818(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 18
		var3.type = 1; // L: 19
		var3.key = (long)var0; // L: 20
		var3.archiveDisk = var1; // L: 21
		var3.archive = var2; // L: 22
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 23
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 24
		} // L: 25

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 27
			if (ArchiveDiskActionHandler.field4237 == 0) { // L: 28
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 29
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 30
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 31
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 32
			}

			ArchiveDiskActionHandler.field4237 = 600; // L: 34
		}
	} // L: 37

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(Lhg;IIII)V",
		garbageValue = "208512649"
	)
	static void method3820(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && WorldMapManager.clientPreferences.method2444() != 0) { // L: 3678
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3679
				int var4 = var0.soundEffects[var1]; // L: 3680
				if (var4 != 0) { // L: 3684
					int var7 = var4 >> 8; // L: 3685
					int var8 = var4 >> 4 & 7; // L: 3686
					int var9 = var4 & 15; // L: 3687
					Client.soundEffectIds[Client.soundEffectCount] = var7; // L: 3688
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8; // L: 3689
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3690
					Client.soundEffects[Client.soundEffectCount] = null; // L: 3691
					int var10 = (var2 - 64) / 128; // L: 3692
					int var11 = (var3 - 64) / 128; // L: 3693
					Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16); // L: 3694
					++Client.soundEffectCount; // L: 3695
				}

			}
		}
	} // L: 3697
}
