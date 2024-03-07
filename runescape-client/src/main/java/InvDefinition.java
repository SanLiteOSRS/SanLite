import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 80243253
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	InvDefinition() {
		this.size = 0; // L: 12
	} // L: 14

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;B)V",
		garbageValue = "25"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.decodeNext(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "1333994219"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) { // L: 39
			this.size = var1.readUnsignedShort();
		}

	} // L: 41

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2122360200"
	)
	static final int method3541() {
		return ViewportMouse.ViewportMouse_x; // L: 107
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-116"
	)
	static void method3540(int var0) {
		SequenceDefinition var1 = MilliClock.SequenceDefinition_get(var0); // L: 12998
		if (var1.isCachedModelIdSet()) { // L: 12999
			int var3 = var1.SequenceDefinition_cachedModelId; // L: 13003
			class140 var5 = (class140)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var3); // L: 13007
			class140 var4;
			if (var5 != null) { // L: 13008
				var4 = var5; // L: 13009
			} else {
				var5 = class93.method2440(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var3, false); // L: 13012
				if (var5 != null) {
					SequenceDefinition.SequenceDefinition_cachedModel.put(var5, (long)var3); // L: 13013
				}

				var4 = var5; // L: 13014
			}

			int var2;
			if (var4 == null) { // L: 13017
				var2 = 2; // L: 13018
			} else {
				var2 = var4.method3160() ? 0 : 1; // L: 13021
			}

			if (var2 == 2) { // L: 13023
				Client.field826.add(var1.SequenceDefinition_cachedModelId); // L: 13024
			}

		}
	} // L: 13000 13026
}
