import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
public abstract class class476 implements class296 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	class521 field4875;

	class476(int var1) {
	} // L: 13

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "-1596270008"
	)
	abstract void vmethod8737(Buffer var1, int var2);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1129594658"
	)
	public void method8736(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 47
			}

			class472[] var3 = new class472[]{class472.field4863, class472.field4866, class472.field4862, class472.field4864}; // L: 21
			class472 var4 = (class472)class356.findEnumerated(var3, var2); // L: 23
			if (var4 != null) { // L: 24
				switch(var4.field4865) { // L: 25
				case 0:
					class370[] var5 = new class370[]{class370.field4322, class370.field4321, class370.field4320, class370.field4326}; // L: 29
					class356.findEnumerated(var5, var1.readUnsignedByte()); // L: 31
					break;
				case 1:
					var1.readStringCp1252NullCircumfixed(); // L: 34
					break; // L: 35
				case 2:
					int var6 = var1.readUnsignedByte(); // L: 39
					this.field4875 = class297.method5966(var6); // L: 40
					if (this.field4875 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6); // L: 41
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4); // L: 37
				}
			} else {
				this.vmethod8737(var1, var2); // L: 45
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-87852554"
	)
	boolean method8738() {
		return this.field4875 != null; // L: 52
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "-2127993541"
	)
	Object method8741() {
		if (this.field4875 == class521.field5125) { // L: 56
			return 0; // L: 57
		} else if (this.field4875 == class521.field5128) { // L: 59
			return -1L; // L: 60
		} else {
			return this.field4875 == class521.field5126 ? "" : null; // L: 62 63 65
		}
	}
}
