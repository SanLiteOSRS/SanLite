import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
public enum class268 implements Enumerated {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	field3537(-1),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	field3540(0),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	field3538(1),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	field3539(2);

	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1451177967
	)
	final int field3536;

	class268(int var3) {
		this.field3536 = var3;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907662946"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3536;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIILeg;IB)V",
		garbageValue = "2"
	)
	static void method4851(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0;
		var5.x = var1 * 128;
		var5.y = var2 * 128;
		int var6 = var3.sizeX;
		int var7 = var3.sizeY;
		if (var4 == 1 || var4 == 3) {
			var6 = var3.sizeY;
			var7 = var3.sizeX;
		}

		var5.field956 = (var6 + var1) * 128;
		var5.field957 = (var7 + var2) * 128;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field958 = var3.int4 * 128;
		var5.field961 = var3.int5;
		var5.field964 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field954 = var5.field961 + (int)(Math.random() * (double)(var5.field964 - var5.field961));
		}

	}
}
