import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
public class class72 {
	@ObfuscatedName("aj")
	static final BigInteger field883;
	@ObfuscatedName("al")
	static final BigInteger field881;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	static IndexedSprite field882;

	static {
		field883 = new BigInteger("10001", 16); // L: 6
		field881 = new BigInteger("e4b69726685ccfa5c5415c9e497295e78a02e17b2f3a30396eab65139af40b3f6513f5c2655479f120ba15625934bfd84bc3b5ce181ded4133a7c8b752309b113cbba2fec6cfa44a318ec4496531f2cfef334025f67ce1161bf85ea98973b1f5bdc33bf97a62b10536f30776646dd4aa199b9c51aaa08126b3678518b0215bbf", 16); // L: 7
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lne;IIB)Lsp;",
		garbageValue = "120"
	)
	static IndexedSprite method2059(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 40
		boolean var3;
		if (var4 == null) { // L: 41
			var3 = false; // L: 42
		} else {
			class212.SpriteBuffer_decode(var4); // L: 45
			var3 = true; // L: 46
		}

		return !var3 ? null : class353.method6646(); // L: 48 49
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "0"
	)
	static final int method2057(int var0, int var1) {
		if (var0 == -2) { // L: 994
			return 12345678;
		} else if (var0 == -1) { // L: 995
			if (var1 < 2) {
				var1 = 2; // L: 996
			} else if (var1 > 126) { // L: 997
				var1 = 126;
			}

			return var1; // L: 998
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1000
			if (var1 < 2) { // L: 1001
				var1 = 2;
			} else if (var1 > 126) { // L: 1002
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1003
		}
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Lmx;",
		garbageValue = "-1462614176"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null; // L: 1966
		if (JagexCache.JagexCache_dat2File != null) { // L: 1967
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, MidiPcmStream.masterDisk, var0, var1, var2, var3, var4); // L: 1968
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "11"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 12006
			PacketBufferNode var1 = UserComparator9.getPacketBufferNode(ClientPacket.field3103, Client.packetWriter.isaacCipher); // L: 12008
			var1.packetBuffer.writeByte(WorldMapLabel.stringCp1252NullTerminatedByteSize(var0)); // L: 12009
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12010
			Client.packetWriter.addNode(var1); // L: 12011
		}
	} // L: 12012

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-102"
	)
	public static boolean method2055() {
		return Client.staffModLevel >= 2; // L: 12192
	}
}
