import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public class class7 {
	@ObfuscatedName("am")
	ExecutorService field10;
	@ObfuscatedName("ap")
	Future field11;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	final Buffer field12;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	final class3 field13;

	@ObfuscatedSignature(
		descriptor = "(Luk;Laj;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field10 = Executors.newSingleThreadExecutor(); // L: 10
		this.field12 = var1; // L: 16
		this.field13 = var2; // L: 17
		this.method50(); // L: 18
	} // L: 19

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1275905562"
	)
	public boolean method44() {
		return this.field11.isDone(); // L: 22
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "25"
	)
	public void method45() {
		this.field10.shutdown(); // L: 26
		this.field10 = null; // L: 27
	} // L: 28

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Luk;",
		garbageValue = "1"
	)
	public Buffer method46() {
		try {
			return (Buffer)this.field11.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "57"
	)
	void method50() {
		this.field11 = this.field10.submit(new class1(this, this.field12, this.field13)); // L: 40
	} // L: 41

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIILhg;II)V",
		garbageValue = "-867036510"
	)
	static void method47(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound(); // L: 74
		var5.plane = var0; // L: 75
		var5.x = var1 * 128; // L: 76
		var5.y = var2 * 128; // L: 77
		int var6 = var3.sizeX; // L: 78
		int var7 = var3.sizeY; // L: 79
		if (var4 == 1 || var4 == 3) { // L: 80
			var6 = var3.sizeY; // L: 81
			var7 = var3.sizeX; // L: 82
		}

		var5.maxX = (var6 + var1) * 128; // L: 84
		var5.maxY = (var7 + var2) * 128; // L: 85
		var5.soundEffectId = var3.ambientSoundId; // L: 86
		var5.field844 = var3.int7 * 16384; // L: 87
		var5.field834 = var3.int5; // L: 88
		var5.field840 = var3.int6; // L: 89
		var5.soundEffectIds = var3.soundEffectIds; // L: 90
		if (var3.transforms != null) { // L: 91
			var5.obj = var3; // L: 92
			var5.set(); // L: 93
		}

		ObjectSound.objectSounds.addFirst(var5); // L: 95
		if (var5.soundEffectIds != null) { // L: 96
			var5.field842 = var5.field834 + (int)(Math.random() * (double)(var5.field840 - var5.field834));
		}

	} // L: 97
}
