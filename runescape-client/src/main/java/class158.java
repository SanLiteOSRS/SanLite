import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class158 extends class136 {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -3634695712178554237L
	)
	long field1812;
	@ObfuscatedName("e")
	String field1808;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	final class139 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	class158(class139 var1) {
		this.this$0 = var1;
		this.field1812 = -1L; // L: 194
		this.field1808 = null; // L: 195
	} // L: 197

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "1101327225"
	)
	void vmethod3349(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1812 = var1.readLong(); // L: 202
		}

		this.field1808 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lep;I)V",
		garbageValue = "839088249"
	)
	void vmethod3350(ClanSettings var1) {
		var1.method3174(this.field1812, this.field1808); // L: 208
	} // L: 209

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "120"
	)
	static final void method3335(int var0, int var1) {
		if (var0 < 128) { // L: 3707
			var0 = 128;
		}

		if (var0 > 383) { // L: 3708
			var0 = 383;
		}

		if (class97.cameraPitch < var0) { // L: 3709
			class97.cameraPitch = (var0 - class97.cameraPitch) * LoginScreenAnimation.field1283 / 1000 + class97.cameraPitch + class415.field4647; // L: 3710
			if (class97.cameraPitch > var0) { // L: 3711
				class97.cameraPitch = var0;
			}
		}

		if (class97.cameraPitch > var0) { // L: 3713
			class97.cameraPitch -= (class97.cameraPitch - var0) * LoginScreenAnimation.field1283 / 1000 + class415.field4647; // L: 3714
			if (class97.cameraPitch < var0) { // L: 3715
				class97.cameraPitch = var0;
			}
		}

		int var2 = var1 - class128.cameraYaw; // L: 3717
		if (var2 > 1024) { // L: 3718
			var2 -= 2048;
		}

		if (var2 < -1024) { // L: 3719
			var2 += 2048;
		}

		if (var2 > 0) { // L: 3720
			class128.cameraYaw = class128.cameraYaw + class415.field4647 + var2 * LoginScreenAnimation.field1283 / 1000; // L: 3721
			class128.cameraYaw &= 2047; // L: 3722
		}

		if (var2 < 0) { // L: 3724
			class128.cameraYaw -= -var2 * LoginScreenAnimation.field1283 / 1000 + class415.field4647; // L: 3725
			class128.cameraYaw &= 2047; // L: 3726
		}

		int var3 = var1 - class128.cameraYaw; // L: 3728
		if (var3 > 1024) { // L: 3729
			var3 -= 2048;
		}

		if (var3 < -1024) { // L: 3730
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 3731
			class128.cameraYaw = var1;
		}

	} // L: 3732
}
