import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lko;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lko;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lko;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lko;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lko;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lko;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 218864089
	)
	public static int field3694;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		signature = "Lgb;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		signature = "Llo;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("k")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)[Lko;",
		garbageValue = "-98"
	)
	public static FontName[] method5456() {
		return new FontName[]{FontName_bold12, FontName_plain11, FontName_verdana11, FontName_verdana13, FontName_plain12, FontName_verdana15};
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1218729276"
	)
	public static void method5459(int var0) {
		if (class206.musicPlayerStatus != 0) {
			class206.musicTrackVolume = var0;
		} else {
			class13.midiPcmStream.setPcmStreamVolume(var0);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "13921338"
	)
	static int method5455(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;B)V",
		garbageValue = "18"
	)
	static void method5458(int var0, String var1) {
		int var2 = Players.Players_count;
		int[] var3 = Players.Players_indices;
		boolean var4 = false;
		Username var5 = new Username(var1, UserComparator4.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = Client.players[var3[var6]];
			if (var7 != null && var7 != PlayerType.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = class4.getPacketBufferNode(ClientPacket.field2239, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByte(0);
					var8.packetBuffer.method5673(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = class4.getPacketBufferNode(ClientPacket.field2281, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(var3[var6]);
					var8.packetBuffer.writeByte(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = class4.getPacketBufferNode(ClientPacket.field2323, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(var3[var6]);
					var8.packetBuffer.method5663(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = class4.getPacketBufferNode(ClientPacket.field2324, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5674(var3[var6]);
					var8.packetBuffer.method5663(0);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			DevicePcmPlayerProvider.addGameMessage(4, "", "Unable to find " + var1);
		}

	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "67"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (ScriptFrame.loadInterface(var0)) {
			Widget[] var1 = Widget.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
