import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class140 extends class142 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 1751161965949237267L
	)
	long field1618;
	@ObfuscatedName("an")
	String field1617;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class140(class145 var1) {
		this.this$0 = var1;
		this.field1618 = -1L; // L: 74
		this.field1617 = null; // L: 75
	} // L: 77

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	void vmethod3381(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 80
			--var1.offset; // L: 81
			this.field1618 = var1.readLong(); // L: 82
		}

		this.field1617 = var1.readStringCp1252NullTerminatedOrNull(); // L: 84
	} // L: 85

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	void vmethod3382(ClanSettings var1) {
		var1.method3207(this.field1618, this.field1617, 0); // L: 88
	} // L: 89

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnq;B)V",
		garbageValue = "37"
	)
	public static void method3112(AbstractArchive var0) {
		EnumComposition.EnumDefinition_archive = var0; // L: 25
	} // L: 26

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Lmb;III)V",
		garbageValue = "-1010047426"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 11110
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 11111
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 11112
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 11113
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 11114
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 11115
		}

		if (var0.yAlignment == 0) { // L: 11116
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 11117
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 11118
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 11119
		} else if (var0.yAlignment == 4) { // L: 11120
			var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height) / 2;
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 11121
		}

	} // L: 11122
}
