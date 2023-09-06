import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("StructDefinition_archive")
	public static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("StructDefinition_cached")
	public static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("am")
	@Export("ByteArrayPool_altSizeArrayCounts")
	static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64); // L: 13
	}

	StructComposition() {
	} // L: 16

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1093103177"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 29

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "-50"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "1817135134"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = Decimator.readStringIntParameters(var1, this.params); // L: 40
		}

	} // L: 42

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1339358564"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class14.method163(this.params, var1, var2); // L: 45
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "792481447"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 50
		String var3;
		if (var4 == null) { // L: 52
			var3 = var2; // L: 53
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 56
			if (var5 == null) { // L: 57
				var3 = var2; // L: 58
			} else {
				var3 = (String)var5.obj; // L: 61
			}
		}

		return var3; // L: 63
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IS)Lha;",
		garbageValue = "-32325"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 34
			var1 = new SpotAnimationDefinition(); // L: 35
			var1.id = var0; // L: 36
			if (var2 != null) { // L: 37
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 38
			return var1; // L: 39
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1529858789"
	)
	static final int method3845() {
		if (class449.clientPreferences.method2448()) { // L: 5131
			return HealthBar.Client_plane;
		} else {
			int var0 = class18.getTileHeight(NPCComposition.cameraX, class139.cameraZ, HealthBar.Client_plane); // L: 5132
			return var0 - class133.cameraY < 800 && (Tiles.Tiles_renderFlags[HealthBar.Client_plane][NPCComposition.cameraX >> 7][class139.cameraZ >> 7] & 4) != 0 ? HealthBar.Client_plane : 3; // L: 5133 5134
		}
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(Lmi;B)V",
		garbageValue = "-126"
	)
	static final void method3843(Widget var0) {
		int var1 = var0.contentType; // L: 12352
		if (var1 == 324) { // L: 12353
			if (Client.field632 == -1) { // L: 12354
				Client.field632 = var0.spriteId2; // L: 12355
				Client.field815 = var0.spriteId; // L: 12356
			}

			if (Client.playerAppearance.field3572 == 1) { // L: 12358
				var0.spriteId2 = Client.field632;
			} else {
				var0.spriteId2 = Client.field815; // L: 12359
			}

		} else if (var1 == 325) { // L: 12362
			if (Client.field632 == -1) { // L: 12363
				Client.field632 = var0.spriteId2; // L: 12364
				Client.field815 = var0.spriteId; // L: 12365
			}

			if (Client.playerAppearance.field3572 == 1) { // L: 12367
				var0.spriteId2 = Client.field815;
			} else {
				var0.spriteId2 = Client.field632; // L: 12368
			}

		} else if (var1 == 327) { // L: 12371
			var0.modelAngleX = 150; // L: 12372
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12373
			var0.modelType = 5; // L: 12374
			var0.modelId = 0; // L: 12375
		} else if (var1 == 328) { // L: 12378
			var0.modelAngleX = 150; // L: 12379
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12380
			var0.modelType = 5; // L: 12381
			var0.modelId = 1; // L: 12382
		}
	} // L: 12360 12369 12376 12383 12385
}
