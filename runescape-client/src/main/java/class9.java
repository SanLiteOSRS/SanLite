import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
public class class9 {
	@ObfuscatedName("l")
	static byte[][][] field71;
	@ObfuscatedName("v")
	@Export("ByteArrayPool_altSizeArrayCounts")
	static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("aj")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("h")
	public byte field76;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 614168869
	)
	public int field80;
	@ObfuscatedName("o")
	public String field73;

	class9() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Z",
		garbageValue = "6"
	)
	static boolean method98(String var0, int var1) {
		return class230.method4348(var0, var1, "openjs");
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(IZZZI)Lji;",
		garbageValue = "-325729093"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class21.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, class1.masterDisk, var0, var1, var2, var3);
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-809914007"
	)
	static final void method97(boolean var0) {
		WorldMapIcon_1.playPcmPlayers();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.field789 && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2583, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.field789 = true;
				}
			}

		}
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "55"
	)
	static void method95(int var0) {
		Client.oculusOrbState = var0;
	}
}
