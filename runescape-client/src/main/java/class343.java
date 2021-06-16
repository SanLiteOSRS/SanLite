import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
public abstract class class343 implements class214 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	class375 field3924;

	class343(int var1) {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "-1006321266"
	)
	abstract void vmethod6077(Buffer var1, int var2);

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-2064643819"
	)
	public void method6070(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class339[] var3 = new class339[]{class339.field3916, class339.field3914, class339.field3913, class339.field3915};
			class339 var4 = (class339)Clock.findEnumerated(var3, var2);
			if (var4 != null) {
				switch(var4.field3912) {
				case 0:
					int var5 = var1.readUnsignedByte();
					int var7 = class373.field4126[var5];
					class375 var6;
					if (var7 == 1) {
						var6 = class375.field4134;
					} else if (var7 == 2) {
						var6 = class375.field4128;
					} else if (var7 == 3) {
						var6 = class375.field4127;
					} else {
						var6 = null;
					}

					this.field3924 = var6;
					if (this.field3924 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
				case 1:
					var1.readStringCp1252NullCircumfixed();
					break;
				case 2:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
				case 3:
					Clock.findEnumerated(LoginPacket.method4510(), var1.readUnsignedByte());
				}
			} else {
				this.vmethod6077(var1, var2);
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "826495123"
	)
	boolean method6072() {
		return this.field3924 != null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "1136165556"
	)
	Object method6073() {
		if (this.field3924 == class375.field4134) {
			return 0;
		} else if (this.field3924 == class375.field4127) {
			return -1L;
		} else {
			return this.field3924 == class375.field4128 ? "" : null;
		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)Z",
		garbageValue = "900256799"
	)
	static final boolean method6080(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method4820(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false);
			}

			if (var1 == 325) {
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = InterfaceParent.getPacketBufferNode(ClientPacket.field2648, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
