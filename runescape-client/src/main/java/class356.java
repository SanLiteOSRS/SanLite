import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
public abstract class class356 implements class228 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	class392 field4040;

	class356(int var1) {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;II)V",
		garbageValue = "-1876316576"
	)
	abstract void vmethod6406(Buffer var1, int var2);

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "772115588"
	)
	public void method6405(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class352[] var3 = new class352[]{class352.field4027, class352.field4029, class352.field4030, class352.field4032};
			class352 var4 = (class352)UserComparator4.findEnumerated(var3, var2);
			if (var4 != null) {
				switch(var4.field4031) {
				case 0:
					int var5 = var1.readUnsignedByte();
					this.field4040 = NetFileRequest.method5300(var5);
					if (this.field4040 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
				case 1:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
				case 2:
					var1.readStringCp1252NullCircumfixed();
					break;
				case 3:
					UserComparator4.findEnumerated(Occluder.method4483(), var1.readUnsignedByte());
				}
			} else {
				this.vmethod6406(var1, var2);
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	boolean method6407() {
		return this.field4040 != null;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "-1684206943"
	)
	Object method6408() {
		if (this.field4040 == class392.field4276) {
			return 0;
		} else if (this.field4040 == class392.field4270) {
			return -1L;
		} else {
			return this.field4040 == class392.field4271 ? "" : null;
		}
	}
}
