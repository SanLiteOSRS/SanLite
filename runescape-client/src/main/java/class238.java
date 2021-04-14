import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public class class238 {
	static {
		Math.sqrt(8192.0D);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)Ljava/security/SecureRandom;",
		garbageValue = "15"
	)
	static SecureRandom method4380() {
		SecureRandom var0 = new SecureRandom();
		var0.nextInt();
		return var0;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(CB)Z",
		garbageValue = "-111"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "(Lbt;I)V",
		garbageValue = "128863813"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		signature = "([BI)[B",
		garbageValue = "745123443"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field3278 != 0 && var3 > AbstractArchive.field3278) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var4 = new byte[var3];
			var1.readBytes(var4, 0, var3);
			return var4;
		} else {
			int var6 = var1.readInt();
			if (var6 >= 0 && (AbstractArchive.field3278 == 0 || var6 <= AbstractArchive.field3278)) {
				byte[] var5 = new byte[var6];
				if (var2 == 1) {
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var6, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5);
				}

				return var5;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1399862547"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = ObjectComposition.getPacketBufferNode(ClientPacket.field2252, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
