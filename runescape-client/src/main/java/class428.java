import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qd")
public abstract class class428 implements class268 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	class467 field4637;

	class428(int var1) {
	} // L: 13

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;IB)V",
		garbageValue = "-66"
	)
	abstract void vmethod7952(Buffer var1, int var2);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "-1069470771"
	)
	public void method7957(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 47
			}

			class424[] var3 = new class424[]{class424.field4632, class424.field4631, class424.field4629, class424.field4630}; // L: 21
			class424 var4 = (class424)SpriteMask.findEnumerated(var3, var2); // L: 23
			if (var4 != null) { // L: 24
				switch(var4.field4628) { // L: 25
				case 1:
					int var5 = var1.readUnsignedByte(); // L: 32
					this.field4637 = class458.method8343(var5); // L: 33
					if (this.field4637 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5); // L: 34
				case 2:
					var1.readStringCp1252NullCircumfixed(); // L: 27
					break;
				case 3:
					class333[] var6 = new class333[]{class333.field4125, class333.field4126, class333.field4127, class333.field4124}; // L: 39
					SpriteMask.findEnumerated(var6, var1.readUnsignedByte());
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4); // L: 30
				}
			} else {
				this.vmethod7952(var1, var2); // L: 45
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-762998085"
	)
	boolean method7953() {
		return this.field4637 != null; // L: 52
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "2009560345"
	)
	Object method7958() {
		if (this.field4637 == class467.field4866) { // L: 56
			return 0; // L: 57
		} else if (this.field4637 == class467.field4859) { // L: 59
			return -1L; // L: 60
		} else {
			return this.field4637 == class467.field4865 ? "" : null; // L: 62 63 65
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lrz;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1198780318"
	)
	static String method7964(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) { // L: 41
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1); // L: 42
			return var3 == null ? var2 : (String)var3.obj; // L: 43 44
		}
	}
}
