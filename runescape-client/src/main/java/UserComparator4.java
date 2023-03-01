import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("d")
	@Export("userHomeDirectory")
	public static String userHomeDirectory;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -401917761
	)
	static int field1429;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Loa;Loa;B)I",
		garbageValue = "35"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1187900253"
	)
	static void method2902() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 30
			if (var0.stream1 != null) { // L: 31
				class209.pcmStreamMixer.removeSubStream(var0.stream1); // L: 32
				var0.stream1 = null; // L: 33
			}

			if (var0.stream2 != null) { // L: 35
				class209.pcmStreamMixer.removeSubStream(var0.stream2); // L: 36
				var0.stream2 = null; // L: 37
			}
		}

		ObjectSound.objectSounds.clear(); // L: 40
	} // L: 41

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "-992361699"
	)
	static int method2909(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2699
			var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2700
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.field702.method4143(var3) ? 1 : 0; // L: 2701
			return 1; // L: 2702
		} else if (var0 == 3501) { // L: 2704
			var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2705
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.field702.method4142(var3) ? 1 : 0; // L: 2706
			return 1; // L: 2707
		} else if (var0 == 3502) { // L: 2709
			var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2710
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.field702.method4157(var3) ? 1 : 0; // L: 2711
			return 1; // L: 2712
		} else {
			return 2; // L: 2714
		}
	}
}
