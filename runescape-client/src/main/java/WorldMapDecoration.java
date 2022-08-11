import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	static ClanSettings field2816;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -831845423
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2055574461
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1905026631
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("o")
	public static final void method4967(long var0) {
		if (var0 > 0L) { // L: 9
			if (var0 % 10L == 0L) { // L: 10
				Frames.method4305(var0 - 1L); // L: 11
				Frames.method4305(1L); // L: 12
			} else {
				Frames.method4305(var0); // L: 14
			}

		}
	} // L: 15

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lgx;",
		garbageValue = "2023361213"
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1086866361"
	)
	public static int method4969(int var0) {
		return class402.field4458[var0 & 16383]; // L: 37
	}
}
