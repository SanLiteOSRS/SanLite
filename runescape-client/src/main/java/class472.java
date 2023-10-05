import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
public abstract class class472 implements class294 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	class517 field4816;

	class472(int var1) {
	} // L: 13

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;IS)V",
		garbageValue = "6664"
	)
	abstract void vmethod8471(Buffer var1, int var2);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-1679983256"
	)
	public void method8465(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 43
			}

			class468 var3 = (class468)SequenceDefinition.findEnumerated(class30.method449(), var2); // L: 19
			if (var3 != null) { // L: 20
				switch(var3.field4809) { // L: 21
				case 0:
					int var5 = var1.readUnsignedByte(); // L: 30
					this.field4816 = Tile.method4516(var5); // L: 31
					if (this.field4816 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5); // L: 32
				case 1:
					var1.readStringCp1252NullCircumfixed(); // L: 35
					break; // L: 36
				case 2:
					class367[] var4 = new class367[]{class367.field4263, class367.field4260, class367.field4261, class367.field4259}; // L: 25
					SequenceDefinition.findEnumerated(var4, var1.readUnsignedByte()); // L: 27
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3); // L: 38
				}
			} else {
				this.vmethod8471(var1, var2); // L: 41
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1797957438"
	)
	boolean method8466() {
		return this.field4816 != null; // L: 48
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "1069039915"
	)
	Object method8470() {
		if (this.field4816 == class517.field5067) { // L: 52
			return 0; // L: 53
		} else if (this.field4816 == class517.field5066) { // L: 55
			return -1L; // L: 56
		} else {
			return this.field4816 == class517.field5065 ? "" : null; // L: 58 59 61
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Luf;",
		garbageValue = "-1429373012"
	)
	@Export("FillMode_values")
	public static class541[] FillMode_values() {
		return new class541[]{class541.field5222, class541.SOLID, class541.field5221}; // L: 15
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZB)I",
		garbageValue = "47"
	)
	static int method8475(int var0, Script var1, boolean var2) {
		if (var0 == 7463) { // L: 5126
			boolean var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 5127
			class330.method6204(var3); // L: 5128
			return 1; // L: 5129
		} else {
			return 2; // L: 5131
		}
	}
}
