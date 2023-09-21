import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("ParamComposition_cached")
	static EvictingDualNodeHashTable ParamComposition_cached;
	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("ak")
	@Export("type")
	char type;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1689580317
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("ao")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("ah")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamComposition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamComposition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-560254991"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 35

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-721387460"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 39
			if (var2 == 0) { // L: 40
				return; // L: 43
			}

			this.decodeNext(var1, var2); // L: 41
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)V",
		garbageValue = "-1665298229"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 46
			this.type = class149.method3180(var1.readByte()); // L: 47
		} else if (var2 == 2) { // L: 49
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false; // L: 50
		} else if (var2 == 5) { // L: 51
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 53

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-19"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 56
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lrb;",
		garbageValue = "-91337538"
	)
	public static class465 method3936() {
		synchronized(class465.field4783) { // L: 27
			if (class465.field4781 == 0) { // L: 28
				return new class465();
			} else {
				class465.field4783[--class465.field4781].method8354(); // L: 30
				return class465.field4783[class465.field4781]; // L: 31
			}
		}
	}
}
