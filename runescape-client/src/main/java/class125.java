import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
public class class125 extends class116 {
	@ObfuscatedName("i")
	String field1429;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class125(class119 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		this.field1429 = var1.readStringCp1252NullTerminated();
		var1.readInt();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.name = this.field1429;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-924468253"
	)
	public static void method2637() {
		class54.reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIILfe;II)V",
		garbageValue = "2132581539"
	)
	static void method2635(int var0, int var1, int var2, ObjectComposition var3, int var4) {
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

		var5.field771 = (var6 + var1) * 16384;
		var5.field772 = (var7 + var2) * 128;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field773 = var3.int7 * 128;
		var5.field767 = var3.int5;
		var5.field776 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field779 = var5.field767 + (int)(Math.random() * (double)(var5.field776 - var5.field767));
		}

	}
}
