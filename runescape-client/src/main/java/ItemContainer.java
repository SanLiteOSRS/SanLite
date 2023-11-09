import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = -1275160227
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("sv")
	static boolean field1024;
	@ObfuscatedName("an")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("aw")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lhh;",
		garbageValue = "-707697126"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 37
		if (var1 != null) { // L: 38
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 39
			var1 = new SpotAnimationDefinition(); // L: 40
			var1.id = var0; // L: 41
			if (var2 != null) { // L: 42
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 43
			return var1; // L: 44
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lha;",
		garbageValue = "28"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 57
		if (var1 != null) { // L: 58
			return var1; // L: 59
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0); // L: 61
			var1 = new SequenceDefinition(); // L: 62
			if (var2 != null) { // L: 63
				var1.decode(new Buffer(var2)); // L: 64
			}

			var1.postDecode(); // L: 66
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 67
			return var1; // L: 68
		}
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(IIB)Ljava/lang/String;",
		garbageValue = "27"
	)
	static final String method2243(int var0, int var1) {
		int var2 = var1 - var0; // L: 9953
		if (var2 < -9) { // L: 9954
			return class383.colorStartTag(16711680);
		} else if (var2 < -6) { // L: 9955
			return class383.colorStartTag(16723968);
		} else if (var2 < -3) { // L: 9956
			return class383.colorStartTag(16740352);
		} else if (var2 < 0) { // L: 9957
			return class383.colorStartTag(16756736);
		} else if (var2 > 9) { // L: 9958
			return class383.colorStartTag(65280);
		} else if (var2 > 6) { // L: 9959
			return class383.colorStartTag(4259584);
		} else if (var2 > 3) { // L: 9960
			return class383.colorStartTag(8453888);
		} else {
			return var2 > 0 ? class383.colorStartTag(12648192) : class383.colorStartTag(16776960); // L: 9961 9962
		}
	}
}
