import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
public abstract class class342 implements class213 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	class374 field3927;

	class342(int var1) {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;II)V",
		garbageValue = "-1773936298"
	)
	abstract void vmethod6036(Buffer var1, int var2);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1490587397"
	)
	public void method6035(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class338 var3 = (class338)Messages.findEnumerated(FloorDecoration.method3834(), var2);
			if (var3 != null) {
				switch(var3.field3918) {
				case 0:
					Messages.findEnumerated(class258.method4835(), var1.readUnsignedByte());
					break;
				case 1:
					int var4 = var1.readUnsignedByte();
					int var6 = class372.field4124[var4];
					class374 var5;
					if (var6 == 1) {
						var5 = class374.field4131;
					} else if (var6 == 2) {
						var5 = class374.field4129;
					} else if (var6 == 3) {
						var5 = class374.field4128;
					} else {
						var5 = null;
					}

					this.field3927 = var5;
					if (this.field3927 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
				case 2:
					var1.readStringCp1252NullCircumfixed();
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
				}
			} else {
				this.vmethod6036(var1, var2);
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1118376221"
	)
	boolean method6040() {
		return this.field3927 != null;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "-334523720"
	)
	Object method6038() {
		if (this.field3927 == class374.field4131) {
			return 0;
		} else if (this.field3927 == class374.field4128) {
			return -1L;
		} else {
			return this.field3927 == class374.field4129 ? "" : null;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "15704077"
	)
	public static int method6043(int var0, int var1, int var2) {
		int var3 = CollisionMap.method3185(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}
}
