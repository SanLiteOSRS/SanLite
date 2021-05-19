import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
public abstract class class342 implements class213 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	class374 field3936;

	class342(int var1) {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;II)V",
		garbageValue = "1226667893"
	)
	abstract void vmethod5880(Buffer var1, int var2);

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "-1780530418"
	)
	public void method5879(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class338 var3 = (class338)UserComparator4.findEnumerated(TriBool.method5690(), var2);
			if (var3 != null) {
				switch(var3.field3924) {
				case 0:
					int var4 = var1.readUnsignedByte();
					this.field3936 = WorldMapSprite.method3581(var4);
					if (this.field3936 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
				case 1:
					class268[] var5 = new class268[]{class268.field3544, class268.field3550, class268.field3545, class268.field3543};
					UserComparator4.findEnumerated(var5, var1.readUnsignedByte());
					break;
				case 2:
					var1.readStringCp1252NullCircumfixed();
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
				}
			} else {
				this.vmethod5880(var1, var2);
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "79330910"
	)
	boolean method5881() {
		return this.field3936 != null;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "-159166525"
	)
	Object method5884() {
		if (this.field3936 == class374.field4141) {
			return 0;
		} else if (this.field3936 == class374.field4135) {
			return -1L;
		} else {
			return this.field3936 == class374.field4136 ? "" : null;
		}
	}
}
