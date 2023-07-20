import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class133 implements class124 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -896189893
	)
	static int field1593;

	@ObfuscatedName("aw")
	static double method3042(double var0) {
		return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 9
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2100564809"
	)
	static void method3041() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 30
			if (var0.stream1 != null) { // L: 31
				SecureRandomCallable.pcmStreamMixer.removeSubStream(var0.stream1); // L: 32
				var0.stream1 = null; // L: 33
			}

			if (var0.stream2 != null) { // L: 35
				SecureRandomCallable.pcmStreamMixer.removeSubStream(var0.stream2); // L: 36
				var0.stream2 = null; // L: 37
			}
		}

		ObjectSound.objectSounds.clear(); // L: 40
	} // L: 41

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lmt;I)I",
		garbageValue = "-1372153517"
	)
	static int method3040(Widget var0) {
		if (var0.type != 11) { // L: 1559
			Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 1560
			return 1; // L: 1561
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1563
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var0.method6461(var1); // L: 1564
			return 1; // L: 1565
		}
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static final void method3043() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 5058 5059 5066
			if (var0.plane == class36.Client_plane && !var0.isFinished) { // L: 5060
				if (Client.cycle >= var0.cycleStart) { // L: 5061
					var0.advance(Client.field702); // L: 5062
					if (var0.isFinished) { // L: 5063
						var0.remove();
					} else {
						UserComparator5.scene.drawEntity(var0.plane, var0.x, var0.y, var0.z, 60, var0, 0, -1L, false); // L: 5064
					}
				}
			} else {
				var0.remove();
			}
		}

	} // L: 5068
}
