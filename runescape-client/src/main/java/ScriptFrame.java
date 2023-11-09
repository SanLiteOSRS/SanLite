import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1822027501
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("v")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("x")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-50"
	)
	public static void method1174() {
		VarpDefinition.VarpDefinition_cached.clear(); // L: 41
	} // L: 42

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "277790421"
	)
	static final void method1170(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) { // L: 158
			for (int var4 = 0; var4 < 8; ++var4) { // L: 159
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) { // L: 161
			for (var3 = 1; var3 < 8; ++var3) { // L: 162
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) { // L: 164
			for (var3 = 1; var3 < 8; ++var3) { // L: 165
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) { // L: 167
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) { // L: 168
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) { // L: 169
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	} // L: 170

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2050810740"
	)
	public static void method1173() {
		KitDefinition.KitDefinition_cached.clear(); // L: 132
	} // L: 133

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lfp;IIB)Lax;",
		garbageValue = "113"
	)
	public static final PcmPlayer method1168(TaskHandler var0, int var1, int var2) {
		if (PcmPlayer.field325 * 22050 == 0) { // L: 45
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) { // L: 46
			if (var2 < 256) { // L: 47
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class20.pcmPlayerProvider.player(); // L: 49
				var3.samples = new int[256 * (class286.PcmPlayer_stereo ? 2 : 1)]; // L: 50
				var3.field320 = var2; // L: 51
				var3.init(); // L: 52
				var3.capacity = (var2 & -1024) + 1024; // L: 53
				if (var3.capacity > 16384) { // L: 54
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 55
				if (class34.field205 > 0 && PcmPlayer.soundSystem == null) { // L: 56
					PcmPlayer.soundSystem = new SoundSystem(); // L: 57
					class11.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 58
					class11.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 59
				}

				if (PcmPlayer.soundSystem != null) { // L: 61
					if (PcmPlayer.soundSystem.players[var1] != null) { // L: 62
						throw new IllegalArgumentException();
					}

					PcmPlayer.soundSystem.players[var1] = var3; // L: 63
				}

				return var3; // L: 65
			} catch (Throwable var4) { // L: 67
				return new PcmPlayer(); // L: 68
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-9"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5482
			int var3 = SpotAnimationDefinition.getTileHeight(var0, var1, class383.Client_plane) - var2; // L: 5487
			var0 -= class145.cameraX; // L: 5488
			var3 -= class414.cameraY; // L: 5489
			var1 -= ClanChannel.cameraZ; // L: 5490
			int var4 = Rasterizer3D.Rasterizer3D_sine[class97.cameraPitch]; // L: 5491
			int var5 = Rasterizer3D.Rasterizer3D_cosine[class97.cameraPitch]; // L: 5492
			int var6 = Rasterizer3D.Rasterizer3D_sine[class128.cameraYaw]; // L: 5493
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class128.cameraYaw]; // L: 5494
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 5495
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5496
			var0 = var8; // L: 5497
			var8 = var3 * var5 - var4 * var1 >> 16; // L: 5498
			var1 = var3 * var4 + var5 * var1 >> 16; // L: 5499
			if (var1 >= 50) { // L: 5501
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5502
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1; // L: 5503
			} else {
				Client.viewportTempX = -1; // L: 5506
				Client.viewportTempY = -1; // L: 5507
			}

		} else {
			Client.viewportTempX = -1; // L: 5483
			Client.viewportTempY = -1; // L: 5484
		}
	} // L: 5485 5509

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIB)V",
		garbageValue = "-124"
	)
	static final void method1172(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		class37.method706(var0, var1, var2, var3, var4, var5, var6, false); // L: 9976
	} // L: 9977

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1601276556"
	)
	static final void method1171(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : VarcInt.guestClanChannel; // L: 12554
		if (var2 != null && var1 >= 0 && var1 < var2.method3312()) { // L: 12555
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 12556
			if (var3.rank == -1) {
				String var4 = var3.username.getName(); // L: 12558
				PacketBufferNode var5 = class136.getPacketBufferNode(ClientPacket.field3142, Client.packetWriter.isaacCipher); // L: 12559
				var5.packetBuffer.writeByte(3 + class13.stringCp1252NullTerminatedByteSize(var4)); // L: 12560
				var5.packetBuffer.writeByte(var0); // L: 12561
				var5.packetBuffer.writeShort(var1); // L: 12562
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 12563
				Client.packetWriter.addNode(var5); // L: 12564
			}
		}
	} // L: 12557 12565

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "-1986308833"
	)
	static String method1169(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 12620
		if (Client.gameBuild == 1) { // L: 12621
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 12622
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 12623
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 12624
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 12625
			var0 = "local";
		}

		String var3 = ""; // L: 12626
		if (class133.field1635 != null) { // L: 12627
			var3 = "/p=" + class133.field1635;
		}

		String var4 = "runescape.com"; // L: 12628
		return var2 + var0 + "." + var4 + "/l=" + class173.clientLanguage + "/a=" + DecorativeObject.field2799 + var3 + "/"; // L: 12629
	}
}
