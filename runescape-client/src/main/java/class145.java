import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class145 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 986235802482684067L
	)
	long field1635;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -769873593
	)
	int field1636;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	IterableNodeDeque field1637;

	@ObfuscatedSignature(
		descriptor = "(Ltz;)V"
	)
	public class145(Buffer var1) {
		this.field1636 = -1; // L: 9
		this.field1637 = new IterableNodeDeque(); // L: 10
		this.method3140(var1); // L: 28
	} // L: 29

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "-112"
	)
	void method3140(Buffer var1) {
		this.field1635 = var1.readLong();
		this.field1636 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 55
			Object var3;
			if (var2 == 3) {
				var3 = new class164(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class140(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class157(this);
			} else if (var2 == 4) {
				var3 = new class149(this);
			} else if (var2 == 6) {
				var3 = new class156(this);
			} else if (var2 == 5) { // L: 42
				var3 = new class141(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class146(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class139(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class143(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class160(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class166(this);
			} else if (var2 == 10) {
				var3 = new class152(this); // L: 48
			} else if (var2 == 11) { // L: 49
				var3 = new class147(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class151(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class161(this);
			}

			((class142)var3).vmethod3381(var1); // L: 53
			this.field1637.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;I)V",
		garbageValue = "376498717"
	)
	public void method3141(ClanSettings var1) {
		if (this.field1635 == var1.field1689 && this.field1636 == var1.field1699) { // L: 60
			for (class142 var2 = (class142)this.field1637.last(); var2 != null; var2 = (class142)this.field1637.previous()) { // L: 61
				var2.vmethod3382(var1); // L: 62
			}

			++var1.field1699; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1123792033"
	)
	static void method3139() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 30
			if (var0.stream1 != null) { // L: 31
				KitDefinition.pcmStreamMixer.removeSubStream(var0.stream1); // L: 32
				var0.stream1 = null; // L: 33
			}

			if (var0.stream2 != null) { // L: 35
				KitDefinition.pcmStreamMixer.removeSubStream(var0.stream2); // L: 36
				var0.stream2 = null; // L: 37
			}
		}

		ObjectSound.objectSounds.clear(); // L: 40
	} // L: 41

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "59"
	)
	public static boolean method3147(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 25
	}
}
