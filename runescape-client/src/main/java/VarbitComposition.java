import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("VarbitDefinition_cached")
	static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		signature = "[Llp;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -416955877
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -740697079
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -427959509
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	VarbitComposition() {
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lkf;I)V",
		garbageValue = "2006870580"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Lkf;II)V",
		garbageValue = "1701572620"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Ljava/applet/Applet;Ljava/lang/String;I)V",
		garbageValue = "1125902282"
	)
	public static void method4593(Applet var0, String var1) {
		class60.applet = var0;
		if (var1 != null) {
			class60.field451 = var1;
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-852003243"
	)
	static int method4596(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}
}
