import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class310 {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -180112901
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-553080232"
	)
	public static final boolean method5484(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (class214.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class365.field4106;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class365.field4104;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1609458459"
	)
	static final void method5485(int var0, int var1) {
		if (Client.field847[var0] != null) {
			if (var1 >= 0 && var1 < Client.field847[var0].method39()) {
				class9 var2 = (class9)Client.field847[var0].field32.get(var1);
				if (var2.field76 == -1) {
					PacketWriter var3 = Client.packetWriter;
					PacketBufferNode var4 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2605, var3.isaacCipher);
					var4.packetBuffer.writeByte(3 + class4.stringCp1252NullTerminatedByteSize(var2.field73));
					var4.packetBuffer.writeByte(var0);
					var4.packetBuffer.writeShort(var1);
					var4.packetBuffer.writeStringCp1252NullTerminated(var2.field73);
					var3.addNode(var4);
				}
			}
		}
	}
}
