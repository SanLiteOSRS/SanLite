import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class141 extends class143 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -8029390523243028603L
	)
	long field1642;
	@ObfuscatedName("ay")
	String field1643;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfr;)V"
	)
	class141(class146 var1) {
		this.this$0 = var1;
		this.field1642 = -1L; // L: 74
		this.field1643 = null; // L: 75
	} // L: 77

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "1"
	)
	void vmethod3412(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 80
			--var1.offset; // L: 81
			this.field1642 = var1.readLong(); // L: 82
		}

		this.field1643 = var1.readStringCp1252NullTerminatedOrNull(); // L: 84
	} // L: 85

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfx;B)V",
		garbageValue = "-72"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3233(this.field1642, this.field1643, 0); // L: 88
	} // L: 89

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;Lsa;B)Lsa;",
		garbageValue = "-36"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = UrlRequest.method2837(var2); // L: 18
			var1 = new IterableNodeHashTable(var3); // L: 19
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 21
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium(); // L: 23
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated()); // L: 25
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 26
			}

			var1.put((Node)var6, (long)var5); // L: 27
		}

		return var1; // L: 29
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)I",
		garbageValue = "-1334865028"
	)
	static int method3120(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 180
		int var2;
		if (var1 == 0) { // L: 182
			var2 = 0;
		} else if (var1 == 1) { // L: 183
			var2 = var0.readBits(5);
		} else if (var1 == 2) { // L: 184
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 185
		}

		return var2; // L: 186
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(Ldx;II)V",
		garbageValue = "-1017792324"
	)
	static final void method3119(Actor var0, int var1) {
		ReflectionCheck.worldToScreen(var0.x, var0.y, var1); // L: 5711
	} // L: 5712
}
